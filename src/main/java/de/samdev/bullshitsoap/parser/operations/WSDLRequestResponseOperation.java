package de.samdev.bullshitsoap.parser.operations;

import java.util.ArrayList;
import java.util.List;

import de.samdev.bullshitsoap.parser.WSDLDefinition;
import de.samdev.bullshitsoap.parser.WSDLParsingException;
import de.samdev.bullshitsoap.parser.helper.StringHelper;
import de.samdev.bullshitsoap.parser.messagedefinitions.WSDLMessageDefinition;
import de.samdev.bullshitsoap.parser.messagedefinitions.WSDLMessageDefinitionPart;
import de.samdev.bullshitsoap.parser.typedefinitions.WSDLPrimitiveTypeDefinition;
import nu.xom.Element;

public class WSDLRequestResponseOperation extends WSDLOperation {
	public final WSDLMessageDefinition Input;
	public final WSDLMessageDefinition Output;
	
	private WSDLRequestResponseOperation(String name, String namespace, String documentation, WSDLMessageDefinition in, WSDLMessageDefinition out) {
		super(name, namespace, documentation);
		
		Input = in;
		Output = out;
	}
	
	private WSDLRequestResponseOperation(String name, String namespace, WSDLMessageDefinition in, WSDLMessageDefinition out) {
		super(name, namespace);
		
		Input = in;
		Output = out;
	}

	public static WSDLRequestResponseOperation createFromWSDL(WSDLDefinition wsdl, String name, String namespace, String documentation, Element root) throws NumberFormatException, WSDLParsingException {
		Element childInput = root.getFirstChildElement("input", WSDLDefinition.NS_WSDL);
		Element childOutput = root.getFirstChildElement("output", WSDLDefinition.NS_WSDL);

		WSDLMessageDefinition mInput = wsdl.getWSDLMessage(childInput.getAttributeValue("message"));
		WSDLMessageDefinition mOutput = wsdl.getWSDLMessage(childOutput.getAttributeValue("message"));
		
		return new WSDLRequestResponseOperation(name, namespace, documentation, mInput, mOutput);
	}

	@Override
	public String toDebugString() {
		return String.format("Operation_RequestResponse [%s]\r\n{\r\n%s\r\n%s\r\n}", 
				Name, 
				StringHelper.indent("Input: "  + Input.toDebugString()), 
				StringHelper.indent("Output: " + Output.toDebugString()));
	}

	@Override
	public String generateClassCode() {
		StringBuilder result = new StringBuilder();
		
		StringBuilder buildr = new StringBuilder();
		
		{
			buildr.append("\tpublic static $RESPONSE$ $NAME$($REQUEST$ input) throws IOException, ValidityException, ParsingException {" 			+ "\r\n");
			buildr.append("\t\tBuilder xom = new Builder();" 																						+ "\r\n");
			buildr.append("\t\tString request = input.serialize().toXML();" 																		+ "\r\n");
			buildr.append("\t\tString response = invoker.getReponse(request);" 																		+ "\r\n");
			buildr.append("\t\t$RESPONSE$ result = $RESPONSE$.createFromXML(xom.build(response, null));" 											+ "\r\n");
			buildr.append("\t\treturn result;" 																										+ "\r\n");
			buildr.append("\t}" 																													+ "\r\n");
		}
		
		if (Input.getFields().isEmpty()) {
			buildr.append(""  																														+ "\r\n");
			buildr.append("\tpublic static $RESPONSE$ $NAME$() throws IOException, ValidityException, ParsingException {" 							+ "\r\n");
			buildr.append("\t\tBuilder xom = new Builder();" 																						+ "\r\n");
			buildr.append("\t\tString request = $REQUEST$.create()" 																				+ "\r\n");
			buildr.append("\t\tString response = invoker.getReponse(request);" 																		+ "\r\n");
			buildr.append("\t\t$RESPONSE$ result = $RESPONSE$.createFromXML(xom.build(response, null));" 											+ "\r\n");
			buildr.append("\t\treturn result;" 																										+ "\r\n");
			buildr.append("\t}"  																													+ "\r\n");
		} else {
			buildr.append(""  																														+ "\r\n");
			buildr.append("\tpublic static $RESPONSE$ $NAME$($PARAMS_WRAPPED$) throws IOException, ValidityException, ParsingException {" 			+ "\r\n");
			buildr.append("\t\tBuilder xom = new Builder();" 																						+ "\r\n");
			buildr.append("\t\tString request = $REQUEST$.create($FLATPARAMS_WRAPPED$).serialize().toXML();" 										+ "\r\n");
			buildr.append("\t\tString response = invoker.getReponse(request);" 																		+ "\r\n");
			buildr.append("\t\t$RESPONSE$ result = $RESPONSE$.createFromXML(xom.build(response, null));" 											+ "\r\n");
			buildr.append("\t\treturn result;" 																										+ "\r\n");
			buildr.append("\t}" 																													+ "\r\n");
			
			if (Input.HasPrimitiveFields()) {
				if (Output.getFields().size() == 1 && Output.getFields().get(0).Type.isPrimitive()) {
					buildr.append(""  																													+ "\r\n");
					buildr.append("\tpublic static $RESPONSE_P$ $NAME$($PARAMS_WRAPPED_P$) throws IOException, ValidityException, ParsingException {" 	+ "\r\n");
					buildr.append("\t\tBuilder xom = new Builder();" 																					+ "\r\n");
					buildr.append("\t\tString request = $REQUEST$.create($FLATPARAMS_WRAPPED_P$).serialize().toXML();" 									+ "\r\n");
					buildr.append("\t\tString response = invoker.getReponse(request);" 																	+ "\r\n");
					buildr.append("\t\t$RESPONSE$ result = $RESPONSE$.createFromXML(xom.build(response, null));" 										+ "\r\n");
					buildr.append("\t\treturn result.field_$RESPONSE_FIELD$.value;" 																	+ "\r\n");
					buildr.append("\t}" 																												+ "\r\n");
				} else {
					buildr.append(""  																													+ "\r\n");
					buildr.append("\tpublic static $RESPONSE$ $NAME$($PARAMS_WRAPPED_P$) throws IOException, ValidityException, ParsingException {" 	+ "\r\n");
					buildr.append("\t\tBuilder xom = new Builder();" 																					+ "\r\n");
					buildr.append("\t\tString request = $REQUEST$.create($FLATPARAMS_WRAPPED_P$).serialize().toXML();" 									+ "\r\n");
					buildr.append("\t\tString response = invoker.getReponse(request);" 																	+ "\r\n");
					buildr.append("\t\t$RESPONSE$ result = $RESPONSE$.createFromXML(xom.build(response, null));" 										+ "\r\n");
					buildr.append("\t\treturn result;" 																									+ "\r\n");
					buildr.append("\t}" 																												+ "\r\n");
				}
			}
		}
		
		List<String> buildr_params_wrapped = new ArrayList<String>();
		for (WSDLMessageDefinitionPart field : Input.getFields()) {
			buildr_params_wrapped.add(String.format("%s _%s", field.Type.getClassCodeName(), field.Name));
		}

		List<String> buildr_flatParams_wrapped = new ArrayList<String>();
		for (WSDLMessageDefinitionPart field : Input.getFields()) {
			buildr_flatParams_wrapped.add(String.format("_%s", field.Name));
		}
		
		List<String> buildr_params_wrapped_primitive = new ArrayList<String>();
		for (WSDLMessageDefinitionPart field : Input.getFields()) {
			if (field.Type.isPrimitive()) {
				buildr_params_wrapped_primitive.add(String.format("%s _%s", ((WSDLPrimitiveTypeDefinition)field.Type).getPrimitiveClassCodeName(), field.Name));
			} else {
				buildr_params_wrapped_primitive.add(String.format("%s _%s", field.Type.getClassCodeName(), field.Name));
			}
		}

		List<String> buildr_flatParams_wrapped_primitive = new ArrayList<String>();
		for (WSDLMessageDefinitionPart field : Input.getFields()) {
			if (field.Type.isPrimitive()) {
				buildr_flatParams_wrapped_primitive.add(String.format("%s.create(_%s)", field.Type.getClassCodeName(), field.Name));
			} else {
				buildr_flatParams_wrapped_primitive.add(String.format("_%s", field.Name));
			}
		}
		
		String code = buildr.toString();
		code = StringHelper.replaceAll(code, "$REQUEST$", Input.getClassCodeName());
		code = StringHelper.replaceAll(code, "$RESPONSE$", Output.getClassCodeName());
		code = StringHelper.replaceAll(code, "$NAME$", Name);
		code = StringHelper.replaceAll(code, "$PARAMS_WRAPPED$", StringHelper.join(", ", buildr_params_wrapped));
		code = StringHelper.replaceAll(code, "$FLATPARAMS_WRAPPED$", StringHelper.join(", ", buildr_flatParams_wrapped));
		code = StringHelper.replaceAll(code, "$PARAMS_WRAPPED_P$", StringHelper.join(", ", buildr_params_wrapped_primitive));
		code = StringHelper.replaceAll(code, "$FLATPARAMS_WRAPPED_P$", StringHelper.join(", ", buildr_flatParams_wrapped_primitive));
		
		if (Output.getFields().size() == 1 && Output.getFields().get(0).Type.isPrimitive()) {
			code = StringHelper.replaceAll(code, "$RESPONSE_FIELD$", Output.getFields().get(0).Name);
			code = StringHelper.replaceAll(code, "$RESPONSE_P$", ((WSDLPrimitiveTypeDefinition)Output.getFields().get(0).Type).getPrimitiveClassCodeName());
		}
		
		return code.toString();
	}
}

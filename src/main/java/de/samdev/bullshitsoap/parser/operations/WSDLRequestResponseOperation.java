package de.samdev.bullshitsoap.parser.operations;

import de.samdev.bullshitsoap.parser.WSDLDefinition;
import de.samdev.bullshitsoap.parser.WSDLParsingException;
import de.samdev.bullshitsoap.parser.helper.StringHelper;
import de.samdev.bullshitsoap.parser.messagedefinitions.WSDLMessageDefinition;
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
		StringBuilder buildr = new StringBuilder();
		
		buildr.append("\tpublic static $RESPONSE$ $NAME$($REQUEST$ input) throws IOException, ValidityException, ParsingException {" 	+ "\r\n");
		buildr.append("\t\tBuilder xom = new Builder();" 																				+ "\r\n");
		buildr.append("\t\tString request = input.serialize().toXML();" 																+ "\r\n");
		buildr.append("\t\tString response = invoker.getReponse(request);" 																+ "\r\n");
		buildr.append("\t\t$RESPONSE$ result = $RESPONSE$.createFromXML(xom.build(response, null));" 									+ "\r\n");
		buildr.append("\t\treturn result;" 																								+ "\r\n");
		buildr.append("\t}" 																											+ "\r\n");
		
		String code = buildr.toString();

		code = StringHelper.replaceAll(code, "$REQUEST$", Input.getClassCodeName());
		code = StringHelper.replaceAll(code, "$RESPONSE$", Output.getClassCodeName());
		code = StringHelper.replaceAll(code, "$NAME$", Name);
		
		return code.toString();
	}
}

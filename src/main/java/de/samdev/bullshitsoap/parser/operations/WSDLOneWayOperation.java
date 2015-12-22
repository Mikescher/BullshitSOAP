package de.samdev.bullshitsoap.parser.operations;

import de.samdev.bullshitsoap.parser.WSDLDefinition;
import de.samdev.bullshitsoap.parser.WSDLParsingException;
import de.samdev.bullshitsoap.parser.helper.StringHelper;
import de.samdev.bullshitsoap.parser.messagedefinitions.WSDLMessageDefinition;
import nu.xom.Element;

public class WSDLOneWayOperation extends WSDLOperation {
	public final WSDLMessageDefinition Input;
	
	private WSDLOneWayOperation(String name, String namespace, String documentation, WSDLMessageDefinition in) {
		super(name, namespace, documentation);
		
		Input = in;
	}
	
	private WSDLOneWayOperation(String name, String namespace, WSDLMessageDefinition in) {
		super(name, namespace);
		
		Input = in;
	}

	public static WSDLOneWayOperation createFromWSDL(WSDLDefinition wsdl, String name, String namespace, String documentation, Element root) throws NumberFormatException, WSDLParsingException {
		Element childInput = root.getFirstChildElement("input", WSDLDefinition.NS_WSDL);

		WSDLMessageDefinition mInput = wsdl.getWSDLMessage(childInput.getAttributeValue("message"));
		
		return new WSDLOneWayOperation(name, namespace, documentation, mInput);
	}

	@Override
	public String toDebugString() {
		return String.format("Operation_OneWay [%s]\r\n{\r\n%s\r\n}", 
				Name, 
				StringHelper.indent("Input: "  + Input.toDebugString()));
	}

	@Override
	public String generateClassCode() {
		StringBuilder buildr = new StringBuilder();
		
		buildr.append("\tpublic static void $NAME$($REQUEST$ input) throws IOException, ValidityException, ParsingException {" 	+ "\r\n");
		buildr.append("\t\tBuilder xom = new Builder();" 																				+ "\r\n");
		buildr.append("\t\tString request = input.serialize(\"$NAME$\").toXML();" 														+ "\r\n");
		buildr.append("\t\tString response = invoker.getReponse(request);" 																+ "\r\n");
		buildr.append("\t}" 																											+ "\r\n");
		
		String code = buildr.toString();

		code = StringHelper.replaceAll(code, "$REQUEST$", Input.getClassCodeName());
		code = StringHelper.replaceAll(code, "$NAME$", Name);
		
		return code.toString();
	}
}

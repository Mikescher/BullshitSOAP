package de.samdev.bullshitsoap.parser.operations;

import de.samdev.bullshitsoap.parser.WSDLDefinition;
import de.samdev.bullshitsoap.parser.WSDLParsingException;
import de.samdev.bullshitsoap.parser.helper.StringHelper;
import de.samdev.bullshitsoap.parser.messages.WSDLMessage;
import nu.xom.Element;

public class WSDLOneWayOperation extends WSDLOperation {
	public final WSDLMessage Input;
	
	private WSDLOneWayOperation(String name, String namespace, String documentation, WSDLMessage in) {
		super(name, namespace, documentation);
		
		Input = in;
	}
	
	private WSDLOneWayOperation(String name, String namespace, WSDLMessage in) {
		super(name, namespace);
		
		Input = in;
	}

	public static WSDLOneWayOperation createFromWSDL(WSDLDefinition wsdl, String name, String namespace, String documentation, Element root) throws NumberFormatException, WSDLParsingException {
		Element childInput = root.getFirstChildElement("input", WSDLDefinition.NS_WSDL);

		WSDLMessage mInput = wsdl.getWSDLMessage(childInput.getAttributeValue("message"));
		
		return new WSDLOneWayOperation(name, namespace, documentation, mInput);
	}

	@Override
	public String toDebugString() {
		return String.format("Operation_OneWay [%s]\r\n{\r\n%s\r\n}", 
				Name, 
				StringHelper.indent("Input: "  + Input.toDebugString()));
	}
}
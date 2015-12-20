package de.samdev.bullshitsoap.parser.operations;

import de.samdev.bullshitsoap.parser.WSDLDefinition;
import de.samdev.bullshitsoap.parser.WSDLParsingException;
import de.samdev.bullshitsoap.parser.helper.StringHelper;
import de.samdev.bullshitsoap.parser.messages.WSDLMessage;
import nu.xom.Element;

public class WSDLNotificationOperation extends WSDLOperation {
	public final WSDLMessage Output;
	
	private WSDLNotificationOperation(String name, String namespace, String documentation, WSDLMessage out) {
		super(name, namespace, documentation);
		
		Output = out;
	}
	
	private WSDLNotificationOperation(String name, String namespace, WSDLMessage out) {
		super(name, namespace);
		
		Output = out;
	}

	public static WSDLNotificationOperation createFromWSDL(WSDLDefinition wsdl, String name, String namespace, String documentation, Element root) throws NumberFormatException, WSDLParsingException {
		Element childOutput = root.getFirstChildElement("output", WSDLDefinition.NS_WSDL);

		WSDLMessage mOutput = wsdl.getWSDLMessage(childOutput.getAttributeValue("message"));
		
		return new WSDLNotificationOperation(name, namespace, documentation, mOutput);
	}

	@Override
	public String toDebugString() {
		return String.format("Operation_RequestResponse [%s]\r\n{\r\n%s\r\n}", 
				Name, 
				StringHelper.indent("Output: " + Output.toDebugString()));
	}
}

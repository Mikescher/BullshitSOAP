package de.samdev.bullshitsoap.parser.operations;

import de.samdev.bullshitsoap.parser.WSDLDefinition;
import de.samdev.bullshitsoap.parser.WSDLParsingException;
import de.samdev.bullshitsoap.parser.helper.StringHelper;
import de.samdev.bullshitsoap.parser.messagedefinitions.WSDLMessageDefinition;
import nu.xom.Element;

public class WSDLNotificationOperation extends WSDLOperation {
	public final WSDLMessageDefinition Output;
	
	private WSDLNotificationOperation(String name, String namespace, String documentation, WSDLMessageDefinition out) {
		super(name, namespace, documentation);
		
		Output = out;
	}
	
	private WSDLNotificationOperation(String name, String namespace, WSDLMessageDefinition out) {
		super(name, namespace);
		
		Output = out;
	}

	public static WSDLNotificationOperation createFromWSDL(WSDLDefinition wsdl, String name, String namespace, String documentation, Element root) throws NumberFormatException, WSDLParsingException {
		Element childOutput = root.getFirstChildElement("output", WSDLDefinition.NS_WSDL);

		WSDLMessageDefinition mOutput = wsdl.getWSDLMessage(childOutput.getAttributeValue("message"));
		
		return new WSDLNotificationOperation(name, namespace, documentation, mOutput);
	}

	@Override
	public String toDebugString() {
		return String.format("Operation_RequestResponse [%s]\r\n{\r\n%s\r\n}", 
				Name, 
				StringHelper.indent("Output: " + Output.toDebugString()));
	}
}

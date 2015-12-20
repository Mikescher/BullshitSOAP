package de.samdev.bullshitsoap.parser.operations;

import de.samdev.bullshitsoap.parser.WSDLDefinition;
import de.samdev.bullshitsoap.parser.WSDLParsingException;
import de.samdev.bullshitsoap.parser.helper.StringHelper;
import de.samdev.bullshitsoap.parser.messages.WSDLMessage;
import nu.xom.Element;

public class WSDLRequestResponseOperation extends WSDLOperation {
	public final WSDLMessage Input;
	public final WSDLMessage Output;
	
	private WSDLRequestResponseOperation(String name, String namespace, String documentation, WSDLMessage in, WSDLMessage out) {
		super(name, namespace, documentation);
		
		Input = in;
		Output = out;
	}
	
	private WSDLRequestResponseOperation(String name, String namespace, WSDLMessage in, WSDLMessage out) {
		super(name, namespace);
		
		Input = in;
		Output = out;
	}

	public static WSDLRequestResponseOperation createFromWSDL(WSDLDefinition wsdl, String name, String namespace, String documentation, Element root) throws NumberFormatException, WSDLParsingException {
		Element childInput = root.getFirstChildElement("input", WSDLDefinition.NS_WSDL);
		Element childOutput = root.getFirstChildElement("output", WSDLDefinition.NS_WSDL);

		WSDLMessage mInput = wsdl.getWSDLMessage(childInput.getAttributeValue("message"));
		WSDLMessage mOutput = wsdl.getWSDLMessage(childOutput.getAttributeValue("message"));
		
		return new WSDLRequestResponseOperation(name, namespace, documentation, mInput, mOutput);
	}

	@Override
	public String toDebugString() {
		return String.format("Operation_RequestResponse [%s]\r\n{\r\n%s\r\n%s\r\n}", 
				Name, 
				StringHelper.indent("Input: "  + Input.toDebugString()), 
				StringHelper.indent("Output: " + Output.toDebugString()));
	}
}

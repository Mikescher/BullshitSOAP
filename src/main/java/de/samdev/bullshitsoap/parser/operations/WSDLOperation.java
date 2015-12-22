package de.samdev.bullshitsoap.parser.operations;

import de.samdev.bullshitsoap.parser.IDebugFormattable;
import de.samdev.bullshitsoap.parser.WSDLDefinition;
import de.samdev.bullshitsoap.parser.WSDLParsingException;
import nu.xom.Element;

public abstract class WSDLOperation implements IDebugFormattable {

	public final String Name;
	public final String Namespace;
	public final String Documentation;
	
	protected WSDLOperation(String name, String namespace) {
		Name = name;
		Namespace = namespace;
		Documentation = "";
	}

	protected WSDLOperation(String name, String namespace, String documentation) {
		Name = name;
		Namespace = namespace;
		Documentation = documentation;
	}

	public static WSDLOperation createFromWSDL(WSDLDefinition wsdl, String name, String namespace, Element root) throws NumberFormatException, WSDLParsingException {
		Element childDocumentation = root.getFirstChildElement("documentation", WSDLDefinition.NS_WSDL);
		Element childInput = root.getFirstChildElement("input", WSDLDefinition.NS_WSDL);
		Element childOutput = root.getFirstChildElement("output", WSDLDefinition.NS_WSDL);
		
		String documentation = "";
		if (childDocumentation != null)documentation = childDocumentation.getValue();
		
		if (childInput != null && childOutput != null) {
			return WSDLRequestResponseOperation.createFromWSDL(wsdl, name, namespace, documentation, root);
		}
		
		if (childInput == null && childOutput != null) {
			return WSDLNotificationOperation.createFromWSDL(wsdl, name, namespace, documentation, root);
		}
		
		if (childInput != null && childOutput == null) {
			return WSDLOneWayOperation.createFromWSDL(wsdl, name, namespace, documentation, root);
		}

		throw new WSDLParsingException("Can't determine message type: " + root);
	}
	
	@Override
	public String toString() {
		return Name;
	}

	public abstract String generateClassCode();
}

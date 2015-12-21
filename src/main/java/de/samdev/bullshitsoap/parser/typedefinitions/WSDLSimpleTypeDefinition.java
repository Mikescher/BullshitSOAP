package de.samdev.bullshitsoap.parser.typedefinitions;

import de.samdev.bullshitsoap.parser.WSDLDefinition;
import de.samdev.bullshitsoap.parser.WSDLParsingException;
import nu.xom.Element;

public abstract class WSDLSimpleTypeDefinition extends WSDLTypeDefinition {
	protected WSDLSimpleTypeDefinition(String name, String ns) {
		super(name, ns);
	}

	public static WSDLSimpleTypeDefinition createFromWSDL(WSDLDefinition wsdl, Element element, String namespace) throws WSDLParsingException, NumberFormatException {
		String name = element.getAttributeValue("name");
		
		Element restriction = element.getFirstChildElement("restriction", WSDLDefinition.NS_XSD);
		if (restriction != null) {
			return WSDLEnumerationTypeDefinition.createFromWSDL(wsdl, name, namespace, element);
		} else {
			throw new WSDLParsingException("Unexpected element " + restriction);
		}
	}
}

package de.samdev.bullshitsoap.parser.types;

import de.samdev.bullshitsoap.parser.WSDLDefinition;
import de.samdev.bullshitsoap.parser.WSDLParsingException;
import nu.xom.Element;

public abstract class WSDLSimpleType extends WSDLType {
	protected WSDLSimpleType(String name, String ns) {
		super(name, ns);
	}

	public static WSDLSimpleType createFromWSDL(WSDLDefinition wsdl, Element element, String namespace) throws WSDLParsingException, NumberFormatException {
		String name = element.getAttributeValue("name");
		
		Element restriction = element.getFirstChildElement("restriction", WSDLDefinition.NS_XSD);
		if (restriction != null) {
			return WSDLEnumerationType.createFromWSDL(wsdl, name, namespace, element);
		} else {
			throw new WSDLParsingException("Unexpected element " + restriction);
		}
	}
}

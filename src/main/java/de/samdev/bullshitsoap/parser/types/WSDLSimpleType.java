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
			if (wsdl.compareType(restriction.getAttributeValue("base"), WSDLDefinition.NS_XSD, "string")) {
				return WSDLStringEnumerationType.createFromWSDL(name, namespace, restriction);
			} else if (wsdl.compareType(restriction.getAttributeValue("base"), WSDLDefinition.NS_XSD, "int")) {
				return WSDLIntegerEnumerationType.createFromWSDL(name, namespace, restriction);
			}
		} else {
			throw new WSDLParsingException("Unexpected element " + restriction);
		}

		throw new WSDLParsingException("Unexpected children " + element);
	}
}

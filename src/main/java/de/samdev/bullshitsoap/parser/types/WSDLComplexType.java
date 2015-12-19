package de.samdev.bullshitsoap.parser.types;

import de.samdev.bullshitsoap.parser.WSDLDefinition;
import de.samdev.bullshitsoap.parser.WSDLParsingException;
import nu.xom.Element;

public abstract class WSDLComplexType extends WSDLType {

	protected WSDLComplexType(String name, String ns) {
		super(name, ns);
	}

	public static WSDLComplexType createFromWSDL(WSDLDefinition wsdl, Element element, String namespace) throws WSDLParsingException {
		String name = element.getAttributeValue("name");
		
		Element elementObj = element.getFirstChildElement("all", WSDLDefinition.NS_XSD);
		if (elementObj != null) {
			return WSDLObjectType.createFromWSDL(wsdl, name, namespace, elementObj);
		}
		
		Element elementList = element.getFirstChildElement("sequence", WSDLDefinition.NS_XSD);
		if (elementList != null) {
			return WSDLSequenceType.createFromWSDL(wsdl, name, namespace, elementList);
		}

		throw new WSDLParsingException("Unexpected children " + element);
	}
}

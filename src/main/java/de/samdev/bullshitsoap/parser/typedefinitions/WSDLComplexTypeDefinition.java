package de.samdev.bullshitsoap.parser.typedefinitions;

import de.samdev.bullshitsoap.parser.WSDLDefinition;
import de.samdev.bullshitsoap.parser.WSDLParsingException;
import nu.xom.Element;

public abstract class WSDLComplexTypeDefinition extends WSDLTypeDefinition {

	protected WSDLComplexTypeDefinition(String name, String ns) {
		super(name, ns);
	}

	public static WSDLComplexTypeDefinition createFromWSDL(WSDLDefinition wsdl, Element element, String namespace) throws WSDLParsingException {
		String name = element.getAttributeValue("name");
		
		Element elementObj = element.getFirstChildElement("all", WSDLDefinition.NS_XSD);
		if (elementObj != null) {
			return WSDLObjectTypeDefinition.createFromWSDL(wsdl, name, namespace, elementObj);
		}
		
		Element elementList = element.getFirstChildElement("sequence", WSDLDefinition.NS_XSD);
		if (elementList != null) {
			return WSDLSequenceTypeDefinition.createFromWSDL(wsdl, name, namespace, elementList);
		}

		throw new WSDLParsingException("Unexpected children " + element);
	}
}

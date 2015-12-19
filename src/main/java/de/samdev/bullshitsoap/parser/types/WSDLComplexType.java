package de.samdev.bullshitsoap.parser.types;

import de.samdev.bullshitsoap.parser.WSDLDefinition;
import nu.xom.Element;

public abstract class WSDLComplexType extends WSDLType {

	protected WSDLComplexType(String name, String ns) {
		super(name, ns);
		// TODO Auto-generated constructor stub
	}

	public static WSDLComplexType createFromWSDL(WSDLDefinition wsdl, Element element, String namespace) {
		// TODO Auto-generated method stub
		
		
		return null;
	}
}

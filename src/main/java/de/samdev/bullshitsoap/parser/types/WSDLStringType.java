package de.samdev.bullshitsoap.parser.types;

import de.samdev.bullshitsoap.parser.WSDLDefinition;

public class WSDLStringType extends WSDLSimpleType {

	public WSDLStringType() {
		super("string", WSDLDefinition.NS_XSD);
	}

}

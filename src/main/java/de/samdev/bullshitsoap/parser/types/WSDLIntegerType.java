package de.samdev.bullshitsoap.parser.types;

import de.samdev.bullshitsoap.parser.WSDLDefinition;

public class WSDLIntegerType extends WSDLSimpleType {

	public WSDLIntegerType() {
		super("int", WSDLDefinition.NS_XSD);
	}

}

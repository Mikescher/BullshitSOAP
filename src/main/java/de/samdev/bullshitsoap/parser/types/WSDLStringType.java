package de.samdev.bullshitsoap.parser.types;

import de.samdev.bullshitsoap.parser.WSDLDefinition;
import de.samdev.bullshitsoap.parser.WSDLParsingException;

public class WSDLStringType extends WSDLPrimitiveType {

	public WSDLStringType() {
		super("string", WSDLDefinition.NS_XSD);
	}

	@Override
	public Object parseFromString(String value) throws WSDLParsingException {
		return value;
	}
}

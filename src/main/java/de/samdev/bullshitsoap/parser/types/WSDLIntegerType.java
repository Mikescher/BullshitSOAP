package de.samdev.bullshitsoap.parser.types;

import de.samdev.bullshitsoap.parser.WSDLDefinition;
import de.samdev.bullshitsoap.parser.WSDLParsingException;

public class WSDLIntegerType extends WSDLPrimitiveType {

	public WSDLIntegerType() {
		super("int", WSDLDefinition.NS_XSD);
	}

	@Override
	public Object parseFromString(String value) throws WSDLParsingException {
		try {
			return Integer.parseInt(value);
		} catch (NumberFormatException e) {
			throw new WSDLParsingException(e);
		}
	}
}

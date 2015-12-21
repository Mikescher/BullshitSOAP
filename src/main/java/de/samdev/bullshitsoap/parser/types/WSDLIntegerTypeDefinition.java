package de.samdev.bullshitsoap.parser.types;

import de.samdev.bullshitsoap.parser.WSDLDefinition;
import de.samdev.bullshitsoap.parser.WSDLParsingException;

public class WSDLIntegerTypeDefinition extends WSDLPrimitiveTypeDefinition {

	public WSDLIntegerTypeDefinition() {
		super("int", WSDLDefinition.NS_XSD);
	}

	@Override
	public Object parseFromString(String value) throws WSDLParsingException {
		try {
			return Integer.valueOf(value);
		} catch (NumberFormatException e) {
			throw new WSDLParsingException(e);
		}
	}

	@Override
	public String generateClassCode() {
		// TODO IMPLEMENT GENERATE CLASS CODE
		return null;
	}
}

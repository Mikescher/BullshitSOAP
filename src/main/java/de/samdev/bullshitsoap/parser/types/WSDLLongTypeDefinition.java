package de.samdev.bullshitsoap.parser.types;

import de.samdev.bullshitsoap.parser.WSDLDefinition;
import de.samdev.bullshitsoap.parser.WSDLParsingException;

public class WSDLLongTypeDefinition extends WSDLPrimitiveTypeDefinition {

	public WSDLLongTypeDefinition() {
		super("long", WSDLDefinition.NS_XSD);
	}

	@Override
	public Object parseFromString(String value) throws WSDLParsingException {
		try {
			return Long.valueOf(value);
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

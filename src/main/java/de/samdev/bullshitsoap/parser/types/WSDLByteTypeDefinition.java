package de.samdev.bullshitsoap.parser.types;

import de.samdev.bullshitsoap.parser.WSDLDefinition;
import de.samdev.bullshitsoap.parser.WSDLParsingException;

public class WSDLByteTypeDefinition extends WSDLPrimitiveTypeDefinition {

	public WSDLByteTypeDefinition() {
		super("byte", WSDLDefinition.NS_XSD);
	}

	@Override
	public Object parseFromString(String value) throws WSDLParsingException {
		try {
			return Byte.valueOf(value);
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

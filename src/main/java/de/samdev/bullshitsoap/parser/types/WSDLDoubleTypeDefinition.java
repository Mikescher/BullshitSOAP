package de.samdev.bullshitsoap.parser.types;

import de.samdev.bullshitsoap.parser.WSDLDefinition;
import de.samdev.bullshitsoap.parser.WSDLParsingException;

public class WSDLDoubleTypeDefinition extends WSDLPrimitiveTypeDefinition {

	public WSDLDoubleTypeDefinition() {
		super("double", WSDLDefinition.NS_XSD);
	}

	@Override
	public Object parseFromString(String value) throws WSDLParsingException {
		try {
			return Double.valueOf(value);
		} catch (NumberFormatException e) {
			throw new WSDLParsingException(e);
		}
	}

	@Override
	protected String generateClassCodeInternal() {
		// TODO IMPLEMENT GENERATE CLASS CODE
		return null;
	}
}

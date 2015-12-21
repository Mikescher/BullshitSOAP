package de.samdev.bullshitsoap.parser.types;

import de.samdev.bullshitsoap.parser.WSDLDefinition;
import de.samdev.bullshitsoap.parser.WSDLParsingException;

public class WSDLStringTypeDefinition extends WSDLPrimitiveTypeDefinition {

	public WSDLStringTypeDefinition() {
		super("string", WSDLDefinition.NS_XSD);
	}

	@Override
	public Object parseFromString(String value) throws WSDLParsingException {
		return value;
	}

	@Override
	protected String generateClassCodeInternal() {
		// TODO IMPLEMENT GENERATE CLASS CODE
		return null;
	}
}

package de.samdev.bullshitsoap.parser.types;

import de.samdev.bullshitsoap.parser.WSDLDefinition;
import de.samdev.bullshitsoap.parser.WSDLParsingException;

public class WSDLBooleanTypeDefinition extends WSDLPrimitiveTypeDefinition {

	public WSDLBooleanTypeDefinition() {
		super("boolean", WSDLDefinition.NS_XSD);
	}

	@Override
	public Object parseFromString(String value) throws WSDLParsingException {
		if (value.equalsIgnoreCase("true")) return Boolean.TRUE;
		if (value.equalsIgnoreCase("false")) return Boolean.FALSE;
		
		throw new WSDLParsingException("Can'T parse primitive: " + value);
	}

	@Override
	protected String generateClassCodeInternal() {
		// TODO IMPLEMENT GENERATE CLASS CODE
		return null;
	}
}

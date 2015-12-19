package de.samdev.bullshitsoap.parser.types;

import de.samdev.bullshitsoap.parser.WSDLDefinition;
import de.samdev.bullshitsoap.parser.WSDLParsingException;

public class WSDLBooleanType extends WSDLPrimitiveType {

	public WSDLBooleanType() {
		super("boolean", WSDLDefinition.NS_XSD);
	}

	@Override
	public Object parseFromString(String value) throws WSDLParsingException {
		if (value.equalsIgnoreCase("true")) return Boolean.TRUE;
		if (value.equalsIgnoreCase("false")) return Boolean.FALSE;
		
		throw new WSDLParsingException("Can'T parse primitive: " + value);
	}
}

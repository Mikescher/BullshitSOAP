package de.samdev.bullshitsoap.parser.typedefinitions;

import de.samdev.bullshitsoap.parser.WSDLDefinition;
import de.samdev.bullshitsoap.parser.WSDLParsingException;
import de.samdev.bullshitsoap.parser.helper.PathHelper;

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
		return PathHelper.getResourceFile("/WSDLObjectBoolean.java-template");
	}

	@Override
	public String getPrimitiveClassCodeName() {
		return "boolean";
	}
}

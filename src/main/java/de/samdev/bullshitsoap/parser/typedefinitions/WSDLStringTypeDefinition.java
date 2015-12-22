package de.samdev.bullshitsoap.parser.typedefinitions;

import de.samdev.bullshitsoap.parser.WSDLDefinition;
import de.samdev.bullshitsoap.parser.WSDLParsingException;
import de.samdev.bullshitsoap.parser.helper.PathHelper;

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
		return PathHelper.getResourceFile("/WSDLObjectString.java-template");
	}

	@Override
	public String getPrimitiveClassCodeName() {
		return "string";
	}
}

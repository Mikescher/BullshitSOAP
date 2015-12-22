package de.samdev.bullshitsoap.parser.typedefinitions;

import de.samdev.bullshitsoap.parser.WSDLDefinition;
import de.samdev.bullshitsoap.parser.WSDLParsingException;
import de.samdev.bullshitsoap.parser.helper.PathHelper;

public class WSDLFloatTypeDefinition extends WSDLPrimitiveTypeDefinition {

	public WSDLFloatTypeDefinition() {
		super("float", WSDLDefinition.NS_XSD);
	}

	@Override
	public Object parseFromString(String value) throws WSDLParsingException {
		try {
			return Float.valueOf(value);
		} catch (NumberFormatException e) {
			throw new WSDLParsingException(e);
		}
	}

	@Override
	protected String generateClassCodeInternal() {
		return PathHelper.getResourceFile("/WSDLObjectFloat.java-template");
	}

	@Override
	public String getPrimitiveClassCodeName() {
		return "float";
	}
}

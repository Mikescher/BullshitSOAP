package de.samdev.bullshitsoap.parser.typedefinitions;

import de.samdev.bullshitsoap.parser.WSDLDefinition;
import de.samdev.bullshitsoap.parser.WSDLParsingException;
import de.samdev.bullshitsoap.parser.helper.PathHelper;

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
	protected String generateClassCodeInternal() {
		return PathHelper.getResourceFile("/WSDLObjectInt.java-template");
	}

	@Override
	public String getPrimitiveClassCodeName() {
		return "int";
	}
}

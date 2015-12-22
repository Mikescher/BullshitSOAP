package de.samdev.bullshitsoap.parser.typedefinitions;

import de.samdev.bullshitsoap.parser.WSDLDefinition;
import de.samdev.bullshitsoap.parser.WSDLParsingException;
import de.samdev.bullshitsoap.parser.helper.PathHelper;

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
	protected String generateClassCodeInternal() {
		return PathHelper.getResourceFile("/WSDLObjectLong.java-template");
	}

	@Override
	public String getPrimitiveClassCodeName() {
		return "long";
	}

	@Override
	public String generateEnumName(Object object, int i) {
		return "VALUE_" + ((Long)object).toString();
	}

	@Override
	public String generateLiteralCode(Object object) {
		return "new Long(" + ((Long)object).toString() + ")";
	}
}

package de.samdev.bullshitsoap.parser.typedefinitions;

import de.samdev.bullshitsoap.parser.WSDLParsingException;

public abstract class WSDLPrimitiveTypeDefinition extends WSDLSimpleTypeDefinition {

	protected WSDLPrimitiveTypeDefinition(String name, String ns) {
		super(name, ns);
	}

	@Override
	public String GetInternalDebugRepresentation() {
		return "";
	}

	@Override
	public String GetInternalDebugName() {
		return "primitive";
	}

	public abstract Object parseFromString(String value) throws WSDLParsingException;
	
	@Override
	public boolean isPrimitive() {
		return true;
	}

	public abstract String getPrimitiveClassCodeName();
	public abstract String generateEnumName(Object object, int i);
	public abstract String generateLiteralCode(Object object);
}

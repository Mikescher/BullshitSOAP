package de.samdev.bullshitsoap.parser.types;

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
}

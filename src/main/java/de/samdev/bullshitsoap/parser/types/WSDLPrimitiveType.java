package de.samdev.bullshitsoap.parser.types;

import de.samdev.bullshitsoap.parser.WSDLParsingException;

public abstract class WSDLPrimitiveType extends WSDLSimpleType {

	protected WSDLPrimitiveType(String name, String ns) {
		super(name, ns);
	}

	@Override
	public String GetInternalDebugRepresentation() {
		return "primitive";
	}

	public abstract Object parseFromString(String value) throws WSDLParsingException;
}

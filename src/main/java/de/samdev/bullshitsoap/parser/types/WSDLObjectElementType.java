package de.samdev.bullshitsoap.parser.types;

import de.samdev.bullshitsoap.parser.IDebugFormattable;

public class WSDLObjectElementType implements IDebugFormattable {
	public final String name;
	public final WSDLType type;
	
	public WSDLObjectElementType(String name, WSDLType t) {
		this.name = name;
		this.type = t;
	}

	@Override
	public String toDebugString() {
		return String.format("%s: %s", name, type.toDebugString());
	}
}
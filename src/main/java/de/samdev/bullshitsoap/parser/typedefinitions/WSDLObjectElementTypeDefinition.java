package de.samdev.bullshitsoap.parser.typedefinitions;

import de.samdev.bullshitsoap.parser.IDebugFormattable;

public class WSDLObjectElementTypeDefinition implements IDebugFormattable {
	public final String name;
	public final WSDLTypeDefinition type;
	
	public WSDLObjectElementTypeDefinition(String name, WSDLTypeDefinition t) {
		this.name = name;
		this.type = t;
	}

	@Override
	public String toDebugString() {
		return String.format("%s: %s", name, type.toDebugString());
	}
}
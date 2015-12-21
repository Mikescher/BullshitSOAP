package de.samdev.bullshitsoap.parser.messages;

import de.samdev.bullshitsoap.parser.IDebugFormattable;
import de.samdev.bullshitsoap.parser.types.WSDLTypeDefinition;

public class WSDLMessagePart implements IDebugFormattable {
	public final String Name;
	public final WSDLTypeDefinition Type;
	
	public WSDLMessagePart(String name, WSDLTypeDefinition type) {
		super();
		
		Name = name;
		Type = type;
	}

	@Override
	public String toDebugString() {
		return String.format("%s: %s", Name, Type.toDebugString());
	}
}

package de.samdev.bullshitsoap.parser.messagedefinitions;

import de.samdev.bullshitsoap.parser.IDebugFormattable;
import de.samdev.bullshitsoap.parser.typedefinitions.WSDLTypeDefinition;

public class WSDLMessageDefinitionPart implements IDebugFormattable {
	public final String Name;
	public final WSDLTypeDefinition Type;
	
	public WSDLMessageDefinitionPart(String name, WSDLTypeDefinition type) {
		super();
		
		Name = name;
		Type = type;
	}

	@Override
	public String toDebugString() {
		return String.format("%s: %s", Name, Type.toDebugString());
	}
}

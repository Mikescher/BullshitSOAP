package de.samdev.bullshitsoap.parser.typedefinitions;

import de.samdev.bullshitsoap.parser.IDebugFormattable;

public class WSDLSequenceElementTypeDefinition implements IDebugFormattable {
	public final String name;
	public final int minOccurs;
	public final int maxOccurs;
	public final WSDLTypeDefinition type;
	
	public WSDLSequenceElementTypeDefinition(String name, int min, int max, WSDLTypeDefinition t) {
		this.name = name;
		this.minOccurs = min;
		this.maxOccurs = max;
		this.type = t;
	}

	@Override
	public String toDebugString() {
		if (minOccurs == 1 && maxOccurs == 1) 
			return String.format("%s: %s", name, type.toDebugString());
		else if (minOccurs == 0 && maxOccurs == Integer.MAX_VALUE) 
			return String.format("%s: Array of %s", name, type.toDebugString());
		else if (maxOccurs == Integer.MAX_VALUE) 
			return String.format("%s: Array [%d..max] of %s", name, minOccurs, type.toDebugString());
		else
			return String.format("%s: Array [%d..%d] of %s", name, minOccurs, maxOccurs, type.toDebugString());
	}
}
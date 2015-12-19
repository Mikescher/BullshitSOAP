package de.samdev.bullshitsoap.parser.types;

public class WSDLSequenceElementType {
	public final String name;
	public final int minOccurs;
	public final int maxOccurs;
	public final WSDLType type;
	
	public WSDLSequenceElementType(String name, int min, int max, WSDLType t) {
		this.name = name;
		this.minOccurs = min;
		this.maxOccurs = max;
		this.type = t;
	}
}
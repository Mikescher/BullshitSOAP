package de.samdev.bullshitsoap.parser.types;

public class WSDLObjectElementType {
	public final String name;
	public final WSDLType type;
	
	public WSDLObjectElementType(String name, WSDLType t) {
		this.name = name;
		this.type = t;
	}
}
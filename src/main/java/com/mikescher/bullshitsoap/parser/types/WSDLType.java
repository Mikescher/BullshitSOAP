package com.mikescher.bullshitsoap.parser.types;

public abstract class WSDLType {
	
	public final String Namespace;
	public final String Name;
	
	protected WSDLType(String name, String ns) {
		super();
		
		Name = name;
		Namespace = ns;
	}
}

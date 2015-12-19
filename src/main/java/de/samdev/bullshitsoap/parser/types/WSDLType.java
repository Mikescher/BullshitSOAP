package de.samdev.bullshitsoap.parser.types;

public abstract class WSDLType {
	
	public final String Namespace;
	public final String Name;
	
	protected WSDLType(String name, String ns) {
		super();
		
		Name = name;
		Namespace = ns;
	}
	
	public String GetDebugString() {
		return String.format("[%s] %s", Name, GetInternalDebugRepresentation());
	}
	
	public abstract String GetInternalDebugRepresentation();
}

package de.samdev.bullshitsoap.parser.types;

public abstract class WSDLType {
	
	public final String Namespace;
	public final String Name;
	
	protected WSDLType(String name, String ns) {
		super();
		
		Name = name;
		Namespace = ns;
	}
	
	public String toDebugString() {
		return String.format("%s [%s] %s", GetInternalDebugName(), Name, GetInternalDebugRepresentation());
	}
	
	public abstract String GetInternalDebugRepresentation();
	public abstract String GetInternalDebugName();
}

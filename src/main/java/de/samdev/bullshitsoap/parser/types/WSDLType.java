package de.samdev.bullshitsoap.parser.types;

import de.samdev.bullshitsoap.parser.IDebugFormattable;

public abstract class WSDLType implements IDebugFormattable {
	
	public final String Namespace;
	public final String Name;
	
	protected WSDLType(String name, String ns) {
		super();
		
		Name = name;
		Namespace = ns;
	}
	
	@Override
	public String toDebugString() {
		return String.format("%s [%s] %s", GetInternalDebugName(), Name, GetInternalDebugRepresentation());
	}
	
	public abstract String GetInternalDebugRepresentation();
	public abstract String GetInternalDebugName();
}

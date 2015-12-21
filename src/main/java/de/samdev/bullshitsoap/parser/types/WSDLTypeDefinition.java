package de.samdev.bullshitsoap.parser.types;

import de.samdev.bullshitsoap.parser.IDebugFormattable;

public abstract class WSDLTypeDefinition implements IDebugFormattable {
	public final String Namespace;
	public final String Name;
	
	protected WSDLTypeDefinition(String name, String ns) {
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

	public abstract String generateClassCode();
	
	public String getClassCodeName() {
		return "WSDLType" + Name;
	}
}

package de.samdev.bullshitsoap.parser.typedefinitions;

import de.samdev.bullshitsoap.parser.IDebugFormattable;
import de.samdev.bullshitsoap.parser.helper.PathHelper;
import de.samdev.bullshitsoap.parser.helper.WSDLCodeGenerationHelper;

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

	protected abstract String generateClassCodeInternal();
	
	public String getClassCodeName() {
		return "WSDLObject" + Character.toUpperCase(Name.charAt(0)) + Name.substring(1).toLowerCase();
	}
	
	public String generateClassCode(String packageBase) {
		String code = generateClassCodeInternal();
		
		if (code == null) return null;//TODO REMOVE ME
	
		return WSDLCodeGenerationHelper.RefactorPackageDefinitions(packageBase, code);
	}
	
	public static String generateClassCodeObject(String packageBase) {
		return WSDLCodeGenerationHelper.RefactorPackageDefinitions(packageBase, PathHelper.getResourceFile("/WSDLObject.java-template"));
	}

	public abstract boolean isPrimitive();
}

package de.samdev.bullshitsoap.parser.helper;

import java.util.List;

import de.samdev.bullshitsoap.parser.types.WSDLObjectElementType;
import de.samdev.bullshitsoap.parser.types.WSDLSequenceElementType;
import de.samdev.bullshitsoap.parser.types.WSDLType;

public class StringHelper {
	public static String joinStringRep(String glue, List<?> list) {
		StringBuilder b = new StringBuilder();
		
		for (int i = 0; i < list.size(); i++) {
			if (i > 0) b.append(glue);
			
			Object obj = list.get(i);
			
			if (obj instanceof WSDLType) {
				b.append(((WSDLType)obj).toDebugString());
			} else if (obj instanceof WSDLObjectElementType) {
				WSDLObjectElementType allObj = (WSDLObjectElementType)obj;

				b.append(String.format("%s: %s", allObj.name, allObj.type.toDebugString()));
				
			} else if (obj instanceof WSDLSequenceElementType) {
				WSDLSequenceElementType seObj = (WSDLSequenceElementType)obj;
				if (seObj.minOccurs == 1 && seObj.maxOccurs == 1) 
					b.append(String.format("%s: %s", seObj.name, seObj.type.toDebugString()));
				else if (seObj.minOccurs == 0 && seObj.maxOccurs == Integer.MAX_VALUE) 
					b.append(String.format("%s: Array of %s", seObj.name, seObj.type.toDebugString()));
				else if (seObj.maxOccurs == Integer.MAX_VALUE) 
					b.append(String.format("%s: Array [%d..max] of %s", seObj.name, seObj.minOccurs, seObj.type.toDebugString()));
				else
					b.append(String.format("%s: Array [%d..%d] of %s", seObj.name, seObj.minOccurs, seObj.maxOccurs, seObj.type.toDebugString()));
			} else {
				b.append(obj.toString());
			}
			
		}
		
		return b.toString();
	}
	
	public static String join(String glue, String[] list) {
		StringBuilder b = new StringBuilder();
		
		for (int i = 0; i < list.length; i++) {
			if (i > 0) b.append(glue);
			
			b.append(list[i].toString());
		}
		
		return b.toString();
	}
	
	public static String join(String glue, WSDLType[] list) {
		StringBuilder b = new StringBuilder();
		
		for (int i = 0; i < list.length; i++) {
			if (i > 0) b.append(glue);
			
			b.append(list[i].toDebugString());
		}
		
		return b.toString();
	}

	public static String indent(String join) {
		String[] lines = join.split("\r\n");
		for (int i = 0; i < lines.length; i++) {
			lines[i] = "    " + lines[i];
		}
		return join("\r\n", lines);
	}
}

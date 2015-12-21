package de.samdev.bullshitsoap.parser.helper;

import java.util.List;

import de.samdev.bullshitsoap.parser.IDebugFormattable;
import de.samdev.bullshitsoap.parser.types.WSDLTypeDefinition;

public class StringHelper {
	public static String joinStringRep(String glue, List<?> list) {
		StringBuilder b = new StringBuilder();
		
		for (int i = 0; i < list.size(); i++) {
			if (i > 0) b.append(glue);
			
			Object obj = list.get(i);
			
			if (obj instanceof IDebugFormattable) {
				b.append(((IDebugFormattable)obj).toDebugString());
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
	
	public static String join(String glue, WSDLTypeDefinition[] list) {
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

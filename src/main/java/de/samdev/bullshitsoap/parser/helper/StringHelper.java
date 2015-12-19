package de.samdev.bullshitsoap.parser.helper;

import java.util.List;

import de.samdev.bullshitsoap.parser.types.WSDLType;

public class StringHelper {
	public static String join(String glue, List<?> list) {
		StringBuilder b = new StringBuilder();
		
		for (int i = 0; i < list.size(); i++) {
			if (i > 0) b.append(glue);
			
			if (list.get(i) instanceof WSDLType) b.append(((WSDLType)list.get(i)).GetDebugString());
			else b.append(list.get(i).toString());
		}
		
		return b.toString();
	}
}

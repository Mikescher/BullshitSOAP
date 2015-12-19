package de.samdev.bullshitsoap.parser.helper;

import java.util.List;

public class StringHelper {
	public static String join(String glue, List<?> list) {
		StringBuilder b = new StringBuilder();
		
		for (int i = 0; i < list.size(); i++) {
			if (i > 0) b.append(glue);
			b.append(list.get(i).toString());
		}
		
		return b.toString();
	}
}

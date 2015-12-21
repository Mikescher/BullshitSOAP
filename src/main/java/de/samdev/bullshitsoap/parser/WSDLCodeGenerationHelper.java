package de.samdev.bullshitsoap.parser;

import java.util.regex.Matcher;

import de.samdev.bullshitsoap.parser.helper.StringHelper;

public class WSDLCodeGenerationHelper {
	public static String RefactorPackageDefinitions(String packageBase, String code) {
		String[] lines = code.split("\r\n");
		
		for (int i = 0; i < lines.length; i++) {
			if (lines[i].trim().startsWith("package")) {
				lines[i] = lines[i].replaceAll(Matcher.quoteReplacement("de.samdev.bullshitsoap.templates"), packageBase);
			} else if (lines[i].trim().startsWith("import")) {
				lines[i] = lines[i].replaceAll(Matcher.quoteReplacement("de.samdev.bullshitsoap.templates"), packageBase);
			}
		}
		
		return StringHelper.join("\r\n", lines);
	}
}

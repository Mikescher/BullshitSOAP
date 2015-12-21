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
		
		code = StringHelper.join("\r\n", lines);
		
		StringBuilder buildr = new StringBuilder();
		
		buildr.append("/****************************************************************************** " + "\r\n");
		buildr.append(" *                                                                            * " + "\r\n");
		buildr.append(" *           THIS CODE WAS CREATED BY BULLSHITSOAP - DO NOT CHANGE            * " + "\r\n");
		buildr.append(" *                                                                            * " + "\r\n");
		buildr.append(" ******************************************************************************/");
		
		code = code.replace("/**DISCLAIMER**/", buildr.toString());
		
		return code;
	}
}

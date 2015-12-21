package de.samdev.bullshitsoap.parser.helper;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class PathHelper {
	public final static String LINE_END = System.getProperty("line.separator");
	
	public static String combinePaths(String base, String... more) {
		File file = new File(base);

		for (int i = 0; i < more.length ; i++) {
			file = new File(file, more[i]);
		}

		return file.getPath();
	}

	public static void writeTextFile(File file, String content) {
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(file));
			writer.write (content);

			writer.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static String getResourceFile(String resourcename) {
		try {
			BufferedReader reader = null;
			StringBuffer content = new StringBuffer();
			
			try {
				InputStream is = new PathHelper().getClass().getResourceAsStream(resourcename);
				if (is == null) throw new IOException();
				reader = new BufferedReader(new InputStreamReader(is));
				String s = null;
				boolean first = true;

				while ((s = reader.readLine()) != null) {
					if (!first) {
						content.append(LINE_END);
					}
					content.append(s);
					first = false;
				}
			} finally {
				if (reader != null) {
					reader.close();
				}
			}
			return content.toString();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}

package de.samdev.bullshitsoap.parser.helper;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class PathHelper {
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
}

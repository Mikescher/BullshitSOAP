package de.samdev.bullshitsoap;

import java.util.ArrayList;
import java.util.List;

public class DebugLogger {

	interface DebugLogListener {
		void OnLog(String log);
	}

	private static List<DebugLogListener> listeners = new ArrayList<DebugLogListener>();

	public static void addListener(DebugLogListener toAdd) {
		listeners.add(toAdd);
	}
	
	public static void Log(String log) {
		System.out.println(log);

		for (DebugLogListener dll : listeners) dll.OnLog(log);
	}
	
	public static void Log(String format, Object... args) {
		String log = String.format(format, args);

		System.out.println(log);
		System.out.println();

		for (DebugLogListener dll : listeners) dll.OnLog(log);
	}
}

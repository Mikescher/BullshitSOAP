package de.samdev.bullshitsoap.parser;

public class WSDLParsingException extends Exception {
	private static final long serialVersionUID = -6359144828943494723L;

	public WSDLParsingException(String message) {
		super(message);
	}
	
	public WSDLParsingException(String message, Throwable cause) {
		super(message, cause);
	}
	
	public WSDLParsingException(Throwable cause) {
		super(cause);
	}
}

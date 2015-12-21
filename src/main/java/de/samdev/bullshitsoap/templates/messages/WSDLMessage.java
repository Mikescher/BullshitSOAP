package de.samdev.bullshitsoap.templates.messages;

import nu.xom.Document;

public abstract class WSDLMessage {
	protected final String namespace;
	
	protected WSDLMessage(String ns) {
		namespace = ns;
	}
	
	public abstract Document serialize();
}

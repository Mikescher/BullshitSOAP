package de.samdev.bullshitsoap.templates.types;

import nu.xom.Element;

public abstract class WSDLObject {
	protected WSDLObject() {
		//--
	}
	
	public abstract Element serialize(String name);
}

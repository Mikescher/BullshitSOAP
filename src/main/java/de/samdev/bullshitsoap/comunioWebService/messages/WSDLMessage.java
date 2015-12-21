package de.samdev.bullshitsoap.comunioWebService.messages;

import nu.xom.Document;

/****************************************************************************** 
 *                                                                            * 
 *           THIS CODE WAS CREATED BY BULLSHITSOAP - DO NOT CHANGE            * 
 *                                                                            * 
 ******************************************************************************/

public abstract class WSDLMessage {
	protected final String namespace;
	
	protected WSDLMessage(String ns) {
		namespace = ns;
	}
	
	public abstract Document serialize();
}
package de.samdev.bullshitsoap.comunioWebService.types;

import nu.xom.Element;

/****************************************************************************** 
 *                                                                            * 
 *           THIS CODE WAS CREATED BY BULLSHITSOAP - DO NOT CHANGE            * 
 *                                                                            * 
 ******************************************************************************/

public abstract class WSDLObject {
	protected WSDLObject() {
		//--
	}
	
	public abstract Element serialize(String name);
}
package de.samdev.bullshitsoap.templates.types;

import java.io.IOException;

import de.samdev.bullshitsoap.comunioWebService.WSDLNamespaceCollection;
import de.samdev.bullshitsoap.comunioWebService.types.WSDLObject;
import nu.xom.Attribute;
import nu.xom.Attribute.Type;
import nu.xom.Element;

/****************************************************************************** 
 *                                                                            * 
 *           THIS CODE WAS CREATED BY BULLSHITSOAP - DO NOT CHANGE            * 
 *                                                                            * 
 ******************************************************************************/

public class WSDLObjectBoolean extends WSDLObject {
	private final boolean value;
	
	private WSDLObjectBoolean(boolean v) {
		super();
		
		value = v;
	}
	
	@Override
	public Element serialize(String name) {
		Element result = new Element(name);
		
		result.addAttribute(new Attribute(
				"type", 
				WSDLNamespaceCollection.NAMESPACE_PREFIX_XML_SCHEMAINSTANCE, 
				WSDLNamespaceCollection.NAMESPACE_PREFIX_XML_SCHEMA + ":boolean", 
				Type.CDATA));
		
		result.appendChild(value ? "true" : "false");
		
		return null;
	}
	
	public static WSDLObjectBoolean createFromXML(Element e) throws IOException {
		if (e.getValue().equalsIgnoreCase("true")) return new WSDLObjectBoolean(true);
		if (e.getValue().equalsIgnoreCase("false")) return new WSDLObjectBoolean(false);

		throw new IOException();
	}
	
	public static WSDLObjectBoolean create(boolean v) {
		return new WSDLObjectBoolean(v);
	}
}
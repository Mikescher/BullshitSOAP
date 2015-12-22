package de.samdev.bullshitsoap.comunioWebService.types;

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
	public final boolean value;
	
	private WSDLObjectBoolean(boolean v) {
		super();
		
		value = v;
	}
	
	@Override
	public Element serialize(String name) {
		Element result = new Element(name);
		
		result.addAttribute(new Attribute(
				WSDLNamespaceCollection.NAMESPACE_PREFIX_XML_SCHEMAINSTANCE + ":" + "type", 
				WSDLNamespaceCollection.NAMESPACE_PATH_XML_SCHEMAINSTANCE, 
				WSDLNamespaceCollection.NAMESPACE_PREFIX_XML_SCHEMA + ":boolean", 
				Type.CDATA));
		
		result.appendChild(value ? "true" : "false");
		
		return result;
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
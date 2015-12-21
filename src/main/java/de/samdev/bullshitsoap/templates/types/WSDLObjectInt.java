package de.samdev.bullshitsoap.templates.types;

import de.samdev.bullshitsoap.templates.WSDLNamespaceCollection;
import nu.xom.Attribute;
import nu.xom.Attribute.Type;
import nu.xom.Element;

/**DISCLAIMER**/

public class WSDLObjectInt extends WSDLObject {
	private final int value;
	
	private WSDLObjectInt(int v) {
		super();
		
		value = v;
	}
	
	@Override
	public Element serialize(String name) {
		Element result = new Element(name);
		
		result.addAttribute(new Attribute("type", WSDLNamespaceCollection.NAMESPACE_PREFIX_XML_SCHEMAINSTANCE, WSDLNamespaceCollection.NAMESPACE_PREFIX_XML_SCHEMA + ":int", Type.CDATA));
		result.appendChild(Integer.toString(value));
		
		return null;
	}
	
	public static WSDLObjectInt createFromXML(Element e) throws NumberFormatException {
		return new WSDLObjectInt(Integer.valueOf(e.getValue()));
	}
	
	public static WSDLObjectInt create(int v) {
		return new WSDLObjectInt(v);
	}
}

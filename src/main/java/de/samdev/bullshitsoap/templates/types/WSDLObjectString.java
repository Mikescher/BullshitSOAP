package de.samdev.bullshitsoap.templates.types;

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

public class WSDLObjectString extends WSDLObject {
	private final String value;
	
	private WSDLObjectString(String v) {
		super();
		
		value = v;
	}
	
	@Override
	public Element serialize(String name) {
		Element result = new Element(name);
		
		result.addAttribute(new Attribute(
				"type", 
				WSDLNamespaceCollection.NAMESPACE_PREFIX_XML_SCHEMAINSTANCE, 
				WSDLNamespaceCollection.NAMESPACE_PREFIX_XML_SCHEMA + ":string", 
				Type.CDATA));
		
		result.appendChild(value);
		
		return null;
	}
	
	public static WSDLObjectString createFromXML(Element e) {
		return new WSDLObjectString(e.getValue());
	}
	
	public static WSDLObjectString create(String v) {
		return new WSDLObjectString(v);
	}
}
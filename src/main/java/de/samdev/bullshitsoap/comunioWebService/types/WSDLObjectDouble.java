package de.samdev.bullshitsoap.comunioWebService.types;

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

public class WSDLObjectDouble extends WSDLObject {
	private final float value;
	
	private WSDLObjectDouble(float v) {
		super();
		
		value = v;
	}
	
	@Override
	public Element serialize(String name) {
		Element result = new Element(name);

		result.addAttribute(new Attribute(
				"type", 
				WSDLNamespaceCollection.NAMESPACE_PREFIX_XML_SCHEMAINSTANCE, 
				WSDLNamespaceCollection.NAMESPACE_PREFIX_XML_SCHEMA + ":double", 
				Type.CDATA));
		
		result.appendChild(Float.toString(value));
		
		return null;
	}
	
	public static WSDLObjectDouble createFromXML(Element e) throws NumberFormatException {
		return new WSDLObjectDouble(Float.valueOf(e.getValue()));
	}
	
	public static WSDLObjectDouble create(float v) {
		return new WSDLObjectDouble(v);
	}
}
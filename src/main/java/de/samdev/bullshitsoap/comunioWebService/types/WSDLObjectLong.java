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

public class WSDLObjectLong extends WSDLObject {
	public final long value;
	
	private WSDLObjectLong(long v) {
		super();
		
		value = v;
	}
	
	@Override
	public Element serialize(String name) {
		Element result = new Element(name);

		result.addAttribute(new Attribute(
				WSDLNamespaceCollection.NAMESPACE_PREFIX_XML_SCHEMAINSTANCE + ":" + "type", 
				WSDLNamespaceCollection.NAMESPACE_PATH_XML_SCHEMAINSTANCE, 
				WSDLNamespaceCollection.NAMESPACE_PREFIX_XML_SCHEMA + ":long", 
				Type.CDATA));
		
		result.appendChild(Long.toString(value));
		
		return result;
	}
	
	public static WSDLObjectLong createFromXML(Element e) throws NumberFormatException {
		return new WSDLObjectLong(Integer.valueOf(e.getValue()));
	}
	
	public static WSDLObjectLong create(long v) {
		return new WSDLObjectLong(v);
	}
}
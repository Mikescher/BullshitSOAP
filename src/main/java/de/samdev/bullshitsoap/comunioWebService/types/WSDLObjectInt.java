package de.samdev.bullshitsoap.comunioWebService.types;

import de.samdev.bullshitsoap.comunioWebService.WSDLNamespaceCollection;
import nu.xom.Attribute;
import nu.xom.Attribute.Type;
import nu.xom.Element;

/****************************************************************************** 
 *                                                                            * 
 *           THIS CODE WAS CREATED BY BULLSHITSOAP - DO NOT CHANGE            * 
 *                                                                            * 
 ******************************************************************************/

public class WSDLObjectInt extends WSDLObject {
	public final int value;
	
	private WSDLObjectInt(int v) {
		super();
		
		value = v;
	}
	
	@Override
	public Element serialize(String name) {
		Element result = new Element(name);
		
		result.addAttribute(new Attribute(
				WSDLNamespaceCollection.NAMESPACE_PREFIX_XML_SCHEMAINSTANCE + ":" + "type", 
				WSDLNamespaceCollection.NAMESPACE_PATH_XML_SCHEMAINSTANCE, 
				WSDLNamespaceCollection.NAMESPACE_PREFIX_XML_SCHEMA + ":int", 
				Type.CDATA));
		  
		result.appendChild(Integer.toString(value));
		
		return result;
	}
	
	public static WSDLObjectInt createFromXML(Element e) throws NumberFormatException {
		return new WSDLObjectInt(Integer.valueOf(e.getValue()));
	}
	
	public static WSDLObjectInt create(int v) {
		return new WSDLObjectInt(v);
	}
}
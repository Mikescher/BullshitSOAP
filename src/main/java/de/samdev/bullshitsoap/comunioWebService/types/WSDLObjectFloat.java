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

public class WSDLObjectFloat extends WSDLObject {
	public final double value;
	
	private WSDLObjectFloat(double v) {
		super();
		
		value = v;
	}
	
	@Override
	public Element serialize(String name) {
		Element result = new Element(name);

		result.addAttribute(new Attribute(
				"type", 
				WSDLNamespaceCollection.NAMESPACE_PREFIX_XML_SCHEMAINSTANCE, 
				WSDLNamespaceCollection.NAMESPACE_PREFIX_XML_SCHEMA + ":float", 
				Type.CDATA));
		
		result.appendChild(Double.toString(value));
		
		return null;
	}
	
	public static WSDLObjectFloat createFromXML(Element e) throws NumberFormatException {
		return new WSDLObjectFloat(Double.valueOf(e.getValue()));
	}
	
	public static WSDLObjectFloat create(double v) {
		return new WSDLObjectFloat(v);
	}
}
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

public class WSDLObjectByte extends WSDLObject {
	private final byte value;
	
	private WSDLObjectByte(byte v) {
		super();
		
		value = v;
	}
	
	@Override
	public Element serialize(String name) {
		Element result = new Element(name);

		result.addAttribute(new Attribute(
				"type", 
				WSDLNamespaceCollection.NAMESPACE_PREFIX_XML_SCHEMAINSTANCE, 
				WSDLNamespaceCollection.NAMESPACE_PREFIX_XML_SCHEMA + ":byte", 
				Type.CDATA));
		
		result.appendChild(Integer.toString(value));
		
		return null;
	}
	
	public static WSDLObjectByte createFromXML(Element e) throws NumberFormatException {
		return new WSDLObjectByte(Byte.valueOf(e.getValue()));
	}
	
	public static WSDLObjectByte create(byte v) {
		return new WSDLObjectByte(v);
	}
}
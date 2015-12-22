package de.samdev.bullshitsoap.comunioWebService.types;

import java.io.IOException;

import de.samdev.bullshitsoap.comunioWebService.WSDLNamespaceCollection;
import nu.xom.Attribute;
import nu.xom.Element;
import nu.xom.Attribute.Type;

public class WSDLObjectActive_starter extends WSDLObject {
	public enum EnumValue_Active_starter {
		FALSE("false"),
		TRUE("true"),
		SUBSTITUTE("substitute");
		
		public final String representation;
		
		EnumValue_Active_starter(String rep) {
			representation = rep;
		}
	}
	
	public final EnumValue_Active_starter value;
	
	private WSDLObjectActive_starter(EnumValue_Active_starter v) {
		super();
		
		value = v;
	}

	@Override
	public Element serialize(String name) {
		Element result = new Element(name);
		
		result.addAttribute(new Attribute(
				"type", 
				WSDLNamespaceCollection.NAMESPACE_PREFIX_XML_SCHEMAINSTANCE, 
				WSDLNamespaceCollection.NAMESPACE_PREFIX_SERVICE_BASE + ":" + "Active_starter", 
				Type.CDATA));
		
		result.appendChild(value.representation);
		
		return null;
	}
	
	public static WSDLObjectActive_starter createFromXML(Element e) throws IOException {
		if (e.getValue().equalsIgnoreCase("false".toString())) return new WSDLObjectActive_starter(EnumValue_Active_starter.FALSE);
		if (e.getValue().equalsIgnoreCase("true".toString())) return new WSDLObjectActive_starter(EnumValue_Active_starter.TRUE);
		if (e.getValue().equalsIgnoreCase("substitute".toString())) return new WSDLObjectActive_starter(EnumValue_Active_starter.SUBSTITUTE);

		throw new IOException();
	}
	
	public static WSDLObjectActive_starter create(EnumValue_Active_starter v) {
		return new WSDLObjectActive_starter(v);
	}
}
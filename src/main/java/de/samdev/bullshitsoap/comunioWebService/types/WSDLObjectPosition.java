package de.samdev.bullshitsoap.comunioWebService.types;

import java.io.IOException;

import de.samdev.bullshitsoap.comunioWebService.WSDLNamespaceCollection;
import nu.xom.Attribute;
import nu.xom.Element;
import nu.xom.Attribute.Type;

public class WSDLObjectPosition extends WSDLObject {
	public enum EnumValue_Position {
		KEEPER("keeper"),
		DEFENDER("defender"),
		MIDFIELDER("midfielder"),
		STRIKER("striker");
		
		public final String representation;
		
		EnumValue_Position(String rep) {
			representation = rep;
		}
	}
	
	public final EnumValue_Position value;
	
	private WSDLObjectPosition(EnumValue_Position v) {
		super();
		
		value = v;
	}

	@Override
	public Element serialize(String name) {
		Element result = new Element(name);
		
		result.addAttribute(new Attribute(
				"type", 
				WSDLNamespaceCollection.NAMESPACE_PREFIX_XML_SCHEMAINSTANCE, 
				WSDLNamespaceCollection.NAMESPACE_PREFIX_SERVICE_BASE + ":" + "Position", 
				Type.CDATA));
		
		result.appendChild(value.representation);
		
		return null;
	}
	
	public static WSDLObjectPosition createFromXML(Element e) throws IOException {
		if (e.getValue().equalsIgnoreCase("keeper".toString())) return new WSDLObjectPosition(EnumValue_Position.KEEPER);
		if (e.getValue().equalsIgnoreCase("defender".toString())) return new WSDLObjectPosition(EnumValue_Position.DEFENDER);
		if (e.getValue().equalsIgnoreCase("midfielder".toString())) return new WSDLObjectPosition(EnumValue_Position.MIDFIELDER);
		if (e.getValue().equalsIgnoreCase("striker".toString())) return new WSDLObjectPosition(EnumValue_Position.STRIKER);

		throw new IOException();
	}
	
	public static WSDLObjectPosition create(EnumValue_Position v) {
		return new WSDLObjectPosition(v);
	}
}
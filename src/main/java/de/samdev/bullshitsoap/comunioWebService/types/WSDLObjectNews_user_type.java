package de.samdev.bullshitsoap.comunioWebService.types;

import java.io.IOException;

import de.samdev.bullshitsoap.comunioWebService.WSDLNamespaceCollection;
import nu.xom.Attribute;
import nu.xom.Element;
import nu.xom.Attribute.Type;

public class WSDLObjectNews_user_type extends WSDLObject {
	public enum EnumValue_news_user_type {
		ALL("ALL"),
		TMP_PLUS_USER("TMP_PLUS_USER"),
		USER("USER"),
		PLUS_USER("PLUS_USER"),
		PRO_USER("PRO_USER"),
		PLUS_PRO_USER("PLUS_PRO_USER"),
		BASIC_PLUS_USER("BASIC_PLUS_USER"),
		UNPAID_PLUS_USER("UNPAID_PLUS_USER"),
		UNPAID_PRO_USER("UNPAID_PRO_USER"),
		UNPAID_USER("UNPAID_USER"),
		EXPIRING_PLUS_USER("EXPIRING_PLUS_USER"),
		EXPIRING_PRO_USER("EXPIRING_PRO_USER"),
		EXPIRING_USER("EXPIRING_USER");
		
		public final String representation;
		
		EnumValue_news_user_type(String rep) {
			representation = rep;
		}
	}
	
	public final EnumValue_news_user_type value;
	
	private WSDLObjectNews_user_type(EnumValue_news_user_type v) {
		super();
		
		value = v;
	}

	@Override
	public Element serialize(String name) {
		Element result = new Element(name);
		
		result.addAttribute(new Attribute(
				"type", 
				WSDLNamespaceCollection.NAMESPACE_PREFIX_XML_SCHEMAINSTANCE, 
				WSDLNamespaceCollection.NAMESPACE_PREFIX_SERVICE_BASE + ":" + "news_user_type", 
				Type.CDATA));
		
		result.appendChild(value.representation);
		
		return null;
	}
	
	public static WSDLObjectNews_user_type createFromXML(Element e) throws IOException {
		if (e.getValue().equalsIgnoreCase("ALL".toString())) return new WSDLObjectNews_user_type(EnumValue_news_user_type.ALL);
		if (e.getValue().equalsIgnoreCase("TMP_PLUS_USER".toString())) return new WSDLObjectNews_user_type(EnumValue_news_user_type.TMP_PLUS_USER);
		if (e.getValue().equalsIgnoreCase("USER".toString())) return new WSDLObjectNews_user_type(EnumValue_news_user_type.USER);
		if (e.getValue().equalsIgnoreCase("PLUS_USER".toString())) return new WSDLObjectNews_user_type(EnumValue_news_user_type.PLUS_USER);
		if (e.getValue().equalsIgnoreCase("PRO_USER".toString())) return new WSDLObjectNews_user_type(EnumValue_news_user_type.PRO_USER);
		if (e.getValue().equalsIgnoreCase("PLUS_PRO_USER".toString())) return new WSDLObjectNews_user_type(EnumValue_news_user_type.PLUS_PRO_USER);
		if (e.getValue().equalsIgnoreCase("BASIC_PLUS_USER".toString())) return new WSDLObjectNews_user_type(EnumValue_news_user_type.BASIC_PLUS_USER);
		if (e.getValue().equalsIgnoreCase("UNPAID_PLUS_USER".toString())) return new WSDLObjectNews_user_type(EnumValue_news_user_type.UNPAID_PLUS_USER);
		if (e.getValue().equalsIgnoreCase("UNPAID_PRO_USER".toString())) return new WSDLObjectNews_user_type(EnumValue_news_user_type.UNPAID_PRO_USER);
		if (e.getValue().equalsIgnoreCase("UNPAID_USER".toString())) return new WSDLObjectNews_user_type(EnumValue_news_user_type.UNPAID_USER);
		if (e.getValue().equalsIgnoreCase("EXPIRING_PLUS_USER".toString())) return new WSDLObjectNews_user_type(EnumValue_news_user_type.EXPIRING_PLUS_USER);
		if (e.getValue().equalsIgnoreCase("EXPIRING_PRO_USER".toString())) return new WSDLObjectNews_user_type(EnumValue_news_user_type.EXPIRING_PRO_USER);
		if (e.getValue().equalsIgnoreCase("EXPIRING_USER".toString())) return new WSDLObjectNews_user_type(EnumValue_news_user_type.EXPIRING_USER);

		throw new IOException();
	}
	
	public static WSDLObjectNews_user_type create(EnumValue_news_user_type v) {
		return new WSDLObjectNews_user_type(v);
	}
}
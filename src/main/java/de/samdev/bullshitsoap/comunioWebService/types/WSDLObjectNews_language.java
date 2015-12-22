package de.samdev.bullshitsoap.comunioWebService.types;

import java.io.IOException;

import de.samdev.bullshitsoap.comunioWebService.WSDLNamespaceCollection;
import nu.xom.Attribute;
import nu.xom.Element;
import nu.xom.Attribute.Type;

public class WSDLObjectNews_language extends WSDLObject {
	public enum EnumValue_news_language {
		ANY("ANY"),
		EN_US("en_US"),
		DE_DE("de_DE"),
		ES_ES("es_ES"),
		FR_FR("fr_FR"),
		TR_TR("tr_TR"),
		IT_IT("it_IT"),
		PT_PT("pt_PT"),
		PT_BR("pt_BR"),
		EL_GR("el_GR"),
		NL_NL("nl_NL");
		
		public final String representation;
		
		EnumValue_news_language(String rep) {
			representation = rep;
		}
	}
	
	public final EnumValue_news_language value;
	
	private WSDLObjectNews_language(EnumValue_news_language v) {
		super();
		
		value = v;
	}

	@Override
	public Element serialize(String name) {
		Element result = new Element(name);
		
		result.addAttribute(new Attribute(
				"type", 
				WSDLNamespaceCollection.NAMESPACE_PREFIX_XML_SCHEMAINSTANCE, 
				WSDLNamespaceCollection.NAMESPACE_PREFIX_SERVICE_BASE + ":" + "news_language", 
				Type.CDATA));
		
		result.appendChild(value.representation);
		
		return null;
	}
	
	public static WSDLObjectNews_language createFromXML(Element e) throws IOException {
		if (e.getValue().equalsIgnoreCase("ANY".toString())) return new WSDLObjectNews_language(EnumValue_news_language.ANY);
		if (e.getValue().equalsIgnoreCase("en_US".toString())) return new WSDLObjectNews_language(EnumValue_news_language.EN_US);
		if (e.getValue().equalsIgnoreCase("de_DE".toString())) return new WSDLObjectNews_language(EnumValue_news_language.DE_DE);
		if (e.getValue().equalsIgnoreCase("es_ES".toString())) return new WSDLObjectNews_language(EnumValue_news_language.ES_ES);
		if (e.getValue().equalsIgnoreCase("fr_FR".toString())) return new WSDLObjectNews_language(EnumValue_news_language.FR_FR);
		if (e.getValue().equalsIgnoreCase("tr_TR".toString())) return new WSDLObjectNews_language(EnumValue_news_language.TR_TR);
		if (e.getValue().equalsIgnoreCase("it_IT".toString())) return new WSDLObjectNews_language(EnumValue_news_language.IT_IT);
		if (e.getValue().equalsIgnoreCase("pt_PT".toString())) return new WSDLObjectNews_language(EnumValue_news_language.PT_PT);
		if (e.getValue().equalsIgnoreCase("pt_BR".toString())) return new WSDLObjectNews_language(EnumValue_news_language.PT_BR);
		if (e.getValue().equalsIgnoreCase("el_GR".toString())) return new WSDLObjectNews_language(EnumValue_news_language.EL_GR);
		if (e.getValue().equalsIgnoreCase("nl_NL".toString())) return new WSDLObjectNews_language(EnumValue_news_language.NL_NL);

		throw new IOException();
	}
	
	public static WSDLObjectNews_language create(EnumValue_news_language v) {
		return new WSDLObjectNews_language(v);
	}
}
package de.samdev.bullshitsoap.parser;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import de.samdev.bullshitsoap.parser.types.WSDLSimpleType;
import de.samdev.bullshitsoap.parser.types.WSDLType;
import nu.xom.Builder;
import nu.xom.Document;
import nu.xom.Element;
import nu.xom.Elements;
import nu.xom.ParsingException;
import nu.xom.ValidityException;

public class WSDLDefinition {
	private final static String NS_WSDL = "http://schemas.xmlsoap.org/wsdl/";
	private final static String NS_SOAP = "http://schemas.xmlsoap.org/wsdl/soap/";
	private final static String NS_XSD  = "http://www.w3.org/2001/XMLSchema";
	private final static String NS_XSI  = "http://www.w3.org/2001/XMLSchema-instance";

	private List<WSDLType> types = new ArrayList<>();
	
	public WSDLDefinition(String xml, String name) throws ValidityException, ParsingException, IOException {
		super();

		parseWSDL(xml, name);
	}

	private void parseWSDL(String xml, String defName) throws ParsingException, ValidityException, IOException {
		Builder parser = new Builder();
		Document doc = parser.build(xml, null);

		Element root = doc.getRootElement();

		Element types = root.getFirstChildElement("types", NS_WSDL);

		parseTypes(types);
	}

	private void parseTypes(Element root) {
		Element schema = root.getFirstChildElement("schema");
		String targetNS = schema.getAttributeValue("targetNamespace");
		
		Elements simpleTypes = schema.getChildElements("simpleType", NS_XSD);
		for (int i = 0; i < simpleTypes.size(); i++) {
			Element simpleTypeXML = simpleTypes.get(i);

			types.add(WSDLSimpleType.createFromWSDL(simpleTypeXML, targetNS));
		}
		
		Elements complexTypes = schema.getChildElements("complexType", NS_XSD);
		for (int i = 0; i < complexTypes.size(); i++) {
			Element complexTypeXML = complexTypes.get(i);

			types.add(WSDLSimpleType.createFromWSDL(complexTypeXML, targetNS));
		}
	}

}

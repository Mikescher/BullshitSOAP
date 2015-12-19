package de.samdev.bullshitsoap.parser.types;

import java.util.ArrayList;
import java.util.List;

import de.samdev.bullshitsoap.parser.WSDLDefinition;
import de.samdev.bullshitsoap.parser.WSDLParsingException;
import de.samdev.bullshitsoap.parser.helper.StringHelper;
import nu.xom.Element;
import nu.xom.Elements;

public class WSDLSequenceType extends WSDLComplexType {
	private final List<WSDLSequenceElementType> fields;
	
	protected WSDLSequenceType(String name, String ns, List<WSDLSequenceElementType> fieldList) {
		super(name, ns);
		
		fields = fieldList;
	}

	public static WSDLSequenceType createFromWSDL(WSDLDefinition wsdl, String name, String namespace, Element root) throws NumberFormatException, WSDLParsingException {
		List<WSDLSequenceElementType> fields = new ArrayList<WSDLSequenceElementType>();

		int baseMinOccurs = 1;
		int baseMaxOccurs = 1;
		
		if (root.getAttribute("minOccurs") != null) baseMinOccurs = parseBound(root.getAttributeValue("minOccurs"));
		if (root.getAttribute("maxOccurs") != null) baseMinOccurs = parseBound(root.getAttributeValue("maxOccurs"));
		
		Elements elements = root.getChildElements("element", WSDLDefinition.NS_XSD);
		for (int i = 0; i < elements.size(); i++) {
			Element element = elements.get(i);
			
			int minOccurs = baseMinOccurs;
			int maxOccurs = baseMaxOccurs;

			if (element.getAttribute("minOccurs") != null) minOccurs = parseBound(element.getAttributeValue("minOccurs"));
			if (element.getAttribute("maxOccurs") != null) maxOccurs = parseBound(element.getAttributeValue("maxOccurs"));
			
			WSDLType type = wsdl.getWSDLType(element.getAttributeValue("type"));
			String elementName = element.getAttributeValue("name");
			
			fields.add(new WSDLSequenceElementType(elementName, minOccurs, maxOccurs, type));
		}
		
		return new WSDLSequenceType(name, namespace, fields);
	}
	
	private static int parseBound(String value) {
		if (value.equalsIgnoreCase("unbounded")) return Integer.MAX_VALUE;
		
		return Integer.valueOf(value);
	}

	@Override
	public String GetInternalDebugRepresentation() {
		return "\r\n{\r\n" + StringHelper.indent(StringHelper.joinStringRep("\r\n", fields)) + "\r\n}";
	}

	@Override
	public String GetInternalDebugName() {
		return "sequence";
	}
}

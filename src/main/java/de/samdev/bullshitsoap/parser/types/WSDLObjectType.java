package de.samdev.bullshitsoap.parser.types;

import java.util.ArrayList;
import java.util.List;

import de.samdev.bullshitsoap.parser.WSDLDefinition;
import de.samdev.bullshitsoap.parser.WSDLParsingException;
import de.samdev.bullshitsoap.parser.helper.StringHelper;
import nu.xom.Element;
import nu.xom.Elements;

public class WSDLObjectType extends WSDLComplexType {

	private final List<WSDLObjectElementType> fields;
	
	protected WSDLObjectType(String name, String ns, List<WSDLObjectElementType> elements) {
		super(name, ns);
		
		fields = elements;
	}

	public static WSDLObjectType createFromWSDL(WSDLDefinition wsdl, String name, String namespace, Element root) throws NumberFormatException, WSDLParsingException {
		List<WSDLObjectElementType> types = new ArrayList<WSDLObjectElementType>();
		
		Elements elements = root.getChildElements("element", WSDLDefinition.NS_XSD);
		for (int i = 0; i < elements.size(); i++) {
			Element element = elements.get(i);
			
			WSDLType type = wsdl.getWSDLType(element.getAttributeValue("type"));
			String elementName = element.getAttributeValue("name");
			
			types.add(new WSDLObjectElementType(elementName, type));
		}
		
		return new WSDLObjectType(name, namespace, types);
	}

	@Override
	public String GetInternalDebugRepresentation() {
		return "\r\n{\r\n" + StringHelper.indent(StringHelper.joinStringRep("\r\n", fields)) + "\r\n}";
	}

	@Override
	public String GetInternalDebugName() {
		return "object";
	}
}

package de.samdev.bullshitsoap.parser.types;

import java.util.ArrayList;
import java.util.List;

import de.samdev.bullshitsoap.parser.WSDLDefinition;
import de.samdev.bullshitsoap.parser.WSDLParsingException;
import de.samdev.bullshitsoap.parser.helper.StringHelper;
import nu.xom.Element;
import nu.xom.Elements;

public class WSDLObjectTypeDefinition extends WSDLComplexTypeDefinition {

	private final List<WSDLObjectElementTypeDefinition> fields;
	
	protected WSDLObjectTypeDefinition(String name, String ns, List<WSDLObjectElementTypeDefinition> elements) {
		super(name, ns);
		
		fields = elements;
	}

	public static WSDLObjectTypeDefinition createFromWSDL(WSDLDefinition wsdl, String name, String namespace, Element root) throws NumberFormatException, WSDLParsingException {
		List<WSDLObjectElementTypeDefinition> types = new ArrayList<WSDLObjectElementTypeDefinition>();
		
		Elements elements = root.getChildElements("element", WSDLDefinition.NS_XSD);
		for (int i = 0; i < elements.size(); i++) {
			Element element = elements.get(i);
			
			WSDLTypeDefinition type = wsdl.getWSDLType(element.getAttributeValue("type"));
			String elementName = element.getAttributeValue("name");
			
			types.add(new WSDLObjectElementTypeDefinition(elementName, type));
		}
		
		return new WSDLObjectTypeDefinition(name, namespace, types);
	}

	@Override
	public String GetInternalDebugRepresentation() {
		return "\r\n{\r\n" + StringHelper.indent(StringHelper.joinStringRep("\r\n", fields)) + "\r\n}";
	}

	@Override
	public String GetInternalDebugName() {
		return "object";
	}

	@Override
	protected String generateClassCodeInternal() {
		// TODO IMPLEMENT GENERATE CLASS CODE
		return null;
	}
}

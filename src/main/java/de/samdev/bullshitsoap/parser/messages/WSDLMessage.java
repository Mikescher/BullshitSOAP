package de.samdev.bullshitsoap.parser.messages;

import java.util.ArrayList;
import java.util.List;

import de.samdev.bullshitsoap.parser.IDebugFormattable;
import de.samdev.bullshitsoap.parser.WSDLDefinition;
import de.samdev.bullshitsoap.parser.WSDLParsingException;
import de.samdev.bullshitsoap.parser.helper.StringHelper;
import de.samdev.bullshitsoap.parser.typedefinitions.WSDLTypeDefinition;
import nu.xom.Element;
import nu.xom.Elements;

public class WSDLMessage implements IDebugFormattable {
	public final String Name;
	public final String Namespace;
	private final List<WSDLMessagePart> fields;
	
	private WSDLMessage(String name, String namespace, List<WSDLMessagePart> parts) {
		super();
		
		fields = parts;
		Name = name;
		Namespace = namespace;
	}

	public static WSDLMessage createFromWSDL(WSDLDefinition wsdl, String name, String namespace, Element root) throws NumberFormatException, WSDLParsingException {
		List<WSDLMessagePart> fields = new ArrayList<WSDLMessagePart>();
		
		Elements parts = root.getChildElements("part", WSDLDefinition.NS_WSDL);
		for (int i = 0; i < parts.size(); i++) {
			Element partXML = parts.get(i);
			String partName = partXML.getAttributeValue("name");
			WSDLTypeDefinition partType = wsdl.getWSDLType(partXML.getAttributeValue("type"));
			
			fields.add(new WSDLMessagePart(partName, partType));
		}
		
		return new WSDLMessage(name, namespace, fields);
	}

	@Override
	public String toDebugString() {
		return String.format("[%s]\r\n{\r\n%s\r\n}", Name, StringHelper.indent(StringHelper.joinStringRep("\r\n", fields)));
	}
}

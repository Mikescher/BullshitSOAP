package de.samdev.bullshitsoap.parser.types;

import java.util.ArrayList;
import java.util.List;

import de.samdev.bullshitsoap.parser.WSDLDefinition;
import de.samdev.bullshitsoap.parser.WSDLParsingException;
import de.samdev.bullshitsoap.parser.helper.StringHelper;
import nu.xom.Element;
import nu.xom.Elements;

public class WSDLEnumerationType extends WSDLSimpleType {
	private final WSDLPrimitiveType base;
	private final List<Object> values;
	
	public WSDLEnumerationType(String name, String ns, WSDLPrimitiveType enumBase, List<Object> enumValues) {
		super(name, ns);
		
		base = enumBase;
		values = enumValues;
	}

	public static WSDLEnumerationType createFromWSDL(WSDLDefinition wsdl, String name, String namespace, Element root) throws NumberFormatException, WSDLParsingException {
		List<Object> enumValues = new ArrayList<Object>();
		
		Element restriction = root.getFirstChildElement("restriction", WSDLDefinition.NS_XSD);
		WSDLPrimitiveType base = wsdl.getSpecificWSDLType(restriction.getAttributeValue("base"));
		
		Elements enums = restriction.getChildElements("enumeration", WSDLDefinition.NS_XSD);
		for (int i = 0; i < enums.size(); i++) {
			enumValues.add(base.parseFromString(enums.get(i).getAttributeValue("value")));
		}
		
		return new WSDLEnumerationType(name, namespace, base, enumValues);
	}

	@Override
	public String GetInternalDebugRepresentation() {
		return "(" + StringHelper.join(" | ", values) + ") of " + base.GetDebugString();
	}
}

package de.samdev.bullshitsoap.parser.types;

import java.util.ArrayList;
import java.util.List;

import de.samdev.bullshitsoap.parser.WSDLDefinition;
import de.samdev.bullshitsoap.parser.WSDLParsingException;
import de.samdev.bullshitsoap.parser.helper.StringHelper;
import nu.xom.Element;
import nu.xom.Elements;

public class WSDLEnumerationTypeDefinition extends WSDLSimpleTypeDefinition {
	private final WSDLPrimitiveTypeDefinition base;
	private final List<Object> values;
	
	public WSDLEnumerationTypeDefinition(String name, String ns, WSDLPrimitiveTypeDefinition enumBase, List<Object> enumValues) {
		super(name, ns);
		
		base = enumBase;
		values = enumValues;
	}

	public static WSDLEnumerationTypeDefinition createFromWSDL(WSDLDefinition wsdl, String name, String namespace, Element root) throws NumberFormatException, WSDLParsingException {
		List<Object> enumValues = new ArrayList<Object>();
		
		Element restriction = root.getFirstChildElement("restriction", WSDLDefinition.NS_XSD);
		WSDLPrimitiveTypeDefinition base = wsdl.getSpecificWSDLType(restriction.getAttributeValue("base"));
		
		Elements enums = restriction.getChildElements("enumeration", WSDLDefinition.NS_XSD);
		for (int i = 0; i < enums.size(); i++) {
			enumValues.add(base.parseFromString(enums.get(i).getAttributeValue("value")));
		}
		
		return new WSDLEnumerationTypeDefinition(name, namespace, base, enumValues);
	}

	@Override
	public String GetInternalDebugRepresentation() {
		return "(" + StringHelper.joinStringRep(" | ", values) + ") of " + base.toDebugString();
	}

	@Override
	public String GetInternalDebugName() {
		return "enumeration";
	}

	@Override
	public String generateClassCode() {
		// TODO IMPLEMENT GENERATE CLASS CODE
		return null;
	}
}

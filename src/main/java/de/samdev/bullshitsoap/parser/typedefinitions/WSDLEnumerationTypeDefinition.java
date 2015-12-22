package de.samdev.bullshitsoap.parser.typedefinitions;

import java.util.ArrayList;
import java.util.List;

import de.samdev.bullshitsoap.parser.WSDLDefinition;
import de.samdev.bullshitsoap.parser.WSDLParsingException;
import de.samdev.bullshitsoap.parser.helper.PathHelper;
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
	protected String generateClassCodeInternal() {
		String code = PathHelper.getResourceFile("/WSDLObjectRestriction.java-template");

		code = StringHelper.replaceAll(code, "$CLASSNAME$", getClassCodeName());
		code = StringHelper.replaceAll(code, "$ENUMCLASSNAME$", "EnumValue_" + Name);
		code = StringHelper.replaceAll(code, "$NAME$", Name);
		code = StringHelper.replaceAll(code, "$ENUMTYPE$", base.getPrimitiveClassCodeName());
		
		StringBuilder buildrEnum = new StringBuilder();
		for (int i = 0; i < values.size(); i++) {
			if (i < values.size()-1) {
				buildrEnum.append(String.format("\t\t%s(%s),", base.generateEnumName(values.get(i), i), base.generateLiteralCode(values.get(i))));
			} else {
				buildrEnum.append(String.format("\t\t%s(%s);", base.generateEnumName(values.get(i), i), base.generateLiteralCode(values.get(i))));
			}

			if (i < values.size()-1) buildrEnum.append("\r\n");
		}
		code = StringHelper.replaceAll(code, "$ENUMDEF$", buildrEnum.toString().substring(2));
		
		StringBuilder buildrDeserialize = new StringBuilder();
		for (int i = 0; i < values.size(); i++) {
			buildrDeserialize.append(String.format("\t\tif (e.getValue().equalsIgnoreCase(%s.toString())) return new %s(%s.%s);", 
					base.generateLiteralCode(values.get(i)),
					getClassCodeName(),
					"EnumValue_" + Name,
					base.generateEnumName(values.get(i), i)));
			
			if (i < values.size()-1) buildrDeserialize.append("\r\n");
		}
		code = StringHelper.replaceAll(code, "$ENUMDESERIALIZE$", buildrDeserialize.toString().substring(2));
		
		return code;
	}
	
	@Override
	public boolean isPrimitive() {
		return false;
	}
}

package de.samdev.bullshitsoap.parser.messagedefinitions;

import java.util.ArrayList;
import java.util.List;

import de.samdev.bullshitsoap.parser.IDebugFormattable;
import de.samdev.bullshitsoap.parser.WSDLCodeGenerationHelper;
import de.samdev.bullshitsoap.parser.WSDLDefinition;
import de.samdev.bullshitsoap.parser.WSDLParsingException;
import de.samdev.bullshitsoap.parser.helper.PathHelper;
import de.samdev.bullshitsoap.parser.helper.StringHelper;
import de.samdev.bullshitsoap.parser.typedefinitions.WSDLTypeDefinition;
import nu.xom.Element;
import nu.xom.Elements;

public class WSDLMessageDefinition implements IDebugFormattable {
	public final String Name;
	public final String Namespace;
	private final List<WSDLMessageDefinitionPart> fields;
	
	private WSDLMessageDefinition(String name, String namespace, List<WSDLMessageDefinitionPart> parts) {
		super();
		
		fields = parts;
		Name = name;
		Namespace = namespace;
	}

	public static WSDLMessageDefinition createFromWSDL(WSDLDefinition wsdl, String name, String namespace, Element root) throws NumberFormatException, WSDLParsingException {
		List<WSDLMessageDefinitionPart> fields = new ArrayList<WSDLMessageDefinitionPart>();
		
		Elements parts = root.getChildElements("part", WSDLDefinition.NS_WSDL);
		for (int i = 0; i < parts.size(); i++) {
			Element partXML = parts.get(i);
			String partName = partXML.getAttributeValue("name");
			WSDLTypeDefinition partType = wsdl.getWSDLType(partXML.getAttributeValue("type"));
			
			fields.add(new WSDLMessageDefinitionPart(partName, partType));
		}
		
		return new WSDLMessageDefinition(name, namespace, fields);
	}

	@Override
	public String toDebugString() {
		return String.format("[%s]\r\n{\r\n%s\r\n}", Name, StringHelper.indent(StringHelper.joinStringRep("\r\n", fields)));
	}

	public String generateClassCode(String basePackage) {
		String code;
		if (fields.isEmpty())
			code = WSDLCodeGenerationHelper.RefactorPackageDefinitions(basePackage, PathHelper.getResourceFile("/WSDLMessageTemplateEmpty.java-template"));
		else
			code = WSDLCodeGenerationHelper.RefactorPackageDefinitions(basePackage, PathHelper.getResourceFile("/WSDLMessageTemplate.java-template"));
			
		
		code = StringHelper.replaceAll(code, "$CLASSNAME$", getClassCodeName());

		code = StringHelper.replaceAll(code, "$MESSAGENAME$", Name);
		
		{
			List<String> buildr_fields = new ArrayList<String>();
			for (WSDLMessageDefinitionPart part : fields) {
				buildr_fields.add(String.format("public final %s field_%s;\r\n", part.Type.getClassCodeName(), part.Name));
			}
			code = StringHelper.replaceAll(code, "%CLASSFIELDS%", StringHelper.indentTabPlus(StringHelper.join("\r\n", buildr_fields), 1));
		}
		
		{
			List<String> buildr_fieldinit = new ArrayList<String>();
			for (WSDLMessageDefinitionPart part : fields) {
				buildr_fieldinit.add(String.format("field_%s = _%s;", part.Name, part.Name));
			}
			code = StringHelper.replaceAll(code, "%FIELDINIT%", StringHelper.indentTabPlus(StringHelper.join("\r\n", buildr_fieldinit), 2));
		}
		
		{
			List<String> buildr_params = new ArrayList<String>();
			for (WSDLMessageDefinitionPart part : fields) {
				buildr_params.add(String.format("%s _%s", part.Type.getClassCodeName(), part.Name));
			}
			code = StringHelper.replaceAll(code, "%PARAMS%", StringHelper.join(", ", buildr_params));
		}
		
		{
			List<String> buildr_flatparams = new ArrayList<String>();
			for (WSDLMessageDefinitionPart part : fields) {
				buildr_flatparams.add(String.format("_%s", part.Name));
			}
			code = StringHelper.replaceAll(code, "%FLATPARAMS%", StringHelper.join(", ", buildr_flatparams));
		}
		
		{
			List<String> buildr_createparams = new ArrayList<String>();
			for (WSDLMessageDefinitionPart part : fields) {
				buildr_createparams.add(String.format("%s.createFromXML(xml_%s)", part.Type.getClassCodeName(), part.Name));
			}
			code = StringHelper.replaceAll(code, "%CREATEPARAMS%", StringHelper.join(", ", buildr_createparams));
		}
		
		{
			List<String> buildr_fieldserialize = new ArrayList<String>();
			for (WSDLMessageDefinitionPart part : fields) {
				buildr_fieldserialize.add(String.format("message.appendChild(field_%s.serialize(\"%s\"));", part.Name, part.Name));
			}
			code = StringHelper.replaceAll(code, "%FIELDSERIALIZE%", StringHelper.indentTabPlus(StringHelper.join("\r\n", buildr_fieldserialize), 2));
		}
		
		{
			List<String> buildr_fielddeserialize = new ArrayList<String>();
			for (WSDLMessageDefinitionPart part : fields) {
				buildr_fielddeserialize.add(String.format("Element xml_%s = message.getFirstChildElement(\"%s\");", part.Name, part.Name));
			}
			code = StringHelper.replaceAll(code, "%FIELDDESERIALIZE%", StringHelper.indentTabPlus(StringHelper.join("\r\n", buildr_fielddeserialize), 2));
		}
		
		return code;
	}
	
	public static String generateClassCodeMessage(String packageBase) {
		return WSDLCodeGenerationHelper.RefactorPackageDefinitions(packageBase, PathHelper.getResourceFile("/WSDLMessage.java-template"));
	}

	public String getClassCodeName() {
		return "WSDLMessage" + Character.toUpperCase(Name.charAt(0)) + Name.substring(1).toLowerCase();
	}
}

package de.samdev.bullshitsoap.parser.types;

import java.util.ArrayList;
import java.util.List;

import de.samdev.bullshitsoap.DebugLogger;
import de.samdev.bullshitsoap.parser.WSDLDefinition;
import de.samdev.bullshitsoap.parser.helper.StringHelper;
import nu.xom.Element;
import nu.xom.Elements;

public class WSDLStringEnumerationType extends WSDLEnumerationType {

	private final List<String> values;
	
	private WSDLStringEnumerationType(String name, String ns, List<String> enumValues) {
		super(name, ns);
		
		values = enumValues;
	}

	public static WSDLStringEnumerationType createFromWSDL(String name, String namespace, Element restrictionRoot) {
		List<String> enumValues = new ArrayList<String>();
		Elements enums = restrictionRoot.getChildElements("enumeration", WSDLDefinition.NS_XSD);
		for (int i = 0; i < enums.size(); i++) {
			enumValues.add(enums.get(i).getAttributeValue("value"));
		}
		
		DebugLogger.Log("Found Type[WSDLStringEnumerationType]: %s (%s)", name, StringHelper.join(", ", enumValues));
		
		return new WSDLStringEnumerationType(name, namespace, enumValues);
	}
}

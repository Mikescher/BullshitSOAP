package de.samdev.bullshitsoap.parser.types;

import java.util.ArrayList;
import java.util.List;

import de.samdev.bullshitsoap.DebugLogger;
import de.samdev.bullshitsoap.parser.WSDLDefinition;
import de.samdev.bullshitsoap.parser.helper.StringHelper;
import nu.xom.Element;
import nu.xom.Elements;

public class WSDLIntegerEnumerationType extends WSDLEnumerationType {

	private final List<Integer> values;
	
	public WSDLIntegerEnumerationType(String name, String ns, List<Integer> enumValues) {
		super(name, ns);
		
		values = enumValues;
	}

	public static WSDLIntegerEnumerationType createFromWSDL(String name, String namespace, Element restrictionRoot) throws NumberFormatException {
		List<Integer> enumValues = new ArrayList<Integer>();
		Elements enums = restrictionRoot.getChildElements("enumeration", WSDLDefinition.NS_XSD);
		for (int i = 0; i < enums.size(); i++) {
			enumValues.add(Integer.parseInt(enums.get(i).getAttributeValue("value")));
		}
		
		DebugLogger.Log("Found Type[WSDLStringEnumerationType]: %s (%s)", name, StringHelper.join(", ", enumValues));
		
		return new WSDLIntegerEnumerationType(name, namespace, enumValues);
	}
}

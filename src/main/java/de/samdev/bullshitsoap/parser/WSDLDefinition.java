package de.samdev.bullshitsoap.parser;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import de.samdev.bullshitsoap.DebugLogger;
import de.samdev.bullshitsoap.parser.messages.WSDLMessage;
import de.samdev.bullshitsoap.parser.operations.WSDLOperation;
import de.samdev.bullshitsoap.parser.types.WSDLBooleanType;
import de.samdev.bullshitsoap.parser.types.WSDLByteType;
import de.samdev.bullshitsoap.parser.types.WSDLComplexType;
import de.samdev.bullshitsoap.parser.types.WSDLDateTimeType;
import de.samdev.bullshitsoap.parser.types.WSDLDateType;
import de.samdev.bullshitsoap.parser.types.WSDLDoubleType;
import de.samdev.bullshitsoap.parser.types.WSDLFloatType;
import de.samdev.bullshitsoap.parser.types.WSDLIntegerType;
import de.samdev.bullshitsoap.parser.types.WSDLLongType;
import de.samdev.bullshitsoap.parser.types.WSDLSimpleType;
import de.samdev.bullshitsoap.parser.types.WSDLStringType;
import de.samdev.bullshitsoap.parser.types.WSDLType;
import nu.xom.Builder;
import nu.xom.Document;
import nu.xom.Element;
import nu.xom.Elements;
import nu.xom.ParsingException;
import nu.xom.ValidityException;

public class WSDLDefinition {
	public final static String NS_WSDL = "http://schemas.xmlsoap.org/wsdl/";
	public final static String NS_SOAP = "http://schemas.xmlsoap.org/wsdl/soap/";
	public final static String NS_XSD  = "http://www.w3.org/2001/XMLSchema";
	public final static String NS_XSI  = "http://www.w3.org/2001/XMLSchema-instance";

	private Map<String, String> namespaces = new HashMap<String, String>(); 
	
	private String serviceName;
	private List<WSDLType> types = new ArrayList<WSDLType>();
	private List<WSDLMessage> messages = new ArrayList<WSDLMessage>();
	private List<WSDLOperation> operations = new ArrayList<WSDLOperation>();
	
	public WSDLDefinition(String xml) throws WSDLParsingException  {
		super();

		try {
			parseWSDL(xml);
		} catch (ParsingException e) {
			throw new WSDLParsingException(e);
		} catch (IOException e) {
			throw new WSDLParsingException(e);
		} catch (NumberFormatException e) {
			throw new WSDLParsingException(e);
		}
	}

	private void parseWSDL(String xml) throws NumberFormatException, ParsingException, ValidityException, IOException, WSDLParsingException {
		Builder parser = new Builder();
		Document doc = parser.build(xml, null);

		Element root = doc.getRootElement();
		serviceName = root.getAttributeValue("name");
		String targetNS = root.getAttributeValue("targetNamespace");

		DebugLogger.Log("Start Parsing Service '%s'", serviceName);
		
		Element types = root.getFirstChildElement("types", NS_WSDL);
		
		addPrimitiveTypes();
		parseNamespaces(root);
		parseTypes(types);
		parseMessages(root, targetNS);
		parseOperations(root, targetNS);
	}

	private void parseOperations(Element root, String targetNS) throws NumberFormatException, WSDLParsingException {
		Element port = root.getFirstChildElement("portType", NS_WSDL);
		
		Elements operationsXML = port.getChildElements("operation", NS_WSDL);
		for (int i = 0; i < operationsXML.size(); i++) {
			Element operationXML = operationsXML.get(i);
			String operationName = operationXML.getAttributeValue("name");
			
			WSDLOperation newOperation = WSDLOperation.createFromWSDL(this, operationName, targetNS, operationXML);
			addWSDLOperation(newOperation);
		}
		
	}

	private void parseMessages(Element root, String targetNS) throws NumberFormatException, WSDLParsingException {
		Elements messagesXML = root.getChildElements("message", NS_WSDL);
		for (int i = 0; i < messagesXML.size(); i++) {
			Element messageXML = messagesXML.get(i);
			String messageName = messageXML.getAttributeValue("name");
			
			WSDLMessage newMessage = WSDLMessage.createFromWSDL(this, messageName, targetNS, messageXML);
			addWSDLMessage(newMessage);
		}
	}

	private void addPrimitiveTypes() {
		addWSDLType(new WSDLBooleanType());
		
		addWSDLType(new WSDLStringType());
		
		addWSDLType(new WSDLByteType());
		addWSDLType(new WSDLIntegerType());
		addWSDLType(new WSDLLongType());
		
		addWSDLType(new WSDLDoubleType());
		addWSDLType(new WSDLFloatType());
		
		addWSDLType(new WSDLDateType());
		addWSDLType(new WSDLDateTimeType());
	}

	private void parseNamespaces(Element root) {
		for (int i = 0; i < root.getNamespaceDeclarationCount(); i++) {
			String prefix = root.getNamespacePrefix(i);
			String url = root.getNamespaceURI(prefix);
			
			if (! prefix.isEmpty()) {
				namespaces.put(prefix, url);
				
				DebugLogger.Log("Namespace found: %s --> %s", prefix, url);
			}
		}
	}

	private void parseTypes(Element root) throws WSDLParsingException, NumberFormatException {
		Element schema = root.getFirstChildElement("schema", NS_XSD);
		String targetNS = schema.getAttributeValue("targetNamespace");
		
		Elements simpleTypes = schema.getChildElements("simpleType", NS_XSD);
		for (int i = 0; i < simpleTypes.size(); i++) {
			Element simpleTypeXML = simpleTypes.get(i);

			WSDLType newType = WSDLSimpleType.createFromWSDL(this, simpleTypeXML, targetNS);
			addWSDLType(newType);
		}
		
		Elements complexTypes = schema.getChildElements("complexType", NS_XSD);
		for (int i = 0; i < complexTypes.size(); i++) {
			Element complexTypeXML = complexTypes.get(i);

			WSDLType newType = WSDLComplexType.createFromWSDL(this, complexTypeXML, targetNS);
			addWSDLType(newType);
		}
	}

	private void addWSDLType(WSDLType newType) {
		DebugLogger.Log("Found type definition: %s", newType.toDebugString());					
		types.add(newType);
	}

	private void addWSDLMessage(WSDLMessage newMessage) {
		DebugLogger.Log("Found message definition: %s", newMessage.toDebugString());					
		messages.add(newMessage);
	}

	private void addWSDLOperation(WSDLOperation newOperation) {
		DebugLogger.Log("Found operation definition: %s", newOperation.toDebugString());					
		operations.add(newOperation);
	}

	public boolean compareNSValue(String fullValue, String namespace, String value) {
		String[] split = fullValue.split(":");
		
		if (split.length == 1 && (namespace == null || namespace.isEmpty()) && fullValue.equalsIgnoreCase(value)) return true;
		
		if (split.length != 2) return false;
		
		if (! namespaces.containsKey(split[0].toLowerCase())) return false;
		
		return namespaces.get(split[0].toLowerCase()).equalsIgnoreCase(namespace) && split[1].equalsIgnoreCase(value);
	}

	public WSDLType getWSDLType(String typeName) throws WSDLParsingException {
		for (WSDLType wsdlType : types) {
			if (compareNSValue(typeName, wsdlType.Namespace, wsdlType.Name)) return wsdlType;
		}

		throw new WSDLParsingException("Can't find type: " + typeName);
	}

	@SuppressWarnings("unchecked")
	public <T extends WSDLType> T getSpecificWSDLType(String typeName) throws WSDLParsingException {
		for (WSDLType wsdlType : types) {
			if (compareNSValue(typeName, wsdlType.Namespace, wsdlType.Name)) {
				try {
					return (T)wsdlType;
				} catch (ClassCastException e) {
					throw new WSDLParsingException(e);
				}
			}
		}

		throw new WSDLParsingException("Can't find type: " + typeName);
	}

	public WSDLMessage getWSDLMessage(String messagename) throws WSDLParsingException {
		for (WSDLMessage wsdlMessage : messages) {
			if (compareNSValue(messagename, wsdlMessage.Namespace, wsdlMessage.Name)) return wsdlMessage;
		}

		throw new WSDLParsingException("Can't find message: " + messagename);
	}
}

package de.samdev.bullshitsoap.parser;

import java.io.File;
import java.io.IOException;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import de.samdev.bullshitsoap.DebugLogger;
import de.samdev.bullshitsoap.parser.helper.PathHelper;
import de.samdev.bullshitsoap.parser.messages.WSDLMessage;
import de.samdev.bullshitsoap.parser.operations.WSDLOperation;
import de.samdev.bullshitsoap.parser.typedefinitions.WSDLBooleanTypeDefinition;
import de.samdev.bullshitsoap.parser.typedefinitions.WSDLByteTypeDefinition;
import de.samdev.bullshitsoap.parser.typedefinitions.WSDLComplexTypeDefinition;
import de.samdev.bullshitsoap.parser.typedefinitions.WSDLDateTimeTypeDefinition;
import de.samdev.bullshitsoap.parser.typedefinitions.WSDLDateTypeDefinition;
import de.samdev.bullshitsoap.parser.typedefinitions.WSDLDoubleTypeDefinition;
import de.samdev.bullshitsoap.parser.typedefinitions.WSDLFloatTypeDefinition;
import de.samdev.bullshitsoap.parser.typedefinitions.WSDLIntegerTypeDefinition;
import de.samdev.bullshitsoap.parser.typedefinitions.WSDLLongTypeDefinition;
import de.samdev.bullshitsoap.parser.typedefinitions.WSDLSimpleTypeDefinition;
import de.samdev.bullshitsoap.parser.typedefinitions.WSDLStringTypeDefinition;
import de.samdev.bullshitsoap.parser.typedefinitions.WSDLTypeDefinition;
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
	private List<WSDLTypeDefinition> types = new ArrayList<WSDLTypeDefinition>();
	private List<WSDLMessage> messages = new ArrayList<WSDLMessage>();
	private List<WSDLOperation> operations = new ArrayList<WSDLOperation>();
	
	private String typeNamespace;
	
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
		addWSDLType(new WSDLBooleanTypeDefinition());
		
		addWSDLType(new WSDLStringTypeDefinition());
		
		addWSDLType(new WSDLByteTypeDefinition());
		addWSDLType(new WSDLIntegerTypeDefinition());
		addWSDLType(new WSDLLongTypeDefinition());
		
		addWSDLType(new WSDLDoubleTypeDefinition());
		addWSDLType(new WSDLFloatTypeDefinition());
		
		addWSDLType(new WSDLDateTypeDefinition());
		addWSDLType(new WSDLDateTimeTypeDefinition());
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
		
		typeNamespace = targetNS;
		
		Elements simpleTypes = schema.getChildElements("simpleType", NS_XSD);
		for (int i = 0; i < simpleTypes.size(); i++) {
			Element simpleTypeXML = simpleTypes.get(i);

			WSDLTypeDefinition newType = WSDLSimpleTypeDefinition.createFromWSDL(this, simpleTypeXML, targetNS);
			addWSDLType(newType);
		}
		
		Elements complexTypes = schema.getChildElements("complexType", NS_XSD);
		for (int i = 0; i < complexTypes.size(); i++) {
			Element complexTypeXML = complexTypes.get(i);

			WSDLTypeDefinition newType = WSDLComplexTypeDefinition.createFromWSDL(this, complexTypeXML, targetNS);
			addWSDLType(newType);
		}
	}

	private void addWSDLType(WSDLTypeDefinition newType) {
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

	public WSDLTypeDefinition getWSDLType(String typeName) throws WSDLParsingException {
		for (WSDLTypeDefinition wsdlType : types) {
			if (compareNSValue(typeName, wsdlType.Namespace, wsdlType.Name)) return wsdlType;
		}

		throw new WSDLParsingException("Can't find type: " + typeName);
	}

	@SuppressWarnings("unchecked")
	public <T extends WSDLTypeDefinition> T getSpecificWSDLType(String typeName) throws WSDLParsingException {
		for (WSDLTypeDefinition wsdlType : types) {
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
	
	public Iterable<WSDLOperation> getOperations() {
		return operations;
	}

	public String getServiceName() {
		return serviceName;
	}

	private String generateClassCodeInvoker(String packageBase) {
		return WSDLCodeGenerationHelper.RefactorPackageDefinitions(packageBase, PathHelper.getResourceFile("/WSDLInvoker.java-template"));
	}

	private String generateClassCodeNamespaceCollection(String packageBase) {
		String code = PathHelper.getResourceFile("/WSDLNamespaceCollection.java-template");

		code = code.replace("%NS_SERVICE%", typeNamespace);
		if (typeNamespace.endsWith("/"))
			code = code.replace("%NS_SERVICETYPES%", typeNamespace + "encodedTypes");
		else
			code = code.replace("%NS_SERVICETYPES%", typeNamespace + "/encodedTypes");

		return WSDLCodeGenerationHelper.RefactorPackageDefinitions(packageBase, code);
	}
	
	public void createAPIClasses(String basePath, String basePackage) {
		basePackage = basePackage + "." + Character.toLowerCase(serviceName.charAt(0)) + serviceName.substring(1);
		
		String servicePackagePath = PathHelper.combinePaths(basePath, basePackage.replaceAll("\\.", "\\\\"));
		
		new File(servicePackagePath).mkdirs();
		
		PathHelper.writeTextFile(new File(
				PathHelper.combinePaths(servicePackagePath, "WSDLInvoker.java")), 
				generateClassCodeInvoker(basePackage));
		DebugLogger.Log("Create file " + "WSDLInvoker.java");
		
		PathHelper.writeTextFile(new File(
				PathHelper.combinePaths(servicePackagePath, "WSDLNamespaceCollection.java")), 
				generateClassCodeNamespaceCollection(basePackage));
		DebugLogger.Log("Create file " + "WSDLNamespaceCollection.java");
		
		PathHelper.writeTextFile(new File(
				PathHelper.combinePaths(servicePackagePath, "types", "WSDLObject.java")), 
				WSDLTypeDefinition.generateClassCodeObject(basePackage));
		DebugLogger.Log("Create file " + "WSDLObject.java");
		
		for (WSDLTypeDefinition type : types) {
			String code = type.generateClassCode(basePackage);
			String classname = type.getClassCodeName();
			File outFile = new File(PathHelper.combinePaths(servicePackagePath, "types", classname + ".java"));
			
			outFile.getParentFile().mkdirs();
			
			//TODO REM CHECK
			if (code != null) {
				PathHelper.writeTextFile(outFile, code);
				DebugLogger.Log("Create file " + outFile.getName());
			}
		}
	}
}

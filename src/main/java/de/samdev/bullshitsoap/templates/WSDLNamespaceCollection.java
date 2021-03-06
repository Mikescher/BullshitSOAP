package de.samdev.bullshitsoap.templates;

/**DISCLAIMER**/

public class WSDLNamespaceCollection {
	public final static String NAMESPACE_PREFIX_SOAP_ENVELOPE = "soap";
	public final static String NAMESPACE_PATH_SOAP_ENVELOPE = "http://schemas.xmlsoap.org/soap/envelope/";

	public final static String NAMESPACE_PREFIX_SOAP_ENCODING = "soapenc";
	public final static String NAMESPACE_PATH_SOAP_ENCODING = "http://schemas.xmlsoap.org/soap/encoding/";

	public final static String NAMESPACE_PREFIX_SERVICE_BASE = "tns";
	public final static String NAMESPACE_PATH_SERVICE_BASE = "%NS_SERVICE%";

	public final static String NAMESPACE_PREFIX_SERVICE_TYPES = "types";
	public final static String NAMESPACE_PATH_SERVICE_TYPES = "%NS_SERVICETYPES%";

	public final static String NAMESPACE_PREFIX_XML_SCHEMAINSTANCE = "xsi";
	public final static String NAMESPACE_PATH_XML_SCHEMAINSTANCE = "http://www.w3.org/2001/XMLSchema-instance";

	public final static String NAMESPACE_PREFIX_XML_SCHEMA = "xsd";
	public final static String NAMESPACE_PATH_XML_SCHEMA = "http://www.w3.org/2001/XMLSchema";
}

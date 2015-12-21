package de.samdev.bullshitsoap.templates.messages;

import de.samdev.bullshitsoap.templates.WSDLNamespaceCollection;
import de.samdev.bullshitsoap.templates.types.*;
import nu.xom.Attribute;
import nu.xom.Attribute.Type;
import nu.xom.Document;
import nu.xom.Element;

public class WSDLMessageGetUserInformationRequest extends WSDLMessage {
	public final WSDLObjectInt userid;
	public final WSDLObjectString md5password;
	
	private WSDLMessageGetUserInformationRequest(WSDLObjectInt _userid, WSDLObjectString _md5password) {
		super(WSDLNamespaceCollection.NAMESPACE_PATH_SERVICE_BASE);
		
		userid = _userid;
		md5password = _md5password;
	}
	
	@Override
	public Document serialize() {
		Element envelope = new Element("envelope", WSDLNamespaceCollection.NAMESPACE_PATH_SOAP_ENVELOPE);
		
		envelope.addNamespaceDeclaration(WSDLNamespaceCollection.NAMESPACE_PREFIX_SOAP_ENVELOPE, WSDLNamespaceCollection.NAMESPACE_PATH_SOAP_ENVELOPE);
		envelope.addNamespaceDeclaration(WSDLNamespaceCollection.NAMESPACE_PREFIX_SOAP_ENCODING, WSDLNamespaceCollection.NAMESPACE_PATH_SOAP_ENCODING);
		envelope.addNamespaceDeclaration(WSDLNamespaceCollection.NAMESPACE_PREFIX_SERVICE_BASE, WSDLNamespaceCollection.NAMESPACE_PATH_SERVICE_BASE);
		envelope.addNamespaceDeclaration(WSDLNamespaceCollection.NAMESPACE_PREFIX_SERVICE_TYPES, WSDLNamespaceCollection.NAMESPACE_PATH_SERVICE_TYPES);
		envelope.addNamespaceDeclaration(WSDLNamespaceCollection.NAMESPACE_PREFIX_XML_SCHEMAINSTANCE, WSDLNamespaceCollection.NAMESPACE_PATH_XML_SCHEMAINSTANCE);
		envelope.addNamespaceDeclaration(WSDLNamespaceCollection.NAMESPACE_PREFIX_XML_SCHEMA, WSDLNamespaceCollection.NAMESPACE_PATH_XML_SCHEMA);
		
		Element body = new Element("body", WSDLNamespaceCollection.NAMESPACE_PATH_SOAP_ENVELOPE);
		body.addAttribute(new Attribute("encodingStyle", WSDLNamespaceCollection.NAMESPACE_PATH_XML_SCHEMAINSTANCE, WSDLNamespaceCollection.NAMESPACE_PATH_SOAP_ENCODING, Type.CDATA));

		Element message = new Element("getuserid");
		
		message.appendChild(userid.serialize("userid"));
		message.appendChild(md5password.serialize("md5password"));
		
		body.appendChild(message);
		envelope.appendChild(body);
		
		Document d = new Document(envelope);
		
		return d;
	}
	
	public static WSDLMessageGetUserInformationRequest createFromXML(Document d) {
		Element envelope = d.getRootElement();
		Element body = envelope.getFirstChildElement("body", WSDLNamespaceCollection.NAMESPACE_PATH_SOAP_ENVELOPE);
		Element message = body.getFirstChildElement("getuserid");
		
		Element e_userid = message.getFirstChildElement("userid");
		Element e_md5password = message.getFirstChildElement("md5password");
		
		return new WSDLMessageGetUserInformationRequest(WSDLObjectInt.createFromXML(e_userid), WSDLObjectString.createFromXML(e_md5password));
	}
	
	public static WSDLMessageGetUserInformationRequest create(WSDLObjectInt _userid, WSDLObjectString _md5password) {
		return new WSDLMessageGetUserInformationRequest(_userid, _md5password);
	}
}

package de.samdev.bullshitsoap.comunioWebService.messages;

import java.io.IOException;

import de.samdev.bullshitsoap.comunioWebService.WSDLNamespaceCollection;
import de.samdev.bullshitsoap.comunioWebService.types.*;
import nu.xom.Attribute;
import nu.xom.Attribute.Type;
import nu.xom.Document;
import nu.xom.Element;

/****************************************************************************** 
 *                                                                            * 
 *           THIS CODE WAS CREATED BY BULLSHITSOAP - DO NOT CHANGE            * 
 *                                                                            * 
 ******************************************************************************/

public class WSDLMessagePostadminnewsrequest extends WSDLMessage {

    public final WSDLObjectString field_userType;
	
	public final WSDLObjectString field_language;
	
	public final WSDLObjectString field_headline;
	
	public final WSDLObjectString field_content;
	
	private WSDLMessagePostadminnewsrequest(WSDLObjectString _userType, WSDLObjectString _language, WSDLObjectString _headline, WSDLObjectString _content) {
		super(WSDLNamespaceCollection.NAMESPACE_PATH_SERVICE_BASE);
		
		field_userType = _userType;
		field_language = _language;
		field_headline = _headline;
		field_content = _content;
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

		Element message = new Element("%MESSAGENAME%");
		
		message.appendChild(field_userType.serialize("userType"));
		message.appendChild(field_language.serialize("language"));
		message.appendChild(field_headline.serialize("headline"));
		message.appendChild(field_content.serialize("content"));
		
		body.appendChild(message);
		envelope.appendChild(body);
		
		Document d = new Document(envelope);
		
		return d;
	}
	
	public static WSDLMessagePostadminnewsrequest createFromXML(Document d) throws IOException {
		Element envelope = d.getRootElement();
		Element body = envelope.getFirstChildElement("body", WSDLNamespaceCollection.NAMESPACE_PATH_SOAP_ENVELOPE);
		Element message = body.getFirstChildElement("%MESSAGENAME%");
		
		Element xml_userType = message.getFirstChildElement("userType");
		Element xml_language = message.getFirstChildElement("language");
		Element xml_headline = message.getFirstChildElement("headline");
		Element xml_content = message.getFirstChildElement("content");
		
		return new WSDLMessagePostadminnewsrequest(WSDLObjectString.createFromXML(xml_userType), WSDLObjectString.createFromXML(xml_language), WSDLObjectString.createFromXML(xml_headline), WSDLObjectString.createFromXML(xml_content));
	}
	
	public static WSDLMessagePostadminnewsrequest create(WSDLObjectString _userType, WSDLObjectString _language, WSDLObjectString _headline, WSDLObjectString _content) {
		return new WSDLMessagePostadminnewsrequest(_userType, _language, _headline, _content);
	}
}
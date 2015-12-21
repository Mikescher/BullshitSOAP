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

public class WSDLMessagePostusernewsrequest extends WSDLMessage {

    public final WSDLObjectInt field_userid;
	
	public final WSDLObjectString field_headline;
	
	public final WSDLObjectString field_content;
	
	private WSDLMessagePostusernewsrequest(WSDLObjectInt _userid, WSDLObjectString _headline, WSDLObjectString _content) {
		super(WSDLNamespaceCollection.NAMESPACE_PATH_SERVICE_BASE);
		
		field_userid = _userid;
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
		
		message.appendChild(field_userid.serialize("userid"));
		message.appendChild(field_headline.serialize("headline"));
		message.appendChild(field_content.serialize("content"));
		
		body.appendChild(message);
		envelope.appendChild(body);
		
		Document d = new Document(envelope);
		
		return d;
	}
	
	public static WSDLMessagePostusernewsrequest createFromXML(Document d) throws IOException {
		Element envelope = d.getRootElement();
		Element body = envelope.getFirstChildElement("body", WSDLNamespaceCollection.NAMESPACE_PATH_SOAP_ENVELOPE);
		Element message = body.getFirstChildElement("%MESSAGENAME%");
		
		Element xml_userid = message.getFirstChildElement("userid");
		Element xml_headline = message.getFirstChildElement("headline");
		Element xml_content = message.getFirstChildElement("content");
		
		return new WSDLMessagePostusernewsrequest(WSDLObjectInt.createFromXML(xml_userid), WSDLObjectString.createFromXML(xml_headline), WSDLObjectString.createFromXML(xml_content));
	}
	
	public static WSDLMessagePostusernewsrequest create(WSDLObjectInt _userid, WSDLObjectString _headline, WSDLObjectString _content) {
		return new WSDLMessagePostusernewsrequest(_userid, _headline, _content);
	}
}
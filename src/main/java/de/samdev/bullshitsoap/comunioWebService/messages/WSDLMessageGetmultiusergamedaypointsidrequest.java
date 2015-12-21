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

public class WSDLMessageGetmultiusergamedaypointsidrequest extends WSDLMessage {

    public final WSDLObjectArrayofuserid field_arr_userid;
	
	public final WSDLObjectInt field_gameday_id;
	
	private WSDLMessageGetmultiusergamedaypointsidrequest(WSDLObjectArrayofuserid _arr_userid, WSDLObjectInt _gameday_id) {
		super(WSDLNamespaceCollection.NAMESPACE_PATH_SERVICE_BASE);
		
		field_arr_userid = _arr_userid;
		field_gameday_id = _gameday_id;
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
		
		message.appendChild(field_arr_userid.serialize("arr_userid"));
		message.appendChild(field_gameday_id.serialize("gameday_id"));
		
		body.appendChild(message);
		envelope.appendChild(body);
		
		Document d = new Document(envelope);
		
		return d;
	}
	
	public static WSDLMessageGetmultiusergamedaypointsidrequest createFromXML(Document d) throws IOException {
		Element envelope = d.getRootElement();
		Element body = envelope.getFirstChildElement("body", WSDLNamespaceCollection.NAMESPACE_PATH_SOAP_ENVELOPE);
		Element message = body.getFirstChildElement("%MESSAGENAME%");
		
		Element xml_arr_userid = message.getFirstChildElement("arr_userid");
		Element xml_gameday_id = message.getFirstChildElement("gameday_id");
		
		return new WSDLMessageGetmultiusergamedaypointsidrequest(WSDLObjectArrayofuserid.createFromXML(xml_arr_userid), WSDLObjectInt.createFromXML(xml_gameday_id));
	}
	
	public static WSDLMessageGetmultiusergamedaypointsidrequest create(WSDLObjectArrayofuserid _arr_userid, WSDLObjectInt _gameday_id) {
		return new WSDLMessageGetmultiusergamedaypointsidrequest(_arr_userid, _gameday_id);
	}
}
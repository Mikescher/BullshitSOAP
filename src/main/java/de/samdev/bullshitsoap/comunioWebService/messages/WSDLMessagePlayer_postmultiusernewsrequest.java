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

public class WSDLMessagePlayer_postmultiusernewsrequest extends WSDLMessage {

    public final WSDLObjectArrayofuserid field_arr_userid;
	
	public final WSDLObjectString field_headline;
	
	public final WSDLObjectString field_content;
	
	private WSDLMessagePlayer_postmultiusernewsrequest(WSDLObjectArrayofuserid _arr_userid, WSDLObjectString _headline, WSDLObjectString _content) {
		super(WSDLNamespaceCollection.NAMESPACE_PATH_SERVICE_BASE);
		
		field_arr_userid = _arr_userid;
		field_headline = _headline;
		field_content = _content;
	}
	
	@Override
	public Document serialize(String opname) {
        Element envelope = new Element(WSDLNamespaceCollection.NAMESPACE_PREFIX_SOAP_ENVELOPE + ":" + "Envelope", WSDLNamespaceCollection.NAMESPACE_PATH_SOAP_ENVELOPE);
        
        envelope.addNamespaceDeclaration(WSDLNamespaceCollection.NAMESPACE_PREFIX_SOAP_ENVELOPE, WSDLNamespaceCollection.NAMESPACE_PATH_SOAP_ENVELOPE);
        envelope.addNamespaceDeclaration(WSDLNamespaceCollection.NAMESPACE_PREFIX_SOAP_ENCODING, WSDLNamespaceCollection.NAMESPACE_PATH_SOAP_ENCODING);
        envelope.addNamespaceDeclaration(WSDLNamespaceCollection.NAMESPACE_PREFIX_SERVICE_BASE, WSDLNamespaceCollection.NAMESPACE_PATH_SERVICE_BASE);
        envelope.addNamespaceDeclaration(WSDLNamespaceCollection.NAMESPACE_PREFIX_SERVICE_TYPES, WSDLNamespaceCollection.NAMESPACE_PATH_SERVICE_TYPES);
        envelope.addNamespaceDeclaration(WSDLNamespaceCollection.NAMESPACE_PREFIX_XML_SCHEMAINSTANCE, WSDLNamespaceCollection.NAMESPACE_PATH_XML_SCHEMAINSTANCE);
        envelope.addNamespaceDeclaration(WSDLNamespaceCollection.NAMESPACE_PREFIX_XML_SCHEMA, WSDLNamespaceCollection.NAMESPACE_PATH_XML_SCHEMA);
        
        Element body = new Element(WSDLNamespaceCollection.NAMESPACE_PREFIX_SOAP_ENVELOPE + ":" + "Body", WSDLNamespaceCollection.NAMESPACE_PATH_SOAP_ENVELOPE);
        body.addAttribute(new Attribute(WSDLNamespaceCollection.NAMESPACE_PREFIX_SOAP_ENVELOPE + ":" + "encodingStyle", WSDLNamespaceCollection.NAMESPACE_PATH_SOAP_ENVELOPE, WSDLNamespaceCollection.NAMESPACE_PATH_SOAP_ENCODING, Type.CDATA));

		Element message = new Element(opname);
		
		message.appendChild(field_arr_userid.serialize("arr_userid"));
		message.appendChild(field_headline.serialize("headline"));
		message.appendChild(field_content.serialize("content"));
		
		body.appendChild(message);
		envelope.appendChild(body);
		
		Document d = new Document(envelope);
		
		return d;
	}
	
	public static WSDLMessagePlayer_postmultiusernewsrequest createFromXML(Document d, String opname) throws IOException {
		Element envelope = d.getRootElement();
		Element body = envelope.getFirstChildElement("Body", WSDLNamespaceCollection.NAMESPACE_PATH_SOAP_ENVELOPE);
		Element message = getFirstChildrenIgnoreNamespace(body, "player_postmultiusernewsRequest");
		
		Element xml_arr_userid = getFirstChildrenIgnoreNamespace(message, "arr_userid");
		Element xml_headline = getFirstChildrenIgnoreNamespace(message, "headline");
		Element xml_content = getFirstChildrenIgnoreNamespace(message, "content");
		
		return new WSDLMessagePlayer_postmultiusernewsrequest(WSDLObjectArrayofuserid.createFromXML(xml_arr_userid), WSDLObjectString.createFromXML(xml_headline), WSDLObjectString.createFromXML(xml_content));
	}
	
	public static WSDLMessagePlayer_postmultiusernewsrequest create(WSDLObjectArrayofuserid _arr_userid, WSDLObjectString _headline, WSDLObjectString _content) {
		return new WSDLMessagePlayer_postmultiusernewsrequest(_arr_userid, _headline, _content);
	}
}
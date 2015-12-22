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

public class WSDLMessageGetcomputernewsrequest extends WSDLMessage {

    public final WSDLObjectInt field_communityid;
	
	public final WSDLObjectInt field_days;
	
	public final WSDLObjectInt field_items;
	
	private WSDLMessageGetcomputernewsrequest(WSDLObjectInt _communityid, WSDLObjectInt _days, WSDLObjectInt _items) {
		super(WSDLNamespaceCollection.NAMESPACE_PATH_SERVICE_BASE);
		
		field_communityid = _communityid;
		field_days = _days;
		field_items = _items;
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
		
		message.appendChild(field_communityid.serialize("communityid"));
		message.appendChild(field_days.serialize("days"));
		message.appendChild(field_items.serialize("items"));
		
		body.appendChild(message);
		envelope.appendChild(body);
		
		Document d = new Document(envelope);
		
		return d;
	}
	
	public static WSDLMessageGetcomputernewsrequest createFromXML(Document d, String opname) throws IOException {
		Element envelope = d.getRootElement();
		Element body = envelope.getFirstChildElement("Body", WSDLNamespaceCollection.NAMESPACE_PATH_SOAP_ENVELOPE);
		Element message = getFirstChildrenIgnoreNamespace(body, "getcomputernewsRequest");
		
		Element xml_communityid = getFirstChildrenIgnoreNamespace(message, "communityid");
		Element xml_days = getFirstChildrenIgnoreNamespace(message, "days");
		Element xml_items = getFirstChildrenIgnoreNamespace(message, "items");
		
		return new WSDLMessageGetcomputernewsrequest(WSDLObjectInt.createFromXML(xml_communityid), WSDLObjectInt.createFromXML(xml_days), WSDLObjectInt.createFromXML(xml_items));
	}
	
	public static WSDLMessageGetcomputernewsrequest create(WSDLObjectInt _communityid, WSDLObjectInt _days, WSDLObjectInt _items) {
		return new WSDLMessageGetcomputernewsrequest(_communityid, _days, _items);
	}
}
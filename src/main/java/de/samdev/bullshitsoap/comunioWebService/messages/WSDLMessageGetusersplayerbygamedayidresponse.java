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

public class WSDLMessageGetusersplayerbygamedayidresponse extends WSDLMessage {

    public final WSDLObjectArrayofplayerlineup field_return;
	
	private WSDLMessageGetusersplayerbygamedayidresponse(WSDLObjectArrayofplayerlineup _return) {
		super(WSDLNamespaceCollection.NAMESPACE_PATH_SERVICE_BASE);
		
		field_return = _return;
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
		
		message.appendChild(field_return.serialize("return"));
		
		body.appendChild(message);
		envelope.appendChild(body);
		
		Document d = new Document(envelope);
		
		return d;
	}
	
	public static WSDLMessageGetusersplayerbygamedayidresponse createFromXML(Document d, String opname) throws IOException {
		Element envelope = d.getRootElement();
		Element body = envelope.getFirstChildElement("Body", WSDLNamespaceCollection.NAMESPACE_PATH_SOAP_ENVELOPE);
		Element message = getFirstChildrenIgnoreNamespace(body, "getusersplayerbygamedayidResponse");
		
		Element xml_return = getFirstChildrenIgnoreNamespace(message, "return");
		
		return new WSDLMessageGetusersplayerbygamedayidresponse(WSDLObjectArrayofplayerlineup.createFromXML(xml_return));
	}
	
	public static WSDLMessageGetusersplayerbygamedayidresponse create(WSDLObjectArrayofplayerlineup _return) {
		return new WSDLMessageGetusersplayerbygamedayidresponse(_return);
	}
}
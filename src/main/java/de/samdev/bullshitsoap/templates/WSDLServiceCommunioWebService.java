package de.samdev.bullshitsoap.templates;

import java.io.IOException;
import java.net.URL;

import de.samdev.bullshitsoap.comunioWebService.messages.*;
import nu.xom.Builder;
import nu.xom.ParsingException;
import nu.xom.ValidityException;

/**DISCLAIMER**/

public final class WSDLServiceCommunioWebService {
	private static WSDLInvoker invoker = null;
	
	static { 
		try { 
			invoker = new WSDLInvoker(new URL("http://www.comunio.de/soapservice.php?wsdl")); 
		} catch (Exception e) { 
			/* Can never happen */
		} 
	}
	
	private WSDLServiceCommunioWebService() { /* */ }
	
	public static WSDLMessageGetplayerbysportaldeidresponse getplayerbysportaldeid(WSDLMessageGetplayerbysportaldeidrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetplayerbysportaldeidresponse result = WSDLMessageGetplayerbysportaldeidresponse.createFromXML(xom.build(response, null));
		return result;
	}
}

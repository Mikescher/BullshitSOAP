package de.samdev.bullshitsoap;

import de.samdev.bullshitsoap.http.HTTPReader;
import de.samdev.bullshitsoap.parser.WSDLDefinition;

public class ConsoleMain {

	public static void main(String[] args) {
		try {
			new WSDLDefinition(HTTPReader.getHTTP("http://www.comunio.de/soapservice.php?wsdl"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

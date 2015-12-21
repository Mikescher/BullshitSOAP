package de.samdev.bullshitsoap;

import de.samdev.bullshitsoap.parser.WSDLDefinition;
import de.samdev.bullshitsoap.parser.helper.PathHelper;

public class ConsoleMain {

	public static void main(String[] args) {
		try {
			//WSDLDefinition wsdl = new WSDLDefinition(HTTPReader.getHTTP("http://www.comunio.de/soapservice.php?wsdl"));
			WSDLDefinition wsdl = new WSDLDefinition(PathHelper.getResourceFile("/wsdl_example.xml"));
			
			wsdl.createAPIClasses(PathHelper.combinePaths(System.getProperty("user.dir"), "src/main/java"), "de.samdev.bullshitsoap");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

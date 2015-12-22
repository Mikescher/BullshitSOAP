package de.samdev.bullshitsoap;

import de.samdev.bullshitsoap.comunioWebService.WSDLServiceComunioWebService;
import de.samdev.bullshitsoap.parser.WSDLDefinition;
import de.samdev.bullshitsoap.parser.helper.PathHelper;

public class ConsoleMain {

	public static void main(String[] args) {
		try {
			//WSDLDefinition wsdl = new WSDLDefinition(HTTPReader.getHTTP("http://www.comunio.de/soapservice.php?wsdl", "http://www.comunio.de/soapservice.php?wsdl"));
			WSDLDefinition wsdl = new WSDLDefinition(PathHelper.getResourceFile("/wsdl_example.xml"), "http://www.comunio.de/soapservice.php?wsdl");
			
			wsdl.createAPIClasses(PathHelper.combinePaths(System.getProperty("user.dir"), "src/main/java"), "de.samdev.bullshitsoap");
			
			DebugLogger.Log("getuserid(Sim91) := " + WSDLServiceComunioWebService.getuserid("Sim91"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

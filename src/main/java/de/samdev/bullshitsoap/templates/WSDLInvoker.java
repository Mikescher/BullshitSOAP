package de.samdev.bullshitsoap.templates;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLConnection;

public class WSDLInvoker {
	private final URL wsdlURL;

	public WSDLInvoker(URL url) {
		wsdlURL = url;
	}

	public String getReponse(String request) throws IOException {
		String soapAction = wsdlURL.getProtocol() + "://"  + wsdlURL.getHost() + wsdlURL.getPath();

		URL targetURL = new URL(soapAction);
		
		// ######## SET UP ########
		
		URLConnection uc = targetURL.openConnection();
		HttpURLConnection connection = (HttpURLConnection) uc;

		connection.setDoOutput(true);
		connection.setDoInput(true);
		connection.setRequestMethod("POST");
		connection.setRequestProperty("SOAPAction", soapAction);
		connection.setRequestProperty("User-Agent","Mozilla/5.0 ( compatible ) ");
		connection.setRequestProperty("Accept","[star]/[star]");      
		connection.setRequestProperty("Content-Type", "text/xml; charset=utf-8");

		// ######## REQUEST ########
		
		byte[] buffer = new byte[request.length()];
		buffer = request.getBytes();
		ByteArrayOutputStream bout = new ByteArrayOutputStream();
		bout.write(buffer);
		byte[] byteReuqest = bout.toByteArray();
		bout.close();
		OutputStream out = connection.getOutputStream();
		out.write(byteReuqest);
		out.close();

		// ######## RESPONSE ########
		
		//int responseCode = connection.getResponseCode();
		BufferedReader rd = new BufferedReader(new InputStreamReader(connection.getInputStream()));
		String responseString = "";
		String outputString = "";
		while ((responseString = rd.readLine()) != null) {
			outputString = outputString + responseString;
		}

		return outputString;    
	}
}

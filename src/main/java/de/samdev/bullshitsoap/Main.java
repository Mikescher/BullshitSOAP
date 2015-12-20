package de.samdev.bullshitsoap;

import java.awt.EventQueue;

import de.samdev.bullshitsoap.http.HTTPReader;
import de.samdev.bullshitsoap.parser.WSDLDefinition;

public class Main {

	public static void main(String[] args) {
		//*
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					MainWindow frame = new MainWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		/*/
		try {
			new WSDLDefinition(HTTPReader.getHTTP("http://www.comunio.de/soapservice.php?wsdl"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		//*/
	}
}

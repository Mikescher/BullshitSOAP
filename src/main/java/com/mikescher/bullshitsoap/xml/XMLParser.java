package com.mikescher.bullshitsoap.xml;

import java.io.IOException;

import nu.xom.Builder;
import nu.xom.Document;
import nu.xom.ParsingException;
import nu.xom.ValidityException;

public class XMLParser {
	
	private Document document;
	
	
	public XMLParser(String xml) throws ValidityException, ParsingException, IOException {

		  Builder parser = new Builder();
		  document = parser.build(xml, null);
	}
}

package com.mikescher.bullshitsoap.parser;

import java.io.IOException;

import com.mikescher.bullshitsoap.xml.XMLParser;

import nu.xom.ParsingException;
import nu.xom.ValidityException;

public class WSDLDefinition {

	
	public WSDLDefinition(String xml) throws ValidityException, ParsingException, IOException {
		XMLParser parser = new XMLParser(xml);
		
		
	}
	
}

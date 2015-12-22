package de.samdev.bullshitsoap.parser.typedefinitions;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

import de.samdev.bullshitsoap.parser.WSDLDefinition;
import de.samdev.bullshitsoap.parser.WSDLParsingException;
import de.samdev.bullshitsoap.parser.helper.PathHelper;

public class WSDLDateTimeTypeDefinition extends WSDLPrimitiveTypeDefinition {
	private final static SimpleDateFormat[] WSDL_DATEFORMAT = new SimpleDateFormat[]
	{
		createSimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'"),
		createSimpleDateFormat("-yyyy-MM-dd'T'HH:mm:ss'Z'"),
		createSimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ"),
		createSimpleDateFormat("-yyyy-MM-dd'T'HH:mm:ssZ"),
	};
		
	private static SimpleDateFormat createSimpleDateFormat(String fmt) {
		SimpleDateFormat sdf = new SimpleDateFormat(fmt);
		sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
		return sdf;
	}
	
	public WSDLDateTimeTypeDefinition() {
		super("datetime", WSDLDefinition.NS_XSD);
	}

	@Override
	public Object parseFromString(String value) throws WSDLParsingException {
		for (SimpleDateFormat sdf : WSDL_DATEFORMAT) {
			try {
				return sdf.parse(value);
			} catch (ParseException e) { /* */ }
		}

		throw new WSDLParsingException("Can'T parse primitive: " + value);
	}

	@Override
	public String getClassCodeName() {
		return "WSDLObjectDateTime";
	}

	@Override
	protected String generateClassCodeInternal() {
		return PathHelper.getResourceFile("/WSDLObjectDateTime.java-template");
	}

	@Override
	public String getPrimitiveClassCodeName() {
		return "Date";
	}
}

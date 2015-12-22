package de.samdev.bullshitsoap.parser.typedefinitions;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

import de.samdev.bullshitsoap.parser.WSDLDefinition;
import de.samdev.bullshitsoap.parser.WSDLParsingException;
import de.samdev.bullshitsoap.parser.helper.PathHelper;

public class WSDLDateTypeDefinition extends WSDLPrimitiveTypeDefinition {
	private final static SimpleDateFormat PLAINDATEFORMAT = createSimpleDateFormat("yyyy_MM_dd");
	
	private final static SimpleDateFormat[] WSDL_DATEFORMAT = new SimpleDateFormat[]
	{
		createSimpleDateFormat("yyyy-MM-dd'Z'"),
		createSimpleDateFormat("-yyyy-MM-dd'Z'"),
		createSimpleDateFormat("yyyy-MM-ddZ"),
		createSimpleDateFormat("-yyyy-MM-ddZ"),
	};
		
	private static SimpleDateFormat createSimpleDateFormat(String fmt) {
		SimpleDateFormat sdf = new SimpleDateFormat(fmt);
		sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
		return sdf;
	}
	
	public WSDLDateTypeDefinition() {
		super("date", WSDLDefinition.NS_XSD);
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
	protected String generateClassCodeInternal() {
		return PathHelper.getResourceFile("/WSDLObjectDate.java-template");
	}

	@Override
	public String getPrimitiveClassCodeName() {
		return "Date";
	}

	@Override
	public String generateEnumName(Object object, int i) {
		return "DATE_" + PLAINDATEFORMAT.format((Date)object);
	}

	@Override
	public String generateLiteralCode(Object object) {
		Calendar c = Calendar.getInstance();
		c.setTime(((Date)object));
		
		return "new Date(" + (c.get(Calendar.YEAR)-1900) + ", " + c.get(Calendar.MONTH) + ", " + c.get(Calendar.DAY_OF_MONTH) + ")";
	}
}

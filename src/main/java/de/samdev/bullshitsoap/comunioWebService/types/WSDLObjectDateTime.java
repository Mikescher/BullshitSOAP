package de.samdev.bullshitsoap.comunioWebService.types;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import de.samdev.bullshitsoap.comunioWebService.WSDLNamespaceCollection;
import de.samdev.bullshitsoap.comunioWebService.types.WSDLObject;
import nu.xom.Attribute;
import nu.xom.Attribute.Type;
import nu.xom.Element;

/****************************************************************************** 
 *                                                                            * 
 *           THIS CODE WAS CREATED BY BULLSHITSOAP - DO NOT CHANGE            * 
 *                                                                            * 
 ******************************************************************************/

public class WSDLObjectDateTime extends WSDLObject {
	private final static SimpleDateFormat BASE_DATE_FORMAT = createSimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");

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
	
	private final Date value;
	
	private WSDLObjectDateTime(Date v) {
		super();
		
		value = v;
	}
	
	@Override
	public Element serialize(String name) {
		Element result = new Element(name);

		result.addAttribute(new Attribute(
				"type", 
				WSDLNamespaceCollection.NAMESPACE_PREFIX_XML_SCHEMAINSTANCE, 
				WSDLNamespaceCollection.NAMESPACE_PREFIX_XML_SCHEMA + ":datetime", 
				Type.CDATA));
		
		result.appendChild(BASE_DATE_FORMAT.format(value));
		
		return null;
	}

	public static Date parseFromString(String value) throws IOException {
		for (SimpleDateFormat sdf : WSDL_DATEFORMAT) {
			try {
				return sdf.parse(value);
			} catch (ParseException e) { /* */ }
		}

		throw new IOException("Can'T parse primitive: " + value);
	}
	
	public static WSDLObjectDateTime createFromXML(Element e) throws IOException {
		return new WSDLObjectDateTime(parseFromString(e.getValue()));
	}
	
	public static WSDLObjectDateTime create(Date v) {
		return new WSDLObjectDateTime(v);
	}
}
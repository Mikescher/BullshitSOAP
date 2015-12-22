package de.samdev.bullshitsoap.comunioWebService;

import java.io.IOException;
import java.net.URL;
import de.samdev.bullshitsoap.comunioWebService.messages.*;
import de.samdev.bullshitsoap.comunioWebService.types.*;
import nu.xom.Builder;
import nu.xom.ParsingException;
import nu.xom.ValidityException;

/****************************************************************************** 
 *                                                                            * 
 *           THIS CODE WAS CREATED BY BULLSHITSOAP - DO NOT CHANGE            * 
 *                                                                            * 
 ******************************************************************************/

public final class WSDLServiceComunioWebService {
	private static WSDLInvoker invoker = null;
	
	static { 
		try { 
			invoker = new WSDLInvoker(new URL("http://www.comunio.de/soapservice.php?wsdl")); 
		} catch (Exception e) { 
			/* Can never happen */
		} 
	}

	private WSDLServiceComunioWebService() { /* */ }

	public static WSDLMessageCheckpermissionsresponse checkPermissions(WSDLMessageCheckpermissionsrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize("checkPermissions").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageCheckpermissionsresponse result = WSDLMessageCheckpermissionsresponse.createFromXML(xom.build(response, null), "checkPermissions");
		return result;
	}

	public static WSDLMessageCheckpermissionsresponse checkPermissions(WSDLObjectInt _userid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageCheckpermissionsrequest.create(_userid).serialize("checkPermissions").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageCheckpermissionsresponse result = WSDLMessageCheckpermissionsresponse.createFromXML(xom.build(response, null), "checkPermissions");
		return result;
	}

	public static boolean checkPermissions(int _userid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageCheckpermissionsrequest.create(WSDLObjectInt.create(_userid)).serialize("checkPermissions").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageCheckpermissionsresponse result = WSDLMessageCheckpermissionsresponse.createFromXML(xom.build(response, null), "checkPermissions");
		return result.field_return.value;
	}

	public static WSDLMessageCheckmultipermissionsresponse checkmultiPermissions(WSDLMessageCheckmultipermissionsrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize("checkmultiPermissions").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageCheckmultipermissionsresponse result = WSDLMessageCheckmultipermissionsresponse.createFromXML(xom.build(response, null), "checkmultiPermissions");
		return result;
	}

	public static WSDLMessageCheckmultipermissionsresponse checkmultiPermissions(WSDLObjectArrayofuserid _arr_userid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageCheckmultipermissionsrequest.create(_arr_userid).serialize("checkmultiPermissions").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageCheckmultipermissionsresponse result = WSDLMessageCheckmultipermissionsresponse.createFromXML(xom.build(response, null), "checkmultiPermissions");
		return result;
	}

	public static WSDLMessageCheckcommunitypermissionsresponse checkcommunitypermissions(WSDLMessageCheckcommunitypermissionsrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize("checkcommunitypermissions").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageCheckcommunitypermissionsresponse result = WSDLMessageCheckcommunitypermissionsresponse.createFromXML(xom.build(response, null), "checkcommunitypermissions");
		return result;
	}

	public static WSDLMessageCheckcommunitypermissionsresponse checkcommunitypermissions(WSDLObjectInt _userid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageCheckcommunitypermissionsrequest.create(_userid).serialize("checkcommunitypermissions").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageCheckcommunitypermissionsresponse result = WSDLMessageCheckcommunitypermissionsresponse.createFromXML(xom.build(response, null), "checkcommunitypermissions");
		return result;
	}

	public static boolean checkcommunitypermissions(int _userid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageCheckcommunitypermissionsrequest.create(WSDLObjectInt.create(_userid)).serialize("checkcommunitypermissions").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageCheckcommunitypermissionsresponse result = WSDLMessageCheckcommunitypermissionsresponse.createFromXML(xom.build(response, null), "checkcommunitypermissions");
		return result.field_return.value;
	}

	public static WSDLMessageGetsoapservicereleaseresponse getsoapservicerelease(WSDLMessageGetsoapservicereleaserequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize("getsoapservicerelease").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetsoapservicereleaseresponse result = WSDLMessageGetsoapservicereleaseresponse.createFromXML(xom.build(response, null), "getsoapservicerelease");
		return result;
	}

	public static WSDLMessageGetsoapservicereleaseresponse getsoapservicerelease() throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetsoapservicereleaserequest.create().serialize("getsoapservicerelease").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetsoapservicereleaseresponse result = WSDLMessageGetsoapservicereleaseresponse.createFromXML(xom.build(response, null), "getsoapservicerelease");
		return result;
	}

	public static WSDLMessageGetuseridresponse getuserid(WSDLMessageGetuseridrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize("getuserid").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetuseridresponse result = WSDLMessageGetuseridresponse.createFromXML(xom.build(response, null), "getuserid");
		return result;
	}

	public static WSDLMessageGetuseridresponse getuserid(WSDLObjectString _login) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetuseridrequest.create(_login).serialize("getuserid").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetuseridresponse result = WSDLMessageGetuseridresponse.createFromXML(xom.build(response, null), "getuserid");
		return result;
	}

	public static int getuserid(String _login) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetuseridrequest.create(WSDLObjectString.create(_login)).serialize("getuserid").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetuseridresponse result = WSDLMessageGetuseridresponse.createFromXML(xom.build(response, null), "getuserid");
		return result.field_return.value;
	}

	public static WSDLMessageGetloginresponse getlogin(WSDLMessageGetloginrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize("getlogin").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetloginresponse result = WSDLMessageGetloginresponse.createFromXML(xom.build(response, null), "getlogin");
		return result;
	}

	public static WSDLMessageGetloginresponse getlogin(WSDLObjectInt _userid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetloginrequest.create(_userid).serialize("getlogin").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetloginresponse result = WSDLMessageGetloginresponse.createFromXML(xom.build(response, null), "getlogin");
		return result;
	}

	public static String getlogin(int _userid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetloginrequest.create(WSDLObjectInt.create(_userid)).serialize("getlogin").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetloginresponse result = WSDLMessageGetloginresponse.createFromXML(xom.build(response, null), "getlogin");
		return result.field_return.value;
	}

	public static WSDLMessageGetuserinformationresponse getUserInformation(WSDLMessageGetuserinformationrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize("getUserInformation").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetuserinformationresponse result = WSDLMessageGetuserinformationresponse.createFromXML(xom.build(response, null), "getUserInformation");
		return result;
	}

	public static WSDLMessageGetuserinformationresponse getUserInformation(WSDLObjectInt _userid, WSDLObjectString _md5password) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetuserinformationrequest.create(_userid, _md5password).serialize("getUserInformation").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetuserinformationresponse result = WSDLMessageGetuserinformationresponse.createFromXML(xom.build(response, null), "getUserInformation");
		return result;
	}

	public static WSDLMessageGetuserinformationresponse getUserInformation(int _userid, String _md5password) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetuserinformationrequest.create(WSDLObjectInt.create(_userid), WSDLObjectString.create(_md5password)).serialize("getUserInformation").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetuserinformationresponse result = WSDLMessageGetuserinformationresponse.createFromXML(xom.build(response, null), "getUserInformation");
		return result;
	}

	public static WSDLMessageGetusersfirstnameresponse getusersfirstname(WSDLMessageGetusersfirstnamerequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize("getusersfirstname").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetusersfirstnameresponse result = WSDLMessageGetusersfirstnameresponse.createFromXML(xom.build(response, null), "getusersfirstname");
		return result;
	}

	public static WSDLMessageGetusersfirstnameresponse getusersfirstname(WSDLObjectInt _userid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetusersfirstnamerequest.create(_userid).serialize("getusersfirstname").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetusersfirstnameresponse result = WSDLMessageGetusersfirstnameresponse.createFromXML(xom.build(response, null), "getusersfirstname");
		return result;
	}

	public static String getusersfirstname(int _userid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetusersfirstnamerequest.create(WSDLObjectInt.create(_userid)).serialize("getusersfirstname").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetusersfirstnameresponse result = WSDLMessageGetusersfirstnameresponse.createFromXML(xom.build(response, null), "getusersfirstname");
		return result.field_return.value;
	}

	public static WSDLMessageGetusersnameresponse getusersname(WSDLMessageGetusersnamerequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize("getusersname").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetusersnameresponse result = WSDLMessageGetusersnameresponse.createFromXML(xom.build(response, null), "getusersname");
		return result;
	}

	public static WSDLMessageGetusersnameresponse getusersname(WSDLObjectInt _userid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetusersnamerequest.create(_userid).serialize("getusersname").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetusersnameresponse result = WSDLMessageGetusersnameresponse.createFromXML(xom.build(response, null), "getusersname");
		return result;
	}

	public static String getusersname(int _userid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetusersnamerequest.create(WSDLObjectInt.create(_userid)).serialize("getusersname").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetusersnameresponse result = WSDLMessageGetusersnameresponse.createFromXML(xom.build(response, null), "getusersname");
		return result.field_return.value;
	}

	public static WSDLMessageGetuserspointsresponse getuserspoints(WSDLMessageGetuserspointsrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize("getuserspoints").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetuserspointsresponse result = WSDLMessageGetuserspointsresponse.createFromXML(xom.build(response, null), "getuserspoints");
		return result;
	}

	public static WSDLMessageGetuserspointsresponse getuserspoints(WSDLObjectInt _userid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetuserspointsrequest.create(_userid).serialize("getuserspoints").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetuserspointsresponse result = WSDLMessageGetuserspointsresponse.createFromXML(xom.build(response, null), "getuserspoints");
		return result;
	}

	public static int getuserspoints(int _userid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetuserspointsrequest.create(WSDLObjectInt.create(_userid)).serialize("getuserspoints").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetuserspointsresponse result = WSDLMessageGetuserspointsresponse.createFromXML(xom.build(response, null), "getuserspoints");
		return result.field_return.value;
	}

	public static WSDLMessageGetmultiuserspointsresponse getmultiuserspoints(WSDLMessageGetmultiuserspointsrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize("getmultiuserspoints").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetmultiuserspointsresponse result = WSDLMessageGetmultiuserspointsresponse.createFromXML(xom.build(response, null), "getmultiuserspoints");
		return result;
	}

	public static WSDLMessageGetmultiuserspointsresponse getmultiuserspoints(WSDLObjectArrayofuserid _arr_userid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetmultiuserspointsrequest.create(_arr_userid).serialize("getmultiuserspoints").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetmultiuserspointsresponse result = WSDLMessageGetmultiuserspointsresponse.createFromXML(xom.build(response, null), "getmultiuserspoints");
		return result;
	}

	public static WSDLMessageGetusersgamdaybudgetstateresponse getusersgamdaybudgetstate(WSDLMessageGetusersgamdaybudgetstaterequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize("getusersgamdaybudgetstate").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetusersgamdaybudgetstateresponse result = WSDLMessageGetusersgamdaybudgetstateresponse.createFromXML(xom.build(response, null), "getusersgamdaybudgetstate");
		return result;
	}

	public static WSDLMessageGetusersgamdaybudgetstateresponse getusersgamdaybudgetstate(WSDLObjectInt _userid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetusersgamdaybudgetstaterequest.create(_userid).serialize("getusersgamdaybudgetstate").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetusersgamdaybudgetstateresponse result = WSDLMessageGetusersgamdaybudgetstateresponse.createFromXML(xom.build(response, null), "getusersgamdaybudgetstate");
		return result;
	}

	public static boolean getusersgamdaybudgetstate(int _userid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetusersgamdaybudgetstaterequest.create(WSDLObjectInt.create(_userid)).serialize("getusersgamdaybudgetstate").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetusersgamdaybudgetstateresponse result = WSDLMessageGetusersgamdaybudgetstateresponse.createFromXML(xom.build(response, null), "getusersgamdaybudgetstate");
		return result.field_return.value;
	}

	public static WSDLMessageGetmultiusersgamdaybudgetstateresponse getmultiusersgamdaybudgetstate(WSDLMessageGetmultiusersgamdaybudgetstaterequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize("getmultiusersgamdaybudgetstate").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetmultiusersgamdaybudgetstateresponse result = WSDLMessageGetmultiusersgamdaybudgetstateresponse.createFromXML(xom.build(response, null), "getmultiusersgamdaybudgetstate");
		return result;
	}

	public static WSDLMessageGetmultiusersgamdaybudgetstateresponse getmultiusersgamdaybudgetstate(WSDLObjectArrayofuserid _arr_userid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetmultiusersgamdaybudgetstaterequest.create(_arr_userid).serialize("getmultiusersgamdaybudgetstate").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetmultiusersgamdaybudgetstateresponse result = WSDLMessageGetmultiusersgamdaybudgetstateresponse.createFromXML(xom.build(response, null), "getmultiusersgamdaybudgetstate");
		return result;
	}

	public static WSDLMessageGetusersdescriptionresponse getusersdescription(WSDLMessageGetusersdescriptionrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize("getusersdescription").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetusersdescriptionresponse result = WSDLMessageGetusersdescriptionresponse.createFromXML(xom.build(response, null), "getusersdescription");
		return result;
	}

	public static WSDLMessageGetusersdescriptionresponse getusersdescription(WSDLObjectInt _userid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetusersdescriptionrequest.create(_userid).serialize("getusersdescription").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetusersdescriptionresponse result = WSDLMessageGetusersdescriptionresponse.createFromXML(xom.build(response, null), "getusersdescription");
		return result;
	}

	public static String getusersdescription(int _userid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetusersdescriptionrequest.create(WSDLObjectInt.create(_userid)).serialize("getusersdescription").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetusersdescriptionresponse result = WSDLMessageGetusersdescriptionresponse.createFromXML(xom.build(response, null), "getusersdescription");
		return result.field_return.value;
	}

	public static WSDLMessageGetteamvalueresponse getteamvalue(WSDLMessageGetteamvaluerequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize("getteamvalue").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetteamvalueresponse result = WSDLMessageGetteamvalueresponse.createFromXML(xom.build(response, null), "getteamvalue");
		return result;
	}

	public static WSDLMessageGetteamvalueresponse getteamvalue(WSDLObjectInt _userid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetteamvaluerequest.create(_userid).serialize("getteamvalue").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetteamvalueresponse result = WSDLMessageGetteamvalueresponse.createFromXML(xom.build(response, null), "getteamvalue");
		return result;
	}

	public static int getteamvalue(int _userid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetteamvaluerequest.create(WSDLObjectInt.create(_userid)).serialize("getteamvalue").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetteamvalueresponse result = WSDLMessageGetteamvalueresponse.createFromXML(xom.build(response, null), "getteamvalue");
		return result.field_return.value;
	}

	public static WSDLMessageGetteamsizeresponse getteamsize(WSDLMessageGetteamsizerequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize("getteamsize").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetteamsizeresponse result = WSDLMessageGetteamsizeresponse.createFromXML(xom.build(response, null), "getteamsize");
		return result;
	}

	public static WSDLMessageGetteamsizeresponse getteamsize(WSDLObjectInt _userid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetteamsizerequest.create(_userid).serialize("getteamsize").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetteamsizeresponse result = WSDLMessageGetteamsizeresponse.createFromXML(xom.build(response, null), "getteamsize");
		return result;
	}

	public static int getteamsize(int _userid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetteamsizerequest.create(WSDLObjectInt.create(_userid)).serialize("getteamsize").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetteamsizeresponse result = WSDLMessageGetteamsizeresponse.createFromXML(xom.build(response, null), "getteamsize");
		return result.field_return.value;
	}

	public static WSDLMessageGetcommunityidresponse getcommunityid(WSDLMessageGetcommunityidrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize("getcommunityid").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetcommunityidresponse result = WSDLMessageGetcommunityidresponse.createFromXML(xom.build(response, null), "getcommunityid");
		return result;
	}

	public static WSDLMessageGetcommunityidresponse getcommunityid(WSDLObjectInt _userid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetcommunityidrequest.create(_userid).serialize("getcommunityid").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetcommunityidresponse result = WSDLMessageGetcommunityidresponse.createFromXML(xom.build(response, null), "getcommunityid");
		return result;
	}

	public static int getcommunityid(int _userid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetcommunityidrequest.create(WSDLObjectInt.create(_userid)).serialize("getcommunityid").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetcommunityidresponse result = WSDLMessageGetcommunityidresponse.createFromXML(xom.build(response, null), "getcommunityid");
		return result.field_return.value;
	}

	public static WSDLMessageGetcommunitynameresponse getcommunityname(WSDLMessageGetcommunitynamerequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize("getcommunityname").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetcommunitynameresponse result = WSDLMessageGetcommunitynameresponse.createFromXML(xom.build(response, null), "getcommunityname");
		return result;
	}

	public static WSDLMessageGetcommunitynameresponse getcommunityname(WSDLObjectInt _communityid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetcommunitynamerequest.create(_communityid).serialize("getcommunityname").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetcommunitynameresponse result = WSDLMessageGetcommunitynameresponse.createFromXML(xom.build(response, null), "getcommunityname");
		return result;
	}

	public static String getcommunityname(int _communityid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetcommunitynamerequest.create(WSDLObjectInt.create(_communityid)).serialize("getcommunityname").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetcommunitynameresponse result = WSDLMessageGetcommunitynameresponse.createFromXML(xom.build(response, null), "getcommunityname");
		return result.field_return.value;
	}

	public static WSDLMessageGetcommunitynamebyuseridresponse getcommunitynamebyuserid(WSDLMessageGetcommunitynamebyuseridrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize("getcommunitynamebyuserid").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetcommunitynamebyuseridresponse result = WSDLMessageGetcommunitynamebyuseridresponse.createFromXML(xom.build(response, null), "getcommunitynamebyuserid");
		return result;
	}

	public static WSDLMessageGetcommunitynamebyuseridresponse getcommunitynamebyuserid(WSDLObjectInt _userid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetcommunitynamebyuseridrequest.create(_userid).serialize("getcommunitynamebyuserid").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetcommunitynamebyuseridresponse result = WSDLMessageGetcommunitynamebyuseridresponse.createFromXML(xom.build(response, null), "getcommunitynamebyuserid");
		return result;
	}

	public static String getcommunitynamebyuserid(int _userid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetcommunitynamebyuseridrequest.create(WSDLObjectInt.create(_userid)).serialize("getcommunitynamebyuserid").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetcommunitynamebyuseridresponse result = WSDLMessageGetcommunitynamebyuseridresponse.createFromXML(xom.build(response, null), "getcommunitynamebyuserid");
		return result.field_return.value;
	}

	public static WSDLMessageGetuserloginsresponse getuserlogins(WSDLMessageGetuserloginsrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize("getuserlogins").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetuserloginsresponse result = WSDLMessageGetuserloginsresponse.createFromXML(xom.build(response, null), "getuserlogins");
		return result;
	}

	public static WSDLMessageGetuserloginsresponse getuserlogins(WSDLObjectInt _communityid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetuserloginsrequest.create(_communityid).serialize("getuserlogins").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetuserloginsresponse result = WSDLMessageGetuserloginsresponse.createFromXML(xom.build(response, null), "getuserlogins");
		return result;
	}

	public static WSDLMessageGetuserloginsresponse getuserlogins(int _communityid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetuserloginsrequest.create(WSDLObjectInt.create(_communityid)).serialize("getuserlogins").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetuserloginsresponse result = WSDLMessageGetuserloginsresponse.createFromXML(xom.build(response, null), "getuserlogins");
		return result;
	}

	public static WSDLMessageGetuseridsresponse getuserids(WSDLMessageGetuseridsrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize("getuserids").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetuseridsresponse result = WSDLMessageGetuseridsresponse.createFromXML(xom.build(response, null), "getuserids");
		return result;
	}

	public static WSDLMessageGetuseridsresponse getuserids(WSDLObjectInt _communityid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetuseridsrequest.create(_communityid).serialize("getuserids").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetuseridsresponse result = WSDLMessageGetuseridsresponse.createFromXML(xom.build(response, null), "getuserids");
		return result;
	}

	public static WSDLMessageGetuseridsresponse getuserids(int _communityid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetuseridsrequest.create(WSDLObjectInt.create(_communityid)).serialize("getuserids").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetuseridsresponse result = WSDLMessageGetuseridsresponse.createFromXML(xom.build(response, null), "getuserids");
		return result;
	}

	public static WSDLMessageGetgamedaysresponse getgamedays(WSDLMessageGetgamedaysrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize("getgamedays").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetgamedaysresponse result = WSDLMessageGetgamedaysresponse.createFromXML(xom.build(response, null), "getgamedays");
		return result;
	}

	public static WSDLMessageGetgamedaysresponse getgamedays() throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetgamedaysrequest.create().serialize("getgamedays").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetgamedaysresponse result = WSDLMessageGetgamedaysresponse.createFromXML(xom.build(response, null), "getgamedays");
		return result;
	}

	public static WSDLMessageGetcommunityadminsresponse getcommunityadmins(WSDLMessageGetcommunityadminsrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize("getcommunityadmins").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetcommunityadminsresponse result = WSDLMessageGetcommunityadminsresponse.createFromXML(xom.build(response, null), "getcommunityadmins");
		return result;
	}

	public static WSDLMessageGetcommunityadminsresponse getcommunityadmins(WSDLObjectInt _communityid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetcommunityadminsrequest.create(_communityid).serialize("getcommunityadmins").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetcommunityadminsresponse result = WSDLMessageGetcommunityadminsresponse.createFromXML(xom.build(response, null), "getcommunityadmins");
		return result;
	}

	public static WSDLMessageGetcommunityadminsresponse getcommunityadmins(int _communityid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetcommunityadminsrequest.create(WSDLObjectInt.create(_communityid)).serialize("getcommunityadmins").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetcommunityadminsresponse result = WSDLMessageGetcommunityadminsresponse.createFromXML(xom.build(response, null), "getcommunityadmins");
		return result;
	}

	public static WSDLMessageGetcommunitymarketresponse getcommunitymarket(WSDLMessageGetcommunitymarketrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize("getcommunitymarket").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetcommunitymarketresponse result = WSDLMessageGetcommunitymarketresponse.createFromXML(xom.build(response, null), "getcommunitymarket");
		return result;
	}

	public static WSDLMessageGetcommunitymarketresponse getcommunitymarket(WSDLObjectInt _communityid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetcommunitymarketrequest.create(_communityid).serialize("getcommunitymarket").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetcommunitymarketresponse result = WSDLMessageGetcommunitymarketresponse.createFromXML(xom.build(response, null), "getcommunitymarket");
		return result;
	}

	public static WSDLMessageGetcommunitymarketresponse getcommunitymarket(int _communityid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetcommunitymarketrequest.create(WSDLObjectInt.create(_communityid)).serialize("getcommunitymarket").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetcommunitymarketresponse result = WSDLMessageGetcommunitymarketresponse.createFromXML(xom.build(response, null), "getcommunitymarket");
		return result;
	}

	public static WSDLMessagePlayer_getcommunitymarketresponse player_getcommunitymarket(WSDLMessagePlayer_getcommunitymarketrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize("player_getcommunitymarket").toXML();
		String response = invoker.getReponse(request);
		WSDLMessagePlayer_getcommunitymarketresponse result = WSDLMessagePlayer_getcommunitymarketresponse.createFromXML(xom.build(response, null), "player_getcommunitymarket");
		return result;
	}

	public static WSDLMessagePlayer_getcommunitymarketresponse player_getcommunitymarket() throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessagePlayer_getcommunitymarketrequest.create().serialize("player_getcommunitymarket").toXML();
		String response = invoker.getReponse(request);
		WSDLMessagePlayer_getcommunitymarketresponse result = WSDLMessagePlayer_getcommunitymarketresponse.createFromXML(xom.build(response, null), "player_getcommunitymarket");
		return result;
	}

	public static WSDLMessageGetplayerbyidresponse getplayerbyid(WSDLMessageGetplayerbyidrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize("getplayerbyid").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetplayerbyidresponse result = WSDLMessageGetplayerbyidresponse.createFromXML(xom.build(response, null), "getplayerbyid");
		return result;
	}

	public static WSDLMessageGetplayerbyidresponse getplayerbyid(WSDLObjectInt _playerid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetplayerbyidrequest.create(_playerid).serialize("getplayerbyid").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetplayerbyidresponse result = WSDLMessageGetplayerbyidresponse.createFromXML(xom.build(response, null), "getplayerbyid");
		return result;
	}

	public static WSDLMessageGetplayerbyidresponse getplayerbyid(int _playerid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetplayerbyidrequest.create(WSDLObjectInt.create(_playerid)).serialize("getplayerbyid").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetplayerbyidresponse result = WSDLMessageGetplayerbyidresponse.createFromXML(xom.build(response, null), "getplayerbyid");
		return result;
	}

	public static WSDLMessageGetusergamedaypointsresponse getusergamedaypoints(WSDLMessageGetusergamedaypointsrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize("getusergamedaypoints").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetusergamedaypointsresponse result = WSDLMessageGetusergamedaypointsresponse.createFromXML(xom.build(response, null), "getusergamedaypoints");
		return result;
	}

	public static WSDLMessageGetusergamedaypointsresponse getusergamedaypoints(WSDLObjectInt _userid, WSDLObjectInt _gameday) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetusergamedaypointsrequest.create(_userid, _gameday).serialize("getusergamedaypoints").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetusergamedaypointsresponse result = WSDLMessageGetusergamedaypointsresponse.createFromXML(xom.build(response, null), "getusergamedaypoints");
		return result;
	}

	public static int getusergamedaypoints(int _userid, int _gameday) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetusergamedaypointsrequest.create(WSDLObjectInt.create(_userid), WSDLObjectInt.create(_gameday)).serialize("getusergamedaypoints").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetusergamedaypointsresponse result = WSDLMessageGetusergamedaypointsresponse.createFromXML(xom.build(response, null), "getusergamedaypoints");
		return result.field_return.value;
	}

	public static WSDLMessageGetusergamedaypointsidresponse getusergamedaypointsid(WSDLMessageGetusergamedaypointsidrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize("getusergamedaypointsid").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetusergamedaypointsidresponse result = WSDLMessageGetusergamedaypointsidresponse.createFromXML(xom.build(response, null), "getusergamedaypointsid");
		return result;
	}

	public static WSDLMessageGetusergamedaypointsidresponse getusergamedaypointsid(WSDLObjectInt _userid, WSDLObjectInt _gameday_id) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetusergamedaypointsidrequest.create(_userid, _gameday_id).serialize("getusergamedaypointsid").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetusergamedaypointsidresponse result = WSDLMessageGetusergamedaypointsidresponse.createFromXML(xom.build(response, null), "getusergamedaypointsid");
		return result;
	}

	public static int getusergamedaypointsid(int _userid, int _gameday_id) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetusergamedaypointsidrequest.create(WSDLObjectInt.create(_userid), WSDLObjectInt.create(_gameday_id)).serialize("getusergamedaypointsid").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetusergamedaypointsidresponse result = WSDLMessageGetusergamedaypointsidresponse.createFromXML(xom.build(response, null), "getusergamedaypointsid");
		return result.field_return.value;
	}

	public static WSDLMessageGetmultiusergamedaypointsresponse getmultiusergamedaypoints(WSDLMessageGetmultiusergamedaypointsrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize("getmultiusergamedaypoints").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetmultiusergamedaypointsresponse result = WSDLMessageGetmultiusergamedaypointsresponse.createFromXML(xom.build(response, null), "getmultiusergamedaypoints");
		return result;
	}

	public static WSDLMessageGetmultiusergamedaypointsresponse getmultiusergamedaypoints(WSDLObjectArrayofuserid _arr_userid, WSDLObjectInt _gameday) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetmultiusergamedaypointsrequest.create(_arr_userid, _gameday).serialize("getmultiusergamedaypoints").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetmultiusergamedaypointsresponse result = WSDLMessageGetmultiusergamedaypointsresponse.createFromXML(xom.build(response, null), "getmultiusergamedaypoints");
		return result;
	}

	public static WSDLMessageGetmultiusergamedaypointsresponse getmultiusergamedaypoints(WSDLObjectArrayofuserid _arr_userid, int _gameday) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetmultiusergamedaypointsrequest.create(_arr_userid, WSDLObjectInt.create(_gameday)).serialize("getmultiusergamedaypoints").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetmultiusergamedaypointsresponse result = WSDLMessageGetmultiusergamedaypointsresponse.createFromXML(xom.build(response, null), "getmultiusergamedaypoints");
		return result;
	}

	public static WSDLMessageGetmultiusergamedaypointsidresponse getmultiusergamedaypointsid(WSDLMessageGetmultiusergamedaypointsidrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize("getmultiusergamedaypointsid").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetmultiusergamedaypointsidresponse result = WSDLMessageGetmultiusergamedaypointsidresponse.createFromXML(xom.build(response, null), "getmultiusergamedaypointsid");
		return result;
	}

	public static WSDLMessageGetmultiusergamedaypointsidresponse getmultiusergamedaypointsid(WSDLObjectArrayofuserid _arr_userid, WSDLObjectInt _gameday_id) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetmultiusergamedaypointsidrequest.create(_arr_userid, _gameday_id).serialize("getmultiusergamedaypointsid").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetmultiusergamedaypointsidresponse result = WSDLMessageGetmultiusergamedaypointsidresponse.createFromXML(xom.build(response, null), "getmultiusergamedaypointsid");
		return result;
	}

	public static WSDLMessageGetmultiusergamedaypointsidresponse getmultiusergamedaypointsid(WSDLObjectArrayofuserid _arr_userid, int _gameday_id) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetmultiusergamedaypointsidrequest.create(_arr_userid, WSDLObjectInt.create(_gameday_id)).serialize("getmultiusergamedaypointsid").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetmultiusergamedaypointsidresponse result = WSDLMessageGetmultiusergamedaypointsidresponse.createFromXML(xom.build(response, null), "getmultiusergamedaypointsid");
		return result;
	}

	public static WSDLMessageGetlatestgamedayresponse getlatestgameday(WSDLMessageGetlatestgamedayrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize("getlatestgameday").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetlatestgamedayresponse result = WSDLMessageGetlatestgamedayresponse.createFromXML(xom.build(response, null), "getlatestgameday");
		return result;
	}

	public static WSDLMessageGetlatestgamedayresponse getlatestgameday() throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetlatestgamedayrequest.create().serialize("getlatestgameday").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetlatestgamedayresponse result = WSDLMessageGetlatestgamedayresponse.createFromXML(xom.build(response, null), "getlatestgameday");
		return result;
	}

	public static WSDLMessageGetlatestgamedayidresponse getlatestgamedayid(WSDLMessageGetlatestgamedayidrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize("getlatestgamedayid").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetlatestgamedayidresponse result = WSDLMessageGetlatestgamedayidresponse.createFromXML(xom.build(response, null), "getlatestgamedayid");
		return result;
	}

	public static WSDLMessageGetlatestgamedayidresponse getlatestgamedayid() throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetlatestgamedayidrequest.create().serialize("getlatestgamedayid").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetlatestgamedayidresponse result = WSDLMessageGetlatestgamedayidresponse.createFromXML(xom.build(response, null), "getlatestgamedayid");
		return result;
	}

	public static WSDLMessageGetcomputernewsresponse getcomputernews(WSDLMessageGetcomputernewsrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize("getcomputernews").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetcomputernewsresponse result = WSDLMessageGetcomputernewsresponse.createFromXML(xom.build(response, null), "getcomputernews");
		return result;
	}

	public static WSDLMessageGetcomputernewsresponse getcomputernews(WSDLObjectInt _communityid, WSDLObjectInt _days, WSDLObjectInt _items) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetcomputernewsrequest.create(_communityid, _days, _items).serialize("getcomputernews").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetcomputernewsresponse result = WSDLMessageGetcomputernewsresponse.createFromXML(xom.build(response, null), "getcomputernews");
		return result;
	}

	public static WSDLMessageGetcomputernewsresponse getcomputernews(int _communityid, int _days, int _items) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetcomputernewsrequest.create(WSDLObjectInt.create(_communityid), WSDLObjectInt.create(_days), WSDLObjectInt.create(_items)).serialize("getcomputernews").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetcomputernewsresponse result = WSDLMessageGetcomputernewsresponse.createFromXML(xom.build(response, null), "getcomputernews");
		return result;
	}

	public static WSDLMessageCommunityexistsresponse communityexists(WSDLMessageCommunityexistsrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize("communityexists").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageCommunityexistsresponse result = WSDLMessageCommunityexistsresponse.createFromXML(xom.build(response, null), "communityexists");
		return result;
	}

	public static WSDLMessageCommunityexistsresponse communityexists(WSDLObjectInt _communityid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageCommunityexistsrequest.create(_communityid).serialize("communityexists").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageCommunityexistsresponse result = WSDLMessageCommunityexistsresponse.createFromXML(xom.build(response, null), "communityexists");
		return result;
	}

	public static boolean communityexists(int _communityid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageCommunityexistsrequest.create(WSDLObjectInt.create(_communityid)).serialize("communityexists").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageCommunityexistsresponse result = WSDLMessageCommunityexistsresponse.createFromXML(xom.build(response, null), "communityexists");
		return result.field_return.value;
	}

	public static WSDLMessageGetclubsresponse getclubs(WSDLMessageGetclubsrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize("getclubs").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetclubsresponse result = WSDLMessageGetclubsresponse.createFromXML(xom.build(response, null), "getclubs");
		return result;
	}

	public static WSDLMessageGetclubsresponse getclubs() throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetclubsrequest.create().serialize("getclubs").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetclubsresponse result = WSDLMessageGetclubsresponse.createFromXML(xom.build(response, null), "getclubs");
		return result;
	}

	public static WSDLMessageGetplayersbyclubidresponse getplayersbyclubid(WSDLMessageGetplayersbyclubidrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize("getplayersbyclubid").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetplayersbyclubidresponse result = WSDLMessageGetplayersbyclubidresponse.createFromXML(xom.build(response, null), "getplayersbyclubid");
		return result;
	}

	public static WSDLMessageGetplayersbyclubidresponse getplayersbyclubid(WSDLObjectInt _clubid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetplayersbyclubidrequest.create(_clubid).serialize("getplayersbyclubid").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetplayersbyclubidresponse result = WSDLMessageGetplayersbyclubidresponse.createFromXML(xom.build(response, null), "getplayersbyclubid");
		return result;
	}

	public static WSDLMessageGetplayersbyclubidresponse getplayersbyclubid(int _clubid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetplayersbyclubidrequest.create(WSDLObjectInt.create(_clubid)).serialize("getplayersbyclubid").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetplayersbyclubidresponse result = WSDLMessageGetplayersbyclubidresponse.createFromXML(xom.build(response, null), "getplayersbyclubid");
		return result;
	}

	public static WSDLMessageGetplayersbyclubidinclretiredresponse getplayersbyclubidinclretired(WSDLMessageGetplayersbyclubidinclretiredrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize("getplayersbyclubidinclretired").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetplayersbyclubidinclretiredresponse result = WSDLMessageGetplayersbyclubidinclretiredresponse.createFromXML(xom.build(response, null), "getplayersbyclubidinclretired");
		return result;
	}

	public static WSDLMessageGetplayersbyclubidinclretiredresponse getplayersbyclubidinclretired(WSDLObjectInt _clubid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetplayersbyclubidinclretiredrequest.create(_clubid).serialize("getplayersbyclubidinclretired").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetplayersbyclubidinclretiredresponse result = WSDLMessageGetplayersbyclubidinclretiredresponse.createFromXML(xom.build(response, null), "getplayersbyclubidinclretired");
		return result;
	}

	public static WSDLMessageGetplayersbyclubidinclretiredresponse getplayersbyclubidinclretired(int _clubid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetplayersbyclubidinclretiredrequest.create(WSDLObjectInt.create(_clubid)).serialize("getplayersbyclubidinclretired").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetplayersbyclubidinclretiredresponse result = WSDLMessageGetplayersbyclubidinclretiredresponse.createFromXML(xom.build(response, null), "getplayersbyclubidinclretired");
		return result;
	}

	public static WSDLMessageGetplayerssportaldeidresponse getplayerssportaldeid(WSDLMessageGetplayerssportaldeidrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize("getplayerssportaldeid").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetplayerssportaldeidresponse result = WSDLMessageGetplayerssportaldeidresponse.createFromXML(xom.build(response, null), "getplayerssportaldeid");
		return result;
	}

	public static WSDLMessageGetplayerssportaldeidresponse getplayerssportaldeid(WSDLObjectInt _playerid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetplayerssportaldeidrequest.create(_playerid).serialize("getplayerssportaldeid").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetplayerssportaldeidresponse result = WSDLMessageGetplayerssportaldeidresponse.createFromXML(xom.build(response, null), "getplayerssportaldeid");
		return result;
	}

	public static int getplayerssportaldeid(int _playerid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetplayerssportaldeidrequest.create(WSDLObjectInt.create(_playerid)).serialize("getplayerssportaldeid").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetplayerssportaldeidresponse result = WSDLMessageGetplayerssportaldeidresponse.createFromXML(xom.build(response, null), "getplayerssportaldeid");
		return result.field_return.value;
	}

	public static WSDLMessageGetplayerbysportaldeidresponse getplayerbysportaldeid(WSDLMessageGetplayerbysportaldeidrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize("getplayerbysportaldeid").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetplayerbysportaldeidresponse result = WSDLMessageGetplayerbysportaldeidresponse.createFromXML(xom.build(response, null), "getplayerbysportaldeid");
		return result;
	}

	public static WSDLMessageGetplayerbysportaldeidresponse getplayerbysportaldeid(WSDLObjectInt _sportaldeid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetplayerbysportaldeidrequest.create(_sportaldeid).serialize("getplayerbysportaldeid").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetplayerbysportaldeidresponse result = WSDLMessageGetplayerbysportaldeidresponse.createFromXML(xom.build(response, null), "getplayerbysportaldeid");
		return result;
	}

	public static int getplayerbysportaldeid(int _sportaldeid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetplayerbysportaldeidrequest.create(WSDLObjectInt.create(_sportaldeid)).serialize("getplayerbysportaldeid").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetplayerbysportaldeidresponse result = WSDLMessageGetplayerbysportaldeidresponse.createFromXML(xom.build(response, null), "getplayerbysportaldeid");
		return result.field_return.value;
	}

	public static WSDLMessageGetplayersspoxidresponse getplayersspoxid(WSDLMessageGetplayersspoxidrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize("getplayersspoxid").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetplayersspoxidresponse result = WSDLMessageGetplayersspoxidresponse.createFromXML(xom.build(response, null), "getplayersspoxid");
		return result;
	}

	public static WSDLMessageGetplayersspoxidresponse getplayersspoxid(WSDLObjectInt _playerid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetplayersspoxidrequest.create(_playerid).serialize("getplayersspoxid").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetplayersspoxidresponse result = WSDLMessageGetplayersspoxidresponse.createFromXML(xom.build(response, null), "getplayersspoxid");
		return result;
	}

	public static int getplayersspoxid(int _playerid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetplayersspoxidrequest.create(WSDLObjectInt.create(_playerid)).serialize("getplayersspoxid").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetplayersspoxidresponse result = WSDLMessageGetplayersspoxidresponse.createFromXML(xom.build(response, null), "getplayersspoxid");
		return result.field_return.value;
	}

	public static WSDLMessageGetplayerbyspoxidresponse getplayerbyspoxid(WSDLMessageGetplayerbyspoxidrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize("getplayerbyspoxid").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetplayerbyspoxidresponse result = WSDLMessageGetplayerbyspoxidresponse.createFromXML(xom.build(response, null), "getplayerbyspoxid");
		return result;
	}

	public static WSDLMessageGetplayerbyspoxidresponse getplayerbyspoxid(WSDLObjectInt _spoxid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetplayerbyspoxidrequest.create(_spoxid).serialize("getplayerbyspoxid").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetplayerbyspoxidresponse result = WSDLMessageGetplayerbyspoxidresponse.createFromXML(xom.build(response, null), "getplayerbyspoxid");
		return result;
	}

	public static int getplayerbyspoxid(int _spoxid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetplayerbyspoxidrequest.create(WSDLObjectInt.create(_spoxid)).serialize("getplayerbyspoxid").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetplayerbyspoxidresponse result = WSDLMessageGetplayerbyspoxidresponse.createFromXML(xom.build(response, null), "getplayerbyspoxid");
		return result.field_return.value;
	}

	public static WSDLMessageGetplayersbyuseridresponse getplayersbyuserid(WSDLMessageGetplayersbyuseridrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize("getplayersbyuserid").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetplayersbyuseridresponse result = WSDLMessageGetplayersbyuseridresponse.createFromXML(xom.build(response, null), "getplayersbyuserid");
		return result;
	}

	public static WSDLMessageGetplayersbyuseridresponse getplayersbyuserid(WSDLObjectInt _userid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetplayersbyuseridrequest.create(_userid).serialize("getplayersbyuserid").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetplayersbyuseridresponse result = WSDLMessageGetplayersbyuseridresponse.createFromXML(xom.build(response, null), "getplayersbyuserid");
		return result;
	}

	public static WSDLMessageGetplayersbyuseridresponse getplayersbyuserid(int _userid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetplayersbyuseridrequest.create(WSDLObjectInt.create(_userid)).serialize("getplayersbyuserid").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetplayersbyuseridresponse result = WSDLMessageGetplayersbyuseridresponse.createFromXML(xom.build(response, null), "getplayersbyuserid");
		return result;
	}

	public static WSDLMessageGetplayersinfobyuseridresponse getplayersinfobyuserid(WSDLMessageGetplayersinfobyuseridrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize("getplayersinfobyuserid").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetplayersinfobyuseridresponse result = WSDLMessageGetplayersinfobyuseridresponse.createFromXML(xom.build(response, null), "getplayersinfobyuserid");
		return result;
	}

	public static WSDLMessageGetplayersinfobyuseridresponse getplayersinfobyuserid(WSDLObjectInt _userid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetplayersinfobyuseridrequest.create(_userid).serialize("getplayersinfobyuserid").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetplayersinfobyuseridresponse result = WSDLMessageGetplayersinfobyuseridresponse.createFromXML(xom.build(response, null), "getplayersinfobyuserid");
		return result;
	}

	public static WSDLMessageGetplayersinfobyuseridresponse getplayersinfobyuserid(int _userid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetplayersinfobyuseridrequest.create(WSDLObjectInt.create(_userid)).serialize("getplayersinfobyuserid").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetplayersinfobyuseridresponse result = WSDLMessageGetplayersinfobyuseridresponse.createFromXML(xom.build(response, null), "getplayersinfobyuserid");
		return result;
	}

	public static WSDLMessageGetpartnerrankingresponse getpartnerranking(WSDLMessageGetpartnerrankingrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize("getpartnerranking").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetpartnerrankingresponse result = WSDLMessageGetpartnerrankingresponse.createFromXML(xom.build(response, null), "getpartnerranking");
		return result;
	}

	public static WSDLMessageGetpartnerrankingresponse getpartnerranking() throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetpartnerrankingrequest.create().serialize("getpartnerranking").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetpartnerrankingresponse result = WSDLMessageGetpartnerrankingresponse.createFromXML(xom.build(response, null), "getpartnerranking");
		return result;
	}

	public static WSDLMessageGetlastpartnerrankingresponse getlastpartnerranking(WSDLMessageGetlastpartnerrankingrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize("getlastpartnerranking").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetlastpartnerrankingresponse result = WSDLMessageGetlastpartnerrankingresponse.createFromXML(xom.build(response, null), "getlastpartnerranking");
		return result;
	}

	public static WSDLMessageGetlastpartnerrankingresponse getlastpartnerranking() throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetlastpartnerrankingrequest.create().serialize("getlastpartnerranking").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetlastpartnerrankingresponse result = WSDLMessageGetlastpartnerrankingresponse.createFromXML(xom.build(response, null), "getlastpartnerranking");
		return result;
	}

	public static WSDLMessageGetservicerankingresponse getserviceranking(WSDLMessageGetservicerankingrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize("getserviceranking").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetservicerankingresponse result = WSDLMessageGetservicerankingresponse.createFromXML(xom.build(response, null), "getserviceranking");
		return result;
	}

	public static WSDLMessageGetservicerankingresponse getserviceranking() throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetservicerankingrequest.create().serialize("getserviceranking").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetservicerankingresponse result = WSDLMessageGetservicerankingresponse.createFromXML(xom.build(response, null), "getserviceranking");
		return result;
	}

	public static WSDLMessageSignupserviceresponse signupservice(WSDLMessageSignupservicerequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize("signupservice").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageSignupserviceresponse result = WSDLMessageSignupserviceresponse.createFromXML(xom.build(response, null), "signupservice");
		return result;
	}

	public static WSDLMessageSignupserviceresponse signupservice(WSDLObjectInt _userid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageSignupservicerequest.create(_userid).serialize("signupservice").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageSignupserviceresponse result = WSDLMessageSignupserviceresponse.createFromXML(xom.build(response, null), "signupservice");
		return result;
	}

	public static boolean signupservice(int _userid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageSignupservicerequest.create(WSDLObjectInt.create(_userid)).serialize("signupservice").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageSignupserviceresponse result = WSDLMessageSignupserviceresponse.createFromXML(xom.build(response, null), "signupservice");
		return result.field_return.value;
	}

	public static WSDLMessageGetserviceexpirationdateresponse getserviceexpirationdate(WSDLMessageGetserviceexpirationdaterequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize("getserviceexpirationdate").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetserviceexpirationdateresponse result = WSDLMessageGetserviceexpirationdateresponse.createFromXML(xom.build(response, null), "getserviceexpirationdate");
		return result;
	}

	public static WSDLMessageGetserviceexpirationdateresponse getserviceexpirationdate(WSDLObjectInt _userid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetserviceexpirationdaterequest.create(_userid).serialize("getserviceexpirationdate").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetserviceexpirationdateresponse result = WSDLMessageGetserviceexpirationdateresponse.createFromXML(xom.build(response, null), "getserviceexpirationdate");
		return result;
	}

	public static String getserviceexpirationdate(int _userid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetserviceexpirationdaterequest.create(WSDLObjectInt.create(_userid)).serialize("getserviceexpirationdate").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetserviceexpirationdateresponse result = WSDLMessageGetserviceexpirationdateresponse.createFromXML(xom.build(response, null), "getserviceexpirationdate");
		return result.field_return.value;
	}

	public static WSDLMessageGetregisteredusersresponse getregisteredusers(WSDLMessageGetregisteredusersrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize("getregisteredusers").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetregisteredusersresponse result = WSDLMessageGetregisteredusersresponse.createFromXML(xom.build(response, null), "getregisteredusers");
		return result;
	}

	public static WSDLMessageGetregisteredusersresponse getregisteredusers() throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetregisteredusersrequest.create().serialize("getregisteredusers").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetregisteredusersresponse result = WSDLMessageGetregisteredusersresponse.createFromXML(xom.build(response, null), "getregisteredusers");
		return result;
	}

	public static WSDLMessagePostcommunitynewsresponse postcommunitynews(WSDLMessagePostcommunitynewsrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize("postcommunitynews").toXML();
		String response = invoker.getReponse(request);
		WSDLMessagePostcommunitynewsresponse result = WSDLMessagePostcommunitynewsresponse.createFromXML(xom.build(response, null), "postcommunitynews");
		return result;
	}

	public static WSDLMessagePostcommunitynewsresponse postcommunitynews(WSDLObjectInt _communityid, WSDLObjectString _headline, WSDLObjectString _content) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessagePostcommunitynewsrequest.create(_communityid, _headline, _content).serialize("postcommunitynews").toXML();
		String response = invoker.getReponse(request);
		WSDLMessagePostcommunitynewsresponse result = WSDLMessagePostcommunitynewsresponse.createFromXML(xom.build(response, null), "postcommunitynews");
		return result;
	}

	public static boolean postcommunitynews(int _communityid, String _headline, String _content) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessagePostcommunitynewsrequest.create(WSDLObjectInt.create(_communityid), WSDLObjectString.create(_headline), WSDLObjectString.create(_content)).serialize("postcommunitynews").toXML();
		String response = invoker.getReponse(request);
		WSDLMessagePostcommunitynewsresponse result = WSDLMessagePostcommunitynewsresponse.createFromXML(xom.build(response, null), "postcommunitynews");
		return result.field_return.value;
	}

	public static WSDLMessagePlayer_postcommunitynewsresponse player_postcommunitynews(WSDLMessagePlayer_postcommunitynewsrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize("player_postcommunitynews").toXML();
		String response = invoker.getReponse(request);
		WSDLMessagePlayer_postcommunitynewsresponse result = WSDLMessagePlayer_postcommunitynewsresponse.createFromXML(xom.build(response, null), "player_postcommunitynews");
		return result;
	}

	public static WSDLMessagePlayer_postcommunitynewsresponse player_postcommunitynews(WSDLObjectString _headline, WSDLObjectString _content) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessagePlayer_postcommunitynewsrequest.create(_headline, _content).serialize("player_postcommunitynews").toXML();
		String response = invoker.getReponse(request);
		WSDLMessagePlayer_postcommunitynewsresponse result = WSDLMessagePlayer_postcommunitynewsresponse.createFromXML(xom.build(response, null), "player_postcommunitynews");
		return result;
	}

	public static boolean player_postcommunitynews(String _headline, String _content) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessagePlayer_postcommunitynewsrequest.create(WSDLObjectString.create(_headline), WSDLObjectString.create(_content)).serialize("player_postcommunitynews").toXML();
		String response = invoker.getReponse(request);
		WSDLMessagePlayer_postcommunitynewsresponse result = WSDLMessagePlayer_postcommunitynewsresponse.createFromXML(xom.build(response, null), "player_postcommunitynews");
		return result.field_return.value;
	}

	public static WSDLMessagePostusernewsresponse postusernews(WSDLMessagePostusernewsrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize("postusernews").toXML();
		String response = invoker.getReponse(request);
		WSDLMessagePostusernewsresponse result = WSDLMessagePostusernewsresponse.createFromXML(xom.build(response, null), "postusernews");
		return result;
	}

	public static WSDLMessagePostusernewsresponse postusernews(WSDLObjectInt _userid, WSDLObjectString _headline, WSDLObjectString _content) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessagePostusernewsrequest.create(_userid, _headline, _content).serialize("postusernews").toXML();
		String response = invoker.getReponse(request);
		WSDLMessagePostusernewsresponse result = WSDLMessagePostusernewsresponse.createFromXML(xom.build(response, null), "postusernews");
		return result;
	}

	public static boolean postusernews(int _userid, String _headline, String _content) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessagePostusernewsrequest.create(WSDLObjectInt.create(_userid), WSDLObjectString.create(_headline), WSDLObjectString.create(_content)).serialize("postusernews").toXML();
		String response = invoker.getReponse(request);
		WSDLMessagePostusernewsresponse result = WSDLMessagePostusernewsresponse.createFromXML(xom.build(response, null), "postusernews");
		return result.field_return.value;
	}

	public static WSDLMessagePlayer_postusernewsresponse player_postusernews(WSDLMessagePlayer_postusernewsrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize("player_postusernews").toXML();
		String response = invoker.getReponse(request);
		WSDLMessagePlayer_postusernewsresponse result = WSDLMessagePlayer_postusernewsresponse.createFromXML(xom.build(response, null), "player_postusernews");
		return result;
	}

	public static WSDLMessagePlayer_postusernewsresponse player_postusernews(WSDLObjectInt _userid, WSDLObjectString _headline, WSDLObjectString _content) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessagePlayer_postusernewsrequest.create(_userid, _headline, _content).serialize("player_postusernews").toXML();
		String response = invoker.getReponse(request);
		WSDLMessagePlayer_postusernewsresponse result = WSDLMessagePlayer_postusernewsresponse.createFromXML(xom.build(response, null), "player_postusernews");
		return result;
	}

	public static boolean player_postusernews(int _userid, String _headline, String _content) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessagePlayer_postusernewsrequest.create(WSDLObjectInt.create(_userid), WSDLObjectString.create(_headline), WSDLObjectString.create(_content)).serialize("player_postusernews").toXML();
		String response = invoker.getReponse(request);
		WSDLMessagePlayer_postusernewsresponse result = WSDLMessagePlayer_postusernewsresponse.createFromXML(xom.build(response, null), "player_postusernews");
		return result.field_return.value;
	}

	public static WSDLMessagePostmultiusernewsresponse postmultiusernews(WSDLMessagePostmultiusernewsrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize("postmultiusernews").toXML();
		String response = invoker.getReponse(request);
		WSDLMessagePostmultiusernewsresponse result = WSDLMessagePostmultiusernewsresponse.createFromXML(xom.build(response, null), "postmultiusernews");
		return result;
	}

	public static WSDLMessagePostmultiusernewsresponse postmultiusernews(WSDLObjectArrayofuserid _arr_userid, WSDLObjectString _headline, WSDLObjectString _content) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessagePostmultiusernewsrequest.create(_arr_userid, _headline, _content).serialize("postmultiusernews").toXML();
		String response = invoker.getReponse(request);
		WSDLMessagePostmultiusernewsresponse result = WSDLMessagePostmultiusernewsresponse.createFromXML(xom.build(response, null), "postmultiusernews");
		return result;
	}

	public static boolean postmultiusernews(WSDLObjectArrayofuserid _arr_userid, String _headline, String _content) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessagePostmultiusernewsrequest.create(_arr_userid, WSDLObjectString.create(_headline), WSDLObjectString.create(_content)).serialize("postmultiusernews").toXML();
		String response = invoker.getReponse(request);
		WSDLMessagePostmultiusernewsresponse result = WSDLMessagePostmultiusernewsresponse.createFromXML(xom.build(response, null), "postmultiusernews");
		return result.field_return.value;
	}

	public static WSDLMessagePlayer_postmultiusernewsresponse player_postmultiusernews(WSDLMessagePlayer_postmultiusernewsrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize("player_postmultiusernews").toXML();
		String response = invoker.getReponse(request);
		WSDLMessagePlayer_postmultiusernewsresponse result = WSDLMessagePlayer_postmultiusernewsresponse.createFromXML(xom.build(response, null), "player_postmultiusernews");
		return result;
	}

	public static WSDLMessagePlayer_postmultiusernewsresponse player_postmultiusernews(WSDLObjectArrayofuserid _arr_userid, WSDLObjectString _headline, WSDLObjectString _content) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessagePlayer_postmultiusernewsrequest.create(_arr_userid, _headline, _content).serialize("player_postmultiusernews").toXML();
		String response = invoker.getReponse(request);
		WSDLMessagePlayer_postmultiusernewsresponse result = WSDLMessagePlayer_postmultiusernewsresponse.createFromXML(xom.build(response, null), "player_postmultiusernews");
		return result;
	}

	public static boolean player_postmultiusernews(WSDLObjectArrayofuserid _arr_userid, String _headline, String _content) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessagePlayer_postmultiusernewsrequest.create(_arr_userid, WSDLObjectString.create(_headline), WSDLObjectString.create(_content)).serialize("player_postmultiusernews").toXML();
		String response = invoker.getReponse(request);
		WSDLMessagePlayer_postmultiusernewsresponse result = WSDLMessagePlayer_postmultiusernewsresponse.createFromXML(xom.build(response, null), "player_postmultiusernews");
		return result.field_return.value;
	}

	public static WSDLMessagePostadminnewsresponse postadminnews(WSDLMessagePostadminnewsrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize("postadminnews").toXML();
		String response = invoker.getReponse(request);
		WSDLMessagePostadminnewsresponse result = WSDLMessagePostadminnewsresponse.createFromXML(xom.build(response, null), "postadminnews");
		return result;
	}

	public static WSDLMessagePostadminnewsresponse postadminnews(WSDLObjectString _userType, WSDLObjectString _language, WSDLObjectString _headline, WSDLObjectString _content) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessagePostadminnewsrequest.create(_userType, _language, _headline, _content).serialize("postadminnews").toXML();
		String response = invoker.getReponse(request);
		WSDLMessagePostadminnewsresponse result = WSDLMessagePostadminnewsresponse.createFromXML(xom.build(response, null), "postadminnews");
		return result;
	}

	public static boolean postadminnews(String _userType, String _language, String _headline, String _content) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessagePostadminnewsrequest.create(WSDLObjectString.create(_userType), WSDLObjectString.create(_language), WSDLObjectString.create(_headline), WSDLObjectString.create(_content)).serialize("postadminnews").toXML();
		String response = invoker.getReponse(request);
		WSDLMessagePostadminnewsresponse result = WSDLMessagePostadminnewsresponse.createFromXML(xom.build(response, null), "postadminnews");
		return result.field_return.value;
	}

	public static WSDLMessageGetcurrentbudgetresponse getcurrentbudget(WSDLMessageGetcurrentbudgetrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize("getcurrentbudget").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetcurrentbudgetresponse result = WSDLMessageGetcurrentbudgetresponse.createFromXML(xom.build(response, null), "getcurrentbudget");
		return result;
	}

	public static WSDLMessageGetcurrentbudgetresponse getcurrentbudget(WSDLObjectInt _userid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetcurrentbudgetrequest.create(_userid).serialize("getcurrentbudget").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetcurrentbudgetresponse result = WSDLMessageGetcurrentbudgetresponse.createFromXML(xom.build(response, null), "getcurrentbudget");
		return result;
	}

	public static int getcurrentbudget(int _userid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetcurrentbudgetrequest.create(WSDLObjectInt.create(_userid)).serialize("getcurrentbudget").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetcurrentbudgetresponse result = WSDLMessageGetcurrentbudgetresponse.createFromXML(xom.build(response, null), "getcurrentbudget");
		return result.field_return.value;
	}

	public static WSDLMessageSetuserbonusresponse setuserbonus(WSDLMessageSetuserbonusrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize("setuserbonus").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageSetuserbonusresponse result = WSDLMessageSetuserbonusresponse.createFromXML(xom.build(response, null), "setuserbonus");
		return result;
	}

	public static WSDLMessageSetuserbonusresponse setuserbonus(WSDLObjectInt _userid, WSDLObjectInt _amount, WSDLObjectString _reason) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageSetuserbonusrequest.create(_userid, _amount, _reason).serialize("setuserbonus").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageSetuserbonusresponse result = WSDLMessageSetuserbonusresponse.createFromXML(xom.build(response, null), "setuserbonus");
		return result;
	}

	public static boolean setuserbonus(int _userid, int _amount, String _reason) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageSetuserbonusrequest.create(WSDLObjectInt.create(_userid), WSDLObjectInt.create(_amount), WSDLObjectString.create(_reason)).serialize("setuserbonus").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageSetuserbonusresponse result = WSDLMessageSetuserbonusresponse.createFromXML(xom.build(response, null), "setuserbonus");
		return result.field_return.value;
	}

	public static WSDLMessagePlayer_setuserbonusresponse player_setuserbonus(WSDLMessagePlayer_setuserbonusrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize("player_setuserbonus").toXML();
		String response = invoker.getReponse(request);
		WSDLMessagePlayer_setuserbonusresponse result = WSDLMessagePlayer_setuserbonusresponse.createFromXML(xom.build(response, null), "player_setuserbonus");
		return result;
	}

	public static WSDLMessagePlayer_setuserbonusresponse player_setuserbonus(WSDLObjectInt _userid, WSDLObjectInt _amount, WSDLObjectString _reason) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessagePlayer_setuserbonusrequest.create(_userid, _amount, _reason).serialize("player_setuserbonus").toXML();
		String response = invoker.getReponse(request);
		WSDLMessagePlayer_setuserbonusresponse result = WSDLMessagePlayer_setuserbonusresponse.createFromXML(xom.build(response, null), "player_setuserbonus");
		return result;
	}

	public static boolean player_setuserbonus(int _userid, int _amount, String _reason) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessagePlayer_setuserbonusrequest.create(WSDLObjectInt.create(_userid), WSDLObjectInt.create(_amount), WSDLObjectString.create(_reason)).serialize("player_setuserbonus").toXML();
		String response = invoker.getReponse(request);
		WSDLMessagePlayer_setuserbonusresponse result = WSDLMessagePlayer_setuserbonusresponse.createFromXML(xom.build(response, null), "player_setuserbonus");
		return result.field_return.value;
	}

	public static WSDLMessageGetcommunitybonusresponse getcommunitybonus(WSDLMessageGetcommunitybonusrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize("getcommunitybonus").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetcommunitybonusresponse result = WSDLMessageGetcommunitybonusresponse.createFromXML(xom.build(response, null), "getcommunitybonus");
		return result;
	}

	public static WSDLMessageGetcommunitybonusresponse getcommunitybonus(WSDLObjectInt _communityid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetcommunitybonusrequest.create(_communityid).serialize("getcommunitybonus").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetcommunitybonusresponse result = WSDLMessageGetcommunitybonusresponse.createFromXML(xom.build(response, null), "getcommunitybonus");
		return result;
	}

	public static int getcommunitybonus(int _communityid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetcommunitybonusrequest.create(WSDLObjectInt.create(_communityid)).serialize("getcommunitybonus").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetcommunitybonusresponse result = WSDLMessageGetcommunitybonusresponse.createFromXML(xom.build(response, null), "getcommunitybonus");
		return result.field_return.value;
	}

	public static WSDLMessageGetuserbonusresponse getuserbonus(WSDLMessageGetuserbonusrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize("getuserbonus").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetuserbonusresponse result = WSDLMessageGetuserbonusresponse.createFromXML(xom.build(response, null), "getuserbonus");
		return result;
	}

	public static WSDLMessageGetuserbonusresponse getuserbonus(WSDLObjectInt _userid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetuserbonusrequest.create(_userid).serialize("getuserbonus").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetuserbonusresponse result = WSDLMessageGetuserbonusresponse.createFromXML(xom.build(response, null), "getuserbonus");
		return result;
	}

	public static int getuserbonus(int _userid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetuserbonusrequest.create(WSDLObjectInt.create(_userid)).serialize("getuserbonus").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetuserbonusresponse result = WSDLMessageGetuserbonusresponse.createFromXML(xom.build(response, null), "getuserbonus");
		return result.field_return.value;
	}

	public static WSDLMessageGetuserpenaltyresponse getuserpenalty(WSDLMessageGetuserpenaltyrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize("getuserpenalty").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetuserpenaltyresponse result = WSDLMessageGetuserpenaltyresponse.createFromXML(xom.build(response, null), "getuserpenalty");
		return result;
	}

	public static WSDLMessageGetuserpenaltyresponse getuserpenalty(WSDLObjectInt _userid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetuserpenaltyrequest.create(_userid).serialize("getuserpenalty").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetuserpenaltyresponse result = WSDLMessageGetuserpenaltyresponse.createFromXML(xom.build(response, null), "getuserpenalty");
		return result;
	}

	public static int getuserpenalty(int _userid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetuserpenaltyrequest.create(WSDLObjectInt.create(_userid)).serialize("getuserpenalty").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetuserpenaltyresponse result = WSDLMessageGetuserpenaltyresponse.createFromXML(xom.build(response, null), "getuserpenalty");
		return result.field_return.value;
	}

	public static WSDLMessageSetusertitleresponse setusertitle(WSDLMessageSetusertitlerequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize("setusertitle").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageSetusertitleresponse result = WSDLMessageSetusertitleresponse.createFromXML(xom.build(response, null), "setusertitle");
		return result;
	}

	public static WSDLMessageSetusertitleresponse setusertitle(WSDLObjectInt _userid, WSDLObjectInt _titleid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageSetusertitlerequest.create(_userid, _titleid).serialize("setusertitle").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageSetusertitleresponse result = WSDLMessageSetusertitleresponse.createFromXML(xom.build(response, null), "setusertitle");
		return result;
	}

	public static boolean setusertitle(int _userid, int _titleid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageSetusertitlerequest.create(WSDLObjectInt.create(_userid), WSDLObjectInt.create(_titleid)).serialize("setusertitle").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageSetusertitleresponse result = WSDLMessageSetusertitleresponse.createFromXML(xom.build(response, null), "setusertitle");
		return result.field_return.value;
	}

	public static WSDLMessagePlayer_setusertitleresponse player_setusertitle(WSDLMessagePlayer_setusertitlerequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize("player_setusertitle").toXML();
		String response = invoker.getReponse(request);
		WSDLMessagePlayer_setusertitleresponse result = WSDLMessagePlayer_setusertitleresponse.createFromXML(xom.build(response, null), "player_setusertitle");
		return result;
	}

	public static WSDLMessagePlayer_setusertitleresponse player_setusertitle(WSDLObjectInt _userid, WSDLObjectInt _titleid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessagePlayer_setusertitlerequest.create(_userid, _titleid).serialize("player_setusertitle").toXML();
		String response = invoker.getReponse(request);
		WSDLMessagePlayer_setusertitleresponse result = WSDLMessagePlayer_setusertitleresponse.createFromXML(xom.build(response, null), "player_setusertitle");
		return result;
	}

	public static boolean player_setusertitle(int _userid, int _titleid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessagePlayer_setusertitlerequest.create(WSDLObjectInt.create(_userid), WSDLObjectInt.create(_titleid)).serialize("player_setusertitle").toXML();
		String response = invoker.getReponse(request);
		WSDLMessagePlayer_setusertitleresponse result = WSDLMessagePlayer_setusertitleresponse.createFromXML(xom.build(response, null), "player_setusertitle");
		return result.field_return.value;
	}

	public static WSDLMessageDeleteusertitleresponse deleteusertitle(WSDLMessageDeleteusertitlerequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize("deleteusertitle").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageDeleteusertitleresponse result = WSDLMessageDeleteusertitleresponse.createFromXML(xom.build(response, null), "deleteusertitle");
		return result;
	}

	public static WSDLMessageDeleteusertitleresponse deleteusertitle(WSDLObjectInt _userid, WSDLObjectInt _titleid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageDeleteusertitlerequest.create(_userid, _titleid).serialize("deleteusertitle").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageDeleteusertitleresponse result = WSDLMessageDeleteusertitleresponse.createFromXML(xom.build(response, null), "deleteusertitle");
		return result;
	}

	public static boolean deleteusertitle(int _userid, int _titleid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageDeleteusertitlerequest.create(WSDLObjectInt.create(_userid), WSDLObjectInt.create(_titleid)).serialize("deleteusertitle").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageDeleteusertitleresponse result = WSDLMessageDeleteusertitleresponse.createFromXML(xom.build(response, null), "deleteusertitle");
		return result.field_return.value;
	}

	public static WSDLMessagePlayer_deleteusertitleresponse player_deleteusertitle(WSDLMessagePlayer_deleteusertitlerequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize("player_deleteusertitle").toXML();
		String response = invoker.getReponse(request);
		WSDLMessagePlayer_deleteusertitleresponse result = WSDLMessagePlayer_deleteusertitleresponse.createFromXML(xom.build(response, null), "player_deleteusertitle");
		return result;
	}

	public static WSDLMessagePlayer_deleteusertitleresponse player_deleteusertitle(WSDLObjectInt _userid, WSDLObjectInt _titleid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessagePlayer_deleteusertitlerequest.create(_userid, _titleid).serialize("player_deleteusertitle").toXML();
		String response = invoker.getReponse(request);
		WSDLMessagePlayer_deleteusertitleresponse result = WSDLMessagePlayer_deleteusertitleresponse.createFromXML(xom.build(response, null), "player_deleteusertitle");
		return result;
	}

	public static boolean player_deleteusertitle(int _userid, int _titleid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessagePlayer_deleteusertitlerequest.create(WSDLObjectInt.create(_userid), WSDLObjectInt.create(_titleid)).serialize("player_deleteusertitle").toXML();
		String response = invoker.getReponse(request);
		WSDLMessagePlayer_deleteusertitleresponse result = WSDLMessagePlayer_deleteusertitleresponse.createFromXML(xom.build(response, null), "player_deleteusertitle");
		return result.field_return.value;
	}

	public static WSDLMessageDeleteteamtitleresponse deleteteamtitle(WSDLMessageDeleteteamtitlerequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize("deleteteamtitle").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageDeleteteamtitleresponse result = WSDLMessageDeleteteamtitleresponse.createFromXML(xom.build(response, null), "deleteteamtitle");
		return result;
	}

	public static WSDLMessageDeleteteamtitleresponse deleteteamtitle(WSDLObjectInt _communityid, WSDLObjectInt _titleid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageDeleteteamtitlerequest.create(_communityid, _titleid).serialize("deleteteamtitle").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageDeleteteamtitleresponse result = WSDLMessageDeleteteamtitleresponse.createFromXML(xom.build(response, null), "deleteteamtitle");
		return result;
	}

	public static boolean deleteteamtitle(int _communityid, int _titleid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageDeleteteamtitlerequest.create(WSDLObjectInt.create(_communityid), WSDLObjectInt.create(_titleid)).serialize("deleteteamtitle").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageDeleteteamtitleresponse result = WSDLMessageDeleteteamtitleresponse.createFromXML(xom.build(response, null), "deleteteamtitle");
		return result.field_return.value;
	}

	public static WSDLMessagePlayer_deleteteamtitleresponse player_deleteteamtitle(WSDLMessagePlayer_deleteteamtitlerequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize("player_deleteteamtitle").toXML();
		String response = invoker.getReponse(request);
		WSDLMessagePlayer_deleteteamtitleresponse result = WSDLMessagePlayer_deleteteamtitleresponse.createFromXML(xom.build(response, null), "player_deleteteamtitle");
		return result;
	}

	public static WSDLMessagePlayer_deleteteamtitleresponse player_deleteteamtitle(WSDLObjectInt _titleid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessagePlayer_deleteteamtitlerequest.create(_titleid).serialize("player_deleteteamtitle").toXML();
		String response = invoker.getReponse(request);
		WSDLMessagePlayer_deleteteamtitleresponse result = WSDLMessagePlayer_deleteteamtitleresponse.createFromXML(xom.build(response, null), "player_deleteteamtitle");
		return result;
	}

	public static boolean player_deleteteamtitle(int _titleid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessagePlayer_deleteteamtitlerequest.create(WSDLObjectInt.create(_titleid)).serialize("player_deleteteamtitle").toXML();
		String response = invoker.getReponse(request);
		WSDLMessagePlayer_deleteteamtitleresponse result = WSDLMessagePlayer_deleteteamtitleresponse.createFromXML(xom.build(response, null), "player_deleteteamtitle");
		return result.field_return.value;
	}

	public static WSDLMessageGetusertitleresponse getusertitle(WSDLMessageGetusertitlerequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize("getusertitle").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetusertitleresponse result = WSDLMessageGetusertitleresponse.createFromXML(xom.build(response, null), "getusertitle");
		return result;
	}

	public static WSDLMessageGetusertitleresponse getusertitle(WSDLObjectInt _userid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetusertitlerequest.create(_userid).serialize("getusertitle").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetusertitleresponse result = WSDLMessageGetusertitleresponse.createFromXML(xom.build(response, null), "getusertitle");
		return result;
	}

	public static WSDLMessageGetusertitleresponse getusertitle(int _userid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetusertitlerequest.create(WSDLObjectInt.create(_userid)).serialize("getusertitle").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetusertitleresponse result = WSDLMessageGetusertitleresponse.createFromXML(xom.build(response, null), "getusertitle");
		return result;
	}

	public static WSDLMessagePlayer_getusertitleresponse player_getusertitle(WSDLMessagePlayer_getusertitlerequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize("player_getusertitle").toXML();
		String response = invoker.getReponse(request);
		WSDLMessagePlayer_getusertitleresponse result = WSDLMessagePlayer_getusertitleresponse.createFromXML(xom.build(response, null), "player_getusertitle");
		return result;
	}

	public static WSDLMessagePlayer_getusertitleresponse player_getusertitle(WSDLObjectInt _userid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessagePlayer_getusertitlerequest.create(_userid).serialize("player_getusertitle").toXML();
		String response = invoker.getReponse(request);
		WSDLMessagePlayer_getusertitleresponse result = WSDLMessagePlayer_getusertitleresponse.createFromXML(xom.build(response, null), "player_getusertitle");
		return result;
	}

	public static WSDLMessagePlayer_getusertitleresponse player_getusertitle(int _userid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessagePlayer_getusertitlerequest.create(WSDLObjectInt.create(_userid)).serialize("player_getusertitle").toXML();
		String response = invoker.getReponse(request);
		WSDLMessagePlayer_getusertitleresponse result = WSDLMessagePlayer_getusertitleresponse.createFromXML(xom.build(response, null), "player_getusertitle");
		return result;
	}

	public static WSDLMessageCancelserviceresponse cancelservice(WSDLMessageCancelservicerequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize("cancelservice").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageCancelserviceresponse result = WSDLMessageCancelserviceresponse.createFromXML(xom.build(response, null), "cancelservice");
		return result;
	}

	public static WSDLMessageCancelserviceresponse cancelservice(WSDLObjectInt _userid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageCancelservicerequest.create(_userid).serialize("cancelservice").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageCancelserviceresponse result = WSDLMessageCancelserviceresponse.createFromXML(xom.build(response, null), "cancelservice");
		return result;
	}

	public static boolean cancelservice(int _userid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageCancelservicerequest.create(WSDLObjectInt.create(_userid)).serialize("cancelservice").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageCancelserviceresponse result = WSDLMessageCancelserviceresponse.createFromXML(xom.build(response, null), "cancelservice");
		return result.field_return.value;
	}

	public static WSDLMessageGetuserspublictransfersresponse getuserspublictransfers(WSDLMessageGetuserspublictransfersrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize("getuserspublictransfers").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetuserspublictransfersresponse result = WSDLMessageGetuserspublictransfersresponse.createFromXML(xom.build(response, null), "getuserspublictransfers");
		return result;
	}

	public static WSDLMessageGetuserspublictransfersresponse getuserspublictransfers(WSDLObjectInt _userid, WSDLObjectInt _gameday) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetuserspublictransfersrequest.create(_userid, _gameday).serialize("getuserspublictransfers").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetuserspublictransfersresponse result = WSDLMessageGetuserspublictransfersresponse.createFromXML(xom.build(response, null), "getuserspublictransfers");
		return result;
	}

	public static WSDLMessageGetuserspublictransfersresponse getuserspublictransfers(int _userid, int _gameday) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetuserspublictransfersrequest.create(WSDLObjectInt.create(_userid), WSDLObjectInt.create(_gameday)).serialize("getuserspublictransfers").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetuserspublictransfersresponse result = WSDLMessageGetuserspublictransfersresponse.createFromXML(xom.build(response, null), "getuserspublictransfers");
		return result;
	}

	public static WSDLMessageGetusertransfersresponse getusertransfers(WSDLMessageGetusertransfersrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize("getusertransfers").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetusertransfersresponse result = WSDLMessageGetusertransfersresponse.createFromXML(xom.build(response, null), "getusertransfers");
		return result;
	}

	public static WSDLMessageGetusertransfersresponse getusertransfers(WSDLObjectInt _userid, WSDLObjectInt _gameday) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetusertransfersrequest.create(_userid, _gameday).serialize("getusertransfers").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetusertransfersresponse result = WSDLMessageGetusertransfersresponse.createFromXML(xom.build(response, null), "getusertransfers");
		return result;
	}

	public static WSDLMessageGetusertransfersresponse getusertransfers(int _userid, int _gameday) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetusertransfersrequest.create(WSDLObjectInt.create(_userid), WSDLObjectInt.create(_gameday)).serialize("getusertransfers").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetusertransfersresponse result = WSDLMessageGetusertransfersresponse.createFromXML(xom.build(response, null), "getusertransfers");
		return result;
	}

	public static WSDLMessageGetplayersboughtresponse getplayersbought(WSDLMessageGetplayersboughtrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize("getplayersbought").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetplayersboughtresponse result = WSDLMessageGetplayersboughtresponse.createFromXML(xom.build(response, null), "getplayersbought");
		return result;
	}

	public static WSDLMessageGetplayersboughtresponse getplayersbought(WSDLObjectInt _userid, WSDLObjectInt _gameday) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetplayersboughtrequest.create(_userid, _gameday).serialize("getplayersbought").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetplayersboughtresponse result = WSDLMessageGetplayersboughtresponse.createFromXML(xom.build(response, null), "getplayersbought");
		return result;
	}

	public static WSDLMessageGetplayersboughtresponse getplayersbought(int _userid, int _gameday) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetplayersboughtrequest.create(WSDLObjectInt.create(_userid), WSDLObjectInt.create(_gameday)).serialize("getplayersbought").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetplayersboughtresponse result = WSDLMessageGetplayersboughtresponse.createFromXML(xom.build(response, null), "getplayersbought");
		return result;
	}

	public static WSDLMessageGetplayerssoldresponse getplayerssold(WSDLMessageGetplayerssoldrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize("getplayerssold").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetplayerssoldresponse result = WSDLMessageGetplayerssoldresponse.createFromXML(xom.build(response, null), "getplayerssold");
		return result;
	}

	public static WSDLMessageGetplayerssoldresponse getplayerssold(WSDLObjectInt _userid, WSDLObjectInt _gameday) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetplayerssoldrequest.create(_userid, _gameday).serialize("getplayerssold").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetplayerssoldresponse result = WSDLMessageGetplayerssoldresponse.createFromXML(xom.build(response, null), "getplayerssold");
		return result;
	}

	public static WSDLMessageGetplayerssoldresponse getplayerssold(int _userid, int _gameday) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetplayerssoldrequest.create(WSDLObjectInt.create(_userid), WSDLObjectInt.create(_gameday)).serialize("getplayerssold").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetplayerssoldresponse result = WSDLMessageGetplayerssoldresponse.createFromXML(xom.build(response, null), "getplayerssold");
		return result;
	}

	public static WSDLMessageGetuserscurrentlineupresponse getuserscurrentlineup(WSDLMessageGetuserscurrentlineuprequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize("getuserscurrentlineup").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetuserscurrentlineupresponse result = WSDLMessageGetuserscurrentlineupresponse.createFromXML(xom.build(response, null), "getuserscurrentlineup");
		return result;
	}

	public static WSDLMessageGetuserscurrentlineupresponse getuserscurrentlineup(WSDLObjectInt _userid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetuserscurrentlineuprequest.create(_userid).serialize("getuserscurrentlineup").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetuserscurrentlineupresponse result = WSDLMessageGetuserscurrentlineupresponse.createFromXML(xom.build(response, null), "getuserscurrentlineup");
		return result;
	}

	public static WSDLMessageGetuserscurrentlineupresponse getuserscurrentlineup(int _userid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetuserscurrentlineuprequest.create(WSDLObjectInt.create(_userid)).serialize("getuserscurrentlineup").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetuserscurrentlineupresponse result = WSDLMessageGetuserscurrentlineupresponse.createFromXML(xom.build(response, null), "getuserscurrentlineup");
		return result;
	}

	public static WSDLMessageGetuserslineupbygamedayresponse getuserslineupbygameday(WSDLMessageGetuserslineupbygamedayrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize("getuserslineupbygameday").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetuserslineupbygamedayresponse result = WSDLMessageGetuserslineupbygamedayresponse.createFromXML(xom.build(response, null), "getuserslineupbygameday");
		return result;
	}

	public static WSDLMessageGetuserslineupbygamedayresponse getuserslineupbygameday(WSDLObjectInt _userid, WSDLObjectInt _gameday) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetuserslineupbygamedayrequest.create(_userid, _gameday).serialize("getuserslineupbygameday").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetuserslineupbygamedayresponse result = WSDLMessageGetuserslineupbygamedayresponse.createFromXML(xom.build(response, null), "getuserslineupbygameday");
		return result;
	}

	public static WSDLMessageGetuserslineupbygamedayresponse getuserslineupbygameday(int _userid, int _gameday) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetuserslineupbygamedayrequest.create(WSDLObjectInt.create(_userid), WSDLObjectInt.create(_gameday)).serialize("getuserslineupbygameday").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetuserslineupbygamedayresponse result = WSDLMessageGetuserslineupbygamedayresponse.createFromXML(xom.build(response, null), "getuserslineupbygameday");
		return result;
	}

	public static WSDLMessageGetuserslineupbygamedayidresponse getuserslineupbygamedayid(WSDLMessageGetuserslineupbygamedayidrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize("getuserslineupbygamedayid").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetuserslineupbygamedayidresponse result = WSDLMessageGetuserslineupbygamedayidresponse.createFromXML(xom.build(response, null), "getuserslineupbygamedayid");
		return result;
	}

	public static WSDLMessageGetuserslineupbygamedayidresponse getuserslineupbygamedayid(WSDLObjectInt _userid, WSDLObjectInt _gameday_id) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetuserslineupbygamedayidrequest.create(_userid, _gameday_id).serialize("getuserslineupbygamedayid").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetuserslineupbygamedayidresponse result = WSDLMessageGetuserslineupbygamedayidresponse.createFromXML(xom.build(response, null), "getuserslineupbygamedayid");
		return result;
	}

	public static WSDLMessageGetuserslineupbygamedayidresponse getuserslineupbygamedayid(int _userid, int _gameday_id) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetuserslineupbygamedayidrequest.create(WSDLObjectInt.create(_userid), WSDLObjectInt.create(_gameday_id)).serialize("getuserslineupbygamedayid").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetuserslineupbygamedayidresponse result = WSDLMessageGetuserslineupbygamedayidresponse.createFromXML(xom.build(response, null), "getuserslineupbygamedayid");
		return result;
	}

	public static WSDLMessageGetusersplayerbygamedayresponse getusersplayerbygameday(WSDLMessageGetusersplayerbygamedayrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize("getusersplayerbygameday").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetusersplayerbygamedayresponse result = WSDLMessageGetusersplayerbygamedayresponse.createFromXML(xom.build(response, null), "getusersplayerbygameday");
		return result;
	}

	public static WSDLMessageGetusersplayerbygamedayresponse getusersplayerbygameday(WSDLObjectInt _userid, WSDLObjectInt _gameday) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetusersplayerbygamedayrequest.create(_userid, _gameday).serialize("getusersplayerbygameday").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetusersplayerbygamedayresponse result = WSDLMessageGetusersplayerbygamedayresponse.createFromXML(xom.build(response, null), "getusersplayerbygameday");
		return result;
	}

	public static WSDLMessageGetusersplayerbygamedayresponse getusersplayerbygameday(int _userid, int _gameday) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetusersplayerbygamedayrequest.create(WSDLObjectInt.create(_userid), WSDLObjectInt.create(_gameday)).serialize("getusersplayerbygameday").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetusersplayerbygamedayresponse result = WSDLMessageGetusersplayerbygamedayresponse.createFromXML(xom.build(response, null), "getusersplayerbygameday");
		return result;
	}

	public static WSDLMessageGetusersplayerbygamedayidresponse getusersplayerbygamedayid(WSDLMessageGetusersplayerbygamedayidrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize("getusersplayerbygamedayid").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetusersplayerbygamedayidresponse result = WSDLMessageGetusersplayerbygamedayidresponse.createFromXML(xom.build(response, null), "getusersplayerbygamedayid");
		return result;
	}

	public static WSDLMessageGetusersplayerbygamedayidresponse getusersplayerbygamedayid(WSDLObjectInt _userid, WSDLObjectInt _gameday_id) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetusersplayerbygamedayidrequest.create(_userid, _gameday_id).serialize("getusersplayerbygamedayid").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetusersplayerbygamedayidresponse result = WSDLMessageGetusersplayerbygamedayidresponse.createFromXML(xom.build(response, null), "getusersplayerbygamedayid");
		return result;
	}

	public static WSDLMessageGetusersplayerbygamedayidresponse getusersplayerbygamedayid(int _userid, int _gameday_id) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetusersplayerbygamedayidrequest.create(WSDLObjectInt.create(_userid), WSDLObjectInt.create(_gameday_id)).serialize("getusersplayerbygamedayid").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetusersplayerbygamedayidresponse result = WSDLMessageGetusersplayerbygamedayidresponse.createFromXML(xom.build(response, null), "getusersplayerbygamedayid");
		return result;
	}

	public static WSDLMessageGetmultiusersplayerbygamedayresponse getmultiusersplayerbygameday(WSDLMessageGetmultiusersplayerbygamedayrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize("getmultiusersplayerbygameday").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetmultiusersplayerbygamedayresponse result = WSDLMessageGetmultiusersplayerbygamedayresponse.createFromXML(xom.build(response, null), "getmultiusersplayerbygameday");
		return result;
	}

	public static WSDLMessageGetmultiusersplayerbygamedayresponse getmultiusersplayerbygameday(WSDLObjectArrayofuserid _arr_userid, WSDLObjectInt _gameday) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetmultiusersplayerbygamedayrequest.create(_arr_userid, _gameday).serialize("getmultiusersplayerbygameday").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetmultiusersplayerbygamedayresponse result = WSDLMessageGetmultiusersplayerbygamedayresponse.createFromXML(xom.build(response, null), "getmultiusersplayerbygameday");
		return result;
	}

	public static WSDLMessageGetmultiusersplayerbygamedayresponse getmultiusersplayerbygameday(WSDLObjectArrayofuserid _arr_userid, int _gameday) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetmultiusersplayerbygamedayrequest.create(_arr_userid, WSDLObjectInt.create(_gameday)).serialize("getmultiusersplayerbygameday").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetmultiusersplayerbygamedayresponse result = WSDLMessageGetmultiusersplayerbygamedayresponse.createFromXML(xom.build(response, null), "getmultiusersplayerbygameday");
		return result;
	}

	public static WSDLMessageGetmultiusersplayerbygamedayidresponse getmultiusersplayerbygamedayid(WSDLMessageGetmultiusersplayerbygamedayidrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize("getmultiusersplayerbygamedayid").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetmultiusersplayerbygamedayidresponse result = WSDLMessageGetmultiusersplayerbygamedayidresponse.createFromXML(xom.build(response, null), "getmultiusersplayerbygamedayid");
		return result;
	}

	public static WSDLMessageGetmultiusersplayerbygamedayidresponse getmultiusersplayerbygamedayid(WSDLObjectArrayofuserid _arr_userid, WSDLObjectInt _gameday_id) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetmultiusersplayerbygamedayidrequest.create(_arr_userid, _gameday_id).serialize("getmultiusersplayerbygamedayid").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetmultiusersplayerbygamedayidresponse result = WSDLMessageGetmultiusersplayerbygamedayidresponse.createFromXML(xom.build(response, null), "getmultiusersplayerbygamedayid");
		return result;
	}

	public static WSDLMessageGetmultiusersplayerbygamedayidresponse getmultiusersplayerbygamedayid(WSDLObjectArrayofuserid _arr_userid, int _gameday_id) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetmultiusersplayerbygamedayidrequest.create(_arr_userid, WSDLObjectInt.create(_gameday_id)).serialize("getmultiusersplayerbygamedayid").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetmultiusersplayerbygamedayidresponse result = WSDLMessageGetmultiusersplayerbygamedayidresponse.createFromXML(xom.build(response, null), "getmultiusersplayerbygamedayid");
		return result;
	}

	public static WSDLMessageGetalluserscurrentlineupresponse getalluserscurrentlineup(WSDLMessageGetalluserscurrentlineuprequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize("getalluserscurrentlineup").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetalluserscurrentlineupresponse result = WSDLMessageGetalluserscurrentlineupresponse.createFromXML(xom.build(response, null), "getalluserscurrentlineup");
		return result;
	}

	public static WSDLMessageGetalluserscurrentlineupresponse getalluserscurrentlineup(WSDLObjectInt _userid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetalluserscurrentlineuprequest.create(_userid).serialize("getalluserscurrentlineup").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetalluserscurrentlineupresponse result = WSDLMessageGetalluserscurrentlineupresponse.createFromXML(xom.build(response, null), "getalluserscurrentlineup");
		return result;
	}

	public static WSDLMessageGetalluserscurrentlineupresponse getalluserscurrentlineup(int _userid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetalluserscurrentlineuprequest.create(WSDLObjectInt.create(_userid)).serialize("getalluserscurrentlineup").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetalluserscurrentlineupresponse result = WSDLMessageGetalluserscurrentlineupresponse.createFromXML(xom.build(response, null), "getalluserscurrentlineup");
		return result;
	}

	public static WSDLMessageGetalluserslineupbygamedayresponse getalluserslineupbygameday(WSDLMessageGetalluserslineupbygamedayrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize("getalluserslineupbygameday").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetalluserslineupbygamedayresponse result = WSDLMessageGetalluserslineupbygamedayresponse.createFromXML(xom.build(response, null), "getalluserslineupbygameday");
		return result;
	}

	public static WSDLMessageGetalluserslineupbygamedayresponse getalluserslineupbygameday(WSDLObjectInt _userid, WSDLObjectInt _gameday) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetalluserslineupbygamedayrequest.create(_userid, _gameday).serialize("getalluserslineupbygameday").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetalluserslineupbygamedayresponse result = WSDLMessageGetalluserslineupbygamedayresponse.createFromXML(xom.build(response, null), "getalluserslineupbygameday");
		return result;
	}

	public static WSDLMessageGetalluserslineupbygamedayresponse getalluserslineupbygameday(int _userid, int _gameday) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetalluserslineupbygamedayrequest.create(WSDLObjectInt.create(_userid), WSDLObjectInt.create(_gameday)).serialize("getalluserslineupbygameday").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetalluserslineupbygamedayresponse result = WSDLMessageGetalluserslineupbygamedayresponse.createFromXML(xom.build(response, null), "getalluserslineupbygameday");
		return result;
	}

	public static WSDLMessageGetplayergamedaypointsresponse getplayergamedaypoints(WSDLMessageGetplayergamedaypointsrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize("getplayergamedaypoints").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetplayergamedaypointsresponse result = WSDLMessageGetplayergamedaypointsresponse.createFromXML(xom.build(response, null), "getplayergamedaypoints");
		return result;
	}

	public static WSDLMessageGetplayergamedaypointsresponse getplayergamedaypoints(WSDLObjectInt _playerid, WSDLObjectInt _gameday) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetplayergamedaypointsrequest.create(_playerid, _gameday).serialize("getplayergamedaypoints").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetplayergamedaypointsresponse result = WSDLMessageGetplayergamedaypointsresponse.createFromXML(xom.build(response, null), "getplayergamedaypoints");
		return result;
	}

	public static int getplayergamedaypoints(int _playerid, int _gameday) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetplayergamedaypointsrequest.create(WSDLObjectInt.create(_playerid), WSDLObjectInt.create(_gameday)).serialize("getplayergamedaypoints").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetplayergamedaypointsresponse result = WSDLMessageGetplayergamedaypointsresponse.createFromXML(xom.build(response, null), "getplayergamedaypoints");
		return result.field_return.value;
	}

	public static WSDLMessageGetplayergamedaystatisticsresponse getplayergamedaystatistics(WSDLMessageGetplayergamedaystatisticsrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize("getplayergamedaystatistics").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetplayergamedaystatisticsresponse result = WSDLMessageGetplayergamedaystatisticsresponse.createFromXML(xom.build(response, null), "getplayergamedaystatistics");
		return result;
	}

	public static WSDLMessageGetplayergamedaystatisticsresponse getplayergamedaystatistics(WSDLObjectInt _playerid, WSDLObjectInt _gameday) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetplayergamedaystatisticsrequest.create(_playerid, _gameday).serialize("getplayergamedaystatistics").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetplayergamedaystatisticsresponse result = WSDLMessageGetplayergamedaystatisticsresponse.createFromXML(xom.build(response, null), "getplayergamedaystatistics");
		return result;
	}

	public static WSDLMessageGetplayergamedaystatisticsresponse getplayergamedaystatistics(int _playerid, int _gameday) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetplayergamedaystatisticsrequest.create(WSDLObjectInt.create(_playerid), WSDLObjectInt.create(_gameday)).serialize("getplayergamedaystatistics").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetplayergamedaystatisticsresponse result = WSDLMessageGetplayergamedaystatisticsresponse.createFromXML(xom.build(response, null), "getplayergamedaystatistics");
		return result;
	}

	public static WSDLMessageGetplayergamedaystatisticsidresponse getplayergamedaystatisticsid(WSDLMessageGetplayergamedaystatisticsidrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize("getplayergamedaystatisticsid").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetplayergamedaystatisticsidresponse result = WSDLMessageGetplayergamedaystatisticsidresponse.createFromXML(xom.build(response, null), "getplayergamedaystatisticsid");
		return result;
	}

	public static WSDLMessageGetplayergamedaystatisticsidresponse getplayergamedaystatisticsid(WSDLObjectInt _playerid, WSDLObjectInt _gameday_id) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetplayergamedaystatisticsidrequest.create(_playerid, _gameday_id).serialize("getplayergamedaystatisticsid").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetplayergamedaystatisticsidresponse result = WSDLMessageGetplayergamedaystatisticsidresponse.createFromXML(xom.build(response, null), "getplayergamedaystatisticsid");
		return result;
	}

	public static WSDLMessageGetplayergamedaystatisticsidresponse getplayergamedaystatisticsid(int _playerid, int _gameday_id) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetplayergamedaystatisticsidrequest.create(WSDLObjectInt.create(_playerid), WSDLObjectInt.create(_gameday_id)).serialize("getplayergamedaystatisticsid").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetplayergamedaystatisticsidresponse result = WSDLMessageGetplayergamedaystatisticsidresponse.createFromXML(xom.build(response, null), "getplayergamedaystatisticsid");
		return result;
	}

	public static WSDLMessageGetquoteresponse getquote(WSDLMessageGetquoterequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize("getquote").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetquoteresponse result = WSDLMessageGetquoteresponse.createFromXML(xom.build(response, null), "getquote");
		return result;
	}

	public static WSDLMessageGetquoteresponse getquote(WSDLObjectInt _playerid, WSDLObjectString _date) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetquoterequest.create(_playerid, _date).serialize("getquote").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetquoteresponse result = WSDLMessageGetquoteresponse.createFromXML(xom.build(response, null), "getquote");
		return result;
	}

	public static int getquote(int _playerid, String _date) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetquoterequest.create(WSDLObjectInt.create(_playerid), WSDLObjectString.create(_date)).serialize("getquote").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetquoteresponse result = WSDLMessageGetquoteresponse.createFromXML(xom.build(response, null), "getquote");
		return result.field_return.value;
	}

	public static WSDLMessageGetuseridsbyplayerresponse getuseridsbyplayer(WSDLMessageGetuseridsbyplayerrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize("getuseridsbyplayer").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetuseridsbyplayerresponse result = WSDLMessageGetuseridsbyplayerresponse.createFromXML(xom.build(response, null), "getuseridsbyplayer");
		return result;
	}

	public static WSDLMessageGetuseridsbyplayerresponse getuseridsbyplayer(WSDLObjectInt _player) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetuseridsbyplayerrequest.create(_player).serialize("getuseridsbyplayer").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetuseridsbyplayerresponse result = WSDLMessageGetuseridsbyplayerresponse.createFromXML(xom.build(response, null), "getuseridsbyplayer");
		return result;
	}

	public static WSDLMessageGetuseridsbyplayerresponse getuseridsbyplayer(int _player) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetuseridsbyplayerrequest.create(WSDLObjectInt.create(_player)).serialize("getuseridsbyplayer").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetuseridsbyplayerresponse result = WSDLMessageGetuseridsbyplayerresponse.createFromXML(xom.build(response, null), "getuseridsbyplayer");
		return result;
	}

	public static WSDLMessageGetwatchlistsbyplayerresponse getwatchlistsbyplayer(WSDLMessageGetwatchlistsbyplayerrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize("getwatchlistsbyplayer").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetwatchlistsbyplayerresponse result = WSDLMessageGetwatchlistsbyplayerresponse.createFromXML(xom.build(response, null), "getwatchlistsbyplayer");
		return result;
	}

	public static WSDLMessageGetwatchlistsbyplayerresponse getwatchlistsbyplayer(WSDLObjectInt _player) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetwatchlistsbyplayerrequest.create(_player).serialize("getwatchlistsbyplayer").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetwatchlistsbyplayerresponse result = WSDLMessageGetwatchlistsbyplayerresponse.createFromXML(xom.build(response, null), "getwatchlistsbyplayer");
		return result;
	}

	public static WSDLMessageGetwatchlistsbyplayerresponse getwatchlistsbyplayer(int _player) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetwatchlistsbyplayerrequest.create(WSDLObjectInt.create(_player)).serialize("getwatchlistsbyplayer").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetwatchlistsbyplayerresponse result = WSDLMessageGetwatchlistsbyplayerresponse.createFromXML(xom.build(response, null), "getwatchlistsbyplayer");
		return result;
	}

	public static WSDLMessageGetbestlineupbygamedayresponse getbestlineupbygameday(WSDLMessageGetbestlineupbygamedayrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize("getbestlineupbygameday").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetbestlineupbygamedayresponse result = WSDLMessageGetbestlineupbygamedayresponse.createFromXML(xom.build(response, null), "getbestlineupbygameday");
		return result;
	}

	public static WSDLMessageGetbestlineupbygamedayresponse getbestlineupbygameday(WSDLObjectInt _gameday) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetbestlineupbygamedayrequest.create(_gameday).serialize("getbestlineupbygameday").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetbestlineupbygamedayresponse result = WSDLMessageGetbestlineupbygamedayresponse.createFromXML(xom.build(response, null), "getbestlineupbygameday");
		return result;
	}

	public static WSDLMessageGetbestlineupbygamedayresponse getbestlineupbygameday(int _gameday) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetbestlineupbygamedayrequest.create(WSDLObjectInt.create(_gameday)).serialize("getbestlineupbygameday").toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetbestlineupbygamedayresponse result = WSDLMessageGetbestlineupbygamedayresponse.createFromXML(xom.build(response, null), "getbestlineupbygameday");
		return result;
	}

}
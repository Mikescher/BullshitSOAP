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
		String request = input.serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageCheckpermissionsresponse result = WSDLMessageCheckpermissionsresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageCheckpermissionsresponse checkPermissions(WSDLObjectInt _userid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageCheckpermissionsrequest.create(_userid).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageCheckpermissionsresponse result = WSDLMessageCheckpermissionsresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static boolean checkPermissions(int _userid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageCheckpermissionsrequest.create(WSDLObjectInt.create(_userid)).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageCheckpermissionsresponse result = WSDLMessageCheckpermissionsresponse.createFromXML(xom.build(response, null));
		return result.field_return.value;
	}

	public static WSDLMessageCheckmultipermissionsresponse checkmultiPermissions(WSDLMessageCheckmultipermissionsrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageCheckmultipermissionsresponse result = WSDLMessageCheckmultipermissionsresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageCheckmultipermissionsresponse checkmultiPermissions(WSDLObjectArrayofuserid _arr_userid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageCheckmultipermissionsrequest.create(_arr_userid).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageCheckmultipermissionsresponse result = WSDLMessageCheckmultipermissionsresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageCheckcommunitypermissionsresponse checkcommunitypermissions(WSDLMessageCheckcommunitypermissionsrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageCheckcommunitypermissionsresponse result = WSDLMessageCheckcommunitypermissionsresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageCheckcommunitypermissionsresponse checkcommunitypermissions(WSDLObjectInt _userid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageCheckcommunitypermissionsrequest.create(_userid).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageCheckcommunitypermissionsresponse result = WSDLMessageCheckcommunitypermissionsresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static boolean checkcommunitypermissions(int _userid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageCheckcommunitypermissionsrequest.create(WSDLObjectInt.create(_userid)).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageCheckcommunitypermissionsresponse result = WSDLMessageCheckcommunitypermissionsresponse.createFromXML(xom.build(response, null));
		return result.field_return.value;
	}

	public static WSDLMessageGetsoapservicereleaseresponse getsoapservicerelease(WSDLMessageGetsoapservicereleaserequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetsoapservicereleaseresponse result = WSDLMessageGetsoapservicereleaseresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetsoapservicereleaseresponse getsoapservicerelease() throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetsoapservicereleaserequest.create()
		String response = invoker.getReponse(request);
		WSDLMessageGetsoapservicereleaseresponse result = WSDLMessageGetsoapservicereleaseresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetuseridresponse getuserid(WSDLMessageGetuseridrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetuseridresponse result = WSDLMessageGetuseridresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetuseridresponse getuserid(WSDLObjectString _login) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetuseridrequest.create(_login).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetuseridresponse result = WSDLMessageGetuseridresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static int getuserid(string _login) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetuseridrequest.create(WSDLObjectString.create(_login)).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetuseridresponse result = WSDLMessageGetuseridresponse.createFromXML(xom.build(response, null));
		return result.field_return.value;
	}

	public static WSDLMessageGetloginresponse getlogin(WSDLMessageGetloginrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetloginresponse result = WSDLMessageGetloginresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetloginresponse getlogin(WSDLObjectInt _userid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetloginrequest.create(_userid).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetloginresponse result = WSDLMessageGetloginresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static string getlogin(int _userid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetloginrequest.create(WSDLObjectInt.create(_userid)).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetloginresponse result = WSDLMessageGetloginresponse.createFromXML(xom.build(response, null));
		return result.field_return.value;
	}

	public static WSDLMessageGetuserinformationresponse getUserInformation(WSDLMessageGetuserinformationrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetuserinformationresponse result = WSDLMessageGetuserinformationresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetuserinformationresponse getUserInformation(WSDLObjectInt _userid, WSDLObjectString _md5password) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetuserinformationrequest.create(_userid, _md5password).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetuserinformationresponse result = WSDLMessageGetuserinformationresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetuserinformationresponse getUserInformation(int _userid, string _md5password) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetuserinformationrequest.create(WSDLObjectInt.create(_userid), WSDLObjectString.create(_md5password)).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetuserinformationresponse result = WSDLMessageGetuserinformationresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetusersfirstnameresponse getusersfirstname(WSDLMessageGetusersfirstnamerequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetusersfirstnameresponse result = WSDLMessageGetusersfirstnameresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetusersfirstnameresponse getusersfirstname(WSDLObjectInt _userid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetusersfirstnamerequest.create(_userid).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetusersfirstnameresponse result = WSDLMessageGetusersfirstnameresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static string getusersfirstname(int _userid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetusersfirstnamerequest.create(WSDLObjectInt.create(_userid)).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetusersfirstnameresponse result = WSDLMessageGetusersfirstnameresponse.createFromXML(xom.build(response, null));
		return result.field_return.value;
	}

	public static WSDLMessageGetusersnameresponse getusersname(WSDLMessageGetusersnamerequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetusersnameresponse result = WSDLMessageGetusersnameresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetusersnameresponse getusersname(WSDLObjectInt _userid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetusersnamerequest.create(_userid).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetusersnameresponse result = WSDLMessageGetusersnameresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static string getusersname(int _userid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetusersnamerequest.create(WSDLObjectInt.create(_userid)).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetusersnameresponse result = WSDLMessageGetusersnameresponse.createFromXML(xom.build(response, null));
		return result.field_return.value;
	}

	public static WSDLMessageGetuserspointsresponse getuserspoints(WSDLMessageGetuserspointsrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetuserspointsresponse result = WSDLMessageGetuserspointsresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetuserspointsresponse getuserspoints(WSDLObjectInt _userid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetuserspointsrequest.create(_userid).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetuserspointsresponse result = WSDLMessageGetuserspointsresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static int getuserspoints(int _userid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetuserspointsrequest.create(WSDLObjectInt.create(_userid)).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetuserspointsresponse result = WSDLMessageGetuserspointsresponse.createFromXML(xom.build(response, null));
		return result.field_return.value;
	}

	public static WSDLMessageGetmultiuserspointsresponse getmultiuserspoints(WSDLMessageGetmultiuserspointsrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetmultiuserspointsresponse result = WSDLMessageGetmultiuserspointsresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetmultiuserspointsresponse getmultiuserspoints(WSDLObjectArrayofuserid _arr_userid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetmultiuserspointsrequest.create(_arr_userid).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetmultiuserspointsresponse result = WSDLMessageGetmultiuserspointsresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetusersgamdaybudgetstateresponse getusersgamdaybudgetstate(WSDLMessageGetusersgamdaybudgetstaterequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetusersgamdaybudgetstateresponse result = WSDLMessageGetusersgamdaybudgetstateresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetusersgamdaybudgetstateresponse getusersgamdaybudgetstate(WSDLObjectInt _userid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetusersgamdaybudgetstaterequest.create(_userid).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetusersgamdaybudgetstateresponse result = WSDLMessageGetusersgamdaybudgetstateresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static boolean getusersgamdaybudgetstate(int _userid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetusersgamdaybudgetstaterequest.create(WSDLObjectInt.create(_userid)).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetusersgamdaybudgetstateresponse result = WSDLMessageGetusersgamdaybudgetstateresponse.createFromXML(xom.build(response, null));
		return result.field_return.value;
	}

	public static WSDLMessageGetmultiusersgamdaybudgetstateresponse getmultiusersgamdaybudgetstate(WSDLMessageGetmultiusersgamdaybudgetstaterequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetmultiusersgamdaybudgetstateresponse result = WSDLMessageGetmultiusersgamdaybudgetstateresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetmultiusersgamdaybudgetstateresponse getmultiusersgamdaybudgetstate(WSDLObjectArrayofuserid _arr_userid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetmultiusersgamdaybudgetstaterequest.create(_arr_userid).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetmultiusersgamdaybudgetstateresponse result = WSDLMessageGetmultiusersgamdaybudgetstateresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetusersdescriptionresponse getusersdescription(WSDLMessageGetusersdescriptionrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetusersdescriptionresponse result = WSDLMessageGetusersdescriptionresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetusersdescriptionresponse getusersdescription(WSDLObjectInt _userid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetusersdescriptionrequest.create(_userid).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetusersdescriptionresponse result = WSDLMessageGetusersdescriptionresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static string getusersdescription(int _userid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetusersdescriptionrequest.create(WSDLObjectInt.create(_userid)).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetusersdescriptionresponse result = WSDLMessageGetusersdescriptionresponse.createFromXML(xom.build(response, null));
		return result.field_return.value;
	}

	public static WSDLMessageGetteamvalueresponse getteamvalue(WSDLMessageGetteamvaluerequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetteamvalueresponse result = WSDLMessageGetteamvalueresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetteamvalueresponse getteamvalue(WSDLObjectInt _userid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetteamvaluerequest.create(_userid).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetteamvalueresponse result = WSDLMessageGetteamvalueresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static int getteamvalue(int _userid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetteamvaluerequest.create(WSDLObjectInt.create(_userid)).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetteamvalueresponse result = WSDLMessageGetteamvalueresponse.createFromXML(xom.build(response, null));
		return result.field_return.value;
	}

	public static WSDLMessageGetteamsizeresponse getteamsize(WSDLMessageGetteamsizerequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetteamsizeresponse result = WSDLMessageGetteamsizeresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetteamsizeresponse getteamsize(WSDLObjectInt _userid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetteamsizerequest.create(_userid).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetteamsizeresponse result = WSDLMessageGetteamsizeresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static int getteamsize(int _userid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetteamsizerequest.create(WSDLObjectInt.create(_userid)).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetteamsizeresponse result = WSDLMessageGetteamsizeresponse.createFromXML(xom.build(response, null));
		return result.field_return.value;
	}

	public static WSDLMessageGetcommunityidresponse getcommunityid(WSDLMessageGetcommunityidrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetcommunityidresponse result = WSDLMessageGetcommunityidresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetcommunityidresponse getcommunityid(WSDLObjectInt _userid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetcommunityidrequest.create(_userid).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetcommunityidresponse result = WSDLMessageGetcommunityidresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static int getcommunityid(int _userid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetcommunityidrequest.create(WSDLObjectInt.create(_userid)).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetcommunityidresponse result = WSDLMessageGetcommunityidresponse.createFromXML(xom.build(response, null));
		return result.field_return.value;
	}

	public static WSDLMessageGetcommunitynameresponse getcommunityname(WSDLMessageGetcommunitynamerequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetcommunitynameresponse result = WSDLMessageGetcommunitynameresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetcommunitynameresponse getcommunityname(WSDLObjectInt _communityid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetcommunitynamerequest.create(_communityid).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetcommunitynameresponse result = WSDLMessageGetcommunitynameresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static string getcommunityname(int _communityid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetcommunitynamerequest.create(WSDLObjectInt.create(_communityid)).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetcommunitynameresponse result = WSDLMessageGetcommunitynameresponse.createFromXML(xom.build(response, null));
		return result.field_return.value;
	}

	public static WSDLMessageGetcommunitynamebyuseridresponse getcommunitynamebyuserid(WSDLMessageGetcommunitynamebyuseridrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetcommunitynamebyuseridresponse result = WSDLMessageGetcommunitynamebyuseridresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetcommunitynamebyuseridresponse getcommunitynamebyuserid(WSDLObjectInt _userid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetcommunitynamebyuseridrequest.create(_userid).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetcommunitynamebyuseridresponse result = WSDLMessageGetcommunitynamebyuseridresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static string getcommunitynamebyuserid(int _userid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetcommunitynamebyuseridrequest.create(WSDLObjectInt.create(_userid)).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetcommunitynamebyuseridresponse result = WSDLMessageGetcommunitynamebyuseridresponse.createFromXML(xom.build(response, null));
		return result.field_return.value;
	}

	public static WSDLMessageGetuserloginsresponse getuserlogins(WSDLMessageGetuserloginsrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetuserloginsresponse result = WSDLMessageGetuserloginsresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetuserloginsresponse getuserlogins(WSDLObjectInt _communityid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetuserloginsrequest.create(_communityid).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetuserloginsresponse result = WSDLMessageGetuserloginsresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetuserloginsresponse getuserlogins(int _communityid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetuserloginsrequest.create(WSDLObjectInt.create(_communityid)).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetuserloginsresponse result = WSDLMessageGetuserloginsresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetuseridsresponse getuserids(WSDLMessageGetuseridsrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetuseridsresponse result = WSDLMessageGetuseridsresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetuseridsresponse getuserids(WSDLObjectInt _communityid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetuseridsrequest.create(_communityid).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetuseridsresponse result = WSDLMessageGetuseridsresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetuseridsresponse getuserids(int _communityid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetuseridsrequest.create(WSDLObjectInt.create(_communityid)).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetuseridsresponse result = WSDLMessageGetuseridsresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetgamedaysresponse getgamedays(WSDLMessageGetgamedaysrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetgamedaysresponse result = WSDLMessageGetgamedaysresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetgamedaysresponse getgamedays() throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetgamedaysrequest.create()
		String response = invoker.getReponse(request);
		WSDLMessageGetgamedaysresponse result = WSDLMessageGetgamedaysresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetcommunityadminsresponse getcommunityadmins(WSDLMessageGetcommunityadminsrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetcommunityadminsresponse result = WSDLMessageGetcommunityadminsresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetcommunityadminsresponse getcommunityadmins(WSDLObjectInt _communityid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetcommunityadminsrequest.create(_communityid).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetcommunityadminsresponse result = WSDLMessageGetcommunityadminsresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetcommunityadminsresponse getcommunityadmins(int _communityid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetcommunityadminsrequest.create(WSDLObjectInt.create(_communityid)).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetcommunityadminsresponse result = WSDLMessageGetcommunityadminsresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetcommunitymarketresponse getcommunitymarket(WSDLMessageGetcommunitymarketrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetcommunitymarketresponse result = WSDLMessageGetcommunitymarketresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetcommunitymarketresponse getcommunitymarket(WSDLObjectInt _communityid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetcommunitymarketrequest.create(_communityid).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetcommunitymarketresponse result = WSDLMessageGetcommunitymarketresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetcommunitymarketresponse getcommunitymarket(int _communityid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetcommunitymarketrequest.create(WSDLObjectInt.create(_communityid)).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetcommunitymarketresponse result = WSDLMessageGetcommunitymarketresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessagePlayer_getcommunitymarketresponse player_getcommunitymarket(WSDLMessagePlayer_getcommunitymarketrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessagePlayer_getcommunitymarketresponse result = WSDLMessagePlayer_getcommunitymarketresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessagePlayer_getcommunitymarketresponse player_getcommunitymarket() throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessagePlayer_getcommunitymarketrequest.create()
		String response = invoker.getReponse(request);
		WSDLMessagePlayer_getcommunitymarketresponse result = WSDLMessagePlayer_getcommunitymarketresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetplayerbyidresponse getplayerbyid(WSDLMessageGetplayerbyidrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetplayerbyidresponse result = WSDLMessageGetplayerbyidresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetplayerbyidresponse getplayerbyid(WSDLObjectInt _playerid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetplayerbyidrequest.create(_playerid).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetplayerbyidresponse result = WSDLMessageGetplayerbyidresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetplayerbyidresponse getplayerbyid(int _playerid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetplayerbyidrequest.create(WSDLObjectInt.create(_playerid)).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetplayerbyidresponse result = WSDLMessageGetplayerbyidresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetusergamedaypointsresponse getusergamedaypoints(WSDLMessageGetusergamedaypointsrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetusergamedaypointsresponse result = WSDLMessageGetusergamedaypointsresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetusergamedaypointsresponse getusergamedaypoints(WSDLObjectInt _userid, WSDLObjectInt _gameday) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetusergamedaypointsrequest.create(_userid, _gameday).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetusergamedaypointsresponse result = WSDLMessageGetusergamedaypointsresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static int getusergamedaypoints(int _userid, int _gameday) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetusergamedaypointsrequest.create(WSDLObjectInt.create(_userid), WSDLObjectInt.create(_gameday)).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetusergamedaypointsresponse result = WSDLMessageGetusergamedaypointsresponse.createFromXML(xom.build(response, null));
		return result.field_return.value;
	}

	public static WSDLMessageGetusergamedaypointsidresponse getusergamedaypointsid(WSDLMessageGetusergamedaypointsidrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetusergamedaypointsidresponse result = WSDLMessageGetusergamedaypointsidresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetusergamedaypointsidresponse getusergamedaypointsid(WSDLObjectInt _userid, WSDLObjectInt _gameday_id) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetusergamedaypointsidrequest.create(_userid, _gameday_id).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetusergamedaypointsidresponse result = WSDLMessageGetusergamedaypointsidresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static int getusergamedaypointsid(int _userid, int _gameday_id) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetusergamedaypointsidrequest.create(WSDLObjectInt.create(_userid), WSDLObjectInt.create(_gameday_id)).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetusergamedaypointsidresponse result = WSDLMessageGetusergamedaypointsidresponse.createFromXML(xom.build(response, null));
		return result.field_return.value;
	}

	public static WSDLMessageGetmultiusergamedaypointsresponse getmultiusergamedaypoints(WSDLMessageGetmultiusergamedaypointsrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetmultiusergamedaypointsresponse result = WSDLMessageGetmultiusergamedaypointsresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetmultiusergamedaypointsresponse getmultiusergamedaypoints(WSDLObjectArrayofuserid _arr_userid, WSDLObjectInt _gameday) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetmultiusergamedaypointsrequest.create(_arr_userid, _gameday).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetmultiusergamedaypointsresponse result = WSDLMessageGetmultiusergamedaypointsresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetmultiusergamedaypointsresponse getmultiusergamedaypoints(WSDLObjectArrayofuserid _arr_userid, int _gameday) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetmultiusergamedaypointsrequest.create(_arr_userid, WSDLObjectInt.create(_gameday)).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetmultiusergamedaypointsresponse result = WSDLMessageGetmultiusergamedaypointsresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetmultiusergamedaypointsidresponse getmultiusergamedaypointsid(WSDLMessageGetmultiusergamedaypointsidrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetmultiusergamedaypointsidresponse result = WSDLMessageGetmultiusergamedaypointsidresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetmultiusergamedaypointsidresponse getmultiusergamedaypointsid(WSDLObjectArrayofuserid _arr_userid, WSDLObjectInt _gameday_id) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetmultiusergamedaypointsidrequest.create(_arr_userid, _gameday_id).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetmultiusergamedaypointsidresponse result = WSDLMessageGetmultiusergamedaypointsidresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetmultiusergamedaypointsidresponse getmultiusergamedaypointsid(WSDLObjectArrayofuserid _arr_userid, int _gameday_id) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetmultiusergamedaypointsidrequest.create(_arr_userid, WSDLObjectInt.create(_gameday_id)).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetmultiusergamedaypointsidresponse result = WSDLMessageGetmultiusergamedaypointsidresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetlatestgamedayresponse getlatestgameday(WSDLMessageGetlatestgamedayrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetlatestgamedayresponse result = WSDLMessageGetlatestgamedayresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetlatestgamedayresponse getlatestgameday() throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetlatestgamedayrequest.create()
		String response = invoker.getReponse(request);
		WSDLMessageGetlatestgamedayresponse result = WSDLMessageGetlatestgamedayresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetlatestgamedayidresponse getlatestgamedayid(WSDLMessageGetlatestgamedayidrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetlatestgamedayidresponse result = WSDLMessageGetlatestgamedayidresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetlatestgamedayidresponse getlatestgamedayid() throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetlatestgamedayidrequest.create()
		String response = invoker.getReponse(request);
		WSDLMessageGetlatestgamedayidresponse result = WSDLMessageGetlatestgamedayidresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetcomputernewsresponse getcomputernews(WSDLMessageGetcomputernewsrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetcomputernewsresponse result = WSDLMessageGetcomputernewsresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetcomputernewsresponse getcomputernews(WSDLObjectInt _communityid, WSDLObjectInt _days, WSDLObjectInt _items) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetcomputernewsrequest.create(_communityid, _days, _items).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetcomputernewsresponse result = WSDLMessageGetcomputernewsresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetcomputernewsresponse getcomputernews(int _communityid, int _days, int _items) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetcomputernewsrequest.create(WSDLObjectInt.create(_communityid), WSDLObjectInt.create(_days), WSDLObjectInt.create(_items)).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetcomputernewsresponse result = WSDLMessageGetcomputernewsresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageCommunityexistsresponse communityexists(WSDLMessageCommunityexistsrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageCommunityexistsresponse result = WSDLMessageCommunityexistsresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageCommunityexistsresponse communityexists(WSDLObjectInt _communityid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageCommunityexistsrequest.create(_communityid).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageCommunityexistsresponse result = WSDLMessageCommunityexistsresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static boolean communityexists(int _communityid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageCommunityexistsrequest.create(WSDLObjectInt.create(_communityid)).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageCommunityexistsresponse result = WSDLMessageCommunityexistsresponse.createFromXML(xom.build(response, null));
		return result.field_return.value;
	}

	public static WSDLMessageGetclubsresponse getclubs(WSDLMessageGetclubsrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetclubsresponse result = WSDLMessageGetclubsresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetclubsresponse getclubs() throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetclubsrequest.create()
		String response = invoker.getReponse(request);
		WSDLMessageGetclubsresponse result = WSDLMessageGetclubsresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetplayersbyclubidresponse getplayersbyclubid(WSDLMessageGetplayersbyclubidrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetplayersbyclubidresponse result = WSDLMessageGetplayersbyclubidresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetplayersbyclubidresponse getplayersbyclubid(WSDLObjectInt _clubid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetplayersbyclubidrequest.create(_clubid).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetplayersbyclubidresponse result = WSDLMessageGetplayersbyclubidresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetplayersbyclubidresponse getplayersbyclubid(int _clubid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetplayersbyclubidrequest.create(WSDLObjectInt.create(_clubid)).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetplayersbyclubidresponse result = WSDLMessageGetplayersbyclubidresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetplayersbyclubidinclretiredresponse getplayersbyclubidinclretired(WSDLMessageGetplayersbyclubidinclretiredrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetplayersbyclubidinclretiredresponse result = WSDLMessageGetplayersbyclubidinclretiredresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetplayersbyclubidinclretiredresponse getplayersbyclubidinclretired(WSDLObjectInt _clubid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetplayersbyclubidinclretiredrequest.create(_clubid).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetplayersbyclubidinclretiredresponse result = WSDLMessageGetplayersbyclubidinclretiredresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetplayersbyclubidinclretiredresponse getplayersbyclubidinclretired(int _clubid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetplayersbyclubidinclretiredrequest.create(WSDLObjectInt.create(_clubid)).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetplayersbyclubidinclretiredresponse result = WSDLMessageGetplayersbyclubidinclretiredresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetplayerssportaldeidresponse getplayerssportaldeid(WSDLMessageGetplayerssportaldeidrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetplayerssportaldeidresponse result = WSDLMessageGetplayerssportaldeidresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetplayerssportaldeidresponse getplayerssportaldeid(WSDLObjectInt _playerid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetplayerssportaldeidrequest.create(_playerid).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetplayerssportaldeidresponse result = WSDLMessageGetplayerssportaldeidresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static int getplayerssportaldeid(int _playerid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetplayerssportaldeidrequest.create(WSDLObjectInt.create(_playerid)).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetplayerssportaldeidresponse result = WSDLMessageGetplayerssportaldeidresponse.createFromXML(xom.build(response, null));
		return result.field_return.value;
	}

	public static WSDLMessageGetplayerbysportaldeidresponse getplayerbysportaldeid(WSDLMessageGetplayerbysportaldeidrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetplayerbysportaldeidresponse result = WSDLMessageGetplayerbysportaldeidresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetplayerbysportaldeidresponse getplayerbysportaldeid(WSDLObjectInt _sportaldeid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetplayerbysportaldeidrequest.create(_sportaldeid).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetplayerbysportaldeidresponse result = WSDLMessageGetplayerbysportaldeidresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static int getplayerbysportaldeid(int _sportaldeid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetplayerbysportaldeidrequest.create(WSDLObjectInt.create(_sportaldeid)).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetplayerbysportaldeidresponse result = WSDLMessageGetplayerbysportaldeidresponse.createFromXML(xom.build(response, null));
		return result.field_return.value;
	}

	public static WSDLMessageGetplayersspoxidresponse getplayersspoxid(WSDLMessageGetplayersspoxidrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetplayersspoxidresponse result = WSDLMessageGetplayersspoxidresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetplayersspoxidresponse getplayersspoxid(WSDLObjectInt _playerid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetplayersspoxidrequest.create(_playerid).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetplayersspoxidresponse result = WSDLMessageGetplayersspoxidresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static int getplayersspoxid(int _playerid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetplayersspoxidrequest.create(WSDLObjectInt.create(_playerid)).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetplayersspoxidresponse result = WSDLMessageGetplayersspoxidresponse.createFromXML(xom.build(response, null));
		return result.field_return.value;
	}

	public static WSDLMessageGetplayerbyspoxidresponse getplayerbyspoxid(WSDLMessageGetplayerbyspoxidrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetplayerbyspoxidresponse result = WSDLMessageGetplayerbyspoxidresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetplayerbyspoxidresponse getplayerbyspoxid(WSDLObjectInt _spoxid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetplayerbyspoxidrequest.create(_spoxid).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetplayerbyspoxidresponse result = WSDLMessageGetplayerbyspoxidresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static int getplayerbyspoxid(int _spoxid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetplayerbyspoxidrequest.create(WSDLObjectInt.create(_spoxid)).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetplayerbyspoxidresponse result = WSDLMessageGetplayerbyspoxidresponse.createFromXML(xom.build(response, null));
		return result.field_return.value;
	}

	public static WSDLMessageGetplayersbyuseridresponse getplayersbyuserid(WSDLMessageGetplayersbyuseridrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetplayersbyuseridresponse result = WSDLMessageGetplayersbyuseridresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetplayersbyuseridresponse getplayersbyuserid(WSDLObjectInt _userid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetplayersbyuseridrequest.create(_userid).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetplayersbyuseridresponse result = WSDLMessageGetplayersbyuseridresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetplayersbyuseridresponse getplayersbyuserid(int _userid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetplayersbyuseridrequest.create(WSDLObjectInt.create(_userid)).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetplayersbyuseridresponse result = WSDLMessageGetplayersbyuseridresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetplayersinfobyuseridresponse getplayersinfobyuserid(WSDLMessageGetplayersinfobyuseridrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetplayersinfobyuseridresponse result = WSDLMessageGetplayersinfobyuseridresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetplayersinfobyuseridresponse getplayersinfobyuserid(WSDLObjectInt _userid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetplayersinfobyuseridrequest.create(_userid).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetplayersinfobyuseridresponse result = WSDLMessageGetplayersinfobyuseridresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetplayersinfobyuseridresponse getplayersinfobyuserid(int _userid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetplayersinfobyuseridrequest.create(WSDLObjectInt.create(_userid)).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetplayersinfobyuseridresponse result = WSDLMessageGetplayersinfobyuseridresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetpartnerrankingresponse getpartnerranking(WSDLMessageGetpartnerrankingrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetpartnerrankingresponse result = WSDLMessageGetpartnerrankingresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetpartnerrankingresponse getpartnerranking() throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetpartnerrankingrequest.create()
		String response = invoker.getReponse(request);
		WSDLMessageGetpartnerrankingresponse result = WSDLMessageGetpartnerrankingresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetlastpartnerrankingresponse getlastpartnerranking(WSDLMessageGetlastpartnerrankingrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetlastpartnerrankingresponse result = WSDLMessageGetlastpartnerrankingresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetlastpartnerrankingresponse getlastpartnerranking() throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetlastpartnerrankingrequest.create()
		String response = invoker.getReponse(request);
		WSDLMessageGetlastpartnerrankingresponse result = WSDLMessageGetlastpartnerrankingresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetservicerankingresponse getserviceranking(WSDLMessageGetservicerankingrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetservicerankingresponse result = WSDLMessageGetservicerankingresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetservicerankingresponse getserviceranking() throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetservicerankingrequest.create()
		String response = invoker.getReponse(request);
		WSDLMessageGetservicerankingresponse result = WSDLMessageGetservicerankingresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageSignupserviceresponse signupservice(WSDLMessageSignupservicerequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageSignupserviceresponse result = WSDLMessageSignupserviceresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageSignupserviceresponse signupservice(WSDLObjectInt _userid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageSignupservicerequest.create(_userid).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageSignupserviceresponse result = WSDLMessageSignupserviceresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static boolean signupservice(int _userid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageSignupservicerequest.create(WSDLObjectInt.create(_userid)).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageSignupserviceresponse result = WSDLMessageSignupserviceresponse.createFromXML(xom.build(response, null));
		return result.field_return.value;
	}

	public static WSDLMessageGetserviceexpirationdateresponse getserviceexpirationdate(WSDLMessageGetserviceexpirationdaterequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetserviceexpirationdateresponse result = WSDLMessageGetserviceexpirationdateresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetserviceexpirationdateresponse getserviceexpirationdate(WSDLObjectInt _userid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetserviceexpirationdaterequest.create(_userid).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetserviceexpirationdateresponse result = WSDLMessageGetserviceexpirationdateresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static string getserviceexpirationdate(int _userid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetserviceexpirationdaterequest.create(WSDLObjectInt.create(_userid)).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetserviceexpirationdateresponse result = WSDLMessageGetserviceexpirationdateresponse.createFromXML(xom.build(response, null));
		return result.field_return.value;
	}

	public static WSDLMessageGetregisteredusersresponse getregisteredusers(WSDLMessageGetregisteredusersrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetregisteredusersresponse result = WSDLMessageGetregisteredusersresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetregisteredusersresponse getregisteredusers() throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetregisteredusersrequest.create()
		String response = invoker.getReponse(request);
		WSDLMessageGetregisteredusersresponse result = WSDLMessageGetregisteredusersresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessagePostcommunitynewsresponse postcommunitynews(WSDLMessagePostcommunitynewsrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessagePostcommunitynewsresponse result = WSDLMessagePostcommunitynewsresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessagePostcommunitynewsresponse postcommunitynews(WSDLObjectInt _communityid, WSDLObjectString _headline, WSDLObjectString _content) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessagePostcommunitynewsrequest.create(_communityid, _headline, _content).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessagePostcommunitynewsresponse result = WSDLMessagePostcommunitynewsresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static boolean postcommunitynews(int _communityid, string _headline, string _content) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessagePostcommunitynewsrequest.create(WSDLObjectInt.create(_communityid), WSDLObjectString.create(_headline), WSDLObjectString.create(_content)).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessagePostcommunitynewsresponse result = WSDLMessagePostcommunitynewsresponse.createFromXML(xom.build(response, null));
		return result.field_return.value;
	}

	public static WSDLMessagePlayer_postcommunitynewsresponse player_postcommunitynews(WSDLMessagePlayer_postcommunitynewsrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessagePlayer_postcommunitynewsresponse result = WSDLMessagePlayer_postcommunitynewsresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessagePlayer_postcommunitynewsresponse player_postcommunitynews(WSDLObjectString _headline, WSDLObjectString _content) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessagePlayer_postcommunitynewsrequest.create(_headline, _content).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessagePlayer_postcommunitynewsresponse result = WSDLMessagePlayer_postcommunitynewsresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static boolean player_postcommunitynews(string _headline, string _content) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessagePlayer_postcommunitynewsrequest.create(WSDLObjectString.create(_headline), WSDLObjectString.create(_content)).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessagePlayer_postcommunitynewsresponse result = WSDLMessagePlayer_postcommunitynewsresponse.createFromXML(xom.build(response, null));
		return result.field_return.value;
	}

	public static WSDLMessagePostusernewsresponse postusernews(WSDLMessagePostusernewsrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessagePostusernewsresponse result = WSDLMessagePostusernewsresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessagePostusernewsresponse postusernews(WSDLObjectInt _userid, WSDLObjectString _headline, WSDLObjectString _content) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessagePostusernewsrequest.create(_userid, _headline, _content).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessagePostusernewsresponse result = WSDLMessagePostusernewsresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static boolean postusernews(int _userid, string _headline, string _content) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessagePostusernewsrequest.create(WSDLObjectInt.create(_userid), WSDLObjectString.create(_headline), WSDLObjectString.create(_content)).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessagePostusernewsresponse result = WSDLMessagePostusernewsresponse.createFromXML(xom.build(response, null));
		return result.field_return.value;
	}

	public static WSDLMessagePlayer_postusernewsresponse player_postusernews(WSDLMessagePlayer_postusernewsrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessagePlayer_postusernewsresponse result = WSDLMessagePlayer_postusernewsresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessagePlayer_postusernewsresponse player_postusernews(WSDLObjectInt _userid, WSDLObjectString _headline, WSDLObjectString _content) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessagePlayer_postusernewsrequest.create(_userid, _headline, _content).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessagePlayer_postusernewsresponse result = WSDLMessagePlayer_postusernewsresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static boolean player_postusernews(int _userid, string _headline, string _content) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessagePlayer_postusernewsrequest.create(WSDLObjectInt.create(_userid), WSDLObjectString.create(_headline), WSDLObjectString.create(_content)).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessagePlayer_postusernewsresponse result = WSDLMessagePlayer_postusernewsresponse.createFromXML(xom.build(response, null));
		return result.field_return.value;
	}

	public static WSDLMessagePostmultiusernewsresponse postmultiusernews(WSDLMessagePostmultiusernewsrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessagePostmultiusernewsresponse result = WSDLMessagePostmultiusernewsresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessagePostmultiusernewsresponse postmultiusernews(WSDLObjectArrayofuserid _arr_userid, WSDLObjectString _headline, WSDLObjectString _content) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessagePostmultiusernewsrequest.create(_arr_userid, _headline, _content).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessagePostmultiusernewsresponse result = WSDLMessagePostmultiusernewsresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static boolean postmultiusernews(WSDLObjectArrayofuserid _arr_userid, string _headline, string _content) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessagePostmultiusernewsrequest.create(_arr_userid, WSDLObjectString.create(_headline), WSDLObjectString.create(_content)).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessagePostmultiusernewsresponse result = WSDLMessagePostmultiusernewsresponse.createFromXML(xom.build(response, null));
		return result.field_return.value;
	}

	public static WSDLMessagePlayer_postmultiusernewsresponse player_postmultiusernews(WSDLMessagePlayer_postmultiusernewsrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessagePlayer_postmultiusernewsresponse result = WSDLMessagePlayer_postmultiusernewsresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessagePlayer_postmultiusernewsresponse player_postmultiusernews(WSDLObjectArrayofuserid _arr_userid, WSDLObjectString _headline, WSDLObjectString _content) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessagePlayer_postmultiusernewsrequest.create(_arr_userid, _headline, _content).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessagePlayer_postmultiusernewsresponse result = WSDLMessagePlayer_postmultiusernewsresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static boolean player_postmultiusernews(WSDLObjectArrayofuserid _arr_userid, string _headline, string _content) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessagePlayer_postmultiusernewsrequest.create(_arr_userid, WSDLObjectString.create(_headline), WSDLObjectString.create(_content)).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessagePlayer_postmultiusernewsresponse result = WSDLMessagePlayer_postmultiusernewsresponse.createFromXML(xom.build(response, null));
		return result.field_return.value;
	}

	public static WSDLMessagePostadminnewsresponse postadminnews(WSDLMessagePostadminnewsrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessagePostadminnewsresponse result = WSDLMessagePostadminnewsresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessagePostadminnewsresponse postadminnews(WSDLObjectString _userType, WSDLObjectString _language, WSDLObjectString _headline, WSDLObjectString _content) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessagePostadminnewsrequest.create(_userType, _language, _headline, _content).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessagePostadminnewsresponse result = WSDLMessagePostadminnewsresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static boolean postadminnews(string _userType, string _language, string _headline, string _content) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessagePostadminnewsrequest.create(WSDLObjectString.create(_userType), WSDLObjectString.create(_language), WSDLObjectString.create(_headline), WSDLObjectString.create(_content)).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessagePostadminnewsresponse result = WSDLMessagePostadminnewsresponse.createFromXML(xom.build(response, null));
		return result.field_return.value;
	}

	public static WSDLMessageGetcurrentbudgetresponse getcurrentbudget(WSDLMessageGetcurrentbudgetrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetcurrentbudgetresponse result = WSDLMessageGetcurrentbudgetresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetcurrentbudgetresponse getcurrentbudget(WSDLObjectInt _userid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetcurrentbudgetrequest.create(_userid).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetcurrentbudgetresponse result = WSDLMessageGetcurrentbudgetresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static int getcurrentbudget(int _userid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetcurrentbudgetrequest.create(WSDLObjectInt.create(_userid)).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetcurrentbudgetresponse result = WSDLMessageGetcurrentbudgetresponse.createFromXML(xom.build(response, null));
		return result.field_return.value;
	}

	public static WSDLMessageSetuserbonusresponse setuserbonus(WSDLMessageSetuserbonusrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageSetuserbonusresponse result = WSDLMessageSetuserbonusresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageSetuserbonusresponse setuserbonus(WSDLObjectInt _userid, WSDLObjectInt _amount, WSDLObjectString _reason) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageSetuserbonusrequest.create(_userid, _amount, _reason).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageSetuserbonusresponse result = WSDLMessageSetuserbonusresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static boolean setuserbonus(int _userid, int _amount, string _reason) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageSetuserbonusrequest.create(WSDLObjectInt.create(_userid), WSDLObjectInt.create(_amount), WSDLObjectString.create(_reason)).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageSetuserbonusresponse result = WSDLMessageSetuserbonusresponse.createFromXML(xom.build(response, null));
		return result.field_return.value;
	}

	public static WSDLMessagePlayer_setuserbonusresponse player_setuserbonus(WSDLMessagePlayer_setuserbonusrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessagePlayer_setuserbonusresponse result = WSDLMessagePlayer_setuserbonusresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessagePlayer_setuserbonusresponse player_setuserbonus(WSDLObjectInt _userid, WSDLObjectInt _amount, WSDLObjectString _reason) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessagePlayer_setuserbonusrequest.create(_userid, _amount, _reason).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessagePlayer_setuserbonusresponse result = WSDLMessagePlayer_setuserbonusresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static boolean player_setuserbonus(int _userid, int _amount, string _reason) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessagePlayer_setuserbonusrequest.create(WSDLObjectInt.create(_userid), WSDLObjectInt.create(_amount), WSDLObjectString.create(_reason)).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessagePlayer_setuserbonusresponse result = WSDLMessagePlayer_setuserbonusresponse.createFromXML(xom.build(response, null));
		return result.field_return.value;
	}

	public static WSDLMessageGetcommunitybonusresponse getcommunitybonus(WSDLMessageGetcommunitybonusrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetcommunitybonusresponse result = WSDLMessageGetcommunitybonusresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetcommunitybonusresponse getcommunitybonus(WSDLObjectInt _communityid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetcommunitybonusrequest.create(_communityid).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetcommunitybonusresponse result = WSDLMessageGetcommunitybonusresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static int getcommunitybonus(int _communityid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetcommunitybonusrequest.create(WSDLObjectInt.create(_communityid)).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetcommunitybonusresponse result = WSDLMessageGetcommunitybonusresponse.createFromXML(xom.build(response, null));
		return result.field_return.value;
	}

	public static WSDLMessageGetuserbonusresponse getuserbonus(WSDLMessageGetuserbonusrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetuserbonusresponse result = WSDLMessageGetuserbonusresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetuserbonusresponse getuserbonus(WSDLObjectInt _userid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetuserbonusrequest.create(_userid).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetuserbonusresponse result = WSDLMessageGetuserbonusresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static int getuserbonus(int _userid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetuserbonusrequest.create(WSDLObjectInt.create(_userid)).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetuserbonusresponse result = WSDLMessageGetuserbonusresponse.createFromXML(xom.build(response, null));
		return result.field_return.value;
	}

	public static WSDLMessageGetuserpenaltyresponse getuserpenalty(WSDLMessageGetuserpenaltyrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetuserpenaltyresponse result = WSDLMessageGetuserpenaltyresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetuserpenaltyresponse getuserpenalty(WSDLObjectInt _userid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetuserpenaltyrequest.create(_userid).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetuserpenaltyresponse result = WSDLMessageGetuserpenaltyresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static int getuserpenalty(int _userid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetuserpenaltyrequest.create(WSDLObjectInt.create(_userid)).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetuserpenaltyresponse result = WSDLMessageGetuserpenaltyresponse.createFromXML(xom.build(response, null));
		return result.field_return.value;
	}

	public static WSDLMessageSetusertitleresponse setusertitle(WSDLMessageSetusertitlerequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageSetusertitleresponse result = WSDLMessageSetusertitleresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageSetusertitleresponse setusertitle(WSDLObjectInt _userid, WSDLObjectInt _titleid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageSetusertitlerequest.create(_userid, _titleid).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageSetusertitleresponse result = WSDLMessageSetusertitleresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static boolean setusertitle(int _userid, int _titleid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageSetusertitlerequest.create(WSDLObjectInt.create(_userid), WSDLObjectInt.create(_titleid)).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageSetusertitleresponse result = WSDLMessageSetusertitleresponse.createFromXML(xom.build(response, null));
		return result.field_return.value;
	}

	public static WSDLMessagePlayer_setusertitleresponse player_setusertitle(WSDLMessagePlayer_setusertitlerequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessagePlayer_setusertitleresponse result = WSDLMessagePlayer_setusertitleresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessagePlayer_setusertitleresponse player_setusertitle(WSDLObjectInt _userid, WSDLObjectInt _titleid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessagePlayer_setusertitlerequest.create(_userid, _titleid).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessagePlayer_setusertitleresponse result = WSDLMessagePlayer_setusertitleresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static boolean player_setusertitle(int _userid, int _titleid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessagePlayer_setusertitlerequest.create(WSDLObjectInt.create(_userid), WSDLObjectInt.create(_titleid)).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessagePlayer_setusertitleresponse result = WSDLMessagePlayer_setusertitleresponse.createFromXML(xom.build(response, null));
		return result.field_return.value;
	}

	public static WSDLMessageDeleteusertitleresponse deleteusertitle(WSDLMessageDeleteusertitlerequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageDeleteusertitleresponse result = WSDLMessageDeleteusertitleresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageDeleteusertitleresponse deleteusertitle(WSDLObjectInt _userid, WSDLObjectInt _titleid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageDeleteusertitlerequest.create(_userid, _titleid).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageDeleteusertitleresponse result = WSDLMessageDeleteusertitleresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static boolean deleteusertitle(int _userid, int _titleid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageDeleteusertitlerequest.create(WSDLObjectInt.create(_userid), WSDLObjectInt.create(_titleid)).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageDeleteusertitleresponse result = WSDLMessageDeleteusertitleresponse.createFromXML(xom.build(response, null));
		return result.field_return.value;
	}

	public static WSDLMessagePlayer_deleteusertitleresponse player_deleteusertitle(WSDLMessagePlayer_deleteusertitlerequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessagePlayer_deleteusertitleresponse result = WSDLMessagePlayer_deleteusertitleresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessagePlayer_deleteusertitleresponse player_deleteusertitle(WSDLObjectInt _userid, WSDLObjectInt _titleid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessagePlayer_deleteusertitlerequest.create(_userid, _titleid).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessagePlayer_deleteusertitleresponse result = WSDLMessagePlayer_deleteusertitleresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static boolean player_deleteusertitle(int _userid, int _titleid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessagePlayer_deleteusertitlerequest.create(WSDLObjectInt.create(_userid), WSDLObjectInt.create(_titleid)).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessagePlayer_deleteusertitleresponse result = WSDLMessagePlayer_deleteusertitleresponse.createFromXML(xom.build(response, null));
		return result.field_return.value;
	}

	public static WSDLMessageDeleteteamtitleresponse deleteteamtitle(WSDLMessageDeleteteamtitlerequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageDeleteteamtitleresponse result = WSDLMessageDeleteteamtitleresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageDeleteteamtitleresponse deleteteamtitle(WSDLObjectInt _communityid, WSDLObjectInt _titleid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageDeleteteamtitlerequest.create(_communityid, _titleid).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageDeleteteamtitleresponse result = WSDLMessageDeleteteamtitleresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static boolean deleteteamtitle(int _communityid, int _titleid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageDeleteteamtitlerequest.create(WSDLObjectInt.create(_communityid), WSDLObjectInt.create(_titleid)).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageDeleteteamtitleresponse result = WSDLMessageDeleteteamtitleresponse.createFromXML(xom.build(response, null));
		return result.field_return.value;
	}

	public static WSDLMessagePlayer_deleteteamtitleresponse player_deleteteamtitle(WSDLMessagePlayer_deleteteamtitlerequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessagePlayer_deleteteamtitleresponse result = WSDLMessagePlayer_deleteteamtitleresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessagePlayer_deleteteamtitleresponse player_deleteteamtitle(WSDLObjectInt _titleid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessagePlayer_deleteteamtitlerequest.create(_titleid).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessagePlayer_deleteteamtitleresponse result = WSDLMessagePlayer_deleteteamtitleresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static boolean player_deleteteamtitle(int _titleid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessagePlayer_deleteteamtitlerequest.create(WSDLObjectInt.create(_titleid)).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessagePlayer_deleteteamtitleresponse result = WSDLMessagePlayer_deleteteamtitleresponse.createFromXML(xom.build(response, null));
		return result.field_return.value;
	}

	public static WSDLMessageGetusertitleresponse getusertitle(WSDLMessageGetusertitlerequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetusertitleresponse result = WSDLMessageGetusertitleresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetusertitleresponse getusertitle(WSDLObjectInt _userid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetusertitlerequest.create(_userid).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetusertitleresponse result = WSDLMessageGetusertitleresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetusertitleresponse getusertitle(int _userid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetusertitlerequest.create(WSDLObjectInt.create(_userid)).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetusertitleresponse result = WSDLMessageGetusertitleresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessagePlayer_getusertitleresponse player_getusertitle(WSDLMessagePlayer_getusertitlerequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessagePlayer_getusertitleresponse result = WSDLMessagePlayer_getusertitleresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessagePlayer_getusertitleresponse player_getusertitle(WSDLObjectInt _userid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessagePlayer_getusertitlerequest.create(_userid).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessagePlayer_getusertitleresponse result = WSDLMessagePlayer_getusertitleresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessagePlayer_getusertitleresponse player_getusertitle(int _userid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessagePlayer_getusertitlerequest.create(WSDLObjectInt.create(_userid)).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessagePlayer_getusertitleresponse result = WSDLMessagePlayer_getusertitleresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageCancelserviceresponse cancelservice(WSDLMessageCancelservicerequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageCancelserviceresponse result = WSDLMessageCancelserviceresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageCancelserviceresponse cancelservice(WSDLObjectInt _userid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageCancelservicerequest.create(_userid).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageCancelserviceresponse result = WSDLMessageCancelserviceresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static boolean cancelservice(int _userid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageCancelservicerequest.create(WSDLObjectInt.create(_userid)).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageCancelserviceresponse result = WSDLMessageCancelserviceresponse.createFromXML(xom.build(response, null));
		return result.field_return.value;
	}

	public static WSDLMessageGetuserspublictransfersresponse getuserspublictransfers(WSDLMessageGetuserspublictransfersrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetuserspublictransfersresponse result = WSDLMessageGetuserspublictransfersresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetuserspublictransfersresponse getuserspublictransfers(WSDLObjectInt _userid, WSDLObjectInt _gameday) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetuserspublictransfersrequest.create(_userid, _gameday).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetuserspublictransfersresponse result = WSDLMessageGetuserspublictransfersresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetuserspublictransfersresponse getuserspublictransfers(int _userid, int _gameday) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetuserspublictransfersrequest.create(WSDLObjectInt.create(_userid), WSDLObjectInt.create(_gameday)).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetuserspublictransfersresponse result = WSDLMessageGetuserspublictransfersresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetusertransfersresponse getusertransfers(WSDLMessageGetusertransfersrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetusertransfersresponse result = WSDLMessageGetusertransfersresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetusertransfersresponse getusertransfers(WSDLObjectInt _userid, WSDLObjectInt _gameday) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetusertransfersrequest.create(_userid, _gameday).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetusertransfersresponse result = WSDLMessageGetusertransfersresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetusertransfersresponse getusertransfers(int _userid, int _gameday) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetusertransfersrequest.create(WSDLObjectInt.create(_userid), WSDLObjectInt.create(_gameday)).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetusertransfersresponse result = WSDLMessageGetusertransfersresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetplayersboughtresponse getplayersbought(WSDLMessageGetplayersboughtrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetplayersboughtresponse result = WSDLMessageGetplayersboughtresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetplayersboughtresponse getplayersbought(WSDLObjectInt _userid, WSDLObjectInt _gameday) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetplayersboughtrequest.create(_userid, _gameday).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetplayersboughtresponse result = WSDLMessageGetplayersboughtresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetplayersboughtresponse getplayersbought(int _userid, int _gameday) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetplayersboughtrequest.create(WSDLObjectInt.create(_userid), WSDLObjectInt.create(_gameday)).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetplayersboughtresponse result = WSDLMessageGetplayersboughtresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetplayerssoldresponse getplayerssold(WSDLMessageGetplayerssoldrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetplayerssoldresponse result = WSDLMessageGetplayerssoldresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetplayerssoldresponse getplayerssold(WSDLObjectInt _userid, WSDLObjectInt _gameday) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetplayerssoldrequest.create(_userid, _gameday).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetplayerssoldresponse result = WSDLMessageGetplayerssoldresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetplayerssoldresponse getplayerssold(int _userid, int _gameday) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetplayerssoldrequest.create(WSDLObjectInt.create(_userid), WSDLObjectInt.create(_gameday)).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetplayerssoldresponse result = WSDLMessageGetplayerssoldresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetuserscurrentlineupresponse getuserscurrentlineup(WSDLMessageGetuserscurrentlineuprequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetuserscurrentlineupresponse result = WSDLMessageGetuserscurrentlineupresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetuserscurrentlineupresponse getuserscurrentlineup(WSDLObjectInt _userid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetuserscurrentlineuprequest.create(_userid).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetuserscurrentlineupresponse result = WSDLMessageGetuserscurrentlineupresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetuserscurrentlineupresponse getuserscurrentlineup(int _userid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetuserscurrentlineuprequest.create(WSDLObjectInt.create(_userid)).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetuserscurrentlineupresponse result = WSDLMessageGetuserscurrentlineupresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetuserslineupbygamedayresponse getuserslineupbygameday(WSDLMessageGetuserslineupbygamedayrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetuserslineupbygamedayresponse result = WSDLMessageGetuserslineupbygamedayresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetuserslineupbygamedayresponse getuserslineupbygameday(WSDLObjectInt _userid, WSDLObjectInt _gameday) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetuserslineupbygamedayrequest.create(_userid, _gameday).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetuserslineupbygamedayresponse result = WSDLMessageGetuserslineupbygamedayresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetuserslineupbygamedayresponse getuserslineupbygameday(int _userid, int _gameday) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetuserslineupbygamedayrequest.create(WSDLObjectInt.create(_userid), WSDLObjectInt.create(_gameday)).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetuserslineupbygamedayresponse result = WSDLMessageGetuserslineupbygamedayresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetuserslineupbygamedayidresponse getuserslineupbygamedayid(WSDLMessageGetuserslineupbygamedayidrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetuserslineupbygamedayidresponse result = WSDLMessageGetuserslineupbygamedayidresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetuserslineupbygamedayidresponse getuserslineupbygamedayid(WSDLObjectInt _userid, WSDLObjectInt _gameday_id) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetuserslineupbygamedayidrequest.create(_userid, _gameday_id).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetuserslineupbygamedayidresponse result = WSDLMessageGetuserslineupbygamedayidresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetuserslineupbygamedayidresponse getuserslineupbygamedayid(int _userid, int _gameday_id) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetuserslineupbygamedayidrequest.create(WSDLObjectInt.create(_userid), WSDLObjectInt.create(_gameday_id)).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetuserslineupbygamedayidresponse result = WSDLMessageGetuserslineupbygamedayidresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetusersplayerbygamedayresponse getusersplayerbygameday(WSDLMessageGetusersplayerbygamedayrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetusersplayerbygamedayresponse result = WSDLMessageGetusersplayerbygamedayresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetusersplayerbygamedayresponse getusersplayerbygameday(WSDLObjectInt _userid, WSDLObjectInt _gameday) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetusersplayerbygamedayrequest.create(_userid, _gameday).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetusersplayerbygamedayresponse result = WSDLMessageGetusersplayerbygamedayresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetusersplayerbygamedayresponse getusersplayerbygameday(int _userid, int _gameday) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetusersplayerbygamedayrequest.create(WSDLObjectInt.create(_userid), WSDLObjectInt.create(_gameday)).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetusersplayerbygamedayresponse result = WSDLMessageGetusersplayerbygamedayresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetusersplayerbygamedayidresponse getusersplayerbygamedayid(WSDLMessageGetusersplayerbygamedayidrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetusersplayerbygamedayidresponse result = WSDLMessageGetusersplayerbygamedayidresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetusersplayerbygamedayidresponse getusersplayerbygamedayid(WSDLObjectInt _userid, WSDLObjectInt _gameday_id) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetusersplayerbygamedayidrequest.create(_userid, _gameday_id).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetusersplayerbygamedayidresponse result = WSDLMessageGetusersplayerbygamedayidresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetusersplayerbygamedayidresponse getusersplayerbygamedayid(int _userid, int _gameday_id) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetusersplayerbygamedayidrequest.create(WSDLObjectInt.create(_userid), WSDLObjectInt.create(_gameday_id)).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetusersplayerbygamedayidresponse result = WSDLMessageGetusersplayerbygamedayidresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetmultiusersplayerbygamedayresponse getmultiusersplayerbygameday(WSDLMessageGetmultiusersplayerbygamedayrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetmultiusersplayerbygamedayresponse result = WSDLMessageGetmultiusersplayerbygamedayresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetmultiusersplayerbygamedayresponse getmultiusersplayerbygameday(WSDLObjectArrayofuserid _arr_userid, WSDLObjectInt _gameday) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetmultiusersplayerbygamedayrequest.create(_arr_userid, _gameday).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetmultiusersplayerbygamedayresponse result = WSDLMessageGetmultiusersplayerbygamedayresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetmultiusersplayerbygamedayresponse getmultiusersplayerbygameday(WSDLObjectArrayofuserid _arr_userid, int _gameday) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetmultiusersplayerbygamedayrequest.create(_arr_userid, WSDLObjectInt.create(_gameday)).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetmultiusersplayerbygamedayresponse result = WSDLMessageGetmultiusersplayerbygamedayresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetmultiusersplayerbygamedayidresponse getmultiusersplayerbygamedayid(WSDLMessageGetmultiusersplayerbygamedayidrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetmultiusersplayerbygamedayidresponse result = WSDLMessageGetmultiusersplayerbygamedayidresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetmultiusersplayerbygamedayidresponse getmultiusersplayerbygamedayid(WSDLObjectArrayofuserid _arr_userid, WSDLObjectInt _gameday_id) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetmultiusersplayerbygamedayidrequest.create(_arr_userid, _gameday_id).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetmultiusersplayerbygamedayidresponse result = WSDLMessageGetmultiusersplayerbygamedayidresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetmultiusersplayerbygamedayidresponse getmultiusersplayerbygamedayid(WSDLObjectArrayofuserid _arr_userid, int _gameday_id) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetmultiusersplayerbygamedayidrequest.create(_arr_userid, WSDLObjectInt.create(_gameday_id)).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetmultiusersplayerbygamedayidresponse result = WSDLMessageGetmultiusersplayerbygamedayidresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetalluserscurrentlineupresponse getalluserscurrentlineup(WSDLMessageGetalluserscurrentlineuprequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetalluserscurrentlineupresponse result = WSDLMessageGetalluserscurrentlineupresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetalluserscurrentlineupresponse getalluserscurrentlineup(WSDLObjectInt _userid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetalluserscurrentlineuprequest.create(_userid).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetalluserscurrentlineupresponse result = WSDLMessageGetalluserscurrentlineupresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetalluserscurrentlineupresponse getalluserscurrentlineup(int _userid) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetalluserscurrentlineuprequest.create(WSDLObjectInt.create(_userid)).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetalluserscurrentlineupresponse result = WSDLMessageGetalluserscurrentlineupresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetalluserslineupbygamedayresponse getalluserslineupbygameday(WSDLMessageGetalluserslineupbygamedayrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetalluserslineupbygamedayresponse result = WSDLMessageGetalluserslineupbygamedayresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetalluserslineupbygamedayresponse getalluserslineupbygameday(WSDLObjectInt _userid, WSDLObjectInt _gameday) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetalluserslineupbygamedayrequest.create(_userid, _gameday).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetalluserslineupbygamedayresponse result = WSDLMessageGetalluserslineupbygamedayresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetalluserslineupbygamedayresponse getalluserslineupbygameday(int _userid, int _gameday) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetalluserslineupbygamedayrequest.create(WSDLObjectInt.create(_userid), WSDLObjectInt.create(_gameday)).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetalluserslineupbygamedayresponse result = WSDLMessageGetalluserslineupbygamedayresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetplayergamedaypointsresponse getplayergamedaypoints(WSDLMessageGetplayergamedaypointsrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetplayergamedaypointsresponse result = WSDLMessageGetplayergamedaypointsresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetplayergamedaypointsresponse getplayergamedaypoints(WSDLObjectInt _playerid, WSDLObjectInt _gameday) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetplayergamedaypointsrequest.create(_playerid, _gameday).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetplayergamedaypointsresponse result = WSDLMessageGetplayergamedaypointsresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static int getplayergamedaypoints(int _playerid, int _gameday) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetplayergamedaypointsrequest.create(WSDLObjectInt.create(_playerid), WSDLObjectInt.create(_gameday)).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetplayergamedaypointsresponse result = WSDLMessageGetplayergamedaypointsresponse.createFromXML(xom.build(response, null));
		return result.field_return.value;
	}

	public static WSDLMessageGetplayergamedaystatisticsresponse getplayergamedaystatistics(WSDLMessageGetplayergamedaystatisticsrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetplayergamedaystatisticsresponse result = WSDLMessageGetplayergamedaystatisticsresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetplayergamedaystatisticsresponse getplayergamedaystatistics(WSDLObjectInt _playerid, WSDLObjectInt _gameday) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetplayergamedaystatisticsrequest.create(_playerid, _gameday).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetplayergamedaystatisticsresponse result = WSDLMessageGetplayergamedaystatisticsresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetplayergamedaystatisticsresponse getplayergamedaystatistics(int _playerid, int _gameday) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetplayergamedaystatisticsrequest.create(WSDLObjectInt.create(_playerid), WSDLObjectInt.create(_gameday)).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetplayergamedaystatisticsresponse result = WSDLMessageGetplayergamedaystatisticsresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetplayergamedaystatisticsidresponse getplayergamedaystatisticsid(WSDLMessageGetplayergamedaystatisticsidrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetplayergamedaystatisticsidresponse result = WSDLMessageGetplayergamedaystatisticsidresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetplayergamedaystatisticsidresponse getplayergamedaystatisticsid(WSDLObjectInt _playerid, WSDLObjectInt _gameday_id) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetplayergamedaystatisticsidrequest.create(_playerid, _gameday_id).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetplayergamedaystatisticsidresponse result = WSDLMessageGetplayergamedaystatisticsidresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetplayergamedaystatisticsidresponse getplayergamedaystatisticsid(int _playerid, int _gameday_id) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetplayergamedaystatisticsidrequest.create(WSDLObjectInt.create(_playerid), WSDLObjectInt.create(_gameday_id)).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetplayergamedaystatisticsidresponse result = WSDLMessageGetplayergamedaystatisticsidresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetquoteresponse getquote(WSDLMessageGetquoterequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetquoteresponse result = WSDLMessageGetquoteresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetquoteresponse getquote(WSDLObjectInt _playerid, WSDLObjectString _date) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetquoterequest.create(_playerid, _date).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetquoteresponse result = WSDLMessageGetquoteresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static int getquote(int _playerid, string _date) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetquoterequest.create(WSDLObjectInt.create(_playerid), WSDLObjectString.create(_date)).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetquoteresponse result = WSDLMessageGetquoteresponse.createFromXML(xom.build(response, null));
		return result.field_return.value;
	}

	public static WSDLMessageGetuseridsbyplayerresponse getuseridsbyplayer(WSDLMessageGetuseridsbyplayerrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetuseridsbyplayerresponse result = WSDLMessageGetuseridsbyplayerresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetuseridsbyplayerresponse getuseridsbyplayer(WSDLObjectInt _player) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetuseridsbyplayerrequest.create(_player).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetuseridsbyplayerresponse result = WSDLMessageGetuseridsbyplayerresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetuseridsbyplayerresponse getuseridsbyplayer(int _player) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetuseridsbyplayerrequest.create(WSDLObjectInt.create(_player)).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetuseridsbyplayerresponse result = WSDLMessageGetuseridsbyplayerresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetwatchlistsbyplayerresponse getwatchlistsbyplayer(WSDLMessageGetwatchlistsbyplayerrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetwatchlistsbyplayerresponse result = WSDLMessageGetwatchlistsbyplayerresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetwatchlistsbyplayerresponse getwatchlistsbyplayer(WSDLObjectInt _player) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetwatchlistsbyplayerrequest.create(_player).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetwatchlistsbyplayerresponse result = WSDLMessageGetwatchlistsbyplayerresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetwatchlistsbyplayerresponse getwatchlistsbyplayer(int _player) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetwatchlistsbyplayerrequest.create(WSDLObjectInt.create(_player)).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetwatchlistsbyplayerresponse result = WSDLMessageGetwatchlistsbyplayerresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetbestlineupbygamedayresponse getbestlineupbygameday(WSDLMessageGetbestlineupbygamedayrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetbestlineupbygamedayresponse result = WSDLMessageGetbestlineupbygamedayresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetbestlineupbygamedayresponse getbestlineupbygameday(WSDLObjectInt _gameday) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetbestlineupbygamedayrequest.create(_gameday).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetbestlineupbygamedayresponse result = WSDLMessageGetbestlineupbygamedayresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetbestlineupbygamedayresponse getbestlineupbygameday(int _gameday) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = WSDLMessageGetbestlineupbygamedayrequest.create(WSDLObjectInt.create(_gameday)).serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetbestlineupbygamedayresponse result = WSDLMessageGetbestlineupbygamedayresponse.createFromXML(xom.build(response, null));
		return result;
	}

}
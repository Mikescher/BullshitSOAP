package de.samdev.bullshitsoap.comunioWebService;

import java.io.IOException;
import java.net.URL;
import de.samdev.bullshitsoap.comunioWebService.messages.*;
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

	public static WSDLMessageCheckmultipermissionsresponse checkmultiPermissions(WSDLMessageCheckmultipermissionsrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
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

	public static WSDLMessageGetsoapservicereleaseresponse getsoapservicerelease(WSDLMessageGetsoapservicereleaserequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
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

	public static WSDLMessageGetloginresponse getlogin(WSDLMessageGetloginrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetloginresponse result = WSDLMessageGetloginresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetuserinformationresponse getUserInformation(WSDLMessageGetuserinformationrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
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

	public static WSDLMessageGetusersnameresponse getusersname(WSDLMessageGetusersnamerequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetusersnameresponse result = WSDLMessageGetusersnameresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetuserspointsresponse getuserspoints(WSDLMessageGetuserspointsrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetuserspointsresponse result = WSDLMessageGetuserspointsresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetmultiuserspointsresponse getmultiuserspoints(WSDLMessageGetmultiuserspointsrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
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

	public static WSDLMessageGetmultiusersgamdaybudgetstateresponse getmultiusersgamdaybudgetstate(WSDLMessageGetmultiusersgamdaybudgetstaterequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
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

	public static WSDLMessageGetteamvalueresponse getteamvalue(WSDLMessageGetteamvaluerequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetteamvalueresponse result = WSDLMessageGetteamvalueresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetteamsizeresponse getteamsize(WSDLMessageGetteamsizerequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetteamsizeresponse result = WSDLMessageGetteamsizeresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetcommunityidresponse getcommunityid(WSDLMessageGetcommunityidrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetcommunityidresponse result = WSDLMessageGetcommunityidresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetcommunitynameresponse getcommunityname(WSDLMessageGetcommunitynamerequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetcommunitynameresponse result = WSDLMessageGetcommunitynameresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetcommunitynamebyuseridresponse getcommunitynamebyuserid(WSDLMessageGetcommunitynamebyuseridrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetcommunitynamebyuseridresponse result = WSDLMessageGetcommunitynamebyuseridresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetuserloginsresponse getuserlogins(WSDLMessageGetuserloginsrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
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

	public static WSDLMessageGetgamedaysresponse getgamedays(WSDLMessageGetgamedaysrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
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

	public static WSDLMessageGetcommunitymarketresponse getcommunitymarket(WSDLMessageGetcommunitymarketrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
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

	public static WSDLMessageGetplayerbyidresponse getplayerbyid(WSDLMessageGetplayerbyidrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
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

	public static WSDLMessageGetusergamedaypointsidresponse getusergamedaypointsid(WSDLMessageGetusergamedaypointsidrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetusergamedaypointsidresponse result = WSDLMessageGetusergamedaypointsidresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetmultiusergamedaypointsresponse getmultiusergamedaypoints(WSDLMessageGetmultiusergamedaypointsrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
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

	public static WSDLMessageGetlatestgamedayresponse getlatestgameday(WSDLMessageGetlatestgamedayrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
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

	public static WSDLMessageGetcomputernewsresponse getcomputernews(WSDLMessageGetcomputernewsrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
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

	public static WSDLMessageGetclubsresponse getclubs(WSDLMessageGetclubsrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
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

	public static WSDLMessageGetplayersbyclubidinclretiredresponse getplayersbyclubidinclretired(WSDLMessageGetplayersbyclubidinclretiredrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
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

	public static WSDLMessageGetplayerbysportaldeidresponse getplayerbysportaldeid(WSDLMessageGetplayerbysportaldeidrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetplayerbysportaldeidresponse result = WSDLMessageGetplayerbysportaldeidresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetplayersspoxidresponse getplayersspoxid(WSDLMessageGetplayersspoxidrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetplayersspoxidresponse result = WSDLMessageGetplayersspoxidresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetplayerbyspoxidresponse getplayerbyspoxid(WSDLMessageGetplayerbyspoxidrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetplayerbyspoxidresponse result = WSDLMessageGetplayerbyspoxidresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetplayersbyuseridresponse getplayersbyuserid(WSDLMessageGetplayersbyuseridrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
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

	public static WSDLMessageGetpartnerrankingresponse getpartnerranking(WSDLMessageGetpartnerrankingrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
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

	public static WSDLMessageGetservicerankingresponse getserviceranking(WSDLMessageGetservicerankingrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
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

	public static WSDLMessageGetserviceexpirationdateresponse getserviceexpirationdate(WSDLMessageGetserviceexpirationdaterequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetserviceexpirationdateresponse result = WSDLMessageGetserviceexpirationdateresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetregisteredusersresponse getregisteredusers(WSDLMessageGetregisteredusersrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
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

	public static WSDLMessagePlayer_postcommunitynewsresponse player_postcommunitynews(WSDLMessagePlayer_postcommunitynewsrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessagePlayer_postcommunitynewsresponse result = WSDLMessagePlayer_postcommunitynewsresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessagePostusernewsresponse postusernews(WSDLMessagePostusernewsrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessagePostusernewsresponse result = WSDLMessagePostusernewsresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessagePlayer_postusernewsresponse player_postusernews(WSDLMessagePlayer_postusernewsrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessagePlayer_postusernewsresponse result = WSDLMessagePlayer_postusernewsresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessagePostmultiusernewsresponse postmultiusernews(WSDLMessagePostmultiusernewsrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessagePostmultiusernewsresponse result = WSDLMessagePostmultiusernewsresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessagePlayer_postmultiusernewsresponse player_postmultiusernews(WSDLMessagePlayer_postmultiusernewsrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessagePlayer_postmultiusernewsresponse result = WSDLMessagePlayer_postmultiusernewsresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessagePostadminnewsresponse postadminnews(WSDLMessagePostadminnewsrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessagePostadminnewsresponse result = WSDLMessagePostadminnewsresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetcurrentbudgetresponse getcurrentbudget(WSDLMessageGetcurrentbudgetrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetcurrentbudgetresponse result = WSDLMessageGetcurrentbudgetresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageSetuserbonusresponse setuserbonus(WSDLMessageSetuserbonusrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageSetuserbonusresponse result = WSDLMessageSetuserbonusresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessagePlayer_setuserbonusresponse player_setuserbonus(WSDLMessagePlayer_setuserbonusrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessagePlayer_setuserbonusresponse result = WSDLMessagePlayer_setuserbonusresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetcommunitybonusresponse getcommunitybonus(WSDLMessageGetcommunitybonusrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetcommunitybonusresponse result = WSDLMessageGetcommunitybonusresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetuserbonusresponse getuserbonus(WSDLMessageGetuserbonusrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetuserbonusresponse result = WSDLMessageGetuserbonusresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetuserpenaltyresponse getuserpenalty(WSDLMessageGetuserpenaltyrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetuserpenaltyresponse result = WSDLMessageGetuserpenaltyresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageSetusertitleresponse setusertitle(WSDLMessageSetusertitlerequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageSetusertitleresponse result = WSDLMessageSetusertitleresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessagePlayer_setusertitleresponse player_setusertitle(WSDLMessagePlayer_setusertitlerequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessagePlayer_setusertitleresponse result = WSDLMessagePlayer_setusertitleresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageDeleteusertitleresponse deleteusertitle(WSDLMessageDeleteusertitlerequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageDeleteusertitleresponse result = WSDLMessageDeleteusertitleresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessagePlayer_deleteusertitleresponse player_deleteusertitle(WSDLMessagePlayer_deleteusertitlerequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessagePlayer_deleteusertitleresponse result = WSDLMessagePlayer_deleteusertitleresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageDeleteteamtitleresponse deleteteamtitle(WSDLMessageDeleteteamtitlerequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageDeleteteamtitleresponse result = WSDLMessageDeleteteamtitleresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessagePlayer_deleteteamtitleresponse player_deleteteamtitle(WSDLMessagePlayer_deleteteamtitlerequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessagePlayer_deleteteamtitleresponse result = WSDLMessagePlayer_deleteteamtitleresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetusertitleresponse getusertitle(WSDLMessageGetusertitlerequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
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

	public static WSDLMessageCancelserviceresponse cancelservice(WSDLMessageCancelservicerequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageCancelserviceresponse result = WSDLMessageCancelserviceresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetuserspublictransfersresponse getuserspublictransfers(WSDLMessageGetuserspublictransfersrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
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

	public static WSDLMessageGetplayersboughtresponse getplayersbought(WSDLMessageGetplayersboughtrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
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

	public static WSDLMessageGetuserscurrentlineupresponse getuserscurrentlineup(WSDLMessageGetuserscurrentlineuprequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
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

	public static WSDLMessageGetuserslineupbygamedayidresponse getuserslineupbygamedayid(WSDLMessageGetuserslineupbygamedayidrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
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

	public static WSDLMessageGetusersplayerbygamedayidresponse getusersplayerbygamedayid(WSDLMessageGetusersplayerbygamedayidrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
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

	public static WSDLMessageGetmultiusersplayerbygamedayidresponse getmultiusersplayerbygamedayid(WSDLMessageGetmultiusersplayerbygamedayidrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
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

	public static WSDLMessageGetalluserslineupbygamedayresponse getalluserslineupbygameday(WSDLMessageGetalluserslineupbygamedayrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
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

	public static WSDLMessageGetplayergamedaystatisticsresponse getplayergamedaystatistics(WSDLMessageGetplayergamedaystatisticsrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
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

	public static WSDLMessageGetquoteresponse getquote(WSDLMessageGetquoterequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetquoteresponse result = WSDLMessageGetquoteresponse.createFromXML(xom.build(response, null));
		return result;
	}

	public static WSDLMessageGetuseridsbyplayerresponse getuseridsbyplayer(WSDLMessageGetuseridsbyplayerrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
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

	public static WSDLMessageGetbestlineupbygamedayresponse getbestlineupbygameday(WSDLMessageGetbestlineupbygamedayrequest input) throws IOException, ValidityException, ParsingException {
		Builder xom = new Builder();
		String request = input.serialize().toXML();
		String response = invoker.getReponse(request);
		WSDLMessageGetbestlineupbygamedayresponse result = WSDLMessageGetbestlineupbygamedayresponse.createFromXML(xom.build(response, null));
		return result;
	}

}
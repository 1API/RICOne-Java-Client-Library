package cases;

import riconeapi.authentication.Authenticator;
import riconeapi.common.XPress;
import riconeapi.common.objects.ServicePath;
import riconeapi.common.rest.AUPPEnum;
import riconeapi.common.rest.MediaTypeEnum;
import riconeapi.exceptions.AuthenticationException;
import riconeapi.authentication.Endpoint;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;

/*
 * @author      Andrew Pieniezny <andrew.pieniezny@neric.org>
 * @version     x.x.x
 * @since       Jan 9, 2017
 */
public class JsonXmlReturn
{
	final static String authUrl = "https://auth.test.ricone.org/login";
	final static String clientId = "dpaDemo";
	final static String clientSecret = "deecd889bff5ed0101a86680752f5f9";
	final static String providerId = "localhost";
	
	public static void main(String[] args) throws AuthenticationException, ParseException {
        String stringResponse;
	    ServicePath servicePath = ServicePath.GETXLEAS;
        ServicePath leaIdservicePath = ServicePath.GETXLEABYID;
	    ServicePath studentsServicePath = ServicePath.GETXROSTERS;
        ServicePath rostersServicePath = ServicePath.GETXROSTERSBYXLEA;
	    ServicePath auppServicePath = ServicePath.GETXSTAFFSBYXSCHOOL;
        String refId = "03ACF04F-DC12-411A-9A42-E8323516D699";
        String schoolRefId = "AE6B3441-5E31-4573-BADB-081669D79C7F";
        String idType = "beds";
        String id = "520101060000";
        int navigationPage = 1;
        int navigationPageSize = 25;
        int schoolYear = 2018;
        AUPPEnum auppEnum = AUPPEnum.GET;
	    MediaTypeEnum mediaType = MediaTypeEnum.JSON;
//        MediaTypeEnum mediaType = MediaTypeEnum.XML;

        String myDate = "2016-02-07 10:28:24";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date opaqueMarker = sdf.parse(myDate);

	    Authenticator auth = Authenticator.getInstance();
		auth.authenticate(authUrl, clientId, clientSecret);
		
		Optional<Endpoint> e = auth.getEndpoints(providerId);
        XPress xPress = new XPress(e.get());

            stringResponse = xPress.getJsonXml(servicePath, mediaType);
//            stringResponse = xPress.getJsonXml(servicePath, schoolYear, mediaType);
//            stringResponse = xPress.getJsonXml(studentsServicePath, navigationPage, navigationPageSize, mediaType);
//            stringResponse = xPress.getJsonXml(servicePath, navigationPage, navigationPageSize, schoolYear, mediaType);
//            stringResponse = xPress.getJsonXml(rostersServicePath, refId, mediaType);
//            stringResponse = xPress.getJsonXml(rostersServicePath, refId, schoolYear, mediaType);
//            stringResponse = xPress.getJsonXml(rostersServicePath, refId, navigationPage, navigationPageSize, mediaType);
//            stringResponse = xPress.getJsonXml(servicePath, refId, navigationPage, navigationPageSize, schoolYear, mediaType);
//            stringResponse = xPress.getJsonXml(leaIdservicePath, idType, id, mediaType);
//            stringResponse = xPress.getJsonXml(leaIdservicePath, idType, id, schoolYear, mediaType);
//            stringResponse = xPress.getJsonXml(servicePath, opaqueMarker, mediaType);
//            stringResponse = xPress.getJsonXml(servicePath, navigationPage, navigationPageSize, opaqueMarker, mediaType);
//            stringResponse = xPress.getJsonXml(auppServicePath, schoolRefId, auppEnum, mediaType);
//            stringResponse = xPress.getJsonXml(auppServicePath, schoolRefId, navigationPage, navigationPageSize, auppEnum, mediaType);

            System.out.println(stringResponse);

    }

}

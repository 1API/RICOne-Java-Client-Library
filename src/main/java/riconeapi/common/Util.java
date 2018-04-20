package riconeapi.common;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.sql.Timestamp;
import java.util.Date;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.X509TrustManager;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;
import org.springframework.http.HttpStatus;

/**
 * @author      Andrew Pieniezny <andrew.pieniezny@neric.org>
 * @version     1.5
 * @since       Dec 22, 2016
 */
public class Util
{
	/**
	 * Convert a Date value to an ISO8601 date/timestamp String value
	 * @param date
	 * @return An ISO8601 String date/timestamp
	 */
	public static String TimestampToISO8601(Date date)
	{				
		DateTime dt = new DateTime(date);
		DateTimeFormatter fmt = ISODateTimeFormat.dateTime();
		String str = fmt.print(dt);
		return str;
	}
	
	/**
	 * Response handler to return HTTP Status Codes if an error with a request
	 * occurs
	 * 
	 * @param response
	 */
	public static void ResponseHandler(HttpStatus response)
	{
		HttpStatus httpStatusCode = response;

		if (httpStatusCode == HttpStatus.OK || httpStatusCode == HttpStatus.NOT_FOUND)
		{
			// System.out.println(httpStatusCode);
		}
		else
		{
			System.out.println("HttpCode: " + httpStatusCode.toString());
		}
	}
	 
	protected static void disableSslVerification()
	{
		try
		{
			// Create a trust manager that does not validate certificate chains
			X509TrustManager[] trustAllCerts = new X509TrustManager[] { new X509TrustManager()
			{
				public X509Certificate[] getAcceptedIssuers()
				{
					return null;
				}

				public void checkClientTrusted(X509Certificate[] certs, String authType)
				{
				}

				public void checkServerTrusted(X509Certificate[] certs, String authType)
				{
				}
			} };

			// Install the all-trusting trust manager
			SSLContext sc = SSLContext.getInstance("SSL");
			sc.init(null, trustAllCerts, new java.security.SecureRandom());
			HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());

			// Create all-trusting host name verifier
			HostnameVerifier allHostsValid = new HostnameVerifier()
			{
				public boolean verify(String hostname, SSLSession session)
				{
					return true;
				}
			};

			// Install the all-trusting host verifier
			HttpsURLConnection.setDefaultHostnameVerifier(allHostsValid);
		}
		catch (NoSuchAlgorithmException e)
		{
			e.printStackTrace();
		}
		catch (KeyManagementException e)
		{
			e.printStackTrace();
		}
	}
}

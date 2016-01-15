package riconeapi.common;

/**
 * @author      Andrew Pieniezny <andrew.pieniezny@neric.org>
 * @version     1.0
 * @since       Jul 7, 2015
 * Filename		Util.java
 */
import org.springframework.http.HttpStatus;


public class Util
{
	/**
	 * Response handler to return HTTP Status Codes if an error with a request occurs
	 * @param response
	 */
	 public static void ResponseHandler(HttpStatus response)
     {
         HttpStatus httpStatusCode = response;

         if (httpStatusCode == HttpStatus.OK ||
            httpStatusCode == HttpStatus.CREATED ||
            httpStatusCode == HttpStatus.NO_CONTENT)
         {
//             System.out.println(httpStatusCode);
             return;
         }
         else
         {
        	 System.out.println("HttpError: " + httpStatusCode.toString());
         }
     }
}

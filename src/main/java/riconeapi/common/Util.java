/**
 * @author      Andrew Pieniezny <andrew.pieniezny@neric.org>
 * @version     1.0
 * @since       Jul 7, 2015
 * Filename		Util.java
 */

package riconeapi.common;

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

         if (httpStatusCode == HttpStatus.OK)
         {
//             System.out.println(httpStatusCode);
         }
         else
         {
        	 System.out.println("HttpCode: " + httpStatusCode.toString());
         }
     }
}

import org.springframework.http.HttpStatus;


public class Util
{
	 public static void ResponseHandler(HttpStatus response)
     {
         HttpStatus httpStatusCode = response;

         if (httpStatusCode == HttpStatus.OK ||
            httpStatusCode == HttpStatus.CREATED ||
            httpStatusCode == HttpStatus.NO_CONTENT)
         {
             System.out.println(httpStatusCode);
             return;
         }
         else
         {
        	 System.out.println("HttpError: " + httpStatusCode.toString());
         }
     }
}

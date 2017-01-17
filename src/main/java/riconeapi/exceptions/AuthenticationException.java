/**
 * @author      Andrew Pieniezny <andrew.pieniezny@neric.org>
 * @version     1.5
 * @since       Jan 13, 2017
 * @filename	AuthenticationException.java
 */
package riconeapi.exceptions;

public class AuthenticationException extends Exception
{	
	private static final long serialVersionUID = 1L;

	public AuthenticationException()
	{}
	
	public AuthenticationException(String message)
	{
		super(message);
	}
	
	public AuthenticationException(String message, Throwable cause)
	{
		super(message, cause);
	} 
	
	public AuthenticationException(Throwable cause)
	{
		super(cause);
	} 
	
	public AuthenticationException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace)
	{
		super(message, cause, enableSuppression, writableStackTrace);
	}
}

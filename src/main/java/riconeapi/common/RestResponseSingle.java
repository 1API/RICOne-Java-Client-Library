/**
 * @author      Andrew Pieniezny <andrew.pieniezny@neric.org>
 * @version     1.2
 * @since       Apr 28, 2016
 * @filename	RestResponseSingle.java
 */
package riconeapi.common;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;

public class RestResponseSingle<T>
{
	private T data;
	private HttpStatus statusCode;
	private HttpHeaders headers;
	private String message;
	
	/**
	 * @return the data from the service path
	 */
	public T getData()
	{
		return data;
	}
	/**
	 * @param data the data to set
	 */
	public void setData(T data)
	{
		this.data = data;
	}
	/**
	 * @return the statusCode of the response
	 */
	public HttpStatus getStatusCode()
	{
		return statusCode;
	}
	/**
	 * @param statusCode the statusCode to set
	 */
	public void setStatusCode(HttpStatus statusCode)
	{
		this.statusCode = statusCode;
	}
	/**
	 * @return the headers of the response
	 */
	public HttpHeaders getHeaders()
	{
		return headers;
	}
	/**
	 * @param headers the headers to set
	 */
	public void setHeaders(HttpHeaders headers)
	{
		this.headers = headers;
	}
	/**
	 * @return the error message of the response
	 */
	public String getMessage()
	{
		return message;
	}
	/**
	 * @param message the message to set
	 */
	public void setMessage(String message)
	{
		this.message = message;
	}
}

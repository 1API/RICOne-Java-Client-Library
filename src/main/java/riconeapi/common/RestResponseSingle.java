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
	
	public T getData()
	{
		return data;
	}
	public void setData(T data)
	{
		this.data = data;
	}
	public HttpStatus getStatusCode()
	{
		return statusCode;
	}
	public void setStatusCode(HttpStatus statusCode)
	{
		this.statusCode = statusCode;
	}
	public HttpHeaders getHeaders()
	{
		return headers;
	}
	public void setHeaders(HttpHeaders headers)
	{
		this.headers = headers;
	}
	public String getMessage()
	{
		return message;
	}
	public void setMessage(String message)
	{
		this.message = message;
	}
	
}

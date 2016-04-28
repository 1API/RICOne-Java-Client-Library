/**
 * @author      Andrew Pieniezny <andrew.pieniezny@neric.org>
 * @version     1.2
 * @since       Apr 27, 2016
 * @filename	RestResponseMulti.java
 */
package riconeapi.common;

import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;

public class RestResponseMulti<T>
{	
	private List<T> data;
	private HttpStatus statusCode;
	private HttpHeaders headers;
	
	public List<T> getData()
	{	
		return data;
	}
	public void setData(List<T> list)
	{
		this.data = list;
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
}

/**
 * @author      Andrew Pieniezny <andrew.pieniezny@neric.org>
 * @version     x.x.x
 * @since       Apr 27, 2016
 * @filename	XStudnetResponse.java
 */
package riconeapi.common;

import java.util.List;

import org.springframework.http.HttpStatus;

import riconeapi.models.sifxpress.BaseXObject;
import riconeapi.models.sifxpress.XStudentType;

public class RestResponse
{	

	private BaseXObject[] data;
	private HttpStatus status;
	
	public BaseXObject[] getData()
	{	
		return data;
	}
	public void setData(BaseXObject[] list)
	{
		this.data = list;
	}
	public HttpStatus getStatus()
	{
		return status;
	}
	public void setStatus(HttpStatus status)
	{
		this.status = status;
	}
}

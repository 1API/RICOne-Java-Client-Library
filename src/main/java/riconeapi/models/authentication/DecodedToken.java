/**
 * @author      Andrew Pieniezny <andrew.pieniezny@neric.org>
 * @version     1.2.1.1
 * @since       May 17, 2016
 * @filename	DecodedToken.java
 */
package riconeapi.models.authentication;

import java.util.Date;

public class DecodedToken
{
	private String application_id;
	private Date iat;
	private Date exp;
	private String iss;

	public String getApplication_id()
	{
		return application_id;
	}
	public void setApplication_id(String application_id)
	{
		this.application_id = application_id;
	}
	public Date getIat()
	{
		return iat;
	}
	public void setIat(long iat)
	{
		Date dt = new Date(Long.parseLong(iat + "000"));
		this.iat = dt;
	}
	public Date getExp()
	{
		return exp;
	}
	public void setExp(long exp)
	{
		Date dt = new Date(Long.parseLong(exp + "000"));
		this.exp = dt;
	}
	public String getIss()
	{
		return iss;
	}
	public void setIss(String iss)
	{
		this.iss = iss;
	}	

}

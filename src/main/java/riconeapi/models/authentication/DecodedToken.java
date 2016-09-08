/**
 * @author      Andrew Pieniezny <andrew.pieniezny@neric.org>
 * @version     1.4
 * @since       Aug 30, 2016
 * @filename	DecodedToken.java
 */
package riconeapi.models.authentication;

import com.auth0.jwt.internal.org.apache.commons.codec.binary.Base64;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DecodedToken
{
	private String application_id;
	private long iat;
	private long exp;
	private String iss;
	private String token;
	
	public DecodedToken()
	{}
	
	public DecodedToken(String token)
	{
		this.token = token;
	}
	
	/**
     * 
     * @param token
     * @return Payload data inside an encrypted JWT token
     */
    public DecodedToken getDecodedToken()
	{
		try
		{		
			ObjectMapper map = new ObjectMapper();
			String[] base64EncodedSegments = token.split("\\.");
			DecodedToken dt = map.readValue(base64UrlDecode(base64EncodedSegments[1]), DecodedToken.class);
			return dt;	
		}
		catch(Exception e)
		{
			return null;
		}			
	}

	protected String base64UrlDecode(String input)
	{
		String result = null;
		Base64 decoder = new Base64(true);
		byte[] decodedBytes = decoder.decode(input);
		result = new String(decodedBytes);
		return result;
	}
	
	public String getApplication_id()
	{
		return application_id;
	}
	
	public long getIat()
	{
		return iat;
	}

	public long getExp()
	{
		return exp;
	}
	
	public String getIss()
	{
		return iss;
	}
}

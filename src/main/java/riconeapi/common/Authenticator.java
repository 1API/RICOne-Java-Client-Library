/**
 * @author      Andrew Pieniezny <andrew.pieniezny@neric.org>
 * @version     1.3.1
 * @since       Jul 20, 2016
 * @filename	Authenticator2.java
 */
package riconeapi.common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.joda.time.DateTime;
import org.springframework.web.client.RestTemplate;

import com.auth0.jwt.internal.org.apache.commons.codec.binary.Base64;
import com.fasterxml.jackson.databind.ObjectMapper;

import riconeapi.models.authentication.DecodedToken;
import riconeapi.models.authentication.Endpoint;
import riconeapi.models.authentication.UserInfo;

public class Authenticator
{
	private static Authenticator instance = null;
	private static UserInfo user = null;
	private static String authUrl;
	private static String clientId;
	private static String clientSecret;

	private Authenticator() 
    {}
	
	public static Authenticator getInstance()
	{
		if (instance == null)
		{
			instance = new Authenticator();
		}
		return instance;
	}
	
	/**
	 * Establish connection to authenticate to authentication server
	 * @param authUrl
	 * @param clientId
	 * @param clientSecret
	 */
    public Authenticator(String authUrl, String clientId, String clientSecret)
    {    
    	Authenticator.authUrl = authUrl;
    	Authenticator.clientId = clientId;
    	Authenticator.clientSecret = clientSecret;
    	login(authUrl, clientId, clientSecret);
    }
    
    /**
     * Post to authentication server with provided credentials
     * @param authUrl
     * @param clientId
     * @param clientSecret
     */
    public void login(String authUrl, String clientId, String clientSecret)
    {
    	RestTemplate rt = new RestTemplate();

    	Map<String, String> vars = new HashMap<String, String>();
        vars.put("username", clientId);
        vars.put("password", clientSecret);

        Authenticator.user = rt.postForObject(authUrl, vars, UserInfo.class);    
    }
    
    /**
     * Re-authenticates with authentication server if token is expired
     * @param token
     */
	public void refreshToken(String token)
	{
		DateTime dt = new DateTime(getDecodedToken(token).getExp() * 1000);
		System.out.println(dt);
		if(dt.isBeforeNow())
		{
			Authenticator.getInstance().login(authUrl, clientId, clientSecret);
		}
	}
    
    /**
     * 
     * @return Token value
     */
    public String getToken()
    {
    	return user.getToken();

    }
    
    /**
	 * @param providerId
	 * @return Endpoint by specified providerId 
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public List<Endpoint> getEndpoints(String providerId)
    {
		List<Endpoint> endpoints = new ArrayList();
        
        for(Endpoint e : user.getEndpoint())
        {
        	if(e.getProviderId().equals(providerId))
        	{
        		endpoints.add(e);
        	}
        }
            
        return endpoints;
    }

    /**
     * @return All endpoints
     */
    public List<Endpoint> getEndpoints()
    {      
        return user.getEndpoint();
    }
    
    /**
     * 
     * @param token
     * @return Payload data inside an encrypted JWT token
     */
    public static DecodedToken getDecodedToken(String token)
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

	public static String base64UrlDecode(String input)
	{
		String result = null;
		Base64 decoder = new Base64(true);
		byte[] decodedBytes = decoder.decode(input);
		result = new String(decodedBytes);
		return result;
	}
}

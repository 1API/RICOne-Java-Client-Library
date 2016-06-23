/**
 * @author      Andrew Pieniezny <andrew.pieniezny@neric.org>
 * @version     1.3
 * @since       Jun 23, 2016
 * Filename		Authenticator.java
 */

package riconeapi.common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.client.RestTemplate;

import com.auth0.jwt.internal.com.fasterxml.jackson.databind.ObjectMapper;
import com.auth0.jwt.internal.org.apache.commons.codec.binary.Base64;

import riconeapi.models.authentication.DecodedToken;
import riconeapi.models.authentication.*;

/**
 * Contains methods to authenticate and pull data from auth server
 *
 */
public class Authenticator
{
	private static Authenticator instance = null;
    private UserInfo user = null;
   
    private Authenticator() 
    {
        // Exists only to defeat instantiation.
    }

	public static Authenticator getInstance()
	{
		if (instance == null)
		{
			instance = new Authenticator();
		}
		return instance;
	}
     
    /**
     * Establish connection to authenticate to auth server
     * @param clientId
     * @param clientSecret
     */
    public Authenticator(String authUrl, String clientId, String clientSecret)
    {        
        RestTemplate rt = new RestTemplate();
        
        Map<String, String> vars = new HashMap<String, String>();

        vars.put("username", clientId);
        vars.put("password", clientSecret);
        this.user = rt.postForObject(authUrl, vars, UserInfo.class);
        
    }
    
    /**
     * @return user id, user_name, token, and list of endpoints
     */
    public UserInfo getUserInfo()
    {  	
    	return user;
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
    public DecodedToken getDecodedToken(String token)
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

	public String base64UrlDecode(String input)
	{
		String result = null;
		Base64 decoder = new Base64(true);
		byte[] decodedBytes = decoder.decode(input);
		result = new String(decodedBytes);
		return result;
	}

}

/**
 * @author      Andrew Pieniezny <andrew.pieniezny@neric.org>
 * @version     1.2
 * @since       Apr 25, 2016
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
	private String authUrl;
    private String clientId;
    private String clientSecret;

    private final RestTemplate rt;
    
    /**
     * Establish connection to authenticate to auth server
     * @param clientId
     * @param clientSecret
     */
    public Authenticator(String authUrl, String clientId, String clientSecret)
    {
    	this.authUrl = authUrl;
        this.clientId = clientId;
        this.clientSecret = clientSecret;        
        rt = new RestTemplate();
        
    }
    
    /**
     * @return user id, user_name, token, and list of endpoints
     */
    public UserInfo getUserInfo()
    {
    	 Map<String, String> vars = new HashMap<String, String>();

         vars.put("username", this.clientId);
         vars.put("password", this.clientSecret);
         UserInfo user = rt.postForObject(authUrl, vars, UserInfo.class);
    	
    	return user;
    }
    
    /**
     * 
     * @return Token value
     */
    public String getToken()
    {
    	 Map<String, String> vars = new HashMap<String, String>();

         vars.put("username", this.clientId);
         vars.put("password", this.clientSecret);
         UserInfo user = rt.postForObject(authUrl, vars, UserInfo.class);
         
         return user.getToken();
    }

	/**
	 * @param providerId
	 * @return Endpoint by specified providerId 
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public List<Endpoint> getEndpoints(String providerId)
    {
    	Map<String, String> vars = new HashMap<String, String>();

        vars.put("username", this.clientId);
        vars.put("password", this.clientSecret);
       
        UserInfo user = rt.postForObject(authUrl, vars, UserInfo.class);

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
    	Map<String, String> vars = new HashMap<String, String>();

        vars.put("username", this.clientId);
        vars.put("password", this.clientSecret);
       
        UserInfo user = rt.postForObject(authUrl, vars, UserInfo.class);
           
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

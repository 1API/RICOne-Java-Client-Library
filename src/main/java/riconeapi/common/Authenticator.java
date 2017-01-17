/**
 * @author      Andrew Pieniezny <andrew.pieniezny@neric.org>
 * @version     1.5
 * @since       Jan 13, 2017
 * @filename	Authenticator.java
 */
package riconeapi.common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.joda.time.DateTime;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.client.RestTemplate;

import riconeapi.exceptions.AuthenticationException;
import riconeapi.models.authentication.DecodedToken;
import riconeapi.models.authentication.Endpoint;
import riconeapi.models.authentication.UserInfo;

public class Authenticator
{
	private static Authenticator instance = null;
	private static ResponseEntity<UserInfo> user = null;
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
	 * @throws AuthenticationException 
	 */
    public void authenticate(String authUrl, String clientId, String clientSecret) throws AuthenticationException
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
    private void login(String authUrl, String clientId, String clientSecret) throws AuthenticationException
    {
    	RestTemplate rt = new RestTemplate();

    	MultiValueMap<String, String> body = new LinkedMultiValueMap<String, String>();
    	body.add("username", clientId);
    	body.add("password", clientSecret);
    	
    	HttpHeaders headers = new HttpHeaders();
    	headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
    	
    	HttpEntity<?> entity = new HttpEntity<Object>(body,headers);
    	
    	try
    	{
    		Authenticator.user = rt.exchange(authUrl, HttpMethod.POST, entity, UserInfo.class);
    	}
    	catch(Exception e)
    	{
    		throw new AuthenticationException("401 UNAUTHORIZED", e, true, true);
    	}  
    }
    
    /**
     * Re-authenticates with authentication server if token is expired
     * @param token
     * @throws AuthenticationException 
     */
	protected void refreshToken(String token) throws AuthenticationException
	{
		DecodedToken decoded = new DecodedToken(token);
		DateTime dt = new DateTime(decoded.getDecodedToken().getExp() * 1000);
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
    	return user.getBody().getToken();

    }
    
    /**
	 * @param providerId
	 * @return Endpoint by specified providerId 
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public List<Endpoint> getEndpoints(String providerId)
    {
		List<Endpoint> endpoints = new ArrayList();
        
        for(Endpoint e : user.getBody().getEndpoint())
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
        return user.getBody().getEndpoint();
    }
}

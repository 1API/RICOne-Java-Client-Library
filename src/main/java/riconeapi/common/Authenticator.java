/**
 * @author      Andrew Pieniezny <andrew.pieniezny@neric.org>
 * @version     1.4
 * @since       Aug 30, 2016
 * @filename	Authenticator2.java
 */
package riconeapi.common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.joda.time.DateTime;
import org.springframework.web.client.RestTemplate;

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
    public void authenticate(String authUrl, String clientId, String clientSecret)
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
    private void login(String authUrl, String clientId, String clientSecret)
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
	protected void refreshToken(String token)
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
}

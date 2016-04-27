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

}

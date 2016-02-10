/**
 * @author      Andrew Pieniezny <andrew.pieniezny@neric.org>
 * @version     1.1.3.1
 * @since       Feb 04, 2016
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
    private String username;
    private String password;

    private final RestTemplate rt;
    
    /**
     * Establish connection to authenticate to auth server
     * @param username
     * @param password
     */
    public Authenticator(String authUrl, String username, String password)
    {
    	this.authUrl = authUrl;
        this.username = username;
        this.password = password;        
        rt = new RestTemplate();
        
    }
    
    /**
     * @return user id, user_name, token, and list of endpoints
     */
    public UserInfo GetUserInfo()
    {
    	 Map<String, String> vars = new HashMap<String, String>();

         vars.put("username", this.username);
         vars.put("password", this.password);
         UserInfo user = rt.postForObject(authUrl, vars, UserInfo.class);
    	
    	return user;
    }

	/**
	 * @param providerId
	 * @return Endpoint by specified providerId 
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public List<Endpoint> GetEndpoints(String providerId)
    {
    	Map<String, String> vars = new HashMap<String, String>();

        vars.put("username", this.username);
        vars.put("password", this.password);
       
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
    public List<Endpoint> GetEndpoints()
    {
    	Map<String, String> vars = new HashMap<String, String>();

        vars.put("username", this.username);
        vars.put("password", this.password);
       
        UserInfo user = rt.postForObject(authUrl, vars, UserInfo.class);
           
        return user.getEndpoint();
    }

}

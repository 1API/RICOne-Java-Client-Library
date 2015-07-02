import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.client.RestTemplate;

import riconeapi.models.authentication.*;


public class Authenticator
{
	final String oauthBaseUrl = "http://oauth.riconeapi.net/login";
    private String username;
    private String password;

    private final RestTemplate rt;
    
    /**
     * Establish connection to authenticate to OAuth server
     * @param username
     * @param password
     */
    public Authenticator(String username, String password)
    {
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
         UserInfo user = rt.postForObject(oauthBaseUrl, vars, UserInfo.class);
    	
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
       
        UserInfo user = rt.postForObject(oauthBaseUrl, vars, UserInfo.class);
        

		List<Endpoint> endpoints = new ArrayList();
        
        for(Endpoint e : user.getEndpoint())
        {
        	if(e.getName().equals(providerId))
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
       
        UserInfo user = rt.postForObject(oauthBaseUrl, vars, UserInfo.class);
           
        return user.getEndpoint();
    }

}

/**
 * @author      Andrew Pieniezny <andrew.pieniezny@neric.org>
 * @version     1.2
 * @since       Apr 25, 2015
 * Filename		RicOneApiClient.java
 */

package riconeapi.common;

import org.springframework.web.client.RestTemplate;

import riconeapi.models.authentication.*;

public class RicOneApiClient
{
	private String token;
	//private DefaultOAuth2AccessToken token;
    private RestTemplate rt;
//	private OAuth2RestTemplate restTemplate;
    private String baseApiUrl;
    public XPress xPress;
    
    /**Use endpoint values to authenticate to data API
     * @param endpoint
     */
    public RicOneApiClient(Endpoint endpoint)
    {
        this.token = endpoint.getToken();
        this.baseApiUrl = endpoint.getHref();
        this.rt = new RestTemplate();

        xPress = new XPress(token, baseApiUrl, rt);
    }
    
    /**Use endpoint values to authenticate to data API
     * @param token
     * @param baseApiUrl
     */
    public RicOneApiClient(String token, String baseApiUrl)
    {
        this.token = token;
        this.baseApiUrl = baseApiUrl;
        this.rt = new RestTemplate();

        xPress = new XPress(token, baseApiUrl, rt);
    }

}

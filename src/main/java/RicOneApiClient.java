/**
 * @author      Andrew Pieniezny <andrew.pieniezny@neric.org>
 * @version     1.0
 * @since       Jul 7, 2015
 * Filename		RicOneApiClient.java
 */
import org.springframework.web.client.RestTemplate;

import riconeapi.models.authentication.*;

public class RicOneApiClient
{
	private String token;
	//private DefaultOAuth2AccessToken token;
    private RestTemplate restTemplate;
//	private OAuth2RestTemplate restTemplate;
    private String baseApiUrl;
    public SifXpress sifXpress;
    
    /**Use endpoint values to authenticate to data API
     * @param endpoint
     */
    public RicOneApiClient(Endpoint endpoint)
    {
        this.token = endpoint.getToken();
        this.baseApiUrl = endpoint.getHref();
        this.restTemplate = new RestTemplate();

        sifXpress = new SifXpress(token, baseApiUrl, restTemplate);
    }
    
    /**Use endpoint values to authenticate to data API
     * @param token
     * @param baseApiUrl
     */
    public RicOneApiClient(String token, String baseApiUrl)
    {
        this.token = token;
        this.baseApiUrl = baseApiUrl;
        this.restTemplate = new RestTemplate();

        sifXpress = new SifXpress(token, baseApiUrl, restTemplate);
    }

}

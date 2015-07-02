import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.web.client.RestTemplate;

import riconeapi.models.authentication.*;

public class RicOneApiClient
{
	private String token;
    private RestTemplate restTemplate;
    private String baseApiUrl;
    public SifXpress sifXpress;

    /// <summary>
    /// Use endpoint values to authenticate to data API
    /// </summary>
    /// <param name="endpoint"></param>
    public RicOneApiClient(Endpoint endpoint)
    {
        this.token = endpoint.getToken();
        this.baseApiUrl = endpoint.getHref();
//        this.restTemplate = new RestTemplate(baseApiUrl);
     
     
        
//        OAuth2RestTemplate oauth = new OAuth2RestTemplate(null);
//        oauth.setAuthenticator();
        
        
//        restTemplate.Authenticator = new OAuth2AuthorizationRequestHeaderAuthenticator(token, "Bearer");
//        sifXpress = new SifXpress(token, baseApiUrl, restTemplate);

    }
    /// <summary>
    /// Use endpoint values to authenticate to data API
    /// </summary>
    /// <param name="token"></param>
    /// <param name="baseApiUrl"></param>
//    public RicOneApiClient(String token, String baseApiUrl)
//    {
//        this.token = token;
//        this.baseApiUrl = baseApiUrl;
//        this.restTemplate = new restTemplate(baseApiUrl);
////        restTemplate.Authenticator = new OAuth2AuthorizationRequestHeaderAuthenticator(token, "Bearer");
////        sifXpress = new SifXpress(token, baseApiUrl, restTemplate);
//       
//    }

}

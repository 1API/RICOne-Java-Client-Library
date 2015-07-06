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

    /// <summary>
    /// Use endpoint values to authenticate to data API
    /// </summary>
    /// <param name="endpoint"></param>
    public RicOneApiClient(Endpoint endpoint)
    {
        this.token = endpoint.getToken();
        this.baseApiUrl = endpoint.getHref();
        this.restTemplate = new RestTemplate();

        sifXpress = new SifXpress(token, baseApiUrl, restTemplate);
        
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

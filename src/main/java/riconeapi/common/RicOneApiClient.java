///**
// * @author      Andrew Pieniezny <andrew.pieniezny@neric.org>
// * @version     1.3
// * @since       Jun 22, 2016
// * Filename		RicOneApiClient.java
// */
//
//package riconeapi.common;
//
//import org.springframework.web.client.RestTemplate;
//
//import riconeapi.models.authentication.*;
//
//public class RicOneApiClient
//{
//	private String token;
//    private RestTemplate rt;
//    private String baseApiUrl;
//    public XPress xPress;
//
//    
//    /**Use endpoint values to authenticate to data API
//     * @param endpoint
//     */
//    public RicOneApiClient(Endpoint endpoint)
//    {
//    	if(AuthServiceProperties.getInstance().getProperty("auth.token") == null)
//    	{
//    		System.out.println("!!!!!!!!!!!!!GETTING TOKEN FROM AUTH");
//    		this.token = endpoint.getToken();
//    	}
//    	else
//    	{
//    		System.out.println("!!!!!!!!!!!!!GETTING TOKEN FROM PROPERTIES FILE");
//    		this.token = AuthServiceProperties.getInstance().getProperty("auth.token");
//    	}
//        this.baseApiUrl = endpoint.getHref();
//        this.rt = new RestTemplate();
//
//        xPress = new XPress(token, baseApiUrl, rt);
//    }
//    
//    /**Use endpoint values to authenticate to data API
//     * @param token
//     * @param baseApiUrl
//     */
//    public RicOneApiClient(String token, String baseApiUrl)
//    {
//        this.token = token;
//        this.baseApiUrl = baseApiUrl;
//        this.rt = new RestTemplate();
//
//        xPress = new XPress(token, baseApiUrl, rt);
//    }
//
//}

import java.util.List;

import org.springframework.web.client.RestTemplate;

import sif.dd.xPress.model.XLeaCollectionType;
import sif.dd.xPress.model.XLeaType;


public class SifXpress
{
	private String token;
    private RestTemplate restTemplate;
    private String baseApiUrl;
    
    public SifXpress(String token, String baseApiUrl, RestTemplate restTemplate)
    {
        this.token = token;
        this.baseApiUrl = baseApiUrl;
        this.restTemplate = restTemplate;
    }
    
    
    
//    public List<XLeaType> GetXLeas(String navigationPage, String navigationPageSize)
//    {
////        RestRequest request = new RestRequest("xLeas", Method.GET);
////        request.AddHeader("Accept", "application/json");
////
////        request.AddParameter("navigationPage", navigationPage);
////        request.AddParameter("navigationPageSize", navigationPageSize);
//
////        var response = restClient.Execute<XLeasRoot>(request);
//		 
//		 	//RestTemplate restTemplate = new RestTemplate();
//			XLeaType lea = restTemplate.getForObject("baseApiUrl + /xLeas", XLeaType.class);
//
//			System.out.println(lea.getRefId());
//			return lea;
			
//			log.debug(profile.toString());

//        Util.ResponseHandler(response);

//        return response.Data.xLeas.xLea;
//    }
    /// <summary>
    /// Request all Leas
    /// </summary>
    /// <param name="navigationPage"></param>
    /// <param name="navigationPageSize"></param>
    /// <returns></returns>
//    public List<XLeaType> GetXLeas(String navigationPage, String navigationPageSize)
//    {
//        //RestRequest request = new RestRequest("xLeas", Method.GET);
//    	
//    	HttpHeaders requestHeaders = new HttpHeaders();
//    	requestHeaders.set("Accept", "application/json");
//    	requestHeaders.set("navigationPage", navigationPage);
//    	requestHeaders.set("navigationPageSize", navigationPageSize);
//    	HttpEntity<?> requestEntity = new HttpEntity(requestHeaders);
//
//    	HttpEntity<String> response = restTemplate.exchange(baseApiUrl + "/xLeas?{navigationPage}&{navigationPageSize}",
//    	  HttpMethod.GET, requestEntity, String.class);
//       
//    	
//    	return response.getBody();
      //  var response = restClient.Execute<XLeasRoot>(request);

       // Util.ResponseHandler(response);

        //return response.Data.xLeas.xLea;
//    }

    /// <summary>
    /// Request all Leas
    /// </summary>
    /// <param name="navigationPage"></param>
    /// <param name="navigationPageSize"></param>
    /// <returns></returns>
	public List<XLeaType> GetXLeas()
    {
		
		XLeaCollectionType response = restTemplate.getForObject(baseApiUrl + "xLeas?accessToken=" + token, XLeaCollectionType.class);
        
		return response.getXLea();
    	
//        RestRequest request = new RestRequest("xLeas", Method.GET);
//        request.AddHeader("Accept", "application/json");
//
//        var response = restClient.Execute<XLeasRoot>(request);
//
//        Util.ResponseHandler(response);
//
//        return response.Data.xLeas.xLea;
    }
    
}

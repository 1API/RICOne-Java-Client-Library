import java.util.List;

import org.springframework.web.client.RestTemplate;
import sif.dd.xPress.model.XLeaType;


public class Test
{
	 public XLeaType GetXLeas(String navigationPage, String navigationPageSize)
     {
//         RestRequest request = new RestRequest("xLeas", Method.GET);
//         request.AddHeader("Accept", "application/json");
//
//         request.AddParameter("navigationPage", navigationPage);
//         request.AddParameter("navigationPageSize", navigationPageSize);

//         var response = restClient.Execute<XLeasRoot>(request);
		 
		 	RestTemplate restTemplate = new RestTemplate();
			XLeaType lea = restTemplate.getForObject("http://10.110.5.5/api/requests/xLeas", XLeaType.class);

			System.out.println(lea.getRefId());
			return lea;
			
//			log.debug(profile.toString());

//         Util.ResponseHandler(response);

//         return response.Data.xLeas.xLea;
     }
}

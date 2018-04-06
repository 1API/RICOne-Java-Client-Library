package riconeapi.common.paths;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;
import riconeapi.authentication.Authenticator;
import riconeapi.models.xpress.*;

/**
 * @author      Andrew Pieniezny <andrew.pieniezny@neric.org>
 * @version     1.7
 * @since       Feb 14, 2018
 */
public class GetLastPagePath
{
	private RestTemplate rt;
	private String baseApiUrl;

	public GetLastPagePath(RestTemplate rt, String baseApiUrl)
	{
		this.rt = rt;
		this.baseApiUrl = baseApiUrl;
	}

	/**
	 *
	 * @param navigationPageSize
	 * @param p
	 * @param refId
	 * @return Max page value for specified service path object
	 */
	public int getLastPage(int navigationPageSize, ServicePath p, String refId)
	{
		int navigationPage = 1;
		Integer navigationLastPage = null;

		try
		{
			switch(p.name())
			{
				case "GETXLEASBYXSCHOOL":
				case "GETXLEASBYXROSTER":
				case "GETXLEASBYXSTAFF":
				case "GETXLEASBYXSTUDENT":
				case "GETXLEASBYXCONTACT":
				{
					HttpHeaders headers = new HttpHeaders();
					headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
					headers.set("navigationPage", Integer.toString(navigationPage));
					headers.set("navigationPageSize", Integer.toString(navigationPageSize));
					headers.set("Content-Type", "application/json");
					HttpEntity<?> entity = new HttpEntity<Object>(headers);
					ResponseEntity<XLeaCollectionType> response = rt.exchange(baseApiUrl + p.value, HttpMethod.GET, entity, XLeaCollectionType.class, refId);

					navigationLastPage = Integer.parseInt(response.getHeaders().getFirst("navigationLastPage"));
					break;
				}
				case "GETXSCHOOLSBYXLEA":
				case "GETXSCHOOLSBYXCALENDAR":
				case "GETXSCHOOLSBYXCOURSE":
				case "GETXSCHOOLSBYXROSTER":
				case "GETXSCHOOLSBYXSTAFF":
				case "GETXSCHOOLSBYXSTUDENT":
				case "GETXSCHOOLSBYXCONTACT":
				{
					HttpHeaders headers = new HttpHeaders();
					headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
					headers.set("navigationPage", Integer.toString(navigationPage));
					headers.set("navigationPageSize", Integer.toString(navigationPageSize));
					//headers.set("Content-Type", "application/json");
					HttpEntity<?> entity = new HttpEntity<Object>(headers);
					ResponseEntity<XSchoolCollectionType> response = rt.exchange(baseApiUrl + p.value, HttpMethod.GET, entity, XSchoolCollectionType.class, refId);

					navigationLastPage = Integer.parseInt(response.getHeaders().getFirst("navigationLastPage"));
					break;
				}
				case "GETXCALENDARSBYXLEA":
				case "GETXCALENDARSBYXSCHOOL":
				{
					HttpHeaders headers = new HttpHeaders();
					headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
					headers.set("navigationPage", Integer.toString(navigationPage));
					headers.set("navigationPageSize", Integer.toString(navigationPageSize));
					//headers.set("Content-Type", "application/json");
					HttpEntity<?> entity = new HttpEntity<Object>(headers);
					ResponseEntity<XCalendarCollectionType> response = rt.exchange(baseApiUrl + p.value, HttpMethod.GET, entity, XCalendarCollectionType.class, refId);

					navigationLastPage = Integer.parseInt(response.getHeaders().getFirst("navigationLastPage"));
					break;
				}
				case "GETXCOURSESBYXLEA":
				case "GETXCOURSESBYXSCHOOL":
				case "GETXCOURSESBYXROSTER":
				{
					HttpHeaders headers = new HttpHeaders();
					headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
					headers.set("navigationPage", Integer.toString(navigationPage));
					headers.set("navigationPageSize", Integer.toString(navigationPageSize));
					//headers.set("Content-Type", "application/json");
					HttpEntity<?> entity = new HttpEntity<Object>(headers);
					ResponseEntity<XCourseCollectionType> response = rt.exchange(baseApiUrl + p.value, HttpMethod.GET, entity, XCourseCollectionType.class, refId);

					navigationLastPage = Integer.parseInt(response.getHeaders().getFirst("navigationLastPage"));
					break;
				}
				case "GETXROSTERSBYXLEA":
				case "GETXROSTERSBYXSCHOOL":
				case "GETXROSTERSBYXCOURSE":
				case "GETXROSTERSBYXSTAFF":
				case "GETXROSTERSBYXSTUDENT":
				{
					HttpHeaders headers = new HttpHeaders();
					headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
					headers.set("navigationPage", Integer.toString(navigationPage));
					headers.set("navigationPageSize", Integer.toString(navigationPageSize));
					headers.set("Content-Type", "application/json");
					HttpEntity<?> entity = new HttpEntity<Object>(headers);
					ResponseEntity<XRosterCollectionType> response = rt.exchange(baseApiUrl + p.value, HttpMethod.GET, entity, XRosterCollectionType.class, refId);

					navigationLastPage = Integer.parseInt(response.getHeaders().getFirst("navigationLastPage"));
					break;
				}
				case "GETXSTAFFSBYXLEA":
				case "GETXSTAFFSBYXSCHOOL":
				case "GETXSTAFFSBYXCOURSE":
				case "GETXSTAFFSBYXROSTER":
				case "GETXSTAFFSBYXSTUDENT":
				{
					HttpHeaders headers = new HttpHeaders();
					headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
					headers.set("navigationPage", Integer.toString(navigationPage));
					headers.set("navigationPageSize", Integer.toString(navigationPageSize));
					//headers.set("Content-Type", "application/json");
					HttpEntity<?> entity = new HttpEntity<Object>(headers);
					ResponseEntity<XStaffCollectionType> response = rt.exchange(baseApiUrl + p.value, HttpMethod.GET, entity, XStaffCollectionType.class, refId);

					navigationLastPage = Integer.parseInt(response.getHeaders().getFirst("navigationLastPage"));
					break;
				}
				case "GETXSTUDENTSBYXLEA":
				case "GETXSTUDENTSBYXSCHOOL":
				case "GETXSTUDENTSBYXROSTER":
				case "GETXSTUDENTSBYXSTAFF":
				case "GETXSTUDENTSBYXCONTACT":
				{
					HttpHeaders headers = new HttpHeaders();
					headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
					headers.set("navigationPage", Integer.toString(navigationPage));
					headers.set("navigationPageSize", Integer.toString(navigationPageSize));
					//headers.set("Content-Type", "application/json");
					HttpEntity<?> entity = new HttpEntity<Object>(headers);
					ResponseEntity<XStudentCollectionType> response = rt.exchange(baseApiUrl + p.value, HttpMethod.GET, entity, XStudentCollectionType.class, refId);

					navigationLastPage = Integer.parseInt(response.getHeaders().getFirst("navigationLastPage"));
					break;
				}
				case "GETXCONTACTSBYXLEA":
				case "GETXCONTACTSBYXSCHOOL":
				case "GETXCONTACTSBYXSTUDENT":
				{
					HttpHeaders headers = new HttpHeaders();
					headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
					headers.set("navigationPage", Integer.toString(navigationPage));
					headers.set("navigationPageSize", Integer.toString(navigationPageSize));
					//headers.set("Content-Type", "application/json");
					HttpEntity<?> entity = new HttpEntity<Object>(headers);
					ResponseEntity<XContactCollectionType> response = rt.exchange(baseApiUrl + p.value, HttpMethod.GET, entity, XContactCollectionType.class, refId);

					navigationLastPage = Integer.parseInt(response.getHeaders().getFirst("navigationLastPage"));
					break;
				}
			}

			return navigationLastPage;
		}
		catch(HttpClientErrorException e)
		{
			return 0;
		}
	}

	/**
	 *
	 * @param navigationPageSize
	 * @param p
	 * @return Max page value for specified service path object
	 */
	public int getLastPage(int navigationPageSize, ServicePath p)
	{
		int navigationPage = 1;
		Integer navigationLastPage = null;

		try
		{
			switch(p.name())
			{
				case "GETXLEAS":
				{
					HttpHeaders headers = new HttpHeaders();
					headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
					headers.set("navigationPage", Integer.toString(navigationPage));
					headers.set("navigationPageSize", Integer.toString(navigationPageSize));
					//headers.set("Content-Type", "application/json");
					HttpEntity<?> entity = new HttpEntity<Object>(headers);
					ResponseEntity<XLeaCollectionType> response = rt.exchange(baseApiUrl + p.value, HttpMethod.GET, entity, XLeaCollectionType.class);

					navigationLastPage = Integer.parseInt(response.getHeaders().getFirst("navigationLastPage"));
					break;
				}
				case "GETXSCHOOLS":
				{
					HttpHeaders headers = new HttpHeaders();
					headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
					headers.set("navigationPage", Integer.toString(navigationPage));
					headers.set("navigationPageSize", Integer.toString(navigationPageSize));
					//headers.set("Content-Type", "application/json");
					HttpEntity<?> entity = new HttpEntity<Object>(headers);
					ResponseEntity<XSchoolCollectionType> response = rt.exchange(baseApiUrl + p.value, HttpMethod.GET, entity, XSchoolCollectionType.class);

					navigationLastPage = Integer.parseInt(response.getHeaders().getFirst("navigationLastPage"));
					break;
				}
				case "GETXCALENDARS":
				{
					HttpHeaders headers = new HttpHeaders();
					headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
					headers.set("navigationPage", Integer.toString(navigationPage));
					headers.set("navigationPageSize", Integer.toString(navigationPageSize));
					//headers.set("Content-Type", "application/json");
					HttpEntity<?> entity = new HttpEntity<Object>(headers);
					ResponseEntity<XCalendarCollectionType> response = rt.exchange(baseApiUrl + p.value, HttpMethod.GET, entity, XCalendarCollectionType.class);

					navigationLastPage = Integer.parseInt(response.getHeaders().getFirst("navigationLastPage"));
					break;
				}
				case "GETXCOURSES":
				{
					HttpHeaders headers = new HttpHeaders();
					headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
					headers.set("navigationPage", Integer.toString(navigationPage));
					headers.set("navigationPageSize", Integer.toString(navigationPageSize));
					//headers.set("Content-Type", "application/json");
					HttpEntity<?> entity = new HttpEntity<Object>(headers);
					ResponseEntity<XCourseCollectionType> response = rt.exchange(baseApiUrl + p.value, HttpMethod.GET, entity, XCourseCollectionType.class);

					navigationLastPage = Integer.parseInt(response.getHeaders().getFirst("navigationLastPage"));
					break;
				}
				case "GETXROSTERS":
				{
					HttpHeaders headers = new HttpHeaders();
					headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
					headers.set("navigationPage", Integer.toString(navigationPage));
					headers.set("navigationPageSize", Integer.toString(navigationPageSize));
					//headers.set("Content-Type", "application/json");
					HttpEntity<?> entity = new HttpEntity<Object>(headers);
					ResponseEntity<XRosterCollectionType> response = rt.exchange(baseApiUrl + p.value, HttpMethod.GET, entity, XRosterCollectionType.class);

					navigationLastPage = Integer.parseInt(response.getHeaders().getFirst("navigationLastPage"));
					break;
				}
				case "GETXSTAFFS":
				{
					HttpHeaders headers = new HttpHeaders();
					headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
					headers.set("navigationPage", Integer.toString(navigationPage));
					headers.set("navigationPageSize", Integer.toString(navigationPageSize));
					//headers.set("Content-Type", "application/json");
					HttpEntity<?> entity = new HttpEntity<Object>(headers);
					ResponseEntity<XStaffCollectionType> response = rt.exchange(baseApiUrl + p.value, HttpMethod.GET, entity, XStaffCollectionType.class);

					navigationLastPage = Integer.parseInt(response.getHeaders().getFirst("navigationLastPage"));

					//				System.out.println(restTemplate.exchange(baseApiUrl + p.value, HttpMethod.GET, entity, XStaffCollectionType.class, navigationPage, navigationPageSize).toString());
					//				System.out.println(response.getHeaders().toString());
					//				System.out.println(baseApiUrl + p.value, HttpMethod.GET, entity);
					//				System.out.println(navigationLastPage);

					break;
				}
				case "GETXSTUDENTS":
				{
					HttpHeaders headers = new HttpHeaders();
					headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
					headers.set("navigationPage", Integer.toString(navigationPage));
					headers.set("navigationPageSize", Integer.toString(navigationPageSize));
					//headers.set("Content-Type", "application/json");
					HttpEntity<?> entity = new HttpEntity<Object>(headers);
					ResponseEntity<XStudentCollectionType> response = rt.exchange(baseApiUrl + p.value, HttpMethod.GET, entity, XStudentCollectionType.class);

					navigationLastPage = Integer.parseInt(response.getHeaders().getFirst("navigationLastPage"));
					break;
				}
				case "GETXCONTACTS":
				{
					HttpHeaders headers = new HttpHeaders();
					headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
					headers.set("navigationPage", Integer.toString(navigationPage));
					headers.set("navigationPageSize", Integer.toString(navigationPageSize));
					//headers.set("Content-Type", "application/json");
					HttpEntity<?> entity = new HttpEntity<Object>(headers);
					ResponseEntity<XContactCollectionType> response = rt.exchange(baseApiUrl + p.value, HttpMethod.GET, entity, XContactCollectionType.class);

					navigationLastPage = Integer.parseInt(response.getHeaders().getFirst("navigationLastPage"));
					break;
				}
			}

			return navigationLastPage;
		}
		catch(HttpClientErrorException e)
		{
			return 0;
		}
	}
}

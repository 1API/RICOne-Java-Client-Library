package riconeapi.common.paths;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;
import riconeapi.authentication.Authenticator;
import riconeapi.models.xpress.*;

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
	 * Enumerator used to retrieve service path object for max page size
	 *
	 */
	public enum ServicePath
	{
		GETXLEAS("xLeas"), GETXLEASBYXSCHOOL("xSchools/{refId}/xLeas"), GETXLEASBYXROSTER("xRosters/{refId}/xLeas"), GETXLEASBYXSTAFF("xStaffs/{refId}/xLeas"), GETXLEASBYXSTUDENT("xStudents/{refId}/xLeas"), GETXLEASBYXCONTACT("xContacts/{refId}/xLeas"), GETXSCHOOLS("xSchools"), GETXSCHOOLSBYXLEA("xLeas/{refId}/xSchools"), GETXSCHOOLSBYXCALENDAR("xCalendars/{refId}/xSchools"), GETXSCHOOLSBYXCOURSE(
			"xCourses/{refId}/xSchools"), GETXSCHOOLSBYXROSTER("xRosters/{refId}/xSchools"), GETXSCHOOLSBYXSTAFF("xStaffs/{refId}/xSchools"), GETXSCHOOLSBYXSTUDENT("xStudents/{refId}/xSchools"), GETXSCHOOLSBYXCONTACT("xContacts/{refId}/xSchools"), GETXCALENDARS("xCalendars"), GETXCALENDARSBYXLEA("xLeas/{refId}/xCalendars"), GETXCALENDARSBYXSCHOOL(
			"xSchools/{refId}/xCalendars"), GETXCOURSES("xCourses"), GETXCOURSESBYXLEA("xLeas/{refId}/xCourses"), GETXCOURSESBYXSCHOOL("xSchools/{refId}/xCourses"), GETXCOURSESBYXROSTER("xRosters/{refId}/xCourses"), GETXROSTERS("xRosters"), GETXROSTERSBYXLEA("xLeas/{refId}/xRosters"), GETXROSTERSBYXSCHOOL("xSchools/{refId}/xRosters"), GETXROSTERSBYXCOURSE("xCourses/{refId}/xRosters"), GETXROSTERSBYXSTAFF(
			"xStaffs/{refId}/xRosters"), GETXROSTERSBYXSTUDENT("xStudents/{refId}/xRosters"), GETXSTAFFS("xStaffs"), GETXSTAFFSBYXLEA("xLeas/{refId}/xStaffs"), GETXSTAFFSBYXSCHOOL("xSchools/{refId}/xStaffs"), GETXSTAFFSBYXCOURSE("xCourses/{refId}/xStaffs"), GETXSTAFFSBYXROSTER(
			"xRosters/{refId}/xStaffs"), GETXSTAFFSBYXSTUDENT("xStudents/{refId}/xStaffs"), GETXSTUDENTS("xStudents"), GETXSTUDENTSBYXLEA("xLeas/{refId}/xStudents"), GETXSTUDENTSBYXSCHOOL("xSchools/{refId}/xStudents"), GETXSTUDENTSBYXROSTER("xRosters/{refId}/xStudents"), GETXSTUDENTSBYXSTAFF("xStaffs/{refId}/xStudents"), GETXSTUDENTSBYXCONTACT(
			"xContacts/{refId}/xStudents"), GETXCONTACTS("xContacts"), GETXCONTACTSBYXLEA("xLeas/{refId}/xContacts"), GETXCONTACTSBYXSCHOOL("xSchools/{refId}/xContacts"), GETXCONTACTSBYXSTUDENT("xStudents/{refId}/xContacts");

		private String value;

		ServicePath(String value)
		{
			this.value = value;
		}

		public String getValue()
		{
			return value;
		}
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
					//headers.set("Content-Type", "application/json");
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
					//headers.set("Content-Type", "application/json");
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

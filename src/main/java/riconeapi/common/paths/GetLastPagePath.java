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
			if (p.name().equals("GETXLEASBYXSCHOOL") || p.name().equals("GETXLEASBYXROSTER") || p.name().equals("GETXLEASBYXSTAFF") || p.name().equals("GETXLEASBYXSTUDENT") || p.name().equals("GETXLEASBYXCONTACT"))
			{
				HttpHeaders headers = new HttpHeaders();
				headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
				headers.set("navigationPage", Integer.toString(navigationPage));
				headers.set("navigationPageSize", Integer.toString(navigationPageSize));
				//headers.set("Content-Type", "application/json");
				HttpEntity<?> entity = new HttpEntity<Object>(headers);
				ResponseEntity<XLeaCollectionType> response = rt.exchange(baseApiUrl + p.value, HttpMethod.GET, entity, XLeaCollectionType.class, refId);

				navigationLastPage = Integer.parseInt(response.getHeaders().getFirst("navigationLastPage"));
			}
			else if (p.name().equals("GETXSCHOOLSBYXLEA") || p.name().equals("GETXSCHOOLSBYXCALENDAR") || p.name().equals("GETXSCHOOLSBYXCOURSE") || p.name().equals("GETXSCHOOLSBYXROSTER") || p.name().equals("GETXSCHOOLSBYXSTAFF") || p.name().equals("GETXSCHOOLSBYXSTUDENT")
					|| p.name().equals("GETXSCHOOLSBYXCONTACT"))
			{
				HttpHeaders headers = new HttpHeaders();
				headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
				headers.set("navigationPage", Integer.toString(navigationPage));
				headers.set("navigationPageSize", Integer.toString(navigationPageSize));
				//headers.set("Content-Type", "application/json");
				HttpEntity<?> entity = new HttpEntity<Object>(headers);
				ResponseEntity<XSchoolCollectionType> response = rt.exchange(baseApiUrl + p.value, HttpMethod.GET, entity, XSchoolCollectionType.class, refId);

				navigationLastPage = Integer.parseInt(response.getHeaders().getFirst("navigationLastPage"));
			}
			else if (p.name().equals("GETXCALENDARSBYXLEA") || p.name().equals("GETXCALENDARSBYXSCHOOL"))
			{
				HttpHeaders headers = new HttpHeaders();
				headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
				headers.set("navigationPage", Integer.toString(navigationPage));
				headers.set("navigationPageSize", Integer.toString(navigationPageSize));
				//headers.set("Content-Type", "application/json");
				HttpEntity<?> entity = new HttpEntity<Object>(headers);
				ResponseEntity<XCalendarCollectionType> response = rt.exchange(baseApiUrl + p.value, HttpMethod.GET, entity, XCalendarCollectionType.class, refId);

				navigationLastPage = Integer.parseInt(response.getHeaders().getFirst("navigationLastPage"));
			}
			else if (p.name().equals("GETXCOURSESBYXLEA") || p.name().equals("GETXCOURSESBYXSCHOOL") || p.name().equals("GETXCOURSESBYXROSTER"))
			{
				HttpHeaders headers = new HttpHeaders();
				headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
				headers.set("navigationPage", Integer.toString(navigationPage));
				headers.set("navigationPageSize", Integer.toString(navigationPageSize));
				//headers.set("Content-Type", "application/json");
				HttpEntity<?> entity = new HttpEntity<Object>(headers);
				ResponseEntity<XCourseCollectionType> response = rt.exchange(baseApiUrl + p.value, HttpMethod.GET, entity, XCourseCollectionType.class, refId);

				navigationLastPage = Integer.parseInt(response.getHeaders().getFirst("navigationLastPage"));
			}
			else if (p.name().equals("GETXROSTERSBYXLEA") || p.name().equals("GETXROSTERSBYXSCHOOL") || p.name().equals("GETXROSTERSBYXCOURSE") || p.name().equals("GETXROSTERSBYXSTAFF") || p.name().equals("GETXROSTERSBYXSTUDENT"))
			{
				HttpHeaders headers = new HttpHeaders();
				headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
				headers.set("navigationPage", Integer.toString(navigationPage));
				headers.set("navigationPageSize", Integer.toString(navigationPageSize));
				//headers.set("Content-Type", "application/json");
				HttpEntity<?> entity = new HttpEntity<Object>(headers);
				ResponseEntity<XRosterCollectionType> response = rt.exchange(baseApiUrl + p.value, HttpMethod.GET, entity, XRosterCollectionType.class, refId);

				navigationLastPage = Integer.parseInt(response.getHeaders().getFirst("navigationLastPage"));
			}
			else if (p.name().equals("GETXSTAFFSBYXLEA") || p.name().equals("GETXSTAFFSBYXSCHOOL") || p.name().equals("GETXSTAFFSBYXCOURSE") || p.name().equals("GETXSTAFFSBYXROSTER") || p.name().equals("GETXSTAFFSBYXSTUDENT"))
			{
				HttpHeaders headers = new HttpHeaders();
				headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
				headers.set("navigationPage", Integer.toString(navigationPage));
				headers.set("navigationPageSize", Integer.toString(navigationPageSize));
				//headers.set("Content-Type", "application/json");
				HttpEntity<?> entity = new HttpEntity<Object>(headers);
				ResponseEntity<XStaffCollectionType> response = rt.exchange(baseApiUrl + p.value, HttpMethod.GET, entity, XStaffCollectionType.class, refId);

				navigationLastPage = Integer.parseInt(response.getHeaders().getFirst("navigationLastPage"));
			}
			else if (p.name().equals("GETXSTUDENTSBYXLEA") || p.name().equals("GETXSTUDENTSBYXSCHOOL") || p.name().equals("GETXSTUDENTSBYXROSTER") || p.name().equals("GETXSTUDENTSBYXSTAFF") || p.name().equals("GETXSTUDENTSBYXCONTACT"))
			{
				HttpHeaders headers = new HttpHeaders();
				headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
				headers.set("navigationPage", Integer.toString(navigationPage));
				headers.set("navigationPageSize", Integer.toString(navigationPageSize));
				//headers.set("Content-Type", "application/json");
				HttpEntity<?> entity = new HttpEntity<Object>(headers);
				ResponseEntity<XStudentCollectionType> response = rt.exchange(baseApiUrl + p.value, HttpMethod.GET, entity, XStudentCollectionType.class, refId);

				navigationLastPage = Integer.parseInt(response.getHeaders().getFirst("navigationLastPage"));
			}
			else if (p.name().equals("GETXCONTACTSBYXLEA") || p.name().equals("GETXCONTACTSBYXSCHOOL") || p.name().equals("GETXCONTACTSBYXSTUDENT"))
			{
				HttpHeaders headers = new HttpHeaders();
				headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
				headers.set("navigationPage", Integer.toString(navigationPage));
				headers.set("navigationPageSize", Integer.toString(navigationPageSize));
				//headers.set("Content-Type", "application/json");
				HttpEntity<?> entity = new HttpEntity<Object>(headers);
				ResponseEntity<XContactCollectionType> response = rt.exchange(baseApiUrl + p.value, HttpMethod.GET, entity, XContactCollectionType.class, refId);

				navigationLastPage = Integer.parseInt(response.getHeaders().getFirst("navigationLastPage"));
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
			if (p.name().equals("GETXLEAS"))
			{
				HttpHeaders headers = new HttpHeaders();
				headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
				headers.set("navigationPage", Integer.toString(navigationPage));
				headers.set("navigationPageSize", Integer.toString(navigationPageSize));
				//headers.set("Content-Type", "application/json");
				HttpEntity<?> entity = new HttpEntity<Object>(headers);
				ResponseEntity<XLeaCollectionType> response = rt.exchange(baseApiUrl + p.value, HttpMethod.GET, entity, XLeaCollectionType.class);

				navigationLastPage = Integer.parseInt(response.getHeaders().getFirst("navigationLastPage"));
			}
			else if (p.name().equals("GETXSCHOOLS"))
			{
				HttpHeaders headers = new HttpHeaders();
				headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
				headers.set("navigationPage", Integer.toString(navigationPage));
				headers.set("navigationPageSize", Integer.toString(navigationPageSize));
				//headers.set("Content-Type", "application/json");
				HttpEntity<?> entity = new HttpEntity<Object>(headers);
				ResponseEntity<XSchoolCollectionType> response = rt.exchange(baseApiUrl + p.value, HttpMethod.GET, entity, XSchoolCollectionType.class);

				navigationLastPage = Integer.parseInt(response.getHeaders().getFirst("navigationLastPage"));
			}
			else if (p.name().equals("GETXCALENDARS"))
			{
				HttpHeaders headers = new HttpHeaders();
				headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
				headers.set("navigationPage", Integer.toString(navigationPage));
				headers.set("navigationPageSize", Integer.toString(navigationPageSize));
				//headers.set("Content-Type", "application/json");
				HttpEntity<?> entity = new HttpEntity<Object>(headers);
				ResponseEntity<XCalendarCollectionType> response = rt.exchange(baseApiUrl + p.value, HttpMethod.GET, entity, XCalendarCollectionType.class);

				navigationLastPage = Integer.parseInt(response.getHeaders().getFirst("navigationLastPage"));
			}
			else if (p.name().equals("GETXCOURSES"))
			{
				HttpHeaders headers = new HttpHeaders();
				headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
				headers.set("navigationPage", Integer.toString(navigationPage));
				headers.set("navigationPageSize", Integer.toString(navigationPageSize));
				//headers.set("Content-Type", "application/json");
				HttpEntity<?> entity = new HttpEntity<Object>(headers);
				ResponseEntity<XCourseCollectionType> response = rt.exchange(baseApiUrl + p.value, HttpMethod.GET, entity, XCourseCollectionType.class);

				navigationLastPage = Integer.parseInt(response.getHeaders().getFirst("navigationLastPage"));
			}
			else if (p.name().equals("GETXROSTERS"))
			{
				HttpHeaders headers = new HttpHeaders();
				headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
				headers.set("navigationPage", Integer.toString(navigationPage));
				headers.set("navigationPageSize", Integer.toString(navigationPageSize));
				//headers.set("Content-Type", "application/json");
				HttpEntity<?> entity = new HttpEntity<Object>(headers);
				ResponseEntity<XRosterCollectionType> response = rt.exchange(baseApiUrl + p.value, HttpMethod.GET, entity, XRosterCollectionType.class);

				navigationLastPage = Integer.parseInt(response.getHeaders().getFirst("navigationLastPage"));
			}
			else if (p.name().equals("GETXSTAFFS"))
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

			}
			else if (p.name().equals("GETXSTUDENTS"))
			{
				HttpHeaders headers = new HttpHeaders();
				headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
				headers.set("navigationPage", Integer.toString(navigationPage));
				headers.set("navigationPageSize", Integer.toString(navigationPageSize));
				//headers.set("Content-Type", "application/json");
				HttpEntity<?> entity = new HttpEntity<Object>(headers);
				ResponseEntity<XStudentCollectionType> response = rt.exchange(baseApiUrl + p.value, HttpMethod.GET, entity, XStudentCollectionType.class);

				navigationLastPage = Integer.parseInt(response.getHeaders().getFirst("navigationLastPage"));
			}
			else if (p.name().equals("GETXCONTACTS"))
			{
				HttpHeaders headers = new HttpHeaders();
				headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
				headers.set("navigationPage", Integer.toString(navigationPage));
				headers.set("navigationPageSize", Integer.toString(navigationPageSize));
				//headers.set("Content-Type", "application/json");
				HttpEntity<?> entity = new HttpEntity<Object>(headers);
				ResponseEntity<XContactCollectionType> response = rt.exchange(baseApiUrl + p.value, HttpMethod.GET, entity, XContactCollectionType.class);

				navigationLastPage = Integer.parseInt(response.getHeaders().getFirst("navigationLastPage"));
			}

			return navigationLastPage;
		}
		catch(HttpClientErrorException e)
		{
			return 0;
		}
	}
}

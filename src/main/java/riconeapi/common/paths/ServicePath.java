package riconeapi.common.paths;

/**
 * @author      Andrew Pieniezny <andrew.pieniezny@neric.org>
 * @version     1.7
 * @since       Feb 14, 2018
 * Enumerator used to retrieve service path object for max page size
 */
public enum ServicePath
{
	GETXLEAS("xLeas"),
	GETXLEASBYXSCHOOL("xSchools/{refId}/xLeas"),
	GETXLEASBYXROSTER("xRosters/{refId}/xLeas"),
	GETXLEASBYXSTAFF("xStaffs/{refId}/xLeas"),
	GETXLEASBYXSTUDENT("xStudents/{refId}/xLeas"),
	GETXLEASBYXCONTACT("xContacts/{refId}/xLeas"),
	GETXSCHOOLS("xSchools"),
	GETXSCHOOLSBYXLEA("xLeas/{refId}/xSchools"),
	GETXSCHOOLSBYXCALENDAR("xCalendars/{refId}/xSchools"),
	GETXSCHOOLSBYXCOURSE("xCourses/{refId}/xSchools"),
	GETXSCHOOLSBYXROSTER("xRosters/{refId}/xSchools"),
	GETXSCHOOLSBYXSTAFF("xStaffs/{refId}/xSchools"),
	GETXSCHOOLSBYXSTUDENT("xStudents/{refId}/xSchools"),
	GETXSCHOOLSBYXCONTACT("xContacts/{refId}/xSchools"),
	GETXCALENDARS("xCalendars"),
	GETXCALENDARSBYXLEA("xLeas/{refId}/xCalendars"),
	GETXCALENDARSBYXSCHOOL("xSchools/{refId}/xCalendars"),
	GETXCOURSES("xCourses"),
	GETXCOURSESBYXLEA("xLeas/{refId}/xCourses"),
	GETXCOURSESBYXSCHOOL("xSchools/{refId}/xCourses"),
	GETXCOURSESBYXROSTER("xRosters/{refId}/xCourses"),
	GETXROSTERS("xRosters"),
	GETXROSTERSBYXLEA("xLeas/{refId}/xRosters"),
	GETXROSTERSBYXSCHOOL("xSchools/{refId}/xRosters"),
	GETXROSTERSBYXCOURSE("xCourses/{refId}/xRosters"),
	GETXROSTERSBYXSTAFF("xStaffs/{refId}/xRosters"),
	GETXROSTERSBYXSTUDENT("xStudents/{refId}/xRosters"),
	GETXSTAFFS("xStaffs"),
	GETXSTAFFSBYXLEA("xLeas/{refId}/xStaffs"),
	GETXSTAFFSBYXSCHOOL("xSchools/{refId}/xStaffs"),
	GETXSTAFFSBYXCOURSE("xCourses/{refId}/xStaffs"),
	GETXSTAFFSBYXROSTER("xRosters/{refId}/xStaffs"),
	GETXSTAFFSBYXSTUDENT("xStudents/{refId}/xStaffs"),
	GETXSTUDENTS("xStudents"),
	GETXSTUDENTSBYXLEA("xLeas/{refId}/xStudents"),
	GETXSTUDENTSBYXSCHOOL("xSchools/{refId}/xStudents"),
	GETXSTUDENTSBYXROSTER("xRosters/{refId}/xStudents"),
	GETXSTUDENTSBYXSTAFF("xStaffs/{refId}/xStudents"),
	GETXSTUDENTSBYXCONTACT("xContacts/{refId}/xStudents"),
	GETXCONTACTS("xContacts"),
	GETXCONTACTSBYXLEA("xLeas/{refId}/xContacts"),
	GETXCONTACTSBYXSCHOOL("xSchools/{refId}/xContacts"),
	GETXCONTACTSBYXSTUDENT("xStudents/{refId}/xContacts");

	protected String value;

	ServicePath(String value)
	{
		this.value = value;
	}

}

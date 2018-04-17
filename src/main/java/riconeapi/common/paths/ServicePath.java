package riconeapi.common.paths;

import riconeapi.common.ServicePathType;

/**
 * @author      Andrew Pieniezny <andrew.pieniezny@neric.org>
 * @version     1.7
 * @since       Apr 11, 2018
 * Enumerator used to retrieve service path object for max page size
 */
public enum ServicePath
{
	GETXLEAS("xLeas", ServicePathType.OBJECT),
	GETXLEABYREFID("xLeas/{refId}", ServicePathType.SINGLE),
	GETXLEABYID("xLeas/{id}", ServicePathType.SINGLE),
	GETXLEASBYXSCHOOL("xSchools/{refId}/xLeas", ServicePathType.PREDICATE),
	GETXLEASBYXROSTER("xRosters/{refId}/xLeas", ServicePathType.PREDICATE),
	GETXLEASBYXSTAFF("xStaffs/{refId}/xLeas", ServicePathType.PREDICATE),
	GETXLEASBYXSTUDENT("xStudents/{refId}/xLeas", ServicePathType.PREDICATE),
	GETXLEASBYXCONTACT("xContacts/{refId}/xLeas", ServicePathType.PREDICATE),
	GETXSCHOOLS("xSchools", ServicePathType.OBJECT),
	GETXSCHOOLBYREFID("xSchools/{refId}", ServicePathType.SINGLE),
	GETXSCHOOLBYID("xLeas/{id}", ServicePathType.SINGLE),
	GETXSCHOOLSBYXLEA("xLeas/{refId}/xSchools", ServicePathType.PREDICATE),
	GETXSCHOOLSBYXCALENDAR("xCalendars/{refId}/xSchools", ServicePathType.PREDICATE),
	GETXSCHOOLSBYXCOURSE("xCourses/{refId}/xSchools", ServicePathType.PREDICATE),
	GETXSCHOOLSBYXROSTER("xRosters/{refId}/xSchools", ServicePathType.PREDICATE),
	GETXSCHOOLSBYXSTAFF("xStaffs/{refId}/xSchools", ServicePathType.PREDICATE),
	GETXSCHOOLSBYXSTUDENT("xStudents/{refId}/xSchools", ServicePathType.PREDICATE),
	GETXSCHOOLSBYXCONTACT("xContacts/{refId}/xSchools", ServicePathType.PREDICATE),
	GETXCALENDARS("xCalendars", ServicePathType.OBJECT),
	GETXCALENDARBYREFID("xCalendars/{refId}"),
	GETXCALENDARSBYXLEA("xLeas/{refId}/xCalendars", ServicePathType.PREDICATE),
	GETXCALENDARSBYXSCHOOL("xSchools/{refId}/xCalendars", ServicePathType.PREDICATE),
	GETXCOURSES("xCourses", ServicePathType.OBJECT),
	GETXCOURSEBYREFID("xCourses/{refId}", ServicePathType.SINGLE),
	GETXCOURSESBYXLEA("xLeas/{refId}/xCourses", ServicePathType.PREDICATE),
	GETXCOURSESBYXSCHOOL("xSchools/{refId}/xCourses", ServicePathType.PREDICATE),
	GETXCOURSESBYXROSTER("xRosters/{refId}/xCourses", ServicePathType.PREDICATE),
	GETXROSTERS("xRosters", ServicePathType.OBJECT),
	GETXROSTERBYREFID("xRosters/{refId}", ServicePathType.SINGLE),
	GETXROSTERSBYXLEA("xLeas/{refId}/xRosters", ServicePathType.PREDICATE),
	GETXROSTERSBYXSCHOOL("xSchools/{refId}/xRosters", ServicePathType.PREDICATE),
	GETXROSTERSBYXCOURSE("xCourses/{refId}/xRosters", ServicePathType.PREDICATE),
	GETXROSTERSBYXSTAFF("xStaffs/{refId}/xRosters", ServicePathType.PREDICATE),
	GETXROSTERSBYXSTUDENT("xStudents/{refId}/xRosters", ServicePathType.PREDICATE),
	GETXSTAFFS("xStaffs", ServicePathType.OBJECT),
	GETXSTAFFBYREFID("xStaffs/{refId}", ServicePathType.SINGLE),
	GETXSTAFFSBYXLEA("xLeas/{refId}/xStaffs", ServicePathType.PREDICATE),
	GETXSTAFFSBYXSCHOOL("xSchools/{refId}/xStaffs", ServicePathType.PREDICATE),
	GETXSTAFFSBYXCOURSE("xCourses/{refId}/xStaffs", ServicePathType.PREDICATE),
	GETXSTAFFSBYXROSTER("xRosters/{refId}/xStaffs", ServicePathType.PREDICATE),
	GETXSTAFFSBYXSTUDENT("xStudents/{refId}/xStaffs", ServicePathType.PREDICATE),
	GETXSTUDENTS("xStudents", ServicePathType.OBJECT),
	GETXSTUDENTBYREFID("xStudents/{refId}", ServicePathType.SINGLE),
	GETXSTUDENTSBYXLEA("xLeas/{refId}/xStudents", ServicePathType.PREDICATE),
	GETXSTUDENTSBYXSCHOOL("xSchools/{refId}/xStudents", ServicePathType.PREDICATE),
	GETXSTUDENTSBYXROSTER("xRosters/{refId}/xStudents", ServicePathType.PREDICATE),
	GETXSTUDENTSBYXSTAFF("xStaffs/{refId}/xStudents", ServicePathType.PREDICATE),
	GETXSTUDENTSBYXCONTACT("xContacts/{refId}/xStudents", ServicePathType.PREDICATE),
	GETXCONTACTS("xContacts", ServicePathType.OBJECT),
	GETXCONTACTBYREFID("xContacts/{refId}", ServicePathType.SINGLE),
	GETXCONTACTSBYXLEA("xLeas/{refId}/xContacts", ServicePathType.PREDICATE),
	GETXCONTACTSBYXSCHOOL("xSchools/{refId}/xContacts", ServicePathType.PREDICATE),
	GETXCONTACTSBYXSTUDENT("xStudents/{refId}/xContacts", ServicePathType.PREDICATE);

	protected String value;
	protected ServicePathType type;

	ServicePath(String value, ServicePathType type) {
		this.value = value;
		this.type = type;
	}

	public String getValue() {
		return value;
	}

	ServicePath(String value)
	{
		this.value = value;
	}

	public ServicePathType getType() {
		return type;
	}

	public void setType(ServicePathType type) {
		this.type = type;
	}
}

package riconeapi.common.objects;

import riconeapi.common.rest.ServicePathType;

/*
  @author Andrew Pieniezny <andrew.pieniezny@neric.org>
 * @version 1.9.0
 * @since 11/8/2019
 */

/**
 * Supported Service Paths in RIC One API.
 */
@SuppressWarnings("unused")
public enum ServicePath {
    /**
     * xLeas
     */
    GETXLEAS("xLeas", ServicePathType.OBJECT),
    /**
     * xLeas/{refId}
     */
    GETXLEABYREFID("xLeas/{refId}", ServicePathType.SINGLE),
    /**
     * xLeas/{id}
     */
    GETXLEABYID("xLeas/{id}", ServicePathType.SINGLE),
    /**
     * xSchools/{refId}/xLeas
     */
    GETXLEASBYXSCHOOL("xSchools/{refId}/xLeas", ServicePathType.PREDICATE),
    /**
     * xRosters/{refId}/xLeas
     */
    GETXLEASBYXROSTER("xRosters/{refId}/xLeas", ServicePathType.PREDICATE),
    /**
     * xStaffs/{refId}/xLeas
     */
    GETXLEASBYXSTAFF("xStaffs/{refId}/xLeas", ServicePathType.PREDICATE),
    /**
     * xStudents/{refId}/xLeas
     */
    GETXLEASBYXSTUDENT("xStudents/{refId}/xLeas", ServicePathType.PREDICATE),
    /**
     * xContacts/{refId}/xLeas
     */
    GETXLEASBYXCONTACT("xContacts/{refId}/xLeas", ServicePathType.PREDICATE),
    /**
     * xSchools
     */
    GETXSCHOOLS("xSchools", ServicePathType.OBJECT),
    /**
     * xSchools/{refId}
     */
    GETXSCHOOLBYREFID("xSchools/{refId}", ServicePathType.SINGLE),
    /**
     * xSchools/{id}
     */
    GETXSCHOOLBYID("xSchools/{id}", ServicePathType.SINGLE),
    /**
     * xLeas/{refId}/xSchools
     */
    GETXSCHOOLSBYXLEA("xLeas/{refId}/xSchools", ServicePathType.PREDICATE),
    /**
     * xCalendars/{refId}/xSchools
     */
    GETXSCHOOLSBYXCALENDAR("xCalendars/{refId}/xSchools", ServicePathType.PREDICATE),
    /**
     * xCourses/{refId}/xSchools
     */
    GETXSCHOOLSBYXCOURSE("xCourses/{refId}/xSchools", ServicePathType.PREDICATE),
    /**
     * xRosters/{refId}/xSchools
     */
    GETXSCHOOLSBYXROSTER("xRosters/{refId}/xSchools", ServicePathType.PREDICATE),
    /**
     * xStaffs/{refId}/xSchools
     */
    GETXSCHOOLSBYXSTAFF("xStaffs/{refId}/xSchools", ServicePathType.PREDICATE),
    /**
     * xStudents/{refId}/xSchools
     */
    GETXSCHOOLSBYXSTUDENT("xStudents/{refId}/xSchools", ServicePathType.PREDICATE),
    /**
     * xContacts/{refId}/xSchools
     */
    GETXSCHOOLSBYXCONTACT("xContacts/{refId}/xSchools", ServicePathType.PREDICATE),
    /**
     * xCalendars
     */
    GETXCALENDARS("xCalendars", ServicePathType.OBJECT),
    /**
     * xCalendars/{refId}
     */
    GETXCALENDARBYREFID("xCalendars/{refId}", ServicePathType.SINGLE),
    /**
     * xLeas/{refId}/xCalendars
     */
    GETXCALENDARSBYXLEA("xLeas/{refId}/xCalendars", ServicePathType.PREDICATE),
    /**
     * xSchools/{refId}/xCalendars
     */
    GETXCALENDARSBYXSCHOOL("xSchools/{refId}/xCalendars", ServicePathType.PREDICATE),
    /**
     * xCourses
     */
    GETXCOURSES("xCourses", ServicePathType.OBJECT),
    /**
     * xCourses/{refId}
     */
    GETXCOURSEBYREFID("xCourses/{refId}", ServicePathType.SINGLE),
    /**
     * xLeas/{refId}/xCourses
     */
    GETXCOURSESBYXLEA("xLeas/{refId}/xCourses", ServicePathType.PREDICATE),
    /**
     * xSchools/{refId}/xCourses
     */
    GETXCOURSESBYXSCHOOL("xSchools/{refId}/xCourses", ServicePathType.PREDICATE),
    /**
     * xRosters/{refId}/xCourses
     */
    GETXCOURSESBYXROSTER("xRosters/{refId}/xCourses", ServicePathType.PREDICATE),
    /**
     * xRosters
     */
    GETXROSTERS("xRosters", ServicePathType.OBJECT),
    /**
     * xRosters/{refId}
     */
    GETXROSTERBYREFID("xRosters/{refId}", ServicePathType.SINGLE),
    /**
     * xLeas/{refId}/xRosters
     */
    GETXROSTERSBYXLEA("xLeas/{refId}/xRosters", ServicePathType.PREDICATE),
    /**
     * xSchools/{refId}/xRosters
     */
    GETXROSTERSBYXSCHOOL("xSchools/{refId}/xRosters", ServicePathType.PREDICATE),
    /**
     * xCourses/{refId}/xRosters
     */
    GETXROSTERSBYXCOURSE("xCourses/{refId}/xRosters", ServicePathType.PREDICATE),
    /**
     * xStaffs/{refId}/xRosters
     */
    GETXROSTERSBYXSTAFF("xStaffs/{refId}/xRosters", ServicePathType.PREDICATE),
    /**
     * xStudents/{refId}/xRosters
     */
    GETXROSTERSBYXSTUDENT("xStudents/{refId}/xRosters", ServicePathType.PREDICATE),
    /**
     * xStaffs
     */
    GETXSTAFFS("xStaffs", ServicePathType.OBJECT),
    /**
     * xStaffs/{refId}
     */
    GETXSTAFFBYREFID("xStaffs/{refId}", ServicePathType.SINGLE),
    /**
     * xLeas/{refId}/xStaffs
     */
    GETXSTAFFSBYXLEA("xLeas/{refId}/xStaffs", ServicePathType.PREDICATE),
    /**
     * xSchools/{refId}/xStaffs
     */
    GETXSTAFFSBYXSCHOOL("xSchools/{refId}/xStaffs", ServicePathType.PREDICATE),
    /**
     * xCourses/{refId}/xStaffs
     */
    GETXSTAFFSBYXCOURSE("xCourses/{refId}/xStaffs", ServicePathType.PREDICATE),
    /**
     * xRosters/{refId}/xStaffs
     */
    GETXSTAFFSBYXROSTER("xRosters/{refId}/xStaffs", ServicePathType.PREDICATE),
    /**
     * xStudents/{refId}/xStaffs
     */
    GETXSTAFFSBYXSTUDENT("xStudents/{refId}/xStaffs", ServicePathType.PREDICATE),
    /**
     * xStudents
     */
    GETXSTUDENTS("xStudents", ServicePathType.OBJECT),
    /**
     * xStudents/{refId}
     */
    GETXSTUDENTBYREFID("xStudents/{refId}", ServicePathType.SINGLE),
    /**
     * xLeas/{refId}/xStudents
     */
    GETXSTUDENTSBYXLEA("xLeas/{refId}/xStudents", ServicePathType.PREDICATE),
    /**
     * xSchools/{refId}/xStudents
     */
    GETXSTUDENTSBYXSCHOOL("xSchools/{refId}/xStudents", ServicePathType.PREDICATE),
    /**
     * xRosters/{refId}/xStudents
     */
    GETXSTUDENTSBYXROSTER("xRosters/{refId}/xStudents", ServicePathType.PREDICATE),
    /**
     * xStaffs/{refId}/xStudents
     */
    GETXSTUDENTSBYXSTAFF("xStaffs/{refId}/xStudents", ServicePathType.PREDICATE),
    /**
     * xContacts/{refId}/xStudents
     */
    GETXSTUDENTSBYXCONTACT("xContacts/{refId}/xStudents", ServicePathType.PREDICATE),
    /**
     * xContacts
     */
    GETXCONTACTS("xContacts", ServicePathType.OBJECT),
    /**
     * xContacts/{refId}
     */
    GETXCONTACTBYREFID("xContacts/{refId}", ServicePathType.SINGLE),
    /**
     * xLeas/{refId}/xContacts
     */
    GETXCONTACTSBYXLEA("xLeas/{refId}/xContacts", ServicePathType.PREDICATE),
    /**
     * xSchools/{refId}/xContacts
     */
    GETXCONTACTSBYXSCHOOL("xSchools/{refId}/xContacts", ServicePathType.PREDICATE),
    /**
     * xStudents/{refId}/xContacts
     */
    GETXCONTACTSBYXSTUDENT("xStudents/{refId}/xContacts", ServicePathType.PREDICATE),
    /**
     * xEmployments
     */
    GETXEMPLOYMENTS("xEmployments", ServicePathType.OBJECT),
    /**
     * xEmployments/{refId}
     */
    GETXEMPLOYMENTBYREFID("xEmployments/{refId}", ServicePathType.PREDICATE),

    /**
     * xLeas/{refId}/xEmployments
     */
    GETXEMPLOYMENTSBYXLEA("xLeas/{refId}/xEmployments", ServicePathType.OBJECT),

    /**
     * xSchools/{refId}/xEmployments
     */
    GETXEMPLOYMENTSBYXSCHOOL("xSchools/{refId}/xEmployments", ServicePathType.OBJECT);

    private final String value;
    protected ServicePathType type;

    ServicePath(String value, ServicePathType type) {
        this.value = value;
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    ServicePath(String value) {
        this.value = value;
    }

    public ServicePathType getType() {
        return type;
    }

    public void setType(ServicePathType type) {
        this.type = type;
    }
}

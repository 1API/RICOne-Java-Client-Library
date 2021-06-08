package riconeapi.library.client.request;

import riconeapi.library.client.response.*;

import java.util.List;

/*
 * @author Andrew Pieniezny <andrew.pieniezny@neric.org>
 * @version 2.0.0
 * @since 1/8/2021
 */

/**
 * Supported service paths in the RIC One API xPress data model. The enumerators are used when making requests with
 * the XRequest builder.
 */
@SuppressWarnings("unused")
public enum ServicePath {
    /**
     * xLeas
     */
    GET_XLEAS("xLeas", ServicePathType.OBJECT, List.of(RequestType.BASIC, RequestType.CHANGES_SINCE), XLeasResponse.class),

    /**
     * xSchools/{refId}/xLeas
     */
    GET_XLEAS_BY_XSCHOOL("xSchools/{refId}/xLeas", ServicePathType.PREDICATE, List.of(RequestType.BASIC, RequestType.CHANGES_SINCE), XLeasResponse.class),

    /**
     * xRosters/{refId}/xLeas
     */
    GET_XLEAS_BY_XROSTER("xRosters/{refId}/xLeas", ServicePathType.PREDICATE, List.of(RequestType.BASIC, RequestType.CHANGES_SINCE), XLeasResponse.class),

    /**
     * xStaffs/{refId}/xLeas
     */
    GET_XLEAS_BY_XSTAFF("xStaffs/{refId}/xLeas", ServicePathType.PREDICATE, List.of(RequestType.BASIC, RequestType.CHANGES_SINCE), XLeasResponse.class),

    /**
     * xStudents/{refId}/xLeas
     */
    GET_XLEAS_BY_XSTUDENT("xStudents/{refId}/xLeas", ServicePathType.PREDICATE, List.of(RequestType.BASIC, RequestType.CHANGES_SINCE), XLeasResponse.class),

    /**
     * xContacts/{refId}/xLeas
     */
    GET_XLEAS_BY_XCONTACT("xContacts/{refId}/xLeas", ServicePathType.PREDICATE, List.of(RequestType.BASIC, RequestType.CHANGES_SINCE), XLeasResponse.class),

    /**
     * xLeas/{refId}
     */
    GET_XLEA_BY_REFID("xLeas/{refId}", ServicePathType.SINGLE, List.of(RequestType.BASIC), XLeaResponse.class),

    /**
     * xLeas/{id}
     */
    GET_XLEA_BY_ID("xLeas/{id}", ServicePathType.SINGLE, List.of(RequestType.ID), XLeaResponse.class),

    /**
     * xSchools
     */
    GET_XSCHOOLS("xSchools", ServicePathType.OBJECT, List.of(RequestType.BASIC, RequestType.CHANGES_SINCE), XSchoolsResponse.class),

    /**
     * xLeas/{refId}/xSchools
     */
    GET_XSCHOOLS_BY_XLEA("xLeas/{refId}/xSchools", ServicePathType.PREDICATE, List.of(RequestType.BASIC, RequestType.CHANGES_SINCE), XSchoolsResponse.class),

    /**
     * xCalendars/{refId}/xSchools
     */
    GET_XSCHOOLS_BY_XCALENDAR("xCalendars/{refId}/xSchools", ServicePathType.PREDICATE, List.of(RequestType.BASIC, RequestType.CHANGES_SINCE), XSchoolsResponse.class),

    /**
     * xCourses/{refId}/xSchools
     */
    GET_XSCHOOLS_BY_XCOURSE("xCourses/{refId}/xSchools", ServicePathType.PREDICATE, List.of(RequestType.BASIC, RequestType.CHANGES_SINCE), XSchoolsResponse.class),

    /**
     * xRosters/{refId}/xSchools
     */
    GET_XSCHOOLS_BY_XROSTER("xRosters/{refId}/xSchools", ServicePathType.PREDICATE, List.of(RequestType.BASIC, RequestType.CHANGES_SINCE), XSchoolsResponse.class),

    /**
     * xStaffs/{refId}/xSchools
     */
    GET_XSCHOOLS_BY_XSTAFF("xStaffs/{refId}/xSchools", ServicePathType.PREDICATE, List.of(RequestType.BASIC, RequestType.CHANGES_SINCE), XSchoolsResponse.class),

    /**
     * xStudents/{refId}/xSchools
     */
    GET_XSCHOOLS_BY_XSTUDENT("xStudents/{refId}/xSchools", ServicePathType.PREDICATE, List.of(RequestType.BASIC, RequestType.CHANGES_SINCE), XSchoolsResponse.class),

    /**
     * xContacts/{refId}/xSchools
     */
    GET_XSCHOOLS_BY_XCONTACT("xContacts/{refId}/xSchools", ServicePathType.PREDICATE, List.of(RequestType.BASIC, RequestType.CHANGES_SINCE), XSchoolsResponse.class),

    /**
     * xSchools/{refId}
     */
    GET_XSCHOOL_BY_REFID("xSchools/{refId}", ServicePathType.SINGLE, List.of(RequestType.BASIC), XSchoolResponse.class),

    /**
     * xSchools/{id}
     */
    GET_XSCHOOL_BY_ID("xSchools/{id}", ServicePathType.SINGLE, List.of(RequestType.ID), XSchoolResponse.class),

    /**
     * xCalendars
     */
    GET_XCALENDARS("xCalendars", ServicePathType.OBJECT, List.of(RequestType.BASIC, RequestType.CHANGES_SINCE), XCalendarsResponse.class),

    /**
     * xLeas/{refId}/xCalendars
     */
    GET_XCALENDARS_BY_XLEA("xLeas/{refId}/xCalendars", ServicePathType.PREDICATE, List.of(RequestType.BASIC, RequestType.CHANGES_SINCE), XCalendarsResponse.class),

    /**
     * xSchools/{refId}/xCalendars
     */
    GET_XCALENDARS_BY_XSCHOOL("xSchools/{refId}/xCalendars", ServicePathType.PREDICATE, List.of(RequestType.BASIC, RequestType.CHANGES_SINCE), XCalendarsResponse.class),

    /**
     * xCalendars/{refId}
     */
    GET_XCALENDAR_BY_REFID("xCalendars/{refId}", ServicePathType.SINGLE, List.of(RequestType.BASIC), XCalendarResponse.class),

    /**
     * xCourses
     */
    GET_XCOURSES("xCourses", ServicePathType.OBJECT, List.of(RequestType.BASIC, RequestType.CHANGES_SINCE), XCoursesResponse.class),

    /**
     * xLeas/{refId}/xCourses
     */
    GET_XCOURSES_BY_XLEA("xLeas/{refId}/xCourses", ServicePathType.PREDICATE, List.of(RequestType.BASIC, RequestType.CHANGES_SINCE), XCoursesResponse.class),

    /**
     * xSchools/{refId}/xCourses
     */
    GET_XCOURSES_BY_XSCHOOL("xSchools/{refId}/xCourses", ServicePathType.PREDICATE, List.of(RequestType.BASIC, RequestType.CHANGES_SINCE), XCoursesResponse.class),
    /**
     * xRosters/{refId}/xCourses
     */
    GET_XCOURSES_BY_XROSTER("xRosters/{refId}/xCourses", ServicePathType.PREDICATE, List.of(RequestType.BASIC, RequestType.CHANGES_SINCE), XCoursesResponse.class),

    /**
     * xCourses/{refId}
     */
    GET_XCOURSE_BY_REFID("xCourses/{refId}", ServicePathType.SINGLE, List.of(RequestType.BASIC), XCourseResponse.class),

    /**
     * xRosters
     */
    GET_XROSTERS("xRosters", ServicePathType.OBJECT, List.of(RequestType.BASIC, RequestType.CHANGES_SINCE), XRostersResponse.class),

    /**
     * xLeas/{refId}/xRosters
     */
    GET_XROSTERS_BY_XLEA("xLeas/{refId}/xRosters", ServicePathType.PREDICATE, List.of(RequestType.BASIC, RequestType.CHANGES_SINCE), XRostersResponse.class),

    /**
     * xSchools/{refId}/xRosters
     */
    GET_XROSTERS_BY_XSCHOOL("xSchools/{refId}/xRosters", ServicePathType.PREDICATE, List.of(RequestType.BASIC, RequestType.CHANGES_SINCE), XRostersResponse.class),

    /**
     * xCourses/{refId}/xRosters
     */
    GET_XROSTERS_BY_XCOURSE("xCourses/{refId}/xRosters", ServicePathType.PREDICATE, List.of(RequestType.BASIC, RequestType.CHANGES_SINCE), XRostersResponse.class),

    /**
     * xStaffs/{refId}/xRosters
     */
    GET_XROSTERS_BY_XSTAFF("xStaffs/{refId}/xRosters", ServicePathType.PREDICATE, List.of(RequestType.BASIC, RequestType.CHANGES_SINCE), XRostersResponse.class),

    /**
     * xStudents/{refId}/xRosters
     */
    GET_XROSTERS_BY_XSTUDENT("xStudents/{refId}/xRosters", ServicePathType.PREDICATE, List.of(RequestType.BASIC, RequestType.CHANGES_SINCE), XRostersResponse.class),

    /**
     * xRosters/{refId}
     */
    GET_XROSTER_BY_REFID("xRosters/{refId}", ServicePathType.SINGLE, List.of(RequestType.BASIC), XRosterResponse.class),

    /**
     * xStaffs
     */
    GET_XSTAFFS("xStaffs", ServicePathType.OBJECT, List.of(RequestType.BASIC, RequestType.CHANGES_SINCE), XStaffsResponse.class),

    /**
     * xLeas/{refId}/xStaffs
     */
    GET_XSTAFFS_BY_XLEA("xLeas/{refId}/xStaffs", ServicePathType.PREDICATE, List.of(RequestType.BASIC, RequestType.CHANGES_SINCE), XStaffsResponse.class),

    /**
     * xSchools/{refId}/xStaffs
     */
    GET_XSTAFFS_BY_XSCHOOL("xSchools/{refId}/xStaffs", ServicePathType.PREDICATE, List.of(RequestType.BASIC, RequestType.CHANGES_SINCE), XStaffsResponse.class),

    /**
     * xCourses/{refId}/xStaffs
     */
    GET_XSTAFFS_BY_XCOURSE("xCourses/{refId}/xStaffs", ServicePathType.PREDICATE, List.of(RequestType.BASIC, RequestType.CHANGES_SINCE), XStaffsResponse.class),

    /**
     * xRosters/{refId}/xStaffs
     */
    GET_XSTAFFS_BY_XROSTER("xRosters/{refId}/xStaffs", ServicePathType.PREDICATE, List.of(RequestType.BASIC, RequestType.CHANGES_SINCE), XStaffsResponse.class),

    /**
     * xStudents/{refId}/xStaffs
     */
    GET_XSTAFFS_BY_XSTUDENT("xStudents/{refId}/xStaffs", ServicePathType.PREDICATE, List.of(RequestType.BASIC, RequestType.CHANGES_SINCE), XStaffsResponse.class),

    /**
     * xStaffs/{refId}
     */
    GET_XSTAFF_BY_REFID("xStaffs/{refId}", ServicePathType.SINGLE, List.of(RequestType.BASIC), XStaffResponse.class),

    /**
     * xStudents
     */
    GET_XSTUDENTS("xStudents", ServicePathType.OBJECT, List.of(RequestType.BASIC, RequestType.CHANGES_SINCE), XStudentsResponse.class),

    /**
     * xLeas/{refId}/xStudents
     */
    GET_XSTUDENTS_BY_XLEA("xLeas/{refId}/xStudents", ServicePathType.PREDICATE, List.of(RequestType.BASIC, RequestType.CHANGES_SINCE), XStudentsResponse.class),

    /**
     * xSchools/{refId}/xStudents
     */
    GET_XSTUDENTS_BY_XSCHOOL("xSchools/{refId}/xStudents", ServicePathType.PREDICATE, List.of(RequestType.BASIC, RequestType.CHANGES_SINCE), XStudentsResponse.class),

    /**
     * xRosters/{refId}/xStudents
     */
    GET_XSTUDENTS_BY_XROSTER("xRosters/{refId}/xStudents", ServicePathType.PREDICATE, List.of(RequestType.BASIC, RequestType.CHANGES_SINCE), XStudentsResponse.class),

    /**
     * xStaffs/{refId}/xStudents
     */
    GET_XSTUDENTS_BY_XSTAFF("xStaffs/{refId}/xStudents", ServicePathType.PREDICATE, List.of(RequestType.BASIC, RequestType.CHANGES_SINCE), XStudentsResponse.class),

    /**
     * xContacts/{refId}/xStudents
     */
    GET_XSTUDENTS_BY_XCONTACT("xContacts/{refId}/xStudents", ServicePathType.PREDICATE, List.of(RequestType.BASIC, RequestType.CHANGES_SINCE), XStudentsResponse.class),

    /**
     * xStudents/{refId}
     */
    GET_XSTUDENT_BY_REFID("xStudents/{refId}", ServicePathType.SINGLE, List.of(RequestType.BASIC), XStudentResponse.class),

    /**
     * xContacts
     */
    GET_XCONTACTS("xContacts", ServicePathType.OBJECT, List.of(RequestType.BASIC, RequestType.CHANGES_SINCE), XContactsResponse.class),

    /**
     * xLeas/{refId}/xContacts
     */
    GET_XCONTACTS_BY_XLEA("xLeas/{refId}/xContacts", ServicePathType.PREDICATE, List.of(RequestType.BASIC, RequestType.CHANGES_SINCE), XContactsResponse.class),

    /**
     * xSchools/{refId}/xContacts
     */
    GET_XCONTACTS_BY_XSCHOOL("xSchools/{refId}/xContacts", ServicePathType.PREDICATE, List.of(RequestType.BASIC, RequestType.CHANGES_SINCE), XContactsResponse.class),

    /**
     * xStudents/{refId}/xContacts
     */
    GET_XCONTACTS_BY_XSTUDENT("xStudents/{refId}/xContacts", ServicePathType.PREDICATE, List.of(RequestType.BASIC, RequestType.CHANGES_SINCE), XContactsResponse.class),

    /**
     * xContacts/{refId}
     */
    GET_XCONTACT_BY_REFID("xContacts/{refId}", ServicePathType.SINGLE, List.of(RequestType.BASIC), XContactResponse.class),

    /**
     * xEmployments
     */
    GET_XEMPLOYMENTS("xEmployments", ServicePathType.OBJECT, List.of(RequestType.BASIC, RequestType.CHANGES_SINCE), XEmploymentsResponse.class),

    /**
     * xLeas/{refId}/xEmployments
     */
    GET_XEMPLOYMENTS_BY_XLEA("xLeas/{refId}/xEmployments", ServicePathType.OBJECT, List.of(RequestType.BASIC, RequestType.CHANGES_SINCE), XEmploymentsResponse.class),

    /**
     * xSchools/{refId}/xEmployments
     */
    GET_XEMPLOYMENTS_BY_XSCHOOL("xSchools/{refId}/xEmployments", ServicePathType.OBJECT, List.of(RequestType.BASIC, RequestType.CHANGES_SINCE), XEmploymentsResponse.class),

    /**
     * xEmployments/{refId}
     */
    GET_XEMPLOYMENT_BY_REFID("xEmployments/{refId}", ServicePathType.SINGLE, List.of(RequestType.BASIC), XEmploymentResponse.class);

    private final String value;
    private ServicePathType servicePathType;
    private List<RequestType> requestType;
    private Class responseClass;

    ServicePath(String value, ServicePathType servicePathType, List<RequestType> requestType, Class responseClass) {
        this.value = value;
        this.servicePathType = servicePathType;
        this.requestType = requestType;
        this.responseClass = responseClass;
    }

    /**
     * Gets the value of the constructor.
     * <p>
     * The value of the enumerator is the relative service path url. For example, for the predicate request GET_XROSTERS_BY_XSCHOOL,
     * the value is /xSchools/{refId}/xRosters.
     * @return the service path value.
     */
    public String getValue() {
        return value;
    }

    /**
     * Gets the service path type. ServicePathType is used to classify each service path. See {@link ServicePathType}.
     * @return the service path type.
     */
    public ServicePathType getServicePathType() {
        return servicePathType;
    }

    /**
     * Gets the request type(s) for the service path. RequestType is used to classify each service path. See {@link RequestType}.
     * @return the request type.
     */
    public List<RequestType> getRequestType() { return requestType; } // TODO: 1/8/2021 use for testing

    /**
     * Gets the response class used for a service path.
     * @return the class of the response.
     */
    public Class getResponseClass() { return responseClass; }
}

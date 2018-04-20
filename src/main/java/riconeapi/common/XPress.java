package riconeapi.common;

import org.springframework.web.client.RestTemplate;
import riconeapi.common.objects.*;
import riconeapi.common.rest.ResponseMulti;
import riconeapi.common.rest.ResponseSingle;
import riconeapi.exceptions.AuthenticationException;
import riconeapi.models.xpress.*;

/**
 * @author      Andrew Pieniezny <andrew.pieniezny@neric.org>
 * @version     1.7
 * @since       Apr 20, 2018
 *
 * Static class allowing access to xPress data model objects
 */
@SuppressWarnings("unused")
public class XPress {
	private final XLeasObject xLeasObject;
	private final XSchoolsObject xSchoolsObject;
	private final XCalendarsObject xCalendarsObject;
	private final XCoursesObject xCoursesObject;
	private final XRostersObject xRostersObject;
	private final XStaffsObject xStaffsObject;
	private final XStudentsObject xStudentsObject;
	private final XContactsObject xContactsObject;
	private final GetLastPageObject getLastPageObject;
	private final AUPPObject auppObject;

	public XPress(String baseApiUrl) {
		RestTemplate rt = new RestTemplate();

		xLeasObject = new XLeasObject(rt, baseApiUrl);
		xSchoolsObject = new XSchoolsObject(rt, baseApiUrl);
		xCalendarsObject = new XCalendarsObject(rt, baseApiUrl);
		xCoursesObject = new XCoursesObject(rt, baseApiUrl);
		xRostersObject = new XRostersObject(rt, baseApiUrl);
		xStaffsObject = new XStaffsObject(rt, baseApiUrl);
		xStudentsObject = new XStudentsObject(rt, baseApiUrl);
		xContactsObject = new XContactsObject(rt, baseApiUrl);
		getLastPageObject = new GetLastPageObject(rt, baseApiUrl);
		auppObject = new AUPPObject(rt, baseApiUrl);
	}

	/* xLeas */
    public ResponseMulti<XLeaType> getXLeas() throws AuthenticationException {
        return xLeasObject.getXLeas();
    }
	public ResponseMulti<XLeaType> getXLeas(int schoolYear) throws AuthenticationException {
		return xLeasObject.getXLeas(schoolYear);
	}
	public ResponseMulti<XLeaType> getXLeas(int navigationPage, int navigationPageSize) throws AuthenticationException {
		return xLeasObject.getXLeas(navigationPage, navigationPageSize);
	}
	public ResponseMulti<XLeaType> getXLeas(int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
		return xLeasObject.getXLeas(navigationPage, navigationPageSize, schoolYear);
	}
	public ResponseMulti<XLeaType> getXLeas(String opaqueMarker) throws AuthenticationException {
		return xLeasObject.getXLeas(opaqueMarker);
	}
    // TODO NEW
    public ResponseMulti<XLeaType> getXLeas(int navigationPage, int navigationPageSize, String opaqueMarker) throws AuthenticationException {
        return xLeasObject.getXLeas(navigationPage, navigationPageSize, opaqueMarker);
    }
	public ResponseSingle<XLeaType> getXLea(String refId) throws AuthenticationException {
		return xLeasObject.getXLea(refId);
	}
	public ResponseSingle<XLeaType> getXLea(String refId, int schoolYear) throws AuthenticationException {
		return xLeasObject.getXLea(refId, schoolYear);
	}
	public ResponseSingle<XLeaType> getXLea(String idType, String id) throws AuthenticationException {
		return xLeasObject.getXLea(idType, id);
	}
	public ResponseSingle<XLeaType> getXLea(String idType, String id, int schoolYear) throws AuthenticationException {
		return xLeasObject.getXLea(idType, id, schoolYear);
	}
	public ResponseMulti<XLeaType> getXLeasByXSchool(String refId) throws AuthenticationException {
		return xLeasObject.getXLeasByXSchool(refId);
	}
	public ResponseMulti<XLeaType> getXLeasByXSchool(String refId, int schoolYear) throws AuthenticationException {
		return xLeasObject.getXLeasByXSchool(refId, schoolYear);
	}
    public ResponseMulti<XLeaType> getXLeasByXSchool(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        return xLeasObject.getXLeasByXSchool(refId, navigationPage, navigationPageSize);
    }
	public ResponseMulti<XLeaType> getXLeasByXSchool(String refId, int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
		return xLeasObject.getXLeasByXSchool(refId, navigationPage, navigationPageSize, schoolYear);
	}
	public ResponseMulti<XLeaType> getXLeasByXRoster(String refId) throws AuthenticationException {
		return xLeasObject.getXLeasByXRoster(refId);
	}
	public ResponseMulti<XLeaType> getXLeasByXRoster(String refId, int schoolYear) throws AuthenticationException {
		return xLeasObject.getXLeasByXRoster(refId, schoolYear);
	}
    public ResponseMulti<XLeaType> getXLeasByXRoster(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        return xLeasObject.getXLeasByXRoster(refId, navigationPage, navigationPageSize);
    }
	public ResponseMulti<XLeaType> getXLeasByXRoster(String refId, int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
		return xLeasObject.getXLeasByXRoster(refId, navigationPage, navigationPageSize, schoolYear);
	}
	public ResponseMulti<XLeaType> getXLeasByXStaff(String refId) throws AuthenticationException {
		return xLeasObject.getXLeasByXStaff(refId);
	}
	public ResponseMulti<XLeaType> getXLeasByXStaff(String refId, int schoolYear) throws AuthenticationException {
		return xLeasObject.getXLeasByXStaff(refId, schoolYear);
	}
    public ResponseMulti<XLeaType> getXLeasByXStaff(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        return xLeasObject.getXLeasByXStaff(refId, navigationPage, navigationPageSize);
    }
	public ResponseMulti<XLeaType> getXLeasByXStaff(String refId, int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
		return xLeasObject.getXLeasByXStaff(refId, navigationPage, navigationPageSize, schoolYear);
	}
	public ResponseMulti<XLeaType> getXLeasByXStudent(String refId) throws AuthenticationException {
		return xLeasObject.getXLeasByXStudent(refId);
	}
	public ResponseMulti<XLeaType> getXLeasByXStudent(String refId, int schoolYear) throws AuthenticationException {
		return xLeasObject.getXLeasByXStudent(refId, schoolYear);
	}
    public ResponseMulti<XLeaType> getXLeasByXStudent(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        return xLeasObject.getXLeasByXStudent(refId, navigationPage, navigationPageSize);
    }
	public ResponseMulti<XLeaType> getXLeasByXStudent(String refId, int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
		return xLeasObject.getXLeasByXStudent(refId, navigationPage, navigationPageSize, schoolYear);
	}
	public ResponseMulti<XLeaType> getXLeasByXContact(String refId) throws AuthenticationException {
		return xLeasObject.getXLeasByXContact(refId);
	}
	public ResponseMulti<XLeaType> getXLeasByXContact(String refId, int schoolYear) throws AuthenticationException {
		return xLeasObject.getXLeasByXContact(refId, schoolYear);
	}
    public ResponseMulti<XLeaType> getXLeasByXContact(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        return xLeasObject.getXLeasByXContact(refId, navigationPage, navigationPageSize);
    }
	public ResponseMulti<XLeaType> getXLeasByXContact(String refId, int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
		return xLeasObject.getXLeasByXContact(refId, navigationPage, navigationPageSize, schoolYear);
	}

    /* xSchools */
    public ResponseMulti<XSchoolType> getXSchools() throws AuthenticationException {
        return xSchoolsObject.getXSchools();
    }
	public ResponseMulti<XSchoolType> getXSchools(int schoolYear) throws AuthenticationException {
		return xSchoolsObject.getXSchools(schoolYear);
	}
	public ResponseMulti<XSchoolType> getXSchools(int navigationPage, int navigationPageSize) throws AuthenticationException {
		return xSchoolsObject.getXSchools(navigationPage, navigationPageSize);
	}
	public ResponseMulti<XSchoolType> getXSchools(int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
		return xSchoolsObject.getXSchools(navigationPage, navigationPageSize, schoolYear);
	}
	public ResponseMulti<XSchoolType> getXSchools(String opaqueMarker) throws AuthenticationException {
		return xSchoolsObject.getXSchools(opaqueMarker);
	}
    // todo NEW
    public ResponseMulti<XSchoolType> getXSchools(int navigationPage, int navigationPageSize, String opaqueMarker) throws AuthenticationException {
        return xSchoolsObject.getXSchools(navigationPage, navigationPageSize, opaqueMarker);
    }
	public ResponseSingle<XSchoolType> getXSchool(String refId) throws AuthenticationException {
		return xSchoolsObject.getXSchool(refId);
	}
	public ResponseSingle<XSchoolType> getXSchool(String refId, int schoolYear) throws AuthenticationException {
		return xSchoolsObject.getXSchool(refId, schoolYear);
	}
	public ResponseSingle<XSchoolType> getXSchool(String idType, String id) throws AuthenticationException {
		return xSchoolsObject.getXSchool(idType, id);
	}
	public ResponseSingle<XSchoolType> getXSchool(String idType, String id, int schoolYear) throws AuthenticationException {
		return xSchoolsObject.getXSchool(idType, id, schoolYear);
	}
	public ResponseMulti<XSchoolType> getXSchoolsByXLea(String refId) throws AuthenticationException {
		return xSchoolsObject.getXSchoolsByXLea(refId);
	}
	public ResponseMulti<XSchoolType> getXSchoolsByXLea(String refId, int schoolYear) throws AuthenticationException {
		return xSchoolsObject.getXSchoolsByXLea(refId, schoolYear);
	}
    public ResponseMulti<XSchoolType> getXSchoolsByXLea(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
		return xSchoolsObject.getXSchoolsByXLea(refId, navigationPage, navigationPageSize);
	}
	public ResponseMulti<XSchoolType> getXSchoolsByXLea(String refId, int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
		return xSchoolsObject.getXSchoolsByXLea(refId, navigationPage, navigationPageSize, schoolYear);
	}
	public ResponseMulti<XSchoolType> getXSchoolsByXCalendar(String refId) throws AuthenticationException {
		return xSchoolsObject.getXSchoolsByXCalendar(refId);
	}
	public ResponseMulti<XSchoolType> getXSchoolsByXCalendar(String refId, int schoolYear) throws AuthenticationException {
		return xSchoolsObject.getXSchoolsByXCalendar(refId, schoolYear);
	}
    public ResponseMulti<XSchoolType> getXSchoolsByXCalendar(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        return xSchoolsObject.getXSchoolsByXCalendar(refId, navigationPage, navigationPageSize);
    }
	public ResponseMulti<XSchoolType> getXSchoolsByXCalendar(String refId, int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
		return xSchoolsObject.getXSchoolsByXCalendar(refId, navigationPage, navigationPageSize, schoolYear);
	}
	public ResponseMulti<XSchoolType> getXSchoolsByXCourse(String refId) throws AuthenticationException {
		return xSchoolsObject.getXSchoolsByXCourse(refId);
	}
	public ResponseMulti<XSchoolType> getXSchoolsByXCourse(String refId, int schoolYear) throws AuthenticationException {
		return xSchoolsObject.getXSchoolsByXCourse(refId, schoolYear);
	}
    public ResponseMulti<XSchoolType> getXSchoolsByXCourse(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        return xSchoolsObject.getXSchoolsByXCourse(refId, navigationPage, navigationPageSize);
    }
	public ResponseMulti<XSchoolType> getXSchoolsByXCourse(String refId, int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
		return xSchoolsObject.getXSchoolsByXCourse(refId, navigationPage, navigationPageSize, schoolYear);
	}
	public ResponseMulti<XSchoolType> getXSchoolsByXRoster(String refId) throws AuthenticationException {
		return xSchoolsObject.getXSchoolsByXRoster(refId);
	}
	public ResponseMulti<XSchoolType> getXSchoolsByXRoster(String refId, int schoolYear) throws AuthenticationException {
		return xSchoolsObject.getXSchoolsByXRoster(refId, schoolYear);
	}
    public ResponseMulti<XSchoolType> getXSchoolsByXRoster(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        return xSchoolsObject.getXSchoolsByXRoster(refId, navigationPage, navigationPageSize);
    }
	public ResponseMulti<XSchoolType> getXSchoolsByXRoster(String refId, int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
		return xSchoolsObject.getXSchoolsByXRoster(refId, navigationPage, navigationPageSize, schoolYear);
	}
	public ResponseMulti<XSchoolType> getXSchoolsByXStaff(String refId) throws AuthenticationException {
		return xSchoolsObject.getXSchoolsByXStaff(refId);
	}
	public ResponseMulti<XSchoolType> getXSchoolsByXStaff(String refId, int schoolYear) throws AuthenticationException {
		return xSchoolsObject.getXSchoolsByXStaff(refId, schoolYear);
	}
    public ResponseMulti<XSchoolType> getXSchoolsByXStaff(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        return xSchoolsObject.getXSchoolsByXStaff(refId, navigationPage, navigationPageSize);
    }
	public ResponseMulti<XSchoolType> getXSchoolsByXStaff(String refId, int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
		return xSchoolsObject.getXSchoolsByXStaff(refId, navigationPage, navigationPageSize, schoolYear);
	}
	public ResponseMulti<XSchoolType> getXSchoolsByXStudent(String refId) throws AuthenticationException {
		return xSchoolsObject.getXSchoolsByXStudent(refId);
	}
	public ResponseMulti<XSchoolType> getXSchoolsByXStudent(String refId, int schoolYear) throws AuthenticationException {
		return xSchoolsObject.getXSchoolsByXStudent(refId, schoolYear);
	}
    public ResponseMulti<XSchoolType> getXSchoolsByXStudent(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        return xSchoolsObject.getXSchoolsByXStudent(refId, navigationPage, navigationPageSize);
    }
	public ResponseMulti<XSchoolType> getXSchoolsByXStudent(String refId, int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
		return xSchoolsObject.getXSchoolsByXStudent(refId, navigationPage, navigationPageSize, schoolYear);
	}
	public ResponseMulti<XSchoolType> getXSchoolsByXContact(String refId) throws AuthenticationException {
		return xSchoolsObject.getXSchoolsByXContact(refId);
	}
	public ResponseMulti<XSchoolType> getXSchoolsByXContact(String refId, int schoolYear) throws AuthenticationException {
		return xSchoolsObject.getXSchoolsByXContact(refId, schoolYear);
	}
    public ResponseMulti<XSchoolType> getXSchoolsByXContact(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        return xSchoolsObject.getXSchoolsByXContact(refId, navigationPage, navigationPageSize);
    }
	public ResponseMulti<XSchoolType> getXSchoolsByXContact(String refId, int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
		return xSchoolsObject.getXSchoolsByXContact(refId, navigationPage, navigationPageSize, schoolYear);
	}

	/* xCalendars */
    public ResponseMulti<XCalendarType> getXCalendars() throws AuthenticationException {
        return xCalendarsObject.getXCalendars();
    }
	public ResponseMulti<XCalendarType> getXCalendars(int schoolYear) throws AuthenticationException {
		return xCalendarsObject.getXCalendars(schoolYear);
	}
    public ResponseMulti<XCalendarType> getXCalendars(int navigationPage, int navigationPageSize) throws AuthenticationException {
        return xCalendarsObject.getXCalendars(navigationPage, navigationPageSize);
    }
	public ResponseMulti<XCalendarType> getXCalendars(int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
		return xCalendarsObject.getXCalendars(navigationPage, navigationPageSize, schoolYear);
	}
    public ResponseMulti<XCalendarType> getXCalendars(String opaqueMarker) throws AuthenticationException {
        return xCalendarsObject.getXCalendars(opaqueMarker);
    }
    //todo NEW
    public ResponseMulti<XCalendarType> getXCalendars(int navigationPage, int navigationPageSize, String opaqueMarker) throws AuthenticationException {
        return xCalendarsObject.getXCalendars(navigationPage, navigationPageSize, opaqueMarker);
    }
	public ResponseSingle<XCalendarType> getXCalendar(String refId) throws AuthenticationException {
		return xCalendarsObject.getXCalendar(refId);
	}
	public ResponseSingle<XCalendarType> getXCalendar(String refId, int schoolYear) throws AuthenticationException {
		return xCalendarsObject.getXCalendar(refId, schoolYear);
	}
    public ResponseMulti<XCalendarType> getXCalendarsByXLea(String refId) throws AuthenticationException {
        return xCalendarsObject.getXCalendarsByXLea(refId);
    }
	public ResponseMulti<XCalendarType> getXCalendarsByXLea(String refId, int schoolYear) throws AuthenticationException {
		return xCalendarsObject.getXCalendarsByXLea(refId, schoolYear);
	}
	public ResponseMulti<XCalendarType> getXCalendarsByXLea(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
		return xCalendarsObject.getXCalendarsByXLea(refId, navigationPage, navigationPageSize);
	}
	public ResponseMulti<XCalendarType> getXCalendarsByXLea(String refId, int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
		return xCalendarsObject.getXCalendarsByXLea(refId, navigationPage, navigationPageSize, schoolYear);
	}
	public ResponseMulti<XCalendarType> getXCalendarsByXSchool(String refId) throws AuthenticationException {
		return xCalendarsObject.getXCalendarsByXSchool(refId);
	}
	public ResponseMulti<XCalendarType> getXCalendarsByXSchool(String refId, int schoolYear) throws AuthenticationException {
		return xCalendarsObject.getXCalendarsByXSchool(refId, schoolYear);
	}
    public ResponseMulti<XCalendarType> getXCalendarsByXSchool(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        return xCalendarsObject.getXCalendarsByXSchool(refId, navigationPage, navigationPageSize);
    }
	public ResponseMulti<XCalendarType> getXCalendarsByXSchool(String refId, int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
		return xCalendarsObject.getXCalendarsByXSchool(refId, navigationPage, navigationPageSize, schoolYear);
	}

	/* xCourses */
    public ResponseMulti<XCourseType> getXCourses() throws AuthenticationException {
        return xCoursesObject.getXCourses();
    }
	public ResponseMulti<XCourseType> getXCourses(int schoolYear) throws AuthenticationException {
		return xCoursesObject.getXCourses(schoolYear);
	}
	public ResponseMulti<XCourseType> getXCourses(int navigationPage, int navigationPageSize) throws AuthenticationException {
		return xCoursesObject.getXCourses(navigationPage, navigationPageSize);
	}
	public ResponseMulti<XCourseType> getXCourses(int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
		return xCoursesObject.getXCourses(navigationPage, navigationPageSize, schoolYear);
	}
    public ResponseMulti<XCourseType> getXCourses(String opaqueMarker) throws AuthenticationException {
        return xCoursesObject.getXCourses(opaqueMarker);
    }
	//todo NEW
	public ResponseMulti<XCourseType> getXCourses(int navigationPage, int navigationPageSize, String opaqueMarker) throws AuthenticationException {
		return xCoursesObject.getXCourses(navigationPage, navigationPageSize, opaqueMarker);
	}
	public ResponseSingle<XCourseType> getXCourse(String refId) throws AuthenticationException {
		return xCoursesObject.getXCourse(refId);
	}
	public ResponseSingle<XCourseType> getXCourse(String refId, int schoolYear) throws AuthenticationException {
		return xCoursesObject.getXCourse(refId, schoolYear);
	}
	public ResponseMulti<XCourseType> getXCoursesByXLea(String refId) throws AuthenticationException {
		return xCoursesObject.getXCoursesByXLea(refId);
	}
	public ResponseMulti<XCourseType> getXCoursesByXLea(String refId, int schoolYear) throws AuthenticationException {
		return xCoursesObject.getXCoursesByXLea(refId, schoolYear);
	}
    public ResponseMulti<XCourseType> getXCoursesByXLea(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        return xCoursesObject.getXCoursesByXLea(refId, navigationPage, navigationPageSize);
    }
	public ResponseMulti<XCourseType> getXCoursesByXLea(String refId, int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
		return xCoursesObject.getXCoursesByXLea(refId, navigationPage, navigationPageSize, schoolYear);
	}
	public ResponseMulti<XCourseType> getXCoursesByXSchool(String refId) throws AuthenticationException {
		return xCoursesObject.getXCoursesByXSchool(refId);
	}
	public ResponseMulti<XCourseType> getXCoursesByXSchool(String refId, int schoolYear) throws AuthenticationException {
		return xCoursesObject.getXCoursesByXSchool(refId, schoolYear);
	}
    public ResponseMulti<XCourseType> getXCoursesByXSchool(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        return xCoursesObject.getXCoursesByXSchool(refId, navigationPage, navigationPageSize);
    }
	public ResponseMulti<XCourseType> getXCoursesByXSchool(String refId, int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
		return xCoursesObject.getXCoursesByXSchool(refId, navigationPage, navigationPageSize, schoolYear);
	}
	public ResponseMulti<XCourseType> getXCoursesByXRoster(String refId) throws AuthenticationException {
		return xCoursesObject.getXCoursesByXRoster(refId);
	}
	public ResponseMulti<XCourseType> getXCoursesByXRoster(String refId, int schoolYear) throws AuthenticationException {
		return xCoursesObject.getXCoursesByXRoster(refId, schoolYear);
	}
    public ResponseMulti<XCourseType> getXCoursesByXRoster(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        return xCoursesObject.getXCoursesByXRoster(refId, navigationPage, navigationPageSize);
    }
	public ResponseMulti<XCourseType> getXCoursesByXRoster(String refId, int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
		return xCoursesObject.getXCoursesByXRoster(refId, navigationPage, navigationPageSize, schoolYear);
	}

	/* xRosters */
    public ResponseMulti<XRosterType> getXRosters() throws AuthenticationException {
        return xRostersObject.getXRosters();
    }
	public ResponseMulti<XRosterType> getXRosters(int schoolYear) throws AuthenticationException {
		return xRostersObject.getXRosters();
	}
	public ResponseMulti<XRosterType> getXRosters(int navigationPage, int navigationPageSize) throws AuthenticationException {
		return xRostersObject.getXRosters(navigationPage, navigationPageSize);
	}
	public ResponseMulti<XRosterType> getXRosters(int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
		return xRostersObject.getXRosters(navigationPage, navigationPageSize, schoolYear);
	}
	public ResponseMulti<XRosterType> getXRosters(String opaqueMarker) throws AuthenticationException {
		return xRostersObject.getXRosters(opaqueMarker);
	}
    //todo NEW
    public ResponseMulti<XRosterType> getXRosters(int navigationPage, int navigationPageSize, String opaqueMarker) throws AuthenticationException {
        return xRostersObject.getXRosters(navigationPage, navigationPageSize, opaqueMarker);
    }
	public ResponseSingle<XRosterType> getXRoster(String refId) throws AuthenticationException {
		return xRostersObject.getXRoster(refId);
	}
	public ResponseSingle<XRosterType> getXRoster(String refId, int schoolYear) throws AuthenticationException {
		return xRostersObject.getXRoster(refId);
	}
	public ResponseMulti<XRosterType> getXRostersByXLea(String refId) throws AuthenticationException {
		return xRostersObject.getXRostersByXLea(refId);
	}
	public ResponseMulti<XRosterType> getXRostersByXLea(String refId, int schoolYear) throws AuthenticationException {
		return xRostersObject.getXRostersByXLea(refId, schoolYear);
	}
    public ResponseMulti<XRosterType> getXRostersByXLea(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        return xRostersObject.getXRostersByXLea(refId, navigationPage, navigationPageSize);
    }
	public ResponseMulti<XRosterType> getXRostersByXLea(String refId, int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
		return xRostersObject.getXRostersByXLea(refId, navigationPage, navigationPageSize, schoolYear);
	}
	public ResponseMulti<XRosterType> getXRostersByXSchool(String refId) throws AuthenticationException {
		return xRostersObject.getXRostersByXSchool(refId);
	}
	public ResponseMulti<XRosterType> getXRostersByXSchool(String refId, int schoolYear) throws AuthenticationException {
		return xRostersObject.getXRostersByXSchool(refId, schoolYear);
	}
    public ResponseMulti<XRosterType> getXRostersByXSchool(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        return xRostersObject.getXRostersByXSchool(refId, navigationPage, navigationPageSize);
    }
	public ResponseMulti<XRosterType> getXRostersByXSchool(String refId, int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
		return xRostersObject.getXRostersByXSchool(refId, navigationPage, navigationPageSize);
	}
	public ResponseMulti<XRosterType> getXRostersByXCourse(String refId) throws AuthenticationException {
		return xRostersObject.getXRostersByXCourse(refId);
	}
	public ResponseMulti<XRosterType> getXRostersByXCourse(String refId, int schoolYear) throws AuthenticationException {
		return xRostersObject.getXRostersByXCourse(refId, schoolYear);
	}
    public ResponseMulti<XRosterType> getXRostersByXCourse(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        return xRostersObject.getXRostersByXCourse(refId, navigationPage, navigationPageSize);
    }
	public ResponseMulti<XRosterType> getXRostersByXCourse(String refId, int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
		return xRostersObject.getXRostersByXCourse(refId, navigationPage, navigationPageSize, schoolYear);
	}
	public ResponseMulti<XRosterType> getXRostersByXStaff(String refId) throws AuthenticationException {
		return xRostersObject.getXRostersByXStaff(refId);
	}
	public ResponseMulti<XRosterType> getXRostersByXStaff(String refId, int schoolYear) throws AuthenticationException {
		return xRostersObject.getXRostersByXStaff(refId, schoolYear);
	}
    public ResponseMulti<XRosterType> getXRostersByXStaff(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        return xRostersObject.getXRostersByXStaff(refId, navigationPage, navigationPageSize);
    }
	public ResponseMulti<XRosterType> getXRostersByXStaff(String refId, int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
		return xRostersObject.getXRostersByXStaff(refId, navigationPage, navigationPageSize, schoolYear);
	}
	public ResponseMulti<XRosterType> getXRostersByXStudent(String refId) throws AuthenticationException {
		return xRostersObject.getXRostersByXStudent(refId);
	}
	public ResponseMulti<XRosterType> getXRostersByXStudent(String refId, int schoolYear) throws AuthenticationException {
		return xRostersObject.getXRostersByXStudent(refId, schoolYear);
	}
    public ResponseMulti<XRosterType> getXRostersByXStudent(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        return xRostersObject.getXRostersByXStudent(refId, navigationPage, navigationPageSize);
    }
	public ResponseMulti<XRosterType> getXRostersByXStudent(String refId, int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
		return xRostersObject.getXRostersByXStudent(refId, navigationPage, navigationPageSize, schoolYear);
	}

	/* xStaffs */
    public ResponseMulti<XStaffType> getXStaffs() throws AuthenticationException {
        return xStaffsObject.getXStaffs();
    }
	public ResponseMulti<XStaffType> getXStaffs(int schoolYear) throws AuthenticationException {
		return xStaffsObject.getXStaffs(schoolYear);
	}
	public ResponseMulti<XStaffType> getXStaffs(int navigationPage, int navigationPageSize) throws AuthenticationException {
		return xStaffsObject.getXStaffs(navigationPage, navigationPageSize);
	}
	public ResponseMulti<XStaffType> getXStaffs(int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
		return xStaffsObject.getXStaffs(navigationPage, navigationPageSize, schoolYear);
	}
	public ResponseMulti<XStaffType> getXStaffs(String opaqueMarker) throws AuthenticationException {
		return xStaffsObject.getXStaffs(opaqueMarker);
	}
    //TODO NEW
    public ResponseMulti<XStaffType> getXStaffs(int navigationPage, int navigationPageSize, String opaqueMarker) throws AuthenticationException {
        return xStaffsObject.getXStaffs(navigationPage, navigationPageSize, opaqueMarker);
    }
	public ResponseSingle<XStaffType> getXStaff(String refId) throws AuthenticationException {
		return xStaffsObject.getXStaff(refId);
	}
	public ResponseSingle<XStaffType> getXStaff(String refId, int schoolYear) throws AuthenticationException {
		return xStaffsObject.getXStaff(refId, schoolYear);
	}
	public ResponseMulti<XStaffType> getXStaffsByXLea(String refId) throws AuthenticationException {
		return xStaffsObject.getXStaffsByXLea(refId);
	}
	public ResponseMulti<XStaffType> getXStaffsByXLea(String refId, int schoolYear) throws AuthenticationException {
		return xStaffsObject.getXStaffsByXLea(refId, schoolYear);
	}
    public ResponseMulti<XStaffType> getXStaffsByXLea(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        return xStaffsObject.getXStaffsByXLea(refId, navigationPage, navigationPageSize);
    }
	public ResponseMulti<XStaffType> getXStaffsByXLea(String refId, int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
		return xStaffsObject.getXStaffsByXLea(refId, navigationPage, navigationPageSize, schoolYear);
	}
	public ResponseMulti<XStaffType> getXStaffsByXSchool(String refId) throws AuthenticationException {
		return xStaffsObject.getXStaffsByXSchool(refId);
	}
	public ResponseMulti<XStaffType> getXStaffsByXSchool(String refId, int schoolYear) throws AuthenticationException {
		return xStaffsObject.getXStaffsByXSchool(refId, schoolYear);
	}
    public ResponseMulti<XStaffType> getXStaffsByXSchool(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        return xStaffsObject.getXStaffsByXSchool(refId, navigationPage, navigationPageSize);
    }
	public ResponseMulti<XStaffType> getXStaffsByXSchool(String refId, int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
		return xStaffsObject.getXStaffsByXSchool(refId, navigationPage, navigationPageSize, schoolYear);
	}
	public ResponseMulti<XStaffType> getXStaffsByXCourse(String refId) throws AuthenticationException {
		return xStaffsObject.getXStaffsByXCourse(refId);
	}
	public ResponseMulti<XStaffType> getXStaffsByXCourse(String refId, int schoolYear) throws AuthenticationException {
		return xStaffsObject.getXStaffsByXCourse(refId, schoolYear);
	}
    public ResponseMulti<XStaffType> getXStaffsByXCourse(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        return xStaffsObject.getXStaffsByXCourse(refId, navigationPage, navigationPageSize);
    }
	public ResponseMulti<XStaffType> getXStaffsByXCourse(String refId, int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
		return xStaffsObject.getXStaffsByXCourse(refId, navigationPage, navigationPageSize, schoolYear);
	}
	public ResponseMulti<XStaffType> getXStaffsByXRoster(String refId) throws AuthenticationException {
		return xStaffsObject.getXStaffsByXRoster(refId);
	}
	public ResponseMulti<XStaffType> getXStaffsByXRoster(String refId, int schoolYear) throws AuthenticationException {
		return xStaffsObject.getXStaffsByXRoster(refId, schoolYear);
	}
    public ResponseMulti<XStaffType> getXStaffsByXRoster(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        return xStaffsObject.getXStaffsByXRoster(refId, navigationPage, navigationPageSize);
    }
	public ResponseMulti<XStaffType> getXStaffsByXRoster(String refId, int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
		return xStaffsObject.getXStaffsByXRoster(refId, navigationPage, navigationPageSize, schoolYear);
	}
	public ResponseMulti<XStaffType> getXStaffsByXStudent(String refId) throws AuthenticationException {
		return xStaffsObject.getXStaffsByXStudent(refId);
	}
	public ResponseMulti<XStaffType> getXStaffsByXStudent(String refId, int schoolYear) throws AuthenticationException {
		return xStaffsObject.getXStaffsByXStudent(refId, schoolYear);
	}
    public ResponseMulti<XStaffType> getXStaffsByXStudent(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        return xStaffsObject.getXStaffsByXStudent(refId, navigationPage, navigationPageSize);
    }
	public ResponseMulti<XStaffType> getXStaffsByXStudent(String refId, int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
		return xStaffsObject.getXStaffsByXStudent(refId, navigationPage, navigationPageSize, schoolYear);
	}

	/* xStudents */
    public ResponseMulti<XStudentType> getXStudents() throws AuthenticationException {
        return xStudentsObject.getXStudents();
    }
	public ResponseMulti<XStudentType> getXStudents(int schoolYear) throws AuthenticationException {
		return xStudentsObject.getXStudents(schoolYear);
	}
	public ResponseMulti<XStudentType> getXStudents(int navigationPage, int navigationPageSize) throws AuthenticationException {
		return xStudentsObject.getXStudents(navigationPage, navigationPageSize);
	}
	public ResponseMulti<XStudentType> getXStudents(int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
		return xStudentsObject.getXStudents(navigationPage, navigationPageSize, schoolYear);
	}
	public ResponseMulti<XStudentType> getXStudents(String opaqueMarker) throws AuthenticationException {
		return xStudentsObject.getXStudents(opaqueMarker);
	}
    //todo NEW
    public ResponseMulti<XStudentType> getXStudents(int navigationPage, int navigationPageSize, String opaqueMarker) throws AuthenticationException {
        return xStudentsObject.getXStudents(navigationPage, navigationPageSize, opaqueMarker);
    }
	public ResponseSingle<XStudentType> getXStudent(String refId) throws AuthenticationException {
		return xStudentsObject.getXStudent(refId);
	}
	public ResponseSingle<XStudentType> getXStudent(String refId, int schoolYear) throws AuthenticationException {
		return xStudentsObject.getXStudent(refId, schoolYear);
	}
	public ResponseMulti<XStudentType> getXStudentsByXLea(String refId) throws AuthenticationException {
		return xStudentsObject.getXStudentsByXLea(refId);
	}
	public ResponseMulti<XStudentType> getXStudentsByXLea(String refId, int schoolYear) throws AuthenticationException {
		return xStudentsObject.getXStudentsByXLea(refId, schoolYear);
	}
    public ResponseMulti<XStudentType> getXStudentsByXLea(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        return xStudentsObject.getXStudentsByXLea(refId, navigationPage, navigationPageSize);
    }
	public ResponseMulti<XStudentType> getXStudentsByXLea(String refId, int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
		return xStudentsObject.getXStudentsByXLea(refId, navigationPage, navigationPageSize, schoolYear);
	}
	public ResponseMulti<XStudentType> getXStudentsByXSchool(String refId) throws AuthenticationException {
		return xStudentsObject.getXStudentsByXSchool(refId);
	}
	public ResponseMulti<XStudentType> getXStudentsByXSchool(String refId, int schoolYear) throws AuthenticationException {
		return xStudentsObject.getXStudentsByXSchool(refId, schoolYear);
	}
    public ResponseMulti<XStudentType> getXStudentsByXSchool(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        return xStudentsObject.getXStudentsByXSchool(refId, navigationPage, navigationPageSize);
    }
	public ResponseMulti<XStudentType> getXStudentsByXSchool(String refId, int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
		return xStudentsObject.getXStudentsByXSchool(refId, navigationPage, navigationPageSize, schoolYear);
	}
	public ResponseMulti<XStudentType> getXStudentsByXRoster(String refId) throws AuthenticationException {
		return xStudentsObject.getXStudentsByXRoster(refId);
	}
	public ResponseMulti<XStudentType> getXStudentsByXRoster(String refId, int schoolYear) throws AuthenticationException {
		return xStudentsObject.getXStudentsByXRoster(refId, schoolYear);
	}
    public ResponseMulti<XStudentType> getXStudentsByXRoster(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        return xStudentsObject.getXStudentsByXRoster(refId, navigationPage, navigationPageSize);
    }
	public ResponseMulti<XStudentType> getXStudentsByXRoster(String refId, int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
		return xStudentsObject.getXStudentsByXRoster(refId, navigationPage, navigationPageSize, schoolYear);
	}
	public ResponseMulti<XStudentType> getXStudentsByXStaff(String refId) throws AuthenticationException {
		return xStudentsObject.getXStudentsByXStaff(refId);
	}
	public ResponseMulti<XStudentType> getXStudentsByXStaff(String refId, int schoolYear) throws AuthenticationException {
		return xStudentsObject.getXStudentsByXStaff(refId, schoolYear);
	}
    public ResponseMulti<XStudentType> getXStudentsByXStaff(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        return xStudentsObject.getXStudentsByXStaff(refId, navigationPage, navigationPageSize);
    }
	public ResponseMulti<XStudentType> getXStudentsByXStaff(String refId, int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
		return xStudentsObject.getXStudentsByXStaff(refId, navigationPage, navigationPageSize, schoolYear);
	}
	public ResponseMulti<XStudentType> getXStudentsByXContact(String refId) throws AuthenticationException {
		return xStudentsObject.getXStudentsByXContact(refId);
	}
	public ResponseMulti<XStudentType> getXStudentsByXContact(String refId, int schoolYear) throws AuthenticationException {
		return xStudentsObject.getXStudentsByXContact(refId, schoolYear);
	}
    public ResponseMulti<XStudentType> getXStudentsByXContact(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        return xStudentsObject.getXStudentsByXContact(refId, navigationPage, navigationPageSize);
    }
	public ResponseMulti<XStudentType> getXStudentsByXContact(String refId, int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
		return xStudentsObject.getXStudentsByXContact(refId, navigationPage, navigationPageSize, schoolYear);
	}

	/* xContacts */
    public ResponseMulti<XContactType> getXContacts() throws AuthenticationException {
        return xContactsObject.getXContacts();
    }
	public ResponseMulti<XContactType> getXContacts(int schoolYear) throws AuthenticationException {
		return xContactsObject.getXContacts(schoolYear);
	}
	public ResponseMulti<XContactType> getXContacts(int navigationPage, int navigationPageSize) throws AuthenticationException {
		return xContactsObject.getXContacts(navigationPage, navigationPageSize);
	}
	public ResponseMulti<XContactType> getXContacts(int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
		return xContactsObject.getXContacts(navigationPage, navigationPageSize, schoolYear);
	}
	public ResponseMulti<XContactType> getXContacts(String opaqueMarker) throws AuthenticationException {
		return xContactsObject.getXContacts(opaqueMarker);
	}
    //todo NEW
    public ResponseMulti<XContactType> getXContacts(int navigationPage, int navigationPageSize, String opaqueMarker) throws AuthenticationException {
        return xContactsObject.getXContacts(navigationPage, navigationPageSize, opaqueMarker);
    }
	public ResponseSingle<XContactType> getXContact(String refId) throws AuthenticationException {
		return xContactsObject.getXContact(refId);
	}
	public ResponseSingle<XContactType> getXContact(String refId, int schoolYear) throws AuthenticationException {
		return xContactsObject.getXContact(refId, schoolYear);
	}
	public ResponseMulti<XContactType> getXContactsByXLea(String refId) throws AuthenticationException {
		return xContactsObject.getXContactsByXLea(refId);
	}
	public ResponseMulti<XContactType> getXContactsByXLea(String refId, int schoolYear) throws AuthenticationException {
		return xContactsObject.getXContactsByXLea(refId, schoolYear);
	}
    public ResponseMulti<XContactType> getXContactsByXLea(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        return xContactsObject.getXContactsByXLea(refId, navigationPage, navigationPageSize);
    }
	public ResponseMulti<XContactType> getXContactsByXLea(String refId, int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
		return xContactsObject.getXContactsByXLea(refId, navigationPage, navigationPageSize, schoolYear);
	}
	public ResponseMulti<XContactType> getXContactsByXSchool(String refId) throws AuthenticationException {
		return xContactsObject.getXContactsByXSchool(refId);
	}
	public ResponseMulti<XContactType> getXContactsByXSchool(String refId, int schoolYear) throws AuthenticationException {
		return xContactsObject.getXContactsByXSchool(refId, schoolYear);
	}
    public ResponseMulti<XContactType> getXContactsByXSchool(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        return xContactsObject.getXContactsByXSchool(refId, navigationPage, navigationPageSize);
    }
	public ResponseMulti<XContactType> getXContactsByXSchool(String refId, int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
		return xContactsObject.getXContactsByXSchool(refId, navigationPage, navigationPageSize, schoolYear);
	}
	public ResponseMulti<XContactType> getXContactsByXStudent(String refId) throws AuthenticationException {
		return xContactsObject.getXContactsByXStudent(refId);
	}
	public ResponseMulti<XContactType> getXContactsByXStudent(String refId, int schoolYear) throws AuthenticationException {
		return xContactsObject.getXContactsByXStudent(refId, schoolYear);
	}
    public ResponseMulti<XContactType> getXContactsByXStudent(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        return xContactsObject.getXContactsByXStudent(refId, navigationPage, navigationPageSize);
    }
	public ResponseMulti<XContactType> getXContactsByXStudent(String refId, int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
		return xContactsObject.getXContactsByXStudent(refId, navigationPage, navigationPageSize, schoolYear);
	}

	/* navigationLastPage */
	public int getLastPage(int navigationPageSize, ServicePath p) throws AuthenticationException {
		return getLastPageObject.getLastPage(navigationPageSize, p);
	}
	public int getLastPage(int navigationPageSize, int schoolYear, ServicePath servicePath) throws AuthenticationException {
		return getLastPageObject.getLastPage(navigationPageSize, schoolYear, servicePath);
	}
    public int getLastPage(int navigationPageSize, ServicePath servicePath, String refId) throws AuthenticationException {
        return getLastPageObject.getLastPage(navigationPageSize, servicePath, refId);
    }
	public int getLastPage(int navigationPageSize, int schoolYear, ServicePath servicePath, String refId) throws AuthenticationException {
		return getLastPageObject.getLastPage(navigationPageSize, schoolYear, servicePath, refId);
	}

	/* AUPP Object */ //TODO Potentially handle multiple school years
	public ResponseMulti<XStaffType> createXStaffUsers(String refId) throws AuthenticationException {
		return auppObject.createXStaffUsers(refId);
	}
	public ResponseMulti<XStaffType> deleteXStaffUsers(String refId) throws AuthenticationException {
		return auppObject.deleteXStaffUsers(refId);
	}
    public ResponseMulti<XStaffType> getXStaffUsers(String refId) throws AuthenticationException {
        return auppObject.getXStaffUsers(refId);
    }
	public ResponseMulti<XStaffType> getXStaffUsers(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
		return auppObject.getXStaffUsers(refId, navigationPage, navigationPageSize);
	}
	public ResponseMulti<XStudentType> createXStudentUsers(String refId) throws AuthenticationException {
		return auppObject.createXStudentUsers(refId);
	}
	public ResponseMulti<XStudentType> deleteXStudentUsers(String refId) throws AuthenticationException {
		return auppObject.deleteXStudentUsers(refId);
	}
	public ResponseMulti<XStudentType> getXStudentUsers(String refId) throws AuthenticationException {
		return auppObject.getXStudentUsers(refId);
	}
    public ResponseMulti<XStudentType> getXStudentUsers(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        return auppObject.getXStudentUsers(refId, navigationPage, navigationPageSize);
    }
//	private ResponseMulti<XContactType> createXContactUsers(String refId) throws AuthenticationException {
//		return auppObject.createXContactUsers(refId);
//	}
//
//	private ResponseMulti<XContactType> deleteXContactUsers(String refId) throws AuthenticationException {
//		return auppObject.deleteXContactUsers(refId);
//	}
//
//	private ResponseMulti<XContactType> getXContactUsers(String refId) throws AuthenticationException {
//		return auppObject.getXContactUsers(refId);
//	}
//
//	private ResponseMulti<XContactType> getXContactUsers(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
//		return auppObject.getXContactUsers(refId, navigationPage, navigationPageSize);
//	}
}
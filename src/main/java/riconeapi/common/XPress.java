package riconeapi.common;

import org.springframework.web.client.RestTemplate;
import riconeapi.common.objects.*;
import riconeapi.common.rest.AUPPEnum;
import riconeapi.common.rest.MediaTypeEnum;
import riconeapi.common.rest.ResponseMulti;
import riconeapi.common.rest.ResponseSingle;
import riconeapi.exceptions.AuthenticationException;
import riconeapi.models.xpress.*;

import java.util.Date;

/*
 * @author      Andrew Pieniezny <andrew.pieniezny@neric.org>
 * @version     1.7.1
 * @since       Jun 28, 2018
 */

/**
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
	private final JsonXmlObject jsonXmlObject;

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
		jsonXmlObject = new JsonXmlObject(rt, baseApiUrl);
	}

	/* xLeas */
    /**
     * Request all xLeas
     * @return List of xLeas type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XLeaType> getXLeas() throws AuthenticationException {
        return xLeasObject.getXLeas();
    }
    /**
     * Request all xLeas by school year.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xLeas type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XLeaType> getXLeas(int schoolYear) throws AuthenticationException {
		return xLeasObject.getXLeas(schoolYear);
	}
    /**
     * Request all xLeas with paging.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @return List of xLeas type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XLeaType> getXLeas(int navigationPage, int navigationPageSize) throws AuthenticationException {
		return xLeasObject.getXLeas(navigationPage, navigationPageSize);
	}
    /**
     * Request all xLeas with paging by school year.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xLeas type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XLeaType> getXLeas(int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
		return xLeasObject.getXLeas(navigationPage, navigationPageSize, schoolYear);
	}
    /**
     * Request all xLeas value changes from a given point.
     * @param opaqueMarker Uses an ISO8601 timestamp that indicates a point since the last changes have been requested.
     * @return List of xLeas type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XLeaType> getXLeas(String opaqueMarker) throws AuthenticationException {
		return xLeasObject.getXLeas(opaqueMarker);
	}
    /**
     * Request all xLeas value changes from a given point with paging.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param opaqueMarker       Uses an ISO8601 timestamp that indicates a point since the last changes have been requested.
     * @return List of xLeas type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XLeaType> getXLeas(int navigationPage, int navigationPageSize, String opaqueMarker) throws AuthenticationException {
        return xLeasObject.getXLeas(navigationPage, navigationPageSize, opaqueMarker);
    }
    /**
     * Request single xLea by refId.
     * @param refId of xLea.
     * @return Single xLeas type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseSingle<XLeaType> getXLea(String refId) throws AuthenticationException {
		return xLeasObject.getXLea(refId);
	}
    /**
     * Request single xLea by refId by school year.
     * @param refId of xLea.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return Single xLeas type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseSingle<XLeaType> getXLea(String refId, int schoolYear) throws AuthenticationException {
		return xLeasObject.getXLea(refId, schoolYear);
	}
    /**
     * Request single xLea by BEDS code or Local Id.
     * @param idType Header value can be set to beds or local.
     * @param id     BEDS or Local Id.
     * @return Single xLeas type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseSingle<XLeaType> getXLea(String idType, String id) throws AuthenticationException {
		return xLeasObject.getXLea(idType, id);
	}
    /**
     * Request single xLea by BEDS code or Local Id by school year.
     * @param idType Header value can be set to beds or local.
     * @param id     BEDS or Local Id.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return Single xLeas type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseSingle<XLeaType> getXLea(String idType, String id, int schoolYear) throws AuthenticationException {
		return xLeasObject.getXLea(idType, id, schoolYear);
	}
    /**
     * Request xLeas associated to a specific xSchool by refId.
     * @param refId of xSchools.
     * @return List of xLeas type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XLeaType> getXLeasByXSchool(String refId) throws AuthenticationException {
		return xLeasObject.getXLeasByXSchool(refId);
	}
    /**
     * Request xLeas associated to a specific xSchool by refId by school year.
     * @param refId of xSchools.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xLeas type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XLeaType> getXLeasByXSchool(String refId, int schoolYear) throws AuthenticationException {
		return xLeasObject.getXLeasByXSchool(refId, schoolYear);
	}
    /**
     * Request xLeas associated to a specific xSchool by refId with paging.
     * @param refId              of xSchools.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @return List of xLeas type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XLeaType> getXLeasByXSchool(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        return xLeasObject.getXLeasByXSchool(refId, navigationPage, navigationPageSize);
    }
    /**
     * Request xLeas associated to a specific xSchool by refId with paging by school year.
     * @param refId              of xSchools.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xLeas type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XLeaType> getXLeasByXSchool(String refId, int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
		return xLeasObject.getXLeasByXSchool(refId, navigationPage, navigationPageSize, schoolYear);
	}
    /**
     * Request xLeas associated to a specific xRoster by refId.
     * @param refId of xRosters.
     * @return List of xLeas type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XLeaType> getXLeasByXRoster(String refId) throws AuthenticationException {
		return xLeasObject.getXLeasByXRoster(refId);
	}
    /**
     * Request xLeas associated to a specific xRoster by refId by school year.
     * @param refId of xRosters.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xLeas type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XLeaType> getXLeasByXRoster(String refId, int schoolYear) throws AuthenticationException {
		return xLeasObject.getXLeasByXRoster(refId, schoolYear);
	}
    /**
     * Request xLeas associated to a specific xRoster by refId with paging.
     * @param refId              of xRoster.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @return List of xLeas type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XLeaType> getXLeasByXRoster(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        return xLeasObject.getXLeasByXRoster(refId, navigationPage, navigationPageSize);
    }
    /**
     * Request xLeas associated to a specific xRoster by refId with paging by school year.
     * @param refId              of xRoster.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xLeas type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XLeaType> getXLeasByXRoster(String refId, int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
		return xLeasObject.getXLeasByXRoster(refId, navigationPage, navigationPageSize, schoolYear);
	}
    /**
     * Request xLeas associated to a specific xStaff by refId.
     * @param refId of xStaffs.
     * @return List of xLeas type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XLeaType> getXLeasByXStaff(String refId) throws AuthenticationException {
		return xLeasObject.getXLeasByXStaff(refId);
	}
    /**
     * Request xLeas associated to a specific xStaff by refId by school year.
     * @param refId of xStaffs.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xLeas type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XLeaType> getXLeasByXStaff(String refId, int schoolYear) throws AuthenticationException {
		return xLeasObject.getXLeasByXStaff(refId, schoolYear);
	}
    /**
     * Request xLeas associated to a specific xStaff by refId with paging.
     * @param refId              of xStaffs.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @return List of xLeas type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XLeaType> getXLeasByXStaff(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        return xLeasObject.getXLeasByXStaff(refId, navigationPage, navigationPageSize);
    }
    /**
     * Request xLeas associated to a specific xStaff by refId with paging by school year.
     * @param refId              of xStaffs.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xLeas type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XLeaType> getXLeasByXStaff(String refId, int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
		return xLeasObject.getXLeasByXStaff(refId, navigationPage, navigationPageSize, schoolYear);
	}
    /**
     * Request xLeas associated to a specific xStudent by refId.
     * @param refId of xStudents.
     * @return List of xLeas type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XLeaType> getXLeasByXStudent(String refId) throws AuthenticationException {
		return xLeasObject.getXLeasByXStudent(refId);
	}
    /**
     * Request xLeas associated to a specific xStudent by refId by school year.
     * @param refId of xStudents.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xLeas type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XLeaType> getXLeasByXStudent(String refId, int schoolYear) throws AuthenticationException {
		return xLeasObject.getXLeasByXStudent(refId, schoolYear);
	}
    /**
     * Request xLeas associated to a specific xStudent by refId with paging.
     * @param refId              of xStudents.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @return List of xLeas type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XLeaType> getXLeasByXStudent(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        return xLeasObject.getXLeasByXStudent(refId, navigationPage, navigationPageSize);
    }
    /**
     * Request xLeas associated to a specific xStudent by refId with paging by school year.
     * @param refId              of xStudents.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xLeas type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XLeaType> getXLeasByXStudent(String refId, int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
		return xLeasObject.getXLeasByXStudent(refId, navigationPage, navigationPageSize, schoolYear);
	}
    /**
     * Request xLeas associated to a specific xContact by refId.
     * @param refId of xContact.
     * @return List of xLeas type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XLeaType> getXLeasByXContact(String refId) throws AuthenticationException {
		return xLeasObject.getXLeasByXContact(refId);
	}
    /**
     * Request xLeas associated to a specific xContact by refId by school year.
     * @param refId of xContact.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xLeas type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XLeaType> getXLeasByXContact(String refId, int schoolYear) throws AuthenticationException {
		return xLeasObject.getXLeasByXContact(refId, schoolYear);
	}
    /**
     * Request xLeas associated to a specific xContact by refId with paging.
     * @param refId              of xContact.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @return List of xLeas type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XLeaType> getXLeasByXContact(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        return xLeasObject.getXLeasByXContact(refId, navigationPage, navigationPageSize);
    }
    /**
     * Request xLeas associated to a specific xContact by refId with paging by school year.
     * @param refId              of xContact.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xLeas type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XLeaType> getXLeasByXContact(String refId, int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
		return xLeasObject.getXLeasByXContact(refId, navigationPage, navigationPageSize, schoolYear);
	}

    /* xSchools */
    /**
     * Request all xSchools.
     * @return List of xSchools type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XSchoolType> getXSchools() throws AuthenticationException {
        return xSchoolsObject.getXSchools();
    }
    /**
     * Request all xSchools by school year.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xSchools type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XSchoolType> getXSchools(int schoolYear) throws AuthenticationException {
		return xSchoolsObject.getXSchools(schoolYear);
	}
    /**
     * Request all xSchools with paging.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @return List of xSchools type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XSchoolType> getXSchools(int navigationPage, int navigationPageSize) throws AuthenticationException {
		return xSchoolsObject.getXSchools(navigationPage, navigationPageSize);
	}
    /**
     * Request all xSchools with paging by school year.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xSchools type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XSchoolType> getXSchools(int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
		return xSchoolsObject.getXSchools(navigationPage, navigationPageSize, schoolYear);
	}
    /**
     * Request all xSchools value changes from a given point.
     * @param opaqueMarker Uses an ISO8601 timestamp that indicates a point since the last changes have been requested.
     * @return List of xSchools type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XSchoolType> getXSchools(String opaqueMarker) throws AuthenticationException {
		return xSchoolsObject.getXSchools(opaqueMarker);
	}
    /**
     * Request all xSchools value changes from a given point with paging.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param opaqueMarker       Uses an ISO8601 timestamp that indicates a point since the last changes have been requested.
     * @return List of xSchools type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XSchoolType> getXSchools(int navigationPage, int navigationPageSize, String opaqueMarker) throws AuthenticationException {
        return xSchoolsObject.getXSchools(navigationPage, navigationPageSize, opaqueMarker);
    }
    /**
     * Request single xSchool by refId.
     * @param refId of xSchool.
     * @return Single xSchools type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseSingle<XSchoolType> getXSchool(String refId) throws AuthenticationException {
		return xSchoolsObject.getXSchool(refId);
	}
    /**
     * Request single xSchool by refId by school year.
     * @param refId of xSchool.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return Single xSchools type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseSingle<XSchoolType> getXSchool(String refId, int schoolYear) throws AuthenticationException {
		return xSchoolsObject.getXSchool(refId, schoolYear);
	}
    /**
     * Request single xSchool by BEDS code or Local Id.
     * @param idType Header value can be set to beds or local.
     * @param id     BEDS or Local Id.
     * @return Single xSchools type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseSingle<XSchoolType> getXSchool(String idType, String id) throws AuthenticationException {
		return xSchoolsObject.getXSchool(idType, id);
	}
    /**
     * Request single xSchool by BEDS code or Local Id by school year.
     * @param idType Header value can be set to beds or local.
     * @param id     BEDS or Local Id.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return Single xSchools type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseSingle<XSchoolType> getXSchool(String idType, String id, int schoolYear) throws AuthenticationException {
		return xSchoolsObject.getXSchool(idType, id, schoolYear);
	}
    /**
     * Request xSchools associated to a specific xLea by refId.
     * @param refId of xLea.
     * @return List of xSchools type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XSchoolType> getXSchoolsByXLea(String refId) throws AuthenticationException {
		return xSchoolsObject.getXSchoolsByXLea(refId);
	}
    /**
     * Request xSchools associated to a specific xLea by refId by school year.
     * @param refId of xLea.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xSchools type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XSchoolType> getXSchoolsByXLea(String refId, int schoolYear) throws AuthenticationException {
		return xSchoolsObject.getXSchoolsByXLea(refId, schoolYear);
	}
    /**
     * Request xSchools associated to a specific xLea by refId with paging.
     * @param refId              of xLea.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @return List of xSchools type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XSchoolType> getXSchoolsByXLea(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
		return xSchoolsObject.getXSchoolsByXLea(refId, navigationPage, navigationPageSize);
	}
    /**
     * Request xSchools associated to a specific xLea by refId with paging by school year.
     * @param refId              of xLea.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xSchools type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XSchoolType> getXSchoolsByXLea(String refId, int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
		return xSchoolsObject.getXSchoolsByXLea(refId, navigationPage, navigationPageSize, schoolYear);
	}
    /**
     * Request xSchools associated to a specific xCalendar by refId.
     * @param refId of xCalendar.
     * @return List of xSchools type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XSchoolType> getXSchoolsByXCalendar(String refId) throws AuthenticationException {
		return xSchoolsObject.getXSchoolsByXCalendar(refId);
	}
    /**
     * Request xSchools associated to a specific xCalendar by refId by school year.
     * @param refId of xCalendar.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xSchools type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XSchoolType> getXSchoolsByXCalendar(String refId, int schoolYear) throws AuthenticationException {
		return xSchoolsObject.getXSchoolsByXCalendar(refId, schoolYear);
	}
    /**
     * Request xSchools associated to a specific xCalendar by refId with paging.
     * @param refId              of xCalendar.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @return List of xSchools type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XSchoolType> getXSchoolsByXCalendar(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        return xSchoolsObject.getXSchoolsByXCalendar(refId, navigationPage, navigationPageSize);
    }
    /**
     * Request xSchools associated to a specific xCalendar by refId with paging by school year.
     * @param refId              of xCalendar.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xSchools type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XSchoolType> getXSchoolsByXCalendar(String refId, int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
		return xSchoolsObject.getXSchoolsByXCalendar(refId, navigationPage, navigationPageSize, schoolYear);
	}
    /**
     * Request xSchools associated to a specific xCourse by refId.
     * @param refId of xCourse.
     * @return List of xSchools type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XSchoolType> getXSchoolsByXCourse(String refId) throws AuthenticationException {
		return xSchoolsObject.getXSchoolsByXCourse(refId);
	}
    /**
     * Request xSchools associated to a specific xCourse by refId by school year.
     * @param refId of xCourse.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xSchools type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XSchoolType> getXSchoolsByXCourse(String refId, int schoolYear) throws AuthenticationException {
		return xSchoolsObject.getXSchoolsByXCourse(refId, schoolYear);
	}
    /**
     * Request xSchools associated to a specific xCourse by refId with paging.
     * @param refId              of xCourse.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @return List of xSchools type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XSchoolType> getXSchoolsByXCourse(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        return xSchoolsObject.getXSchoolsByXCourse(refId, navigationPage, navigationPageSize);
    }
    /**
     * Request xSchools associated to a specific xCourse by refId with paging by school year.
     * @param refId              of xCourse.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xSchools type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XSchoolType> getXSchoolsByXCourse(String refId, int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
		return xSchoolsObject.getXSchoolsByXCourse(refId, navigationPage, navigationPageSize, schoolYear);
	}
    /**
     * Request xSchools associated to a specific xRoster by refId.
     * @param refId of xRoster.
     * @return List of xSchools type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XSchoolType> getXSchoolsByXRoster(String refId) throws AuthenticationException {
		return xSchoolsObject.getXSchoolsByXRoster(refId);
	}
    /**
     * Request xSchools associated to a specific xRoster by refId by school year.
     * @param refId of xRoster.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xSchools type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XSchoolType> getXSchoolsByXRoster(String refId, int schoolYear) throws AuthenticationException {
		return xSchoolsObject.getXSchoolsByXRoster(refId, schoolYear);
	}
    /**
     * Request xSchools associated to a specific xRoster by refId with paging.
     * @param refId              of xRoster.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @return List of xSchools type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XSchoolType> getXSchoolsByXRoster(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        return xSchoolsObject.getXSchoolsByXRoster(refId, navigationPage, navigationPageSize);
    }
    /**
     * Request xSchools associated to a specific xRoster by refId with paging by school year.
     * @param refId              of xRoster.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xSchools type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XSchoolType> getXSchoolsByXRoster(String refId, int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
		return xSchoolsObject.getXSchoolsByXRoster(refId, navigationPage, navigationPageSize, schoolYear);
	}
    /**
     * Request xSchools associated to a specific xStaff by refId.
     * @param refId of xStaff.
     * @return List of xSchools type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XSchoolType> getXSchoolsByXStaff(String refId) throws AuthenticationException {
		return xSchoolsObject.getXSchoolsByXStaff(refId);
	}
    /**
     * Request xSchools associated to a specific xStaff by refId by school year.
     * @param refId of xStaff.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xSchools type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XSchoolType> getXSchoolsByXStaff(String refId, int schoolYear) throws AuthenticationException {
		return xSchoolsObject.getXSchoolsByXStaff(refId, schoolYear);
	}
    /**
     * Request xSchools associated to a specific xStaff by refId with paging.
     * @param refId              of xStaff.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @return List of xSchools type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XSchoolType> getXSchoolsByXStaff(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        return xSchoolsObject.getXSchoolsByXStaff(refId, navigationPage, navigationPageSize);
    }
    /**
     * Request xSchools associated to a specific xStaff by refId with paging by school year.
     * @param refId              of xStaff.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xSchools type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XSchoolType> getXSchoolsByXStaff(String refId, int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
		return xSchoolsObject.getXSchoolsByXStaff(refId, navigationPage, navigationPageSize, schoolYear);
	}
    /**
     * Request xSchools associated to a specific xStudent by refId.
     * @param refId of xStudent.
     * @return List of xSchools type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XSchoolType> getXSchoolsByXStudent(String refId) throws AuthenticationException {
		return xSchoolsObject.getXSchoolsByXStudent(refId);
	}
    /**
     * Request xSchools associated to a specific xStudent by refId by school year.
     * @param refId of xStudent.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xSchools type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XSchoolType> getXSchoolsByXStudent(String refId, int schoolYear) throws AuthenticationException {
		return xSchoolsObject.getXSchoolsByXStudent(refId, schoolYear);
	}
    /**
     * Request xSchools associated to a specific xStudent by refId with paging.
     * @param refId              of xStudent.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @return List of xSchools type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XSchoolType> getXSchoolsByXStudent(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        return xSchoolsObject.getXSchoolsByXStudent(refId, navigationPage, navigationPageSize);
    }
    /**
     * Request xSchools associated to a specific xStudent by refId with paging by school year.
     * @param refId              of xStudent.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xSchools type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XSchoolType> getXSchoolsByXStudent(String refId, int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
		return xSchoolsObject.getXSchoolsByXStudent(refId, navigationPage, navigationPageSize, schoolYear);
	}
    /**
     * Request xSchools associated to a specific xContact by refId.
     * @param refId of xContact.
     * @return List of xSchools type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XSchoolType> getXSchoolsByXContact(String refId) throws AuthenticationException {
		return xSchoolsObject.getXSchoolsByXContact(refId);
	}
    /**
     * Request xSchools associated to a specific xContact by refId by school year.
     * @param refId of xContact.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xSchools type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XSchoolType> getXSchoolsByXContact(String refId, int schoolYear) throws AuthenticationException {
		return xSchoolsObject.getXSchoolsByXContact(refId, schoolYear);
	}
    /**
     * Request xSchools associated to a specific xContact by refId with paging.
     * @param refId              of xContact.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @return List of xSchools type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XSchoolType> getXSchoolsByXContact(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        return xSchoolsObject.getXSchoolsByXContact(refId, navigationPage, navigationPageSize);
    }
    /**
     * Request xSchools associated to a specific xContact by refId with paging by school year.
     * @param refId              of xContact.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xSchools type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XSchoolType> getXSchoolsByXContact(String refId, int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
		return xSchoolsObject.getXSchoolsByXContact(refId, navigationPage, navigationPageSize, schoolYear);
	}

	/* xCalendars */
    /**
     * Request all xCalendars.
     * @return List of xCalendars type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XCalendarType> getXCalendars() throws AuthenticationException {
        return xCalendarsObject.getXCalendars();
    }
    /**
     * Request all xCalendars by school year.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xCalendars type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XCalendarType> getXCalendars(int schoolYear) throws AuthenticationException {
		return xCalendarsObject.getXCalendars(schoolYear);
	}
    /**
     * Request all xCalendars with paging.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @return List of xCalendars type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XCalendarType> getXCalendars(int navigationPage, int navigationPageSize) throws AuthenticationException {
        return xCalendarsObject.getXCalendars(navigationPage, navigationPageSize);
    }
    /**
     * Request all xCalendars with paging by school year.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xCalendars type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XCalendarType> getXCalendars(int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
		return xCalendarsObject.getXCalendars(navigationPage, navigationPageSize, schoolYear);
	}
    /**
     * Request all xCalendar value changes from a given point.
     * @param opaqueMarker Uses an ISO8601 timestamp that indicates a point since the last changes have been requested.
     * @return List of xCalendars type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XCalendarType> getXCalendars(String opaqueMarker) throws AuthenticationException {
        return xCalendarsObject.getXCalendars(opaqueMarker);
    }
    /**
     * Request all xCalendar value changes from a given point with paging.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param opaqueMarker       Uses an ISO8601 timestamp that indicates a point since the last changes have been requested.
     * @return List of xCalendars type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XCalendarType> getXCalendars(int navigationPage, int navigationPageSize, String opaqueMarker) throws AuthenticationException {
        return xCalendarsObject.getXCalendars(navigationPage, navigationPageSize, opaqueMarker);
    }
    /**
     * Request single xCalendar by refId.
     * @param refId of xCalendar.
     * @return Single xCalendars type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseSingle<XCalendarType> getXCalendar(String refId) throws AuthenticationException {
		return xCalendarsObject.getXCalendar(refId);
	}
    /**
     * Request single xCalendar by refId by school year.
     * @param refId of xCalendar.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return Single xCalendars type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseSingle<XCalendarType> getXCalendar(String refId, int schoolYear) throws AuthenticationException {
		return xCalendarsObject.getXCalendar(refId, schoolYear);
	}
    /**
     * Request xCalendars associated to a specific xLea by refId.
     * @param refId of xLea.
     * @return List of xCalendars type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XCalendarType> getXCalendarsByXLea(String refId) throws AuthenticationException {
        return xCalendarsObject.getXCalendarsByXLea(refId);
    }
    /**
     * Request xCalendars associated to a specific xLea by refId by school year.
     * @param refId of xLea.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xCalendars type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XCalendarType> getXCalendarsByXLea(String refId, int schoolYear) throws AuthenticationException {
		return xCalendarsObject.getXCalendarsByXLea(refId, schoolYear);
	}
    /**
     * Request xCalendars associated to a specific xLea by refId with paging.
     * @param refId              of xLea.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @return List of xCalendars type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XCalendarType> getXCalendarsByXLea(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
		return xCalendarsObject.getXCalendarsByXLea(refId, navigationPage, navigationPageSize);
	}
    /**
     * Request xCalendars associated to a specific xLea by refId with paging by school year.
     * @param refId              of xLea.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xCalendars type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XCalendarType> getXCalendarsByXLea(String refId, int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
		return xCalendarsObject.getXCalendarsByXLea(refId, navigationPage, navigationPageSize, schoolYear);
	}
    /**
     * Request xCalendars associated to a specific xSchool by refId.
     * @param refId of xSchool.
     * @return List of xCalendars type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XCalendarType> getXCalendarsByXSchool(String refId) throws AuthenticationException {
		return xCalendarsObject.getXCalendarsByXSchool(refId);
	}
    /**
     * Request xCalendars associated to a specific xSchool by refId by school year.
     * @param refId of xSchool.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xCalendars type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XCalendarType> getXCalendarsByXSchool(String refId, int schoolYear) throws AuthenticationException {
		return xCalendarsObject.getXCalendarsByXSchool(refId, schoolYear);
	}
    /**
     * Request xCalendars associated to a specific xSchool by refId with paging.
     * @param refId              of xSchool.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @return List of xCalendars type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XCalendarType> getXCalendarsByXSchool(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        return xCalendarsObject.getXCalendarsByXSchool(refId, navigationPage, navigationPageSize);
    }
    /**
     * Request xCalendars associated to a specific xSchool by refId with paging by school year.
     * @param refId              of xSchool.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xCalendars type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XCalendarType> getXCalendarsByXSchool(String refId, int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
		return xCalendarsObject.getXCalendarsByXSchool(refId, navigationPage, navigationPageSize, schoolYear);
	}

	/* xCourses */
    /**
     * Request all xCourses.
     * @return List of xCourses type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XCourseType> getXCourses() throws AuthenticationException {
        return xCoursesObject.getXCourses();
    }
    /**
     * Request all xCourses by school year.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xCourses type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XCourseType> getXCourses(int schoolYear) throws AuthenticationException {
		return xCoursesObject.getXCourses(schoolYear);
	}
    /**
     * Request all xCourses with paging
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @return List of xCourses type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XCourseType> getXCourses(int navigationPage, int navigationPageSize) throws AuthenticationException {
		return xCoursesObject.getXCourses(navigationPage, navigationPageSize);
	}
    /**
     * Request all xCourses with paging by school year.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xCourses type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XCourseType> getXCourses(int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
		return xCoursesObject.getXCourses(navigationPage, navigationPageSize, schoolYear);
	}
    /**
     * Request all xCourse value changes from a given point.
     * @param opaqueMarker Uses an ISO8601 timestamp that indicates a point since the last changes have been requested.
     * @return List of xCourses type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XCourseType> getXCourses(String opaqueMarker) throws AuthenticationException {
        return xCoursesObject.getXCourses(opaqueMarker);
    }
    /**
     * Request all xCourse value changes from a given point with paging.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param opaqueMarker       Uses an ISO8601 timestamp that indicates a point since the last changes have been requested.
     * @return List of xCourses type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XCourseType> getXCourses(int navigationPage, int navigationPageSize, String opaqueMarker) throws AuthenticationException {
		return xCoursesObject.getXCourses(navigationPage, navigationPageSize, opaqueMarker);
	}
    /**
     * Request single xCourse by refId.
     * @param refId of xCourse.
     * @return Single xCourses type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseSingle<XCourseType> getXCourse(String refId) throws AuthenticationException {
		return xCoursesObject.getXCourse(refId);
	}
    /**
     * Request single xCourse by refId by school year.
     * @param refId of xCourse.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return Single xCourses type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseSingle<XCourseType> getXCourse(String refId, int schoolYear) throws AuthenticationException {
		return xCoursesObject.getXCourse(refId, schoolYear);
	}
    /**
     * Request xCourses associated to a specific xLea by refId.
     * @param refId of xLea.
     * @return List of xCourses type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XCourseType> getXCoursesByXLea(String refId) throws AuthenticationException {
		return xCoursesObject.getXCoursesByXLea(refId);
	}
    /**
     * Request xCourses associated to a specific xLea by refId by school year.
     * @param refId of xLea.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xCourses type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XCourseType> getXCoursesByXLea(String refId, int schoolYear) throws AuthenticationException {
		return xCoursesObject.getXCoursesByXLea(refId, schoolYear);
	}
    /**
     * Request xCourses associated to a specific xLea by refId wtih paging.
     * @param refId              of xLea.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @return List of xCourses type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XCourseType> getXCoursesByXLea(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        return xCoursesObject.getXCoursesByXLea(refId, navigationPage, navigationPageSize);
    }
    /**
     * Request xCourses associated to a specific xLea by refId with paging by school year.
     * @param refId              of xLea.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xCourses type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XCourseType> getXCoursesByXLea(String refId, int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
		return xCoursesObject.getXCoursesByXLea(refId, navigationPage, navigationPageSize, schoolYear);
	}
    /**
     * Request xCourses associated to a specific xSchool by refId.
     * @param refId of xSchool.
     * @return List of xCourses type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XCourseType> getXCoursesByXSchool(String refId) throws AuthenticationException {
		return xCoursesObject.getXCoursesByXSchool(refId);
	}
    /**
     * Request xCourses associated to a specific xSchool by refId by school year.
     * @param refId of xSchool.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xCourses type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XCourseType> getXCoursesByXSchool(String refId, int schoolYear) throws AuthenticationException {
		return xCoursesObject.getXCoursesByXSchool(refId, schoolYear);
	}
    /**
     * Request xCourses associated to a specific xSchool by refId with paging.
     * @param refId              of xSchool.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @return List of xCourses type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XCourseType> getXCoursesByXSchool(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        return xCoursesObject.getXCoursesByXSchool(refId, navigationPage, navigationPageSize);
    }
    /**
     * Request xCourses associated to a specific xSchool by refId with paging by school year.
     * @param refId              of xSchool.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xCourses type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XCourseType> getXCoursesByXSchool(String refId, int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
		return xCoursesObject.getXCoursesByXSchool(refId, navigationPage, navigationPageSize, schoolYear);
	}
    /**
     * Request xCourses associated to a specific xRoster by refId.
     * @param refId of xRoster.
     * @return List of xCourses type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XCourseType> getXCoursesByXRoster(String refId) throws AuthenticationException {
		return xCoursesObject.getXCoursesByXRoster(refId);
	}
    /**
     * Request xCourses associated to a specific xRoster by refId by school year.
     * @param refId of xRoster.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xCourses type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XCourseType> getXCoursesByXRoster(String refId, int schoolYear) throws AuthenticationException {
		return xCoursesObject.getXCoursesByXRoster(refId, schoolYear);
	}
    /**
     * Request xCourses associated to a specific xRoster by refId with paging.
     * @param refId              of xRoster.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @return List of xCourses type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XCourseType> getXCoursesByXRoster(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        return xCoursesObject.getXCoursesByXRoster(refId, navigationPage, navigationPageSize);
    }
    /**
     * Request xCourses associated to a specific xRoster by refId with paging by school year.
     * @param refId              of xRoster.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xCourses type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XCourseType> getXCoursesByXRoster(String refId, int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
		return xCoursesObject.getXCoursesByXRoster(refId, navigationPage, navigationPageSize, schoolYear);
	}

	/* xRosters */
    /**
     * Request all xRosters.
     * @return List of xRosters type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XRosterType> getXRosters() throws AuthenticationException {
        return xRostersObject.getXRosters();
    }
    /**
     * Request all xRosters by school year.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xRosters type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XRosterType> getXRosters(int schoolYear) throws AuthenticationException {
		return xRostersObject.getXRosters();
	}
    /**
     * Request all xRosters with paging.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @return List of xRosters type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XRosterType> getXRosters(int navigationPage, int navigationPageSize) throws AuthenticationException {
		return xRostersObject.getXRosters(navigationPage, navigationPageSize);
	}
    /**
     * Request all xRosters with paging by school year.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xRosters type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XRosterType> getXRosters(int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
		return xRostersObject.getXRosters(navigationPage, navigationPageSize, schoolYear);
	}
    /**
     * Request all xRosters value changes from a given point.
     * @param opaqueMarker Uses an ISO8601 timestamp that indicates a point since the last changes have been requested.
     * @return List of xRosters type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XRosterType> getXRosters(String opaqueMarker) throws AuthenticationException {
		return xRostersObject.getXRosters(opaqueMarker);
	}
    /**
     * Request all xRosters value changes from a given point with paging.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param opaqueMarker       Uses an ISO8601 timestamp that indicates a point since the last changes have been requested.
     * @return List of xRosters type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XRosterType> getXRosters(int navigationPage, int navigationPageSize, String opaqueMarker) throws AuthenticationException {
        return xRostersObject.getXRosters(navigationPage, navigationPageSize, opaqueMarker);
    }
    /**
     * Request single xRoster by refId.
     * @param refId of xRoster.
     * @return Single xRosters type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseSingle<XRosterType> getXRoster(String refId) throws AuthenticationException {
		return xRostersObject.getXRoster(refId);
	}
    /**
     * Request single xRoster by refId by school year.
     * @param refId of xRoster.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return Single xRosters type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseSingle<XRosterType> getXRoster(String refId, int schoolYear) throws AuthenticationException {
		return xRostersObject.getXRoster(refId);
	}
    /**
     * Request xRosters associated to a specific xLea by refId.
     * @param refId of xLea.
     * @return List of xRosters type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XRosterType> getXRostersByXLea(String refId) throws AuthenticationException {
		return xRostersObject.getXRostersByXLea(refId);
	}
    /**
     * Request xRosters associated to a specific xLea by refId by school year.
     * @param refId of xLea.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xRosters type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XRosterType> getXRostersByXLea(String refId, int schoolYear) throws AuthenticationException {
		return xRostersObject.getXRostersByXLea(refId, schoolYear);
	}
    /**
     * Request xRosters associated to a specific xLea by refId with paging.
     * @param refId              of xLea.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @return List of xRosters type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XRosterType> getXRostersByXLea(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        return xRostersObject.getXRostersByXLea(refId, navigationPage, navigationPageSize);
    }
    /**
     * Request xRosters associated to a specific xLea by refId with paging by school year.
     * @param refId              of xLea.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xRosters type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XRosterType> getXRostersByXLea(String refId, int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
		return xRostersObject.getXRostersByXLea(refId, navigationPage, navigationPageSize, schoolYear);
	}
    /**
     * Request xRosters associated to a specific xSchool by refId.
     * @param refId of xSchool.
     * @return List of xRosters type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XRosterType> getXRostersByXSchool(String refId) throws AuthenticationException {
		return xRostersObject.getXRostersByXSchool(refId);
	}
    /**
     * Request xRosters associated to a specific xSchool by refId by school year.
     * @param refId of xSchool.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xRosters type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XRosterType> getXRostersByXSchool(String refId, int schoolYear) throws AuthenticationException {
		return xRostersObject.getXRostersByXSchool(refId, schoolYear);
	}
    /**
     * Request xRosters associated to a specific xSchool by refId with paging.
     * @param refId              of xSchool.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @return List of xRosters type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XRosterType> getXRostersByXSchool(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        return xRostersObject.getXRostersByXSchool(refId, navigationPage, navigationPageSize);
    }
    /**
     * Request xRosters associated to a specific xSchool by refId with paging by school year.
     * @param refId              of xSchool.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xRosters type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XRosterType> getXRostersByXSchool(String refId, int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
		return xRostersObject.getXRostersByXSchool(refId, navigationPage, navigationPageSize);
	}
    /**
     * Request xRosters associated to a specific xCourse by refId.
     * @param refId of xCourse.
     * @return List of xRosters type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XRosterType> getXRostersByXCourse(String refId) throws AuthenticationException {
		return xRostersObject.getXRostersByXCourse(refId);
	}
    /**
     * Request xRosters associated to a specific xCourse by refId by school year.
     * @param refId of xCourse.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xRosters type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XRosterType> getXRostersByXCourse(String refId, int schoolYear) throws AuthenticationException {
		return xRostersObject.getXRostersByXCourse(refId, schoolYear);
	}
    /**
     * Request xRosters associated to a specific xCourse by refId with paging.
     * @param refId              of xCourse.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @return List of xRosters type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XRosterType> getXRostersByXCourse(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        return xRostersObject.getXRostersByXCourse(refId, navigationPage, navigationPageSize);
    }
    /**
     * Request xRosters associated to a specific xCourse by refId with paging by school year.
     * @param refId              of xCourse.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xRosters type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XRosterType> getXRostersByXCourse(String refId, int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
		return xRostersObject.getXRostersByXCourse(refId, navigationPage, navigationPageSize, schoolYear);
	}
    /**
     * Request xRosters associated to a specific xStaff by refId.
     * @param refId of xStaff.
     * @return List of xRosters type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XRosterType> getXRostersByXStaff(String refId) throws AuthenticationException {
		return xRostersObject.getXRostersByXStaff(refId);
	}
    /**
     * Request xRosters associated to a specific xStaff by refId by school year.
     * @param refId of xStaff.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xRosters type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XRosterType> getXRostersByXStaff(String refId, int schoolYear) throws AuthenticationException {
		return xRostersObject.getXRostersByXStaff(refId, schoolYear);
	}
    /**
     * Request xRosters associated to a specific xStaff by refId with paging.
     * @param refId              of xStaff.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @return List of xRosters type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XRosterType> getXRostersByXStaff(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        return xRostersObject.getXRostersByXStaff(refId, navigationPage, navigationPageSize);
    }
    /**
     * Request xRosters associated to a specific xStaff by refId with paging by school year.
     * @param refId              of xStaff.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xRosters type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XRosterType> getXRostersByXStaff(String refId, int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
		return xRostersObject.getXRostersByXStaff(refId, navigationPage, navigationPageSize, schoolYear);
	}
    /**
     * Request xRosters associated to a specific xStudent by refId.
     * @param refId of xStudent.
     * @return List of xRosters type.
     * @throws AuthenticationException if login does not succeed. if login does not succeed.
     */
	public ResponseMulti<XRosterType> getXRostersByXStudent(String refId) throws AuthenticationException {
		return xRostersObject.getXRostersByXStudent(refId);
	}
    /**
     * Request xRosters associated to a specific xStudent by refId by school year.
     * @param refId of xStudent.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xRosters type.
     * @throws AuthenticationException if login does not succeed. if login does not succeed.
     */
	public ResponseMulti<XRosterType> getXRostersByXStudent(String refId, int schoolYear) throws AuthenticationException {
		return xRostersObject.getXRostersByXStudent(refId, schoolYear);
	}
    /**
     * Request xRosters associated to a specific xStudent by refId wtih paging.
     * @param refId              of xStudent.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @return List of xRosters type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XRosterType> getXRostersByXStudent(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        return xRostersObject.getXRostersByXStudent(refId, navigationPage, navigationPageSize);
    }
    /**
     * Request xRosters associated to a specific xStudent by refId with paging by school year.
     * @param refId              of xStudent.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xRosters type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XRosterType> getXRostersByXStudent(String refId, int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
		return xRostersObject.getXRostersByXStudent(refId, navigationPage, navigationPageSize, schoolYear);
	}

	/* xStaffs */
    /**
     * Request all xStaffs.
     * @return List of xStaffs type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XStaffType> getXStaffs() throws AuthenticationException {
        return xStaffsObject.getXStaffs();
    }
    /**
     * Request all xStaffs by school year.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xStaffs type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XStaffType> getXStaffs(int schoolYear) throws AuthenticationException {
		return xStaffsObject.getXStaffs(schoolYear);
	}
    /**
     * Request all xStaffs with paging.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @return List of xStaffs type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XStaffType> getXStaffs(int navigationPage, int navigationPageSize) throws AuthenticationException {
		return xStaffsObject.getXStaffs(navigationPage, navigationPageSize);
	}
    /**
     * Request all xStaffs with paging by school year.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xStaffs type..
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XStaffType> getXStaffs(int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
		return xStaffsObject.getXStaffs(navigationPage, navigationPageSize, schoolYear);
	}
    /**
     * Request all xStaffs value changes from a given point.
     * @param opaqueMarker Uses an ISO8601 timestamp that indicates a point since the last changes have been requested.
     * @return List of xStaffs type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XStaffType> getXStaffs(String opaqueMarker) throws AuthenticationException {
		return xStaffsObject.getXStaffs(opaqueMarker);
	}
    /**
     * Request all xStaffs value changes from a given point with paging.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param opaqueMarker       Uses an ISO8601 timestamp that indicates a point since the last changes have been requested.
     * @return List of xStaffs type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XStaffType> getXStaffs(int navigationPage, int navigationPageSize, String opaqueMarker) throws AuthenticationException {
        return xStaffsObject.getXStaffs(navigationPage, navigationPageSize, opaqueMarker);
    }
    /**
     * Request single xStaff by refId.
     * @param refId of xStaff.
     * @return Single xStaffs type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseSingle<XStaffType> getXStaff(String refId) throws AuthenticationException {
		return xStaffsObject.getXStaff(refId);
	}
    /**
     * Request single xStaff by refId by school year.
     * @param refId of xStaff.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return Single xStaffs type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseSingle<XStaffType> getXStaff(String refId, int schoolYear) throws AuthenticationException {
		return xStaffsObject.getXStaff(refId, schoolYear);
	}
    /**
     * Request xStaffs associated to a specific xLea by refId.
     * @param refId of xStaff.
     * @return List of xStaffs type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XStaffType> getXStaffsByXLea(String refId) throws AuthenticationException {
		return xStaffsObject.getXStaffsByXLea(refId);
	}
    /**
     * Request xStaffs associated to a specific xLea by refId by school year.
     * @param refId of xStaff.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xStaffs type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XStaffType> getXStaffsByXLea(String refId, int schoolYear) throws AuthenticationException {
		return xStaffsObject.getXStaffsByXLea(refId, schoolYear);
	}
    /**
     * Request xStaffs associated to a specific xLea by refId with paging.
     * @param refId              of xLea.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @return List of xStaffs type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XStaffType> getXStaffsByXLea(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        return xStaffsObject.getXStaffsByXLea(refId, navigationPage, navigationPageSize);
    }
    /**
     * Request xStaffs associated to a specific xLea by refId with paging by school year.
     * @param refId              of xLea.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xStaffs type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XStaffType> getXStaffsByXLea(String refId, int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
		return xStaffsObject.getXStaffsByXLea(refId, navigationPage, navigationPageSize, schoolYear);
	}
    /**
     * Request xStaffs associated to a specific xSchool by refId.
     * @param refId of xSchool.
     * @return List of xStaffs type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XStaffType> getXStaffsByXSchool(String refId) throws AuthenticationException {
		return xStaffsObject.getXStaffsByXSchool(refId);
	}
    /**
     * Request xStaffs associated to a specific xSchool by refId by school year.
     * @param refId of xSchool.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xStaffs type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XStaffType> getXStaffsByXSchool(String refId, int schoolYear) throws AuthenticationException {
		return xStaffsObject.getXStaffsByXSchool(refId, schoolYear);
	}
    /**
     * Request xStaffs associated to a specific xSchool by refId with paging.
     * @param refId              of xSchool.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @return List of xStaffs type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XStaffType> getXStaffsByXSchool(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        return xStaffsObject.getXStaffsByXSchool(refId, navigationPage, navigationPageSize);
    }
    /**
     * Request xStaffs associated to a specific xSchool by refId with paging by school year.
     * @param refId              of xSchool.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xStaffs type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XStaffType> getXStaffsByXSchool(String refId, int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
		return xStaffsObject.getXStaffsByXSchool(refId, navigationPage, navigationPageSize, schoolYear);
	}
    /**
     * Request xStaffs associated to a specific xCourse by refId.
     * @param refId of xCourse.
     * @return List of xStaffs type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XStaffType> getXStaffsByXCourse(String refId) throws AuthenticationException {
		return xStaffsObject.getXStaffsByXCourse(refId);
	}
    /**
     * Request xStaffs associated to a specific xCourse by refId by school year.
     * @param refId of xCourse.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xStaffs type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XStaffType> getXStaffsByXCourse(String refId, int schoolYear) throws AuthenticationException {
		return xStaffsObject.getXStaffsByXCourse(refId, schoolYear);
	}
    /**
     * Request xStaffs associated to a specific xCourse by refId with paging.
     * @param refId              of xCourse.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @return List of xStaffs type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XStaffType> getXStaffsByXCourse(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        return xStaffsObject.getXStaffsByXCourse(refId, navigationPage, navigationPageSize);
    }
    /**
     * Request xStaffs associated to a specific xCourse by refId with paging by school year.
     * @param refId              of xCourse.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xStaffs type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XStaffType> getXStaffsByXCourse(String refId, int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
		return xStaffsObject.getXStaffsByXCourse(refId, navigationPage, navigationPageSize, schoolYear);
	}
    /**
     * Request xStaffs associated to a specific xRoster by refId.
     * @param refId of xRoster.
     * @return List of xStaffs type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XStaffType> getXStaffsByXRoster(String refId) throws AuthenticationException {
		return xStaffsObject.getXStaffsByXRoster(refId);
	}
    /**
     * Request xStaffs associated to a specific xRoster by refId by school year.
     * @param refId of xRoster.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xStaffs type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XStaffType> getXStaffsByXRoster(String refId, int schoolYear) throws AuthenticationException {
		return xStaffsObject.getXStaffsByXRoster(refId, schoolYear);
	}
    /**
     * Request xStaffs associated to a specific xRoster by refId with paging.
     * @param refId              of xRoster.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @return List of xStaffs type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XStaffType> getXStaffsByXRoster(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        return xStaffsObject.getXStaffsByXRoster(refId, navigationPage, navigationPageSize);
    }
    /**
     * Request xStaffs associated to a specific xRoster by refId with paging by school year.
     * @param refId              of xRoster.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xStaffs type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XStaffType> getXStaffsByXRoster(String refId, int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
		return xStaffsObject.getXStaffsByXRoster(refId, navigationPage, navigationPageSize, schoolYear);
	}
    /**
     * Request xStaffs associated to a specific xStudent by refId.
     * @param refId of xStudent.
     * @return List of xStaffs type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XStaffType> getXStaffsByXStudent(String refId) throws AuthenticationException {
		return xStaffsObject.getXStaffsByXStudent(refId);
	}
    /**
     * Request xStaffs associated to a specific xStudent by refId by school year.
     * @param refId of xStudent.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xStaffs type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XStaffType> getXStaffsByXStudent(String refId, int schoolYear) throws AuthenticationException {
		return xStaffsObject.getXStaffsByXStudent(refId, schoolYear);
	}
    /**
     * Request xStaffs associated to a specific xStudent by refId with paging.
     * @param refId              of xStudent.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @return List of xStaffs type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XStaffType> getXStaffsByXStudent(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        return xStaffsObject.getXStaffsByXStudent(refId, navigationPage, navigationPageSize);
    }
    /**
     * Request xStaffs associated to a specific xStudent by refId with paging by school year.
     * @param refId              of xStudent.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xStaffs type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XStaffType> getXStaffsByXStudent(String refId, int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
		return xStaffsObject.getXStaffsByXStudent(refId, navigationPage, navigationPageSize, schoolYear);
	}

	/* xStudents */
    /**
     * Request all xStudents.
     * @return List of xStudents type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XStudentType> getXStudents() throws AuthenticationException {
        return xStudentsObject.getXStudents();
    }
    /**
     * Request all xStudents by school year.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xStudents type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XStudentType> getXStudents(int schoolYear) throws AuthenticationException {
		return xStudentsObject.getXStudents(schoolYear);
	}
    /**
     * Request all xStudents with paging.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @return List of xStudents type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XStudentType> getXStudents(int navigationPage, int navigationPageSize) throws AuthenticationException {
		return xStudentsObject.getXStudents(navigationPage, navigationPageSize);
	}
    /**
     * Request all xStudents with paging by school year.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xStudents type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XStudentType> getXStudents(int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
		return xStudentsObject.getXStudents(navigationPage, navigationPageSize, schoolYear);
	}
    /**
     * Request all xStudents value changes from a given point.
     * @param opaqueMarker Uses an ISO8601 timestamp that indicates a point since the last changes have been requested.
     * @return List of xStudents type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XStudentType> getXStudents(String opaqueMarker) throws AuthenticationException {
		return xStudentsObject.getXStudents(opaqueMarker);
	}
    /**
     * Request all xStudents value changes from a given point with paging.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve
     * @param opaqueMarker       Uses an ISO8601 timestamp that indicates a point since the last changes have been requested.
     * @return List of xStudents type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XStudentType> getXStudents(int navigationPage, int navigationPageSize, String opaqueMarker) throws AuthenticationException {
        return xStudentsObject.getXStudents(navigationPage, navigationPageSize, opaqueMarker);
    }
    /**
     * Request single xStudent by refId.
     * @param refId of xStudent.
     * @return Single xStudents type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseSingle<XStudentType> getXStudent(String refId) throws AuthenticationException {
		return xStudentsObject.getXStudent(refId);
	}
    /**
     * Request single xStudent by refId by school year.
     * @param refId of xStudent.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return Single xStudents type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseSingle<XStudentType> getXStudent(String refId, int schoolYear) throws AuthenticationException {
		return xStudentsObject.getXStudent(refId, schoolYear);
	}
    /**
     * Request xStudents associated to a specific xLea by refId.
     * @param refId of xLea.
     * @return List of xStudents type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XStudentType> getXStudentsByXLea(String refId) throws AuthenticationException {
		return xStudentsObject.getXStudentsByXLea(refId);
	}
    /**
     * Request xStudents associated to a specific xLea by refId by school year.
     * @param refId of xLea.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xStudents type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XStudentType> getXStudentsByXLea(String refId, int schoolYear) throws AuthenticationException {
		return xStudentsObject.getXStudentsByXLea(refId, schoolYear);
	}
    /**
     * Request xStudents associated to a specific xLea by refId with paging.
     * @param refId              of xLea.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @return List of xStudents type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XStudentType> getXStudentsByXLea(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        return xStudentsObject.getXStudentsByXLea(refId, navigationPage, navigationPageSize);
    }
    /**
     * Request xStudents associated to a specific xLea by refId with paging by school year.
     * @param refId              of xLea.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xStudents type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XStudentType> getXStudentsByXLea(String refId, int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
		return xStudentsObject.getXStudentsByXLea(refId, navigationPage, navigationPageSize, schoolYear);
	}
    /**
     * Request xStudents associated to a specific xSchool by refId.
     * @param refId of xSchool.
     * @return List of xStudents type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XStudentType> getXStudentsByXSchool(String refId) throws AuthenticationException {
		return xStudentsObject.getXStudentsByXSchool(refId);
	}
    /**
     * Request xStudents associated to a specific xSchool by refId by school year.
     * @param refId of xSchool.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xStudents type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XStudentType> getXStudentsByXSchool(String refId, int schoolYear) throws AuthenticationException {
		return xStudentsObject.getXStudentsByXSchool(refId, schoolYear);
	}
    /**
     * Request xStudents associated to a specific xSchool by refId with paging.
     * @param refId              of xSchool.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @return List of xStudents type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XStudentType> getXStudentsByXSchool(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        return xStudentsObject.getXStudentsByXSchool(refId, navigationPage, navigationPageSize);
    }
    /**
     * Request xStudents associated to a specific xSchool by refId with paging by school year.
     * @param refId              of xSchool.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xStudents type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XStudentType> getXStudentsByXSchool(String refId, int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
		return xStudentsObject.getXStudentsByXSchool(refId, navigationPage, navigationPageSize, schoolYear);
	}
    /**
     * Request xStudents associated to a specific xRoster by refId.
     * @param refId of xRoster.
     * @return List of xStudents type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XStudentType> getXStudentsByXRoster(String refId) throws AuthenticationException {
		return xStudentsObject.getXStudentsByXRoster(refId);
	}
    /**
     * Request xStudents associated to a specific xRoster by refId by school year.
     * @param refId of xRoster.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xStudents type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XStudentType> getXStudentsByXRoster(String refId, int schoolYear) throws AuthenticationException {
		return xStudentsObject.getXStudentsByXRoster(refId, schoolYear);
	}
    /**
     * Request xStudents associated to a specific xRoster by refId with paging.
     * @param refId              of xRoster.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @return List of xStudents type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XStudentType> getXStudentsByXRoster(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        return xStudentsObject.getXStudentsByXRoster(refId, navigationPage, navigationPageSize);
    }
    /**
     * Request xStudents associated to a specific xRoster by refId with paging by school year.
     * @param refId              of xRoster.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xStudents type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XStudentType> getXStudentsByXRoster(String refId, int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
		return xStudentsObject.getXStudentsByXRoster(refId, navigationPage, navigationPageSize, schoolYear);
	}
    /**
     * Request xStudents associated to a specific xStaff by refId.
     * @param refId of xStaff.
     * @return List of xStudents type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XStudentType> getXStudentsByXStaff(String refId) throws AuthenticationException {
		return xStudentsObject.getXStudentsByXStaff(refId);
	}
    /**
     * Request xStudents associated to a specific xStaff by refId by school year.
     * @param refId of xStaff.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xStudents type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XStudentType> getXStudentsByXStaff(String refId, int schoolYear) throws AuthenticationException {
		return xStudentsObject.getXStudentsByXStaff(refId, schoolYear);
	}
    /**
     * Request xStudents associated to a specific xStaff by refId with paging.
     * @param refId              of xStaff.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @return List of xStudents type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XStudentType> getXStudentsByXStaff(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        return xStudentsObject.getXStudentsByXStaff(refId, navigationPage, navigationPageSize);
    }
    /**
     * Request xStudents associated to a specific xStaff by refId with paging by school year.
     * @param refId              of xStaff.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xStudents type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XStudentType> getXStudentsByXStaff(String refId, int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
		return xStudentsObject.getXStudentsByXStaff(refId, navigationPage, navigationPageSize, schoolYear);
	}
    /**
     * Request xStudents associated to a specific xContact by refId.
     * @param refId of xContact.
     * @return List of xStudents type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XStudentType> getXStudentsByXContact(String refId) throws AuthenticationException {
		return xStudentsObject.getXStudentsByXContact(refId);
	}
    /**
     * Request xStudents associated to a specific xContact by refId by school year.
     * @param refId of xContact.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xStudents type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XStudentType> getXStudentsByXContact(String refId, int schoolYear) throws AuthenticationException {
		return xStudentsObject.getXStudentsByXContact(refId, schoolYear);
	}
    /**
     * Request xStudents associated to a specific xContact by refId with paging.
     * @param refId              of xContact.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @return List of xStudents type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XStudentType> getXStudentsByXContact(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        return xStudentsObject.getXStudentsByXContact(refId, navigationPage, navigationPageSize);
    }
    /**
     * Request xStudents associated to a specific xContact by refId with paging by school year.
     * @param refId              of xContact.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xStudents type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XStudentType> getXStudentsByXContact(String refId, int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
		return xStudentsObject.getXStudentsByXContact(refId, navigationPage, navigationPageSize, schoolYear);
	}

	/* xContacts */
    /**
     * Request all xContacts
     * @return List of xContacts type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XContactType> getXContacts() throws AuthenticationException {
        return xContactsObject.getXContacts();
    }
    /**
     * Request all xContacts by school year.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xContacts type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XContactType> getXContacts(int schoolYear) throws AuthenticationException {
		return xContactsObject.getXContacts(schoolYear);
	}
    /**
     * Request all xContacts with paging.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @return List of xContacts type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XContactType> getXContacts(int navigationPage, int navigationPageSize) throws AuthenticationException {
		return xContactsObject.getXContacts(navigationPage, navigationPageSize);
	}
    /**
     * Request all xContacts with paging by school year.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xContacts type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XContactType> getXContacts(int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
		return xContactsObject.getXContacts(navigationPage, navigationPageSize, schoolYear);
	}
    /**
     * Request all xContacts value changes from a given point.
     * @param opaqueMarker Uses an ISO8601 timestamp that indicates a point since the last changes have been requested.
     * @return List of xContacts type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XContactType> getXContacts(String opaqueMarker) throws AuthenticationException {
		return xContactsObject.getXContacts(opaqueMarker);
	}
    /**
     * Request all xContacts value changes from a given point with paging.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param opaqueMarker       Uses an ISO8601 timestamp that indicates a point since the last changes have been requested.
     * @return List of xContacts type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XContactType> getXContacts(int navigationPage, int navigationPageSize, String opaqueMarker) throws AuthenticationException {
        return xContactsObject.getXContacts(navigationPage, navigationPageSize, opaqueMarker);
    }
    /**
     * Request single xContact by refId.
     * @param refId of xContact.
     * @return Single xContacts type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseSingle<XContactType> getXContact(String refId) throws AuthenticationException {
		return xContactsObject.getXContact(refId);
	}
    /**
     * Request single xContact by refId by school year.
     * @param refId of xContact.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return Single xContacts type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseSingle<XContactType> getXContact(String refId, int schoolYear) throws AuthenticationException {
		return xContactsObject.getXContact(refId, schoolYear);
	}
    /**
     * Request xContacts associated to a specific xLea by refId.
     * @param refId of xLea.
     * @return List of xContacts type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XContactType> getXContactsByXLea(String refId) throws AuthenticationException {
		return xContactsObject.getXContactsByXLea(refId);
	}
    /**
     * Request xContacts associated to a specific xLea by refId by school year.
     * @param refId of xLea.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xContacts type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XContactType> getXContactsByXLea(String refId, int schoolYear) throws AuthenticationException {
		return xContactsObject.getXContactsByXLea(refId, schoolYear);
	}
    /**
     * Request xContacts associated to a specific xLea by refId with paging.
     * @param refId              of xLea.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @return List of xContacts type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XContactType> getXContactsByXLea(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        return xContactsObject.getXContactsByXLea(refId, navigationPage, navigationPageSize);
    }
    /**
     * Request xContacts associated to a specific xLea by refId with paging by school year.
     * @param refId              of xLea.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xContacts type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XContactType> getXContactsByXLea(String refId, int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
		return xContactsObject.getXContactsByXLea(refId, navigationPage, navigationPageSize, schoolYear);
	}
    /**
     * Request xContacts associated to a specific xSchool by refId.
     * @param refId of xSchool.
     * @return List of xContacts type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XContactType> getXContactsByXSchool(String refId) throws AuthenticationException {
		return xContactsObject.getXContactsByXSchool(refId);
	}
    /**
     * Request xContacts associated to a specific xSchool by refId by school year.
     * @param refId of xSchool.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xContacts type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XContactType> getXContactsByXSchool(String refId, int schoolYear) throws AuthenticationException {
		return xContactsObject.getXContactsByXSchool(refId, schoolYear);
	}
    /**
     * Request xContacts associated to a specific xSchool by refId with paging.
     * @param refId              of xSchool.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @return List of xContacts type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XContactType> getXContactsByXSchool(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        return xContactsObject.getXContactsByXSchool(refId, navigationPage, navigationPageSize);
    }
    /**
     * Request xContacts associated to a specific xSchool by refId with paging by school year.
     * @param refId              of xSchool.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xContacts type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XContactType> getXContactsByXSchool(String refId, int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
		return xContactsObject.getXContactsByXSchool(refId, navigationPage, navigationPageSize, schoolYear);
	}
    /**
     * Request xContacts associated to a specific xStudent by refId.
     * @param refId of xStudent.
     * @return List of xContacts type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XContactType> getXContactsByXStudent(String refId) throws AuthenticationException {
		return xContactsObject.getXContactsByXStudent(refId);
	}
    /**
     * Request xContacts associated to a specific xStudent by refId by school year.
     * @param refId of xStudent.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xContacts type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XContactType> getXContactsByXStudent(String refId, int schoolYear) throws AuthenticationException {
		return xContactsObject.getXContactsByXStudent(refId, schoolYear);
	}
    /**
     * Request xContacts associated to a specific xStudent by refId with paging.
     * @param refId              of xStudent.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @return List of xContacts type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XContactType> getXContactsByXStudent(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        return xContactsObject.getXContactsByXStudent(refId, navigationPage, navigationPageSize);
    }
    /**
     * Request xContacts associated to a specific xStudent by refId with paging by school year.
     * @param refId              of xStudent.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xContacts type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XContactType> getXContactsByXStudent(String refId, int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
		return xContactsObject.getXContactsByXStudent(refId, navigationPage, navigationPageSize, schoolYear);
	}

	/* navigationLastPage */
    /**
     * Returns the max page value for specified service path object.
     * @param servicePath The requested service path.
     * @param navigationPageSize Number of resources to retrieve.
     * @return Integer value.
     * @throws AuthenticationException if login does not succeed.
     */
	public int getLastPage(ServicePath servicePath, int navigationPageSize) throws AuthenticationException {
		return getLastPageObject.getLastPage(servicePath, navigationPageSize);
	}
    /**
     * Returns the max page value for specified service path object by school year.
     * @param servicePath The requested service path.
     * @param navigationPageSize Number of resources to retrieve.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return Integer value.
     * @throws AuthenticationException if login does not succeed.
     */
	public int getLastPage(ServicePath servicePath, int navigationPageSize, int schoolYear) throws AuthenticationException {
		return getLastPageObject.getLastPage(servicePath, navigationPageSize, schoolYear);
	}
    /**
     * Returns the max page value for specified service path object.
     * @param servicePath The requested service path.
     * @param refId of xObject.
     * @param navigationPageSize Number of resources to retrieve.
     * @return Integer value.
     * @throws AuthenticationException if login does not succeed.
     */
    public int getLastPage(ServicePath servicePath, String refId, int navigationPageSize) throws AuthenticationException {
        return getLastPageObject.getLastPage(servicePath, refId, navigationPageSize);
    }
    /**
     * Returns the max page value for specified service path object by school year.
     * @param servicePath The requested service path.
     * @param refId of xObject.
     * @param navigationPageSize Number of resources to retrieve.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return Integer value.
     * @throws AuthenticationException if login does not succeed.
     */
	public int getLastPage(ServicePath servicePath, String refId, int navigationPageSize, int schoolYear) throws AuthenticationException {
		return getLastPageObject.getLastPage(servicePath, refId, navigationPageSize, schoolYear);
	}

	/* AUPP Object */
    /**
     * Request creation of xStaffs usernames and passwords by xSchool.
     * @param refId of xSchool.
     * @return List of xStaffs type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XStaffType> createXStaffUsers(String refId) throws AuthenticationException {
		return auppObject.createXStaffUsers(refId);
	}
    /**
     * Request deletion of generated xStaffs passwords by xSchool.
     * @param refId of xSchool.
     * @return List of xStaffs type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XStaffType> deleteXStaffUsers(String refId) throws AuthenticationException {
		return auppObject.deleteXStaffUsers(refId);
	}
    /**
     * Request generated xStaffs usernames and passwords by xSchool.
     * @param refId of xSchool.
     * @return List of xStaffs type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XStaffType> getXStaffUsers(String refId) throws AuthenticationException {
        return auppObject.getXStaffUsers(refId);
    }
    /**
     * Request generated xStaffs usernames and passwords by xSchool with paging.
     * @param refId              of xSchool.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @return List of xStaffs type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XStaffType> getXStaffUsers(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
		return auppObject.getXStaffUsers(refId, navigationPage, navigationPageSize);
	}
    /**
     * Request creation of xStudents usernames and passwords by xSchool.
     * @param refId of xSchool.
     * @return List of xStudents type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XStudentType> createXStudentUsers(String refId) throws AuthenticationException {
		return auppObject.createXStudentUsers(refId);
	}
    /**
     * Request deletion of generated xStudents passwords by xSchool.
     * @param refId of xSchool.
     * @return List of xStudents type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XStudentType> deleteXStudentUsers(String refId) throws AuthenticationException {
		return auppObject.deleteXStudentUsers(refId);
	}
    /**
     * Request generated xStudents usernames and passwords by xSchool.
     * @param refId of xSchool.
     * @return List of xStudents type.
     * @throws AuthenticationException if login does not succeed.
     */
	public ResponseMulti<XStudentType> getXStudentUsers(String refId) throws AuthenticationException {
		return auppObject.getXStudentUsers(refId);
	}
    /**
     * Request generated xStudents usernames and passwords by xSchool.
     * @param refId              of xSchool.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @return List of xStudents type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XStudentType> getXStudentUsers(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        return auppObject.getXStudentUsers(refId, navigationPage, navigationPageSize);
    }

//    /**
//     * Request creation of xContacts usernames and passwords by xSchool.
//     * @param refId of xSchool.
//     * @return List of xContacts type.
//     * @throws AuthenticationException if login does not succeed.
//     */
//	private ResponseMulti<XContactType> createXContactUsers(String refId) throws AuthenticationException {
//		return auppObject.createXContactUsers(refId);
//	}
//    /**
//     * Request deletion of generated xContacts passwords by xSchool.
//     * @param refId of xSchool.
//     * @return List of xContacts type.
//     * @throws AuthenticationException if login does not succeed.
//     */
//	private ResponseMulti<XContactType> deleteXContactUsers(String refId) throws AuthenticationException {
//		return auppObject.deleteXContactUsers(refId);
//	}
//    /**
//     * Request generated xContacts usernames and passwords by xSchool.
//     * @param refId of xSchool.
//     * @return List of xContacts type.
//     * @throws AuthenticationException if login does not succeed.
//     */
//	private ResponseMulti<XContactType> getXContactUsers(String refId) throws AuthenticationException {
//		return auppObject.getXContactUsers(refId);
//	}
//    /**
//     * Request generated xContacts usernames and passwords by xSchool with paging.
//     * @param refId              of xSchool.
//     * @param navigationPage     Page to retrieve.
//     * @param navigationPageSize Number of resources to retrieve.
//     * @return List of xContacts type.
//     * @throws AuthenticationException if login does not succeed.
//     */
//	private ResponseMulti<XContactType> getXContactUsers(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
//		return auppObject.getXContactUsers(refId, navigationPage, navigationPageSize);
//	}

	/**
	 * Request String response of a service path in JSON or XML format.
	 * @param servicePath The requested service path.
	 * @param type MediaType Enumerator for values MediaTypeEnum.JSON or MediaTypeEnum.XML.
	 * @return String value of requested service path.
	 * @see ServicePath
	 * @see MediaTypeEnum
	 * @throws AuthenticationException if login does not succeed.
	 */
	public String getJsonXml(ServicePath servicePath, MediaTypeEnum type) throws AuthenticationException {
		return jsonXmlObject.getJsonXml(servicePath, type);
	}

	/**
	 * Request String response of a service path by school year in JSON or XML format.
	 * @param servicePath The requested service path.
	 * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
	 * @param type MediaType Enumerator for values MediaTypeEnum.JSON or MediaTypeEnum.XML.
	 * @return String value of requested service path.
	 * @see ServicePath
	 * @see MediaTypeEnum
	 * @throws AuthenticationException if login does not succeed.
	 */
	public String getJsonXml(ServicePath servicePath, int schoolYear, MediaTypeEnum type) throws AuthenticationException {
		return jsonXmlObject.getJsonXml(servicePath, schoolYear, type);
	}

	/**
	 * Request String response of a service path with paging in JSON or XML format.
	 * @param servicePath The requested service path.
	 * @param navigationPage     Page to retrieve.
	 * @param navigationPageSize Number of resources to retrieve.
	 * @param type MediaType Enumerator for values MediaTypeEnum.JSON or MediaTypeEnum.XML.
	 * @return String value of requested service path.
	 * @see ServicePath
	 * @see MediaTypeEnum
	 * @throws AuthenticationException if login does not succeed.
	 */
	public String getJsonXml(ServicePath servicePath, int navigationPage, int navigationPageSize, MediaTypeEnum type) throws AuthenticationException {
		return jsonXmlObject.getJsonXml(servicePath, navigationPage, navigationPageSize, type);
	}

	/**
	 * Request String response of a service path with paging by school year in JSON or XML format.
	 * @param servicePath The requested service path.
	 * @param navigationPage     Page to retrieve.
	 * @param navigationPageSize Number of resources to retrieve.
	 * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
	 * @param type MediaType Enumerator for values MediaTypeEnum.JSON or MediaTypeEnum.XML.
	 * @return String value of requested service path.
	 * @see ServicePath
	 * @see MediaTypeEnum
	 * @throws AuthenticationException if login does not succeed.
	 */
	public String getJsonXml(ServicePath servicePath, int navigationPage, int navigationPageSize, int schoolYear, MediaTypeEnum type) throws AuthenticationException {
		return jsonXmlObject.getJsonXml(servicePath, navigationPage, navigationPageSize, schoolYear, type);
	}

	/**
	 * Request String response of a service path by refId in JSON or XML format.
	 * @param servicePath The requested service path.
	 * @param refId of xObject.
	 * @param type MediaType Enumerator for values MediaTypeEnum.JSON or MediaTypeEnum.XML.
	 * @return String value of requested service path.
	 * @see ServicePath
	 * @see MediaTypeEnum
	 * @throws AuthenticationException if login does not succeed.
	 */
	public String getJsonXml(ServicePath servicePath, String refId, MediaTypeEnum type) throws AuthenticationException {
		return jsonXmlObject.getJsonXml(servicePath, refId, type);
	}

	/**
	 * Request String response of a service path by refId and school year in JSON or XML format.
	 * @param servicePath The requested service path.
	 * @param refId of xObject.
	 * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
	 * @param type MediaType Enumerator for values MediaTypeEnum.JSON or MediaTypeEnum.XML.
	 * @return String value of requested service path.
	 * @see ServicePath
	 * @see MediaTypeEnum
	 * @throws AuthenticationException if login does not succeed.
	 */
	public String getJsonXml(ServicePath servicePath, String refId, int schoolYear, MediaTypeEnum type) throws AuthenticationException {
		return jsonXmlObject.getJsonXml(servicePath, refId, schoolYear, type);
	}

	/**
	 * Request String response of a service path by refId with paging in JSON or XML format.
	 * @param servicePath The requested service path.
	 * @param refId of xObject.
	 * @param navigationPage     Page to retrieve.
	 * @param navigationPageSize Number of resources to retrieve.
	 * @param type MediaType Enumerator for values MediaTypeEnum.JSON or MediaTypeEnum.XML.
	 * @return String value of requested service path.
	 * @see ServicePath
	 * @see MediaTypeEnum
	 * @throws AuthenticationException if login does not succeed.
	 */
	public String getJsonXml(ServicePath servicePath, String refId, int navigationPage, int navigationPageSize, MediaTypeEnum type) throws AuthenticationException {
		return jsonXmlObject.getJsonXml(servicePath, refId, navigationPage, navigationPageSize, type);
	}

	/**
	 * Request String response of a service path by refId with paging by school year in JSON or XML format.
	 * @param servicePath The requested service path.
	 * @param refId of xObject.
	 * @param navigationPage     Page to retrieve.
	 * @param navigationPageSize Number of resources to retrieve.
	 * @param schoolYear  The year of the requested data (i.e. 2018 for the 2017-2018 school year).
	 * @param type MediaType Enumerator for values MediaTypeEnum.JSON or MediaTypeEnum.XML.
	 * @return String value of requested service path.
	 * @see ServicePath
	 * @see MediaTypeEnum
	 * @throws AuthenticationException if login does not succeed.
	 */
	public String getJsonXml(ServicePath servicePath, String refId, int navigationPage, int navigationPageSize, int schoolYear, MediaTypeEnum type) throws AuthenticationException {
		return jsonXmlObject.getJsonXml(servicePath, refId, navigationPage, navigationPageSize, schoolYear, type);
	}

	/**
	 * Request String response of a service path by BEDS code or Local Id in JSON or XML format.
	 * @param servicePath The requested service path.
	 * @param idType Header value can be set to beds or local.
	 * @param id     BEDS or Local Id.
	 * @param type MediaType Enumerator for values MediaTypeEnum.JSON or MediaTypeEnum.XML.
	 * @return String value of requested service path.
	 * @see ServicePath
	 * @see MediaTypeEnum
	 * @throws AuthenticationException if login does not succeed.
	 */
	public String getJsonXml(ServicePath servicePath, String idType, String id, MediaTypeEnum type) throws AuthenticationException {
		return jsonXmlObject.getJsonXml(servicePath, idType, id, type);
	}

	/**
	 * Request String response of a service path by BEDS code or Local Id by school year in JSON or XML format.
	 * @param servicePath The requested service path.
	 * @param idType Header value can be set to beds or local.
	 * @param id     BEDS or Local Id.
	 * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
	 * @param type MediaType Enumerator for values MediaTypeEnum.JSON or MediaTypeEnum.XML.
	 * @return String value of requested service path.
	 * @see ServicePath
	 * @see MediaTypeEnum
	 * @throws AuthenticationException if login does not succeed.
	 */
	public String getJsonXml(ServicePath servicePath, String idType, String id, int schoolYear, MediaTypeEnum type) throws AuthenticationException {
		return jsonXmlObject.getJsonXml(servicePath, idType, id, schoolYear, type);
	}

	/**
	 * Request value changes from a given point on a service path in JSON or XML format.
	 * This will only work for ServicePath.GETXLEAS, ServicePath.GETXSCHOOLS, ServicePath.GETXCALENDARS, ServicePath.GETXCOURSES,
	 * ServicePath.GETXROSTERS, ServicePath.GETXSTAFFS, ServicePath.GETXSTUDENTS, ServicePath.GETXCONTACTS.
	 * @param servicePath The requested service path.
	 * @param opaqueMarker Uses an ISO8601 timestamp that indicates a point since the last changes have been requested.
	 * @param type MediaType Enumerator for values MediaTypeEnum.JSON or MediaTypeEnum.XML.
	 * @return String value of requested service path.
	 * @see ServicePath
	 * @see MediaTypeEnum
	 * @throws AuthenticationException if login does not succeed.
	 */
	public String getJsonXml(ServicePath servicePath, Date opaqueMarker, MediaTypeEnum type) throws AuthenticationException {
		return jsonXmlObject.getJsonXml(servicePath, opaqueMarker, type);
	}

	/**
	 * Request value changes from a given point on a service path with paging in JSON or XML format.
	 * This will only work for ServicePath.GETXLEAS, ServicePath.GETXSCHOOLS, ServicePath.GETXCALENDARS, ServicePath.GETXCOURSES,
	 * ServicePath.GETXROSTERS, ServicePath.GETXSTAFFS, ServicePath.GETXSTUDENTS, ServicePath.GETXCONTACTS.
	 * @param servicePath The requested service path.
	 * @param navigationPage     Page to retrieve.
	 * @param navigationPageSize Number of resources to retrieve.
	 * @param opaqueMarker Uses an ISO8601 timestamp that indicates a point since the last changes have been requested.
	 * @param type MediaType Enumerator for values MediaTypeEnum.JSON or MediaTypeEnum.XML.
	 * @return String value of requested service path.
	 * @see ServicePath
	 * @see MediaTypeEnum
	 * @throws AuthenticationException if login does not succeed.
	 */
	public String getJsonXml(ServicePath servicePath, int navigationPage, int navigationPageSize, Date opaqueMarker, MediaTypeEnum type) throws AuthenticationException {
		return jsonXmlObject.getJsonXml(servicePath, navigationPage, navigationPageSize, opaqueMarker, type);
	}

	/**
	 * Request String response of a service path for AUPP in JSON or XML format.
	 * @param servicePath The requested service path.
	 * @param refId of xObject.
	 * @param auppEnum AUPP Enumerator for values AUPPEnum.CREATE, AUPPEnum.DELETE, AUPPEnum.GET.
	 * @param type MediaType Enumerator for values MediaTypeEnum.JSON or MediaTypeEnum.XML.
	 * @return String value of requested service path.
	 * @see ServicePath
	 * @see AUPPEnum
	 * @see MediaTypeEnum
	 * @throws AuthenticationException if login does not succeed.
	 */
	public String getJsonXml(ServicePath servicePath, String refId, AUPPEnum auppEnum, MediaTypeEnum type) throws AuthenticationException {
		return jsonXmlObject.getJsonXml(servicePath, refId, auppEnum, type);
	}

	/**
	 * Request String response of a service path for AUPP with paging in JSON or XML format.
	 * @param servicePath The requested service path.
	 * @param refId of xObject.
	 * @param navigationPage     Page to retrieve.
	 * @param navigationPageSize Number of resources to retrieve.
	 * @param auppEnum AUPP Enumerator for values AUPPEnum.CREATE, AUPPEnum.DELETE, AUPPEnum.GET.
	 * @param type MediaType Enumerator for values MediaTypeEnum.JSON or MediaTypeEnum.XML.
	 * @return String value of requested service path.
	 * @see ServicePath
	 * @see AUPPEnum
	 * @see MediaTypeEnum
	 * @throws AuthenticationException if login does not succeed.
	 */
	public String getJsonXml(ServicePath servicePath, String refId, int navigationPage, int navigationPageSize, AUPPEnum auppEnum, MediaTypeEnum type) throws AuthenticationException {
		return jsonXmlObject.getJsonXml(servicePath, refId, navigationPage, navigationPageSize, auppEnum, type);
	}
}
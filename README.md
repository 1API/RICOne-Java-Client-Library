
Copyright © 2014-2018 New York State Education Department. All rights reserved.

# RICOne API Java Client Library
The RICOne Java Client Library was developed using Java JDK 7, Spring’s RestTemplate
(http://projects.spring.io/spring-framework/), and FasterXML Jackson (http://wiki.fasterxml.com/JacksonHome).

### Features
* Makes calls to the RICOne API using the xPress model in Java projects
* User can login to the authentication server using credentials to retrieve provider information
* Uses POJO object responses

#### Basic Use
```java
Authenticator auth = Authenticator.getInstance();
auth.authenticate(authUrl, clientId, clientSecret);

for(Endpoint e : auth.GetEndpoints())
{
	XPress xPress = new XPress(e.getHref());
}
```

### Project Contents
* RicOneApi - Client Library
* RicOneApiTests - RestResponse Console Outputs
* RicOneApiTestsPaging - RestResponse Console Outputs with paging
* SampleConsole - Simple console app showing use

### Getting Started
1. View the library <a href="http://www.ricone.org/vendors/ric-one-api/java-client-developers-guide/" target="_blank">documentation</a>
2. Download the Project
3. Get your OAuth server credentials
4. Open SampleConsole
5. Add the auth url and credentials to clientId and clientSecret
```java
final static String authUrl = "AUTH URL"
final static String clientId = "YOUR USERNAME";
final static String clientSecret = "YOUR PASSWORD";
```
## Change Log
### v1.7.1
* Added support to return responses as JSON or XML strings.
    ```java
        getJsonXml(ServicePath servicePath, MediaTypeEnum type)
    	getJsonXml(ServicePath servicePath, int schoolYear, MediaTypeEnum type)
    	getJsonXml(ServicePath servicePath, int navigationPage, int navigationPageSize, MediaTypeEnum type)
    	getJsonXml(ServicePath servicePath, int navigationPage, int navigationPageSize, int schoolYear, MediaTypeEnum type)
    	getJsonXml(ServicePath servicePath, String refId, MediaTypeEnum type)
    	getJsonXml(ServicePath servicePath, String refId, int schoolYear, MediaTypeEnum type)
    	getJsonXml(ServicePath servicePath, String refId, int navigationPage, int navigationPageSize, MediaTypeEnum type)
    	getJsonXml(ServicePath servicePath, String refId, int navigationPage, int navigationPageSize, int schoolYear, MediaTypeEnum type)
    	getJsonXml(ServicePath servicePath, String idType, String id, MediaTypeEnum type)
    	getJsonXml(ServicePath servicePath, String idType, String id, int schoolYear, MediaTypeEnum type)
    	getJsonXml(ServicePath servicePath, Date opaqueMarker, MediaTypeEnum type)
    	getJsonXml(ServicePath servicePath, int navigationPage, int navigationPageSize, Date opaqueMarker, MediaTypeEnum type)
    	getJsonXml(ServicePath servicePath, String refId, AUPPEnum auppEnum, MediaTypeEnum type)
    	getJsonXml(ServicePath servicePath, String refId, int navigationPage, int navigationPageSize, AUPPEnum auppEnum, MediaTypeEnum type)
    ```

### v1.7
* Support for multiple school years
    * Integer value, i.e. 2018 for the 2017-2018 school year
    * Available on all methods except except ones that accept the opaqueMarker for changes since
    ```java
    int schoolYear = 2018;
    xPress.getXLeas(schoolYear).getData();
    ```
* Added paging requests for changes since
    ```java
    getXRosters(int navigationPage, int navigationPageSize, String opaqueMarker);
    ```
* Changed order of getLastPage method
    ```java
    //NEW
    getLastPage(ServicePath servicePath, int navigationPageSize)
    getLastPage(ServicePath servicePath, String refId, int navigationPageSize);

    //OLD
    getLastPage(int navigationPageSize, ServicePath servicePath)
    getLastPage(int navigationPageSize, ServicePath servicePath, String refId);
    ```

* Removed the single object REST calls with paging
    ```java
    getXLea(String refId, int navigationPage, int navigationPageSize);
    getXSchool(String refId, int navigationPage, int navigationPageSize);
    getXCalendar(String refId, int navigationPage, int navigationPageSize);
    getXCourse(String refId, int navigationPage, int navigationPageSize);
    getXRoster(String refId, int navigationPage, int navigationPageSize);
    getXStaff(String refId, int navigationPage, int navigationPageSize);
    getXStudent(String refId, int navigationPage, int navigationPageSize);
    getXContact(String refId, int navigationPage, int navigationPageSize);
   ```
* Removed the following REST calls by beds or local id, as they are not supported in the API
    ```java
    getXLeasByXSchool(String idType, String id);
    getXSchoolsByXLea(String idType, String id);
    getXCalendarsByXLea(String idType, String id);
    getXCalendarsByXSchool(String idType, String id);
    getXCoursesByXLea(String idType, String id);
    getXCoursesByXSchool(String idType, String id);
    getXRostersByXLea(String idType, String id);
    getXRostersByXSchool(String idType, String id);
    getXStaffsByXLea(String idType, String id);
    getXStaffsByXSchool(String idType, String id);
    getXStudentsByXLea(String idType, String id);
    getXStudentsByXSchool(String idType, String id);
    getXContactsByXLea(String idType, String id);
    getXContactsByXSchool(String idType, String id);
    ```
* Internal code cleanup

### v1.6
* Added the RIC One API-AuthenticationClientLibrary-Java jar into the project
    * Authentication classes now moved into seperate repository: <a href="https://github.com/RIConeorg/API-AuthenticationClientLibrary-Java" target="blank">API-AuthenticationClientLibrary-Java</a>
    * import statement change, example below

        Old:
        ```java
        import riconeapi.common.Authenticator;
        ```
        New:
        ```java
        import riconeapi.authentication.Authenticator;
        ```

### v1.5.2
* Entry/Exit Codes now available
    * Added XOtherCodeListType & XOtherCodeType POJOs
    * Added entryType & exitType to XEnrollmentType
* Added paging methods when retrieving staff and student accounts via AUPPObject
    * getXStaffUsers(String refId, int navigationPage, int navigationPageSize)
    * getXStudentUsers(String refId, int navigationPage, int navigationPageSize)

### v1.5.1
* Added ability to request xLea or xSchool objects by BEDS or Local Id code.
	* xLeas/{id}
	* xSchools/{id}
	* xLeas/{id}/xObject
	* xSchools/{id}/xObject

### v1.5
* Added Changes Since support to XPress.java
	* Supported calls include: getXLeas(String), getXSchools(String), getXCalendars(String), getXCoursess(String), getXRosters(String), getXStaffs(String), getXStudents(String), getXContactss(String)
	* More info on Changes Since can be found in the API Developer's Guide <a href="http://www.ricone.org/vendors/ric-one-api/api-developers-guide/" target="_blank">here</a>
* Added TimestampToISO8601(Date) to Util.java
* Added custom exception class for failed authentication - AuthenticationException.java 
* Modified Athenticator.java 
	* Throws AuthenticationException and will return 401 UNAUTHORIZED message on a failed login attempt
* Modified XPress.java
	* Throws AuthenticationException and will return 401 UNAUTHORIZED message on a failed login attempt
	 
### v1.4.1
* Modifications to the xPress data model
	* Deprecated schoolCalendarRefId and sessionCode in XRosterType
	* Added schoolCalendarRefId and sessionCode to XMeetingTimeType

### v1.4
* Updated Authenticator class to include authenticate() where the auth server url and credentials are passed
* Removed getDecodedToken from Authenticator class and moved it to the DecodedToken class

### v1.3.1
* Modified Authenticator.java
* Modified XPress.java
	* Check token expiration and refresh if expired

### v1.3
* Code cleanup
	* Removed RicOneApiClient.java
	* Reworked Authenticator.java
* Included example loading authentication properties from properties file

### v1.2.2
* Added xStaff and xStudent account provisioning methods

### v1.2.1
* Added getToken() method to Authenticator
* Added getDecodedToken() method to Authenticator
	* Returns JWT token payload values: application_id, iss, iat, exp

### v1.2
* Token now passed via header
* Paging passed via header
* Refactored method names
	* i.e. GetXStudents() now getXStudents()
* Dropped SIF prefix from SIFXPress class, now XPress
* Ability to access response status code, status message, and headers
* Removed LoginId from XContactType, XStaffType, and XStudentType
* Added XAppProvisioningInfoType
	* Added to XContactType, XStaffType, and XStudentType
* Changed XYearGroupListType to XGradeLevelListType
	* Changed in XSchoolType

### v1.1.3.1
* Auth url now configurable
* Changed accessToken to access_token to reflect RFC 6750 specification

### v1.1.3
* Updated auth url

### v1.1.2
* Additional Service Paths
     * xLeas/{id}/xCalendars
     * xSchools/{id}/xCourses
     * xSaffs/{id}/xLeas
     * xRosters/{id}/xLeas
     * xRosters/{id}/xCourses
     * xStudents/{id}/xStaffs 

### v1.1.1
* Modified Endpoint.java model file to include provider id
* In Authenticator.java, switched GetEndPoints() to match on provider id versus provider name

### v1.1
* Added max page size


Copyright © 2014-2016 New York State Education Department. All rights reserved.

# RICOne API Java Client Library
The RICOne Java Client Library was developed using Java JDK 7, Spring’s RestTemplate
(http://projects.spring.io/spring-framework/), and FasterXML Jackson (http://wiki.fasterxml.com/JacksonHome).

### Features
* Makes calls to the RICOne API using the xPress model in Java projects
* User can login to the authentication server using credentials to retrieve provider information
* Uses POJO object responses

#### Basic Use
```java
Authenticator auth = auth.getInstance(); 
auth.authenticate(authUrl, clientId, clientSecret);

for(Endpoint e : auth.GetEndpoints())
{
	XPress xPress = new XPress(e.getHref());
}
```

### Project Contents
* RicOneApi - Client Library
* RicOneApiTests - Test Console Outputs
* RicOneApiTestsPaging - Test Console Outputs with paging
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

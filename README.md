
Copyright © 2014-2015 New York State Education Department. All rights reserved.

# RICOne API Java Client Library
The RICOne Java Client Library was developed using Java JDK 7, Spring’s RestTemplate
(http://projects.spring.io/spring-framework/), and FasterXML Jackson (http://wiki.fasterxml.com/JacksonHome).

### Features
* Makes calls to the RICOne API using the SIFxPress model in Java projects
* User can login to auth server using credentials to retrieve provider information
* Uses POJO object responses

#### Basic Use
```java
Authenticator auth = new Authenticator(authUrl, username, password);

for(Endpoint e : auth.GetEndpoints())
{
	RicOneApiClient ricOne = new RicOneApiClient(e);
}
```

### Project Contents
* RicOneApi - Client Library
* RicOneApiTests - Test Console Outputs
* SampleConsole - Simple console app showing use

### Getting Started
1. View the library <a href="https://docs.google.com/document/d/1flatjQRT9epMQBWlDwgpCjKlsFEOsuonTlseafzgYDo/pub" target="_blank">documentation</a>
2. Download the Project
3. Get your OAuth server credentials
4. Open SampleConsole
5. Add the auth url and credentials to username and password
```java
final static String authUrl = "AUTH URL"
final static String username = "YOUR USERNAME";
final static String password = "YOUR PASSWORD";
```
## Change Log
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

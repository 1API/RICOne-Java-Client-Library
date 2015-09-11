
Copyright © 2014-2015 New York State Education Department. All rights reserved.

# RICOne API Java Client Library
The RICOne Java Client Library was developed using Java JDK 7, Spring’s RestTemplate
(http://projects.spring.io/spring-framework/), and FasterXML Jackson (http://wiki.fasterxml.com/JacksonHome).

### Features
* Makes calls to the RICOne API using the SIFxPress model in Java projects
* User can login to OAuth server using credentials to retrieve provider information
* Uses POJO object responses

#### Basic Use
```java
Authenticator auth = new Authenticator(username, password);

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
1. Download the Project
2. Get your OAuth server credentials
3. Open SampleConsole
4. Add credentials to username and password
```java
static final String username = "YOUR USERNAME";
static final String password = "YOUR PASSWORD";
```
## Change Log
### v1.1.1
* Modified Endpoint.java model file to include provider id
* In Authenticator.java, switched GetEndPoints() to match on provider id versus provider name

### v1.1
* Added max page size

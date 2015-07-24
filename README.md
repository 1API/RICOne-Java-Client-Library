
Copyright © NERIC 2015

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software distributed under the License
is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
or implied.
See the License for the specific language governing permissions and limitations under the License.


The RICOne Java Client Library was developed using Java JDK 7, Spring’s RestTemplate
(http://projects.spring.io/spring-framework/), and FasterXML Jackson (http://wiki.fasterxml.com/JacksonHome). 
The client library supports OAuth2 authentication.


## v1.1
* Added max page size

## v1.0

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

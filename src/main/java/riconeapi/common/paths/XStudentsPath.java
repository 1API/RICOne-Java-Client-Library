package riconeapi.common.paths;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import riconeapi.authentication.Authenticator;
import riconeapi.common.ResponseMulti;
import riconeapi.common.ResponseSingle;
import riconeapi.exceptions.AuthenticationException;
import riconeapi.models.xpress.XStudentCollectionType;
import riconeapi.models.xpress.XStudentType;

public class XStudentsPath {
    private RestTemplate rt;
    private String baseApiUrl;

    public XStudentsPath(RestTemplate rt, String baseApiUrl) {
        this.rt = rt;
        this.baseApiUrl = baseApiUrl;
    }

    /**
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @return All Students with paging.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XStudentType> getXStudents(int navigationPage, int navigationPageSize) throws AuthenticationException {
        ResponseEntity<XStudentCollectionType> response;
        ResponseMulti<XStudentType> output = new ResponseMulti<>();

        Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

        try {
            HttpHeaders headers = new HttpHeaders();
            headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
            headers.set("navigationPage", Integer.toString(navigationPage));
            headers.set("navigationPageSize", Integer.toString(navigationPageSize));
            //headers.set("Content-Type", "application/json");
            HttpEntity<?> entity = new HttpEntity<Object>(headers);
            response = rt.exchange(baseApiUrl + "xStudents", HttpMethod.GET, entity, XStudentCollectionType.class);

            if (response.getBody() != null) {
                output.setData(response.getBody().getXStudent());
            }
            output.setMessage(response.getStatusCode().getReasonPhrase());
            output.setStatusCode(response.getStatusCode().value());
            output.setHeader(response.getHeaders().toString());
        } catch (HttpClientErrorException e) {
            output.setMessage(e.getStatusText());
            output.setStatusCode(e.getStatusCode().value());
            output.setHeader(e.getResponseHeaders().toString());
        }
        return output;
    }

    /**
     * @param opaqueMarker Uses an ISO8601 timestamp that indicates a point since the last changes have been requested.
     * @return All Student value changes from a given point.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XStudentType> getXStudents(String opaqueMarker) throws AuthenticationException {
        ResponseEntity<XStudentCollectionType> response;
        ResponseMulti<XStudentType> output = new ResponseMulti<>();

        Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

        try {
            HttpHeaders headers = new HttpHeaders();
            headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
            //headers.set("Content-Type", "application/json");
            UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(baseApiUrl)
                    .path("xStudents")
                    .queryParam("changesSinceMarker", opaqueMarker);
            HttpEntity<?> entity = new HttpEntity<Object>(headers);
            response = rt.exchange(builder.build().encode().toUriString(), HttpMethod.GET, entity, XStudentCollectionType.class);

            if (response.getBody() != null) {
                output.setData(response.getBody().getXStudent());
            }
            output.setMessage(response.getStatusCode().getReasonPhrase());
            output.setStatusCode(response.getStatusCode().value());
            output.setHeader(response.getHeaders().toString());
        } catch (HttpClientErrorException e) {
            output.setMessage(e.getStatusText());
            output.setStatusCode(e.getStatusCode().value());
            output.setHeader(e.getResponseHeaders().toString());
        }
        return output;
    }

    /**
     * @return All Students.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XStudentType> getXStudents() throws AuthenticationException {
        ResponseEntity<XStudentCollectionType> response;
        ResponseMulti<XStudentType> output = new ResponseMulti<>();

        Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

        try {
            HttpHeaders headers = new HttpHeaders();
            headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
            //headers.set("Content-Type", "application/json");
            HttpEntity<?> entity = new HttpEntity<Object>(headers);
            response = rt.exchange(baseApiUrl + "xStudents", HttpMethod.GET, entity, XStudentCollectionType.class);

            if (response.getBody() != null) {
                output.setData(response.getBody().getXStudent());
            }
            output.setMessage(response.getStatusCode().getReasonPhrase());
            output.setStatusCode(response.getStatusCode().value());
            output.setHeader(response.getHeaders().toString());
        } catch (HttpClientErrorException e) {
            output.setMessage(e.getStatusText());
            output.setStatusCode(e.getStatusCode().value());
            output.setHeader(e.getResponseHeaders().toString());
        }
        return output;
    }

    /**
     * @param refId              of xStudent.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @return Single Student by refId with paging.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseSingle<XStudentType> getXStudent(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        ResponseEntity<XStudentType> response;
        ResponseSingle<XStudentType> output = new ResponseSingle<>();

        Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

        try {
            HttpHeaders headers = new HttpHeaders();
            headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
            headers.set("navigationPage", Integer.toString(navigationPage));
            headers.set("navigationPageSize", Integer.toString(navigationPageSize));
            //headers.set("Content-Type", "application/json");
            HttpEntity<?> entity = new HttpEntity<Object>(headers);
            response = rt.exchange(baseApiUrl + "xStudents/{refId}", HttpMethod.GET, entity, XStudentType.class, refId);

            if (response.getBody() != null) {
                output.setData(response.getBody());
            }
            output.setMessage(response.getStatusCode().getReasonPhrase());
            output.setStatusCode(response.getStatusCode().value());
            output.setHeader(response.getHeaders().toString());
        } catch (HttpClientErrorException e) {
            output.setMessage(e.getStatusText());
            output.setStatusCode(e.getStatusCode().value());
            output.setHeader(e.getResponseHeaders().toString());
        }
        return output;
    }

    /**
     * @param refId of xStudent.
     * @return Single Student by refId.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseSingle<XStudentType> getXStudent(String refId) throws AuthenticationException {
        ResponseEntity<XStudentType> response;
        ResponseSingle<XStudentType> output = new ResponseSingle<>();

        Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

        try {
            HttpHeaders headers = new HttpHeaders();
            headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
            //headers.set("Content-Type", "application/json");
            HttpEntity<?> entity = new HttpEntity<Object>(headers);
            response = rt.exchange(baseApiUrl + "xStudents/{refId}", HttpMethod.GET, entity, XStudentType.class, refId);

            if (response.getBody() != null) {
                output.setData(response.getBody());
            }
            output.setMessage(response.getStatusCode().getReasonPhrase());
            output.setStatusCode(response.getStatusCode().value());
            output.setHeader(response.getHeaders().toString());
        } catch (HttpClientErrorException e) {
            output.setMessage(e.getStatusText());
            output.setStatusCode(e.getStatusCode().value());
            output.setHeader(e.getResponseHeaders().toString());
        }
        return output;
    }

    /**
     * @param refId              of xLea.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @return Students associated to a specific Lea by refId with paging.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XStudentType> getXStudentsByXLea(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        ResponseEntity<XStudentCollectionType> response;
        ResponseMulti<XStudentType> output = new ResponseMulti<>();

        Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

        try {
            HttpHeaders headers = new HttpHeaders();
            headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
            headers.set("navigationPage", Integer.toString(navigationPage));
            headers.set("navigationPageSize", Integer.toString(navigationPageSize));
            //headers.set("Content-Type", "application/json");
            HttpEntity<?> entity = new HttpEntity<Object>(headers);
            response = rt.exchange(baseApiUrl + "xLeas/{refId}/xStudents", HttpMethod.GET, entity, XStudentCollectionType.class, refId);

            if (response.getBody() != null) {
                output.setData(response.getBody().getXStudent());
            }
            output.setMessage(response.getStatusCode().getReasonPhrase());
            output.setStatusCode(response.getStatusCode().value());
            output.setHeader(response.getHeaders().toString());
        } catch (HttpClientErrorException e) {
            output.setMessage(e.getStatusText());
            output.setStatusCode(e.getStatusCode().value());
            output.setHeader(e.getResponseHeaders().toString());
        }
        return output;
    }

    /**
     * @param refId of xLea.
     * @return Students associated to a specific Lea by refId.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XStudentType> getXStudentsByXLea(String refId) throws AuthenticationException {
        ResponseEntity<XStudentCollectionType> response;
        ResponseMulti<XStudentType> output = new ResponseMulti<>();

        Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

        try {
            HttpHeaders headers = new HttpHeaders();
            headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
            //headers.set("Content-Type", "application/json");
            HttpEntity<?> entity = new HttpEntity<Object>(headers);
            response = rt.exchange(baseApiUrl + "xLeas/{refId}/xStudents", HttpMethod.GET, entity, XStudentCollectionType.class, refId);

            if (response.getBody() != null) {
                output.setData(response.getBody().getXStudent());
            }
            output.setMessage(response.getStatusCode().getReasonPhrase());
            output.setStatusCode(response.getStatusCode().value());
            output.setHeader(response.getHeaders().toString());
        } catch (HttpClientErrorException e) {
            output.setMessage(e.getStatusText());
            output.setStatusCode(e.getStatusCode().value());
            output.setHeader(e.getResponseHeaders().toString());
        }
        return output;
    }

    /**
     * @param idType Header value can be set to beds or local.
     * @param id     BEDS or Local Id.
     * @return Students associated to a specific Lea by BEDS code or Local Id.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XStudentType> getXStudentsByXLea(String idType, String id) throws AuthenticationException {
        ResponseEntity<XStudentCollectionType> response;
        ResponseMulti<XStudentType> output = new ResponseMulti<>();

        Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

        try {
            HttpHeaders headers = new HttpHeaders();
            headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
            headers.set("IdType", idType);
            //headers.set("Content-Type", "application/json");
            HttpEntity<?> entity = new HttpEntity<Object>(headers);
            response = rt.exchange(baseApiUrl + "xLeas/{id}/xStudents", HttpMethod.GET, entity, XStudentCollectionType.class, id);

            if (response.getBody() != null) {
                output.setData(response.getBody().getXStudent());
            }
            output.setMessage(response.getStatusCode().getReasonPhrase());
            output.setStatusCode(response.getStatusCode().value());
            output.setHeader(response.getHeaders().toString());
        } catch (HttpClientErrorException e) {
            output.setMessage(e.getStatusText());
            output.setStatusCode(e.getStatusCode().value());
            output.setHeader(e.getResponseHeaders().toString());
        }
        return output;
    }

    /**
     * @param refId              of xSchool.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @return Students associated to a specific School by refId with paging.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XStudentType> getXStudentsByXSchool(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        ResponseEntity<XStudentCollectionType> response;
        ResponseMulti<XStudentType> output = new ResponseMulti<>();

        Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

        try {
            HttpHeaders headers = new HttpHeaders();
            headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
            headers.set("navigationPage", Integer.toString(navigationPage));
            headers.set("navigationPageSize", Integer.toString(navigationPageSize));
            //headers.set("Content-Type", "application/json");
            HttpEntity<?> entity = new HttpEntity<Object>(headers);
            response = rt.exchange(baseApiUrl + "xSchools/{refId}/xStudents", HttpMethod.GET, entity, XStudentCollectionType.class, refId);

            if (response.getBody() != null) {
                output.setData(response.getBody().getXStudent());
            }
            output.setMessage(response.getStatusCode().getReasonPhrase());
            output.setStatusCode(response.getStatusCode().value());
            output.setHeader(response.getHeaders().toString());
        } catch (HttpClientErrorException e) {
            output.setMessage(e.getStatusText());
            output.setStatusCode(e.getStatusCode().value());
            output.setHeader(e.getResponseHeaders().toString());
        }
        return output;
    }

    /**
     * @param refId of xSchool.
     * @return Students associated to a specific School by refId.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XStudentType> getXStudentsByXSchool(String refId) throws AuthenticationException {
        ResponseEntity<XStudentCollectionType> response;
        ResponseMulti<XStudentType> output = new ResponseMulti<>();

        Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

        try {
            HttpHeaders headers = new HttpHeaders();
            headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
            //headers.set("Content-Type", "application/json");
            HttpEntity<?> entity = new HttpEntity<Object>(headers);
            response = rt.exchange(baseApiUrl + "xSchools/{refId}/xStudents", HttpMethod.GET, entity, XStudentCollectionType.class, refId);

            if (response.getBody() != null) {
                output.setData(response.getBody().getXStudent());
            }
            output.setMessage(response.getStatusCode().getReasonPhrase());
            output.setStatusCode(response.getStatusCode().value());
            output.setHeader(response.getHeaders().toString());
        } catch (HttpClientErrorException e) {
            output.setMessage(e.getStatusText());
            output.setStatusCode(e.getStatusCode().value());
            output.setHeader(e.getResponseHeaders().toString());
        }
        return output;
    }

    /**
     * @param idType Header value can be set to beds or local.
     * @param id     BEDS or Local Id.
     * @return Students associated to a specific School by BEDS code or Local Id.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XStudentType> getXStudentsByXSchool(String idType, String id) throws AuthenticationException {
        ResponseEntity<XStudentCollectionType> response;
        ResponseMulti<XStudentType> output = new ResponseMulti<>();

        Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

        try {
            HttpHeaders headers = new HttpHeaders();
            headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
            headers.set("IdType", idType);
            //headers.set("Content-Type", "application/json");
            HttpEntity<?> entity = new HttpEntity<Object>(headers);
            response = rt.exchange(baseApiUrl + "xSchools/{id}/xStudents", HttpMethod.GET, entity, XStudentCollectionType.class, id);

            if (response.getBody() != null) {
                output.setData(response.getBody().getXStudent());
            }
            output.setMessage(response.getStatusCode().getReasonPhrase());
            output.setStatusCode(response.getStatusCode().value());
            output.setHeader(response.getHeaders().toString());
        } catch (HttpClientErrorException e) {
            output.setMessage(e.getStatusText());
            output.setStatusCode(e.getStatusCode().value());
            output.setHeader(e.getResponseHeaders().toString());
        }
        return output;
    }

    /**
     * @param refId              of xRoster.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @return Students associated to a specific Roster by refId with paging.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XStudentType> getXStudentsByXRoster(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        ResponseEntity<XStudentCollectionType> response;
        ResponseMulti<XStudentType> output = new ResponseMulti<>();

        Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

        try {
            HttpHeaders headers = new HttpHeaders();
            headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
            headers.set("navigationPage", Integer.toString(navigationPage));
            headers.set("navigationPageSize", Integer.toString(navigationPageSize));
            //headers.set("Content-Type", "application/json");
            HttpEntity<?> entity = new HttpEntity<Object>(headers);
            response = rt.exchange(baseApiUrl + "xRosters/{refId}/xStudents", HttpMethod.GET, entity, XStudentCollectionType.class, refId);

            if (response.getBody() != null) {
                output.setData(response.getBody().getXStudent());
            }
            output.setMessage(response.getStatusCode().getReasonPhrase());
            output.setStatusCode(response.getStatusCode().value());
            output.setHeader(response.getHeaders().toString());
        } catch (HttpClientErrorException e) {
            output.setMessage(e.getStatusText());
            output.setStatusCode(e.getStatusCode().value());
            output.setHeader(e.getResponseHeaders().toString());
        }
        return output;
    }

    /**
     * @param refId of xRoster.
     * @return Students associated to a specific Roster by refId.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XStudentType> getXStudentsByXRoster(String refId) throws AuthenticationException {
        ResponseEntity<XStudentCollectionType> response;
        ResponseMulti<XStudentType> output = new ResponseMulti<>();

        Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

        try {
            HttpHeaders headers = new HttpHeaders();
            headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
            //headers.set("Content-Type", "application/json");
            HttpEntity<?> entity = new HttpEntity<Object>(headers);
            response = rt.exchange(baseApiUrl + "xRosters/{refId}/xStudents", HttpMethod.GET, entity, XStudentCollectionType.class, refId);

            if (response.getBody() != null) {
                output.setData(response.getBody().getXStudent());
            }
            output.setMessage(response.getStatusCode().getReasonPhrase());
            output.setStatusCode(response.getStatusCode().value());
            output.setHeader(response.getHeaders().toString());
        } catch (HttpClientErrorException e) {
            output.setMessage(e.getStatusText());
            output.setStatusCode(e.getStatusCode().value());
            output.setHeader(e.getResponseHeaders().toString());
        }
        return output;
    }

    /**
     * @param refId              of xStaff.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @return Students associated to a specific Staff by refId with paging.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XStudentType> getXStudentsByXStaff(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        ResponseEntity<XStudentCollectionType> response;
        ResponseMulti<XStudentType> output = new ResponseMulti<>();

        Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

        try {
            HttpHeaders headers = new HttpHeaders();
            headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
            headers.set("navigationPage", Integer.toString(navigationPage));
            headers.set("navigationPageSize", Integer.toString(navigationPageSize));
            //headers.set("Content-Type", "application/json");
            HttpEntity<?> entity = new HttpEntity<Object>(headers);
            response = rt.exchange(baseApiUrl + "xStaffs/{refId}/xStudents", HttpMethod.GET, entity, XStudentCollectionType.class, refId);

            if (response.getBody() != null) {
                output.setData(response.getBody().getXStudent());
            }
            output.setMessage(response.getStatusCode().getReasonPhrase());
            output.setStatusCode(response.getStatusCode().value());
            output.setHeader(response.getHeaders().toString());
        } catch (HttpClientErrorException e) {
            output.setMessage(e.getStatusText());
            output.setStatusCode(e.getStatusCode().value());
            output.setHeader(e.getResponseHeaders().toString());
        }
        return output;
    }

    /**
     * @param refId of xStaff.
     * @return Students associated to a specific Staff by refId.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XStudentType> getXStudentsByXStaff(String refId) throws AuthenticationException {
        ResponseEntity<XStudentCollectionType> response;
        ResponseMulti<XStudentType> output = new ResponseMulti<>();

        Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

        try {
            HttpHeaders headers = new HttpHeaders();
            headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
            //headers.set("Content-Type", "application/json");
            HttpEntity<?> entity = new HttpEntity<Object>(headers);
            response = rt.exchange(baseApiUrl + "xStaffs/{refId}/xStudents", HttpMethod.GET, entity, XStudentCollectionType.class, refId);

            if (response.getBody() != null) {
                output.setData(response.getBody().getXStudent());
            }
            output.setMessage(response.getStatusCode().getReasonPhrase());
            output.setStatusCode(response.getStatusCode().value());
            output.setHeader(response.getHeaders().toString());
        } catch (HttpClientErrorException e) {
            output.setMessage(e.getStatusText());
            output.setStatusCode(e.getStatusCode().value());
            output.setHeader(e.getResponseHeaders().toString());
        }
        return output;
    }

    /**
     * @param refId              of xContact.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @return Students associated to a specific Contact by refId with paging.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XStudentType> getXStudentsByXContact(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        ResponseEntity<XStudentCollectionType> response;
        ResponseMulti<XStudentType> output = new ResponseMulti<>();

        Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

        try {
            HttpHeaders headers = new HttpHeaders();
            headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
            headers.set("navigationPage", Integer.toString(navigationPage));
            headers.set("navigationPageSize", Integer.toString(navigationPageSize));
            //headers.set("Content-Type", "application/json");
            HttpEntity<?> entity = new HttpEntity<Object>(headers);
            response = rt.exchange(baseApiUrl + "xContacts/{refId}/xStudents", HttpMethod.GET, entity, XStudentCollectionType.class, refId);

            if (response.getBody() != null) {
                output.setData(response.getBody().getXStudent());
            }
            output.setMessage(response.getStatusCode().getReasonPhrase());
            output.setStatusCode(response.getStatusCode().value());
            output.setHeader(response.getHeaders().toString());
        } catch (HttpClientErrorException e) {
            output.setMessage(e.getStatusText());
            output.setStatusCode(e.getStatusCode().value());
            output.setHeader(e.getResponseHeaders().toString());
        }
        return output;
    }

    /**
     * @param refId of xContact.
     * @return Students associated to a specific Contact by refId.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XStudentType> getXStudentsByXContact(String refId) throws AuthenticationException {
        ResponseEntity<XStudentCollectionType> response;
        ResponseMulti<XStudentType> output = new ResponseMulti<>();

        Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

        try {
            HttpHeaders headers = new HttpHeaders();
            headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
            //headers.set("Content-Type", "application/json");
            HttpEntity<?> entity = new HttpEntity<Object>(headers);
            response = rt.exchange(baseApiUrl + "xContacts/{refId}/xStudents", HttpMethod.GET, entity, XStudentCollectionType.class, refId);

            if (response.getBody() != null) {
                output.setData(response.getBody().getXStudent());
            }
            output.setMessage(response.getStatusCode().getReasonPhrase());
            output.setStatusCode(response.getStatusCode().value());
            output.setHeader(response.getHeaders().toString());
        } catch (HttpClientErrorException e) {
            output.setMessage(e.getStatusText());
            output.setStatusCode(e.getStatusCode().value());
            output.setHeader(e.getResponseHeaders().toString());
        }
        return output;
    }
}

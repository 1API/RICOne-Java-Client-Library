package riconeapi.library.client.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import riconeapi.library.client.response.model.XContacts;

/**
 * Extends the XResponse class for accessing response data.
 * <p>
 * This class returns data for multiple xContact records.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"xContacts"})
public class XContactsResponse extends XResponse<XContacts> {
    @JsonProperty("xContacts")
    private XContacts xContacts;

    /**
     * Empty constructor.
     */
    public XContactsResponse() {
    }

    /**
     * Creates an empty constructor with an xContacts object.
     * @param xContacts a list of xContact.
     */
    public XContactsResponse(XContacts xContacts) {
        super();
        this.xContacts = xContacts;
    }

    // TODO: 4/14/2021 remove?
//    @JsonProperty("xContacts")
//    public XContacts getXContacts() {
//        return xContacts;
//    }
//
//    @JsonProperty("xContacts")
//    public void setXContacts(XContacts xContacts) {
//        this.xContacts = xContacts;
//    }

    @Override
    public XContacts getData() {
        return xContacts;
    }

    @Override
    public void setData(XContacts data) {
        this.xContacts = data;
    }

    /**
     * Returns a string representation of the collection. The string representation consists of a list of the collection's
     * elements, enclosed in square brackets ("[]"). Adjacent elements are separated by the characters ", " (comma and space).
     * @return a string representation of the collection.
     */
    @Override
    public String toString() {
        return "XContactsResponse{" + "xContacts=" + xContacts + '}';
    }
}
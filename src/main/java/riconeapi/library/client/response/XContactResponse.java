package riconeapi.library.client.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import riconeapi.library.client.response.model.XContact;

/**
 * Extends the XResponse class for accessing response data.
 * <p>
 * This class returns data for a single xContact record.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"xContact"})
public class XContactResponse extends XResponse<XContact> {
    @JsonProperty("xContact")
    private XContact xContact;

    /**
     * Empty constructor.
     */
    public XContactResponse() {
    }

    /**
     * Creates an empty constructor with an xContact object.
     * @param xContact a single xContact.
     */
    public XContactResponse(XContact xContact) {
        super();
        this.xContact = xContact;
    }

    // TODO: 4/14/2021 remove?
//    @JsonProperty("xContact")
//    public XContact getXContact() {
//        return xContact;
//    }
//
//    @JsonProperty("xContact")
//    public void setXContact(XContact xContact) {
//        this.xContact = xContact;
//    }

    @Override
    public XContact getData() {
        return xContact;
    }

    @Override
    public void setData(XContact data) {
        this.xContact = data;
    }

    /**
     * Returns a string representation of the collection. The string representation consists of a list of the collection's
     * elements, enclosed in square brackets ("[]"). Adjacent elements are separated by the characters ", " (comma and space).
     * @return a string representation of the collection.
     */
    @Override
    public String toString() {
        return "XContactResponse{" + "xContact=" + xContact + '}';
    }
}
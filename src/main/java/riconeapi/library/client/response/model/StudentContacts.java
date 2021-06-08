package riconeapi.library.client.response.model;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>Java class for xStudentContactListType complex type.</p>
 * <p>This data element is meant to be used in one of two ways.  1) Populate the contactPersonRefId field so that the xContact details can be retrieved from an xContact service endpoint.  This allows you to access related xContact data only as needed.  If you use this option, leave the "xContact" element unpopulated. 2) Populate the "xContact."  Use this option if you don't offer an xContact resource endpoint or if one is not appropriate in your use case (e.g. Student Record Exchange).  If this option is used, leave contactPersonRefId unpopulated.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"contactPersonRefId"})
public class StudentContacts {
    @JsonProperty("contactPersonRefId")
    @JacksonXmlProperty(localName = "contactPersonRefId", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<String> contactPersonRefId;

    public StudentContacts() {
        contactPersonRefId = new ArrayList<>();
    }

    public StudentContacts(List<String> contactPersonRefId) {
        super();
        this.contactPersonRefId = contactPersonRefId;
    }

    /**
     * <p>Gets the value of the contactPersonRefId property.</p>
     * <p>The RefId of the contact object.</p>
     *
     * @return possible object is {@link String }
     */
    @JsonProperty("contactPersonRefId")
    @JacksonXmlElementWrapper(useWrapping = false)
    public List<String> getContactPersonRefId() {
        return contactPersonRefId;
    }

    /**
     * <p>Sets the value of the contactPersonRefId property.</p>
     * <p>The RefId of the contact object.</p>
     *
     * @param contactPersonRefId allowed object is {@link String }
     */
    @JsonProperty("contactPersonRefId")
    @JacksonXmlElementWrapper(useWrapping = false)
    public void setContactPersonRefId(List<String> contactPersonRefId) {
        this.contactPersonRefId = contactPersonRefId;
    }

    @JsonIgnore
    public boolean isEmptyObject() {
        return contactPersonRefId.isEmpty();
    }

    @Override
    public String toString() {
        return "StudentContacts{" + "contactPersonRefId=" + contactPersonRefId + '}';
    }
}
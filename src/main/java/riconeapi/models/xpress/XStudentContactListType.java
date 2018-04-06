
package riconeapi.models.xpress;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder({
        "contactPersonRefId",
        "xContact"
})
public class XStudentContactListType {

    @JsonProperty("contactPersonRefId")
    private List<String> contactPersonRefId = new ArrayList<>();
    @JsonProperty("xContact")
    private List<XContactType> xContact = new ArrayList<>();

    public XStudentContactListType() {
    }

    public XStudentContactListType(List<String> contactPersonRefId, List<XContactType> xContact) {
        super();
        this.contactPersonRefId = contactPersonRefId;
        this.xContact = xContact;
    }

    @JsonProperty("contactPersonRefId")
    public List<String> getContactPersonRefId() {
        return contactPersonRefId;
    }

    @JsonProperty("contactPersonRefId")
    public void setContactPersonRefId(List<String> contactPersonRefId) {
        this.contactPersonRefId = contactPersonRefId;
    }

    @JsonProperty("xContact")
    public List<XContactType> getXContact()
    {
        return xContact;
    }

    @JsonProperty("xContact")
    public void setXContact(List<XContactType> xContact)
    {
        this.xContact = xContact;
    }

    @Override public String toString()
    {
        return "XStudentContactListType{" + "contactPersonRefId=" + contactPersonRefId + ", xContact=" + xContact + '}';
    }
}

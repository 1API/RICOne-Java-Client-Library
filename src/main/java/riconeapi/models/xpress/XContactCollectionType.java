
package riconeapi.models.xpress;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder({
        "xContact"
})
@JsonRootName(value = "xContacts")
public class XContactCollectionType {

    @JsonProperty("xContact")
    private List<XContactType> xContact = new ArrayList<>();

    public XContactCollectionType() {
    }

    public XContactCollectionType(List<XContactType> xContact) {
        super();
        this.xContact = xContact;
    }

    @JsonProperty("xContact")
    public List<XContactType> getXContact() {
        return xContact;
    }

    @JsonProperty("xContact")
    public void setXContact(List<XContactType> xContact) {
        this.xContact = xContact;
    }

    @Override public String toString()
    {
        return "XContactCollectionType{" + "xContact=" + xContact + '}';
    }
}

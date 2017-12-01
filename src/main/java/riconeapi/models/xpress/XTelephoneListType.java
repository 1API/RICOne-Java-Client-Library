
package riconeapi.models.xpress;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "phoneNumber"
})
public class XTelephoneListType
{

    @JsonProperty("phoneNumber")
    private List<XTelephoneType> phoneNumber = new ArrayList<XTelephoneType>();

    public XTelephoneListType() {
    }

    public XTelephoneListType(List<XTelephoneType> phoneNumber) {
        super();
        this.phoneNumber = phoneNumber;
    }

    @JsonProperty("phoneNumber")
    public List<XTelephoneType> getPhoneNumber() {
        return phoneNumber;
    }

    @JsonProperty("phoneNumber")
    public void setPhoneNumber(List<XTelephoneType> phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override public String toString()
    {
        return "XTelephoneListType{" + "phoneNumber=" + phoneNumber + '}';
    }
}


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
        "email"
})
public class XEmailListType {

    @JsonProperty("email")
    private List<XEmailType> email = new ArrayList<>();

    /**
     * No args constructor for use in serialization
     *
     */
    public XEmailListType() {
    }

    /**
     *
     * @param email
     */
    public XEmailListType(List<XEmailType> email) {
        super();
        this.email = email;
    }

    @JsonProperty("email")
    public List<XEmailType> getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(List<XEmailType> email) {
        this.email = email;
    }

}

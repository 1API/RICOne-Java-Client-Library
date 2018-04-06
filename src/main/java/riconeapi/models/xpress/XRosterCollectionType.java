
package riconeapi.models.xpress;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder({
        "xRoster"
})
@JsonRootName(value = "xRosters")
public class XRosterCollectionType {

    @JsonProperty("xRoster")
    private List<XRosterType> xRoster = new ArrayList<>();

    public XRosterCollectionType() {
    }

    public XRosterCollectionType(List<XRosterType> xRoster) {
        super();
        this.xRoster = xRoster;
    }

    @JsonProperty("xRoster")
    public List<XRosterType> getXRoster() {
        return xRoster;
    }

    @JsonProperty("xRoster")
    public void setXRoster(List<XRosterType> xRoster) {
        this.xRoster = xRoster;
    }

    @Override public String toString()
    {
        return "XRosterCollectionType{" + "xRoster=" + xRoster + '}';
    }
}

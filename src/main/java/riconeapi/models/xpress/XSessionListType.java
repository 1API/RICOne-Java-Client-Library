
package riconeapi.models.xpress;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder({
        "sessionList"
})
public class XSessionListType {

    @JsonProperty("sessionList")
    private List<XSessionType> sessionList = new ArrayList<>();

    public XSessionListType() {
    }

    public XSessionListType(List<XSessionType> sessionList) {
        super();
        this.sessionList = sessionList;
    }

    @JsonProperty("sessionList")
    public List<XSessionType> getSessionList() {
        return sessionList;
    }

    @JsonProperty("sessionList")
    public void setSessionList(List<XSessionType> sessionList) {
        this.sessionList = sessionList;
    }

    @Override public String toString()
    {
        return "XSessionListType{" + "sessionList=" + sessionList + '}';
    }
}
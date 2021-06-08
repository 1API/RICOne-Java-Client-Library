package riconeapi.library.client.response.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>Java class for xSessionListType complex type.</p>
 * <p>A list of sessions.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"sessionList"})
public class Sessions {
    @JsonProperty("sessionList")
    @JacksonXmlProperty(localName = "sessionList", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<SessionList> sessionList;

    public Sessions() {
        sessionList = new ArrayList<>();
    }

    public Sessions(List<SessionList> sessionList) {
        super();
        this.sessionList = sessionList;
    }

    /**
     * <p>Gets the value of the sessionList property.</p>
     *
     * @return possible object is {@link SessionList }
     */
    @JsonProperty("sessionList")
    @JacksonXmlElementWrapper(useWrapping = false)
    public List<SessionList> getSessionList() {
        return sessionList;
    }

    /**
     * <p>Sets the value of the sessionList property.</p>
     *
     * @param sessionList allowed object is {@link SessionList }
     */
    @JsonProperty("sessionList")
    @JacksonXmlElementWrapper(useWrapping = false)
    public void setSessionList(List<SessionList> sessionList) {
        this.sessionList = sessionList;
    }

    @Override
    public String toString() {
        return "Sessions{" + "sessionList=" + sessionList + '}';
    }
}
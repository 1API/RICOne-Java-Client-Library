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
 * <p>Java class for xOtherPersonNameListType complex type.</p>
 * <p>A list of other Ids for the person.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"otherId"})
public class OtherIds {
    @JsonProperty("otherId")
    @JacksonXmlProperty(localName = "otherId", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<OtherId> otherId;

    public OtherIds() {
        otherId = new ArrayList<>();
    }

    public OtherIds(List<OtherId> otherId) {
        super();
        this.otherId = otherId;
    }

    /**
     * <p>Gets the value of the otherId property.</p>
     * <p>An other Id for the person.</p>
     *
     * @return possible object is {@link OtherId }
     */
    @JsonProperty("otherId")
    @JacksonXmlElementWrapper(useWrapping = false)
    public List<OtherId> getOtherId() {
        return otherId;
    }

    /**
     * <p>Sets the value of the otherId property.</p>
     * <p>An other Id for the person.</p>
     *
     * @param otherId allowed object is {@link OtherId }
     */
    @JsonProperty("otherId")
    @JacksonXmlElementWrapper(useWrapping = false)
    public void setOtherId(List<OtherId> otherId) {
        this.otherId = otherId;
    }

    @Override
    public String toString() {
        return "OtherIds{" + "otherId=" + otherId + '}';
    }
}
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
 * <p>Java class for xOtherPersonListType complex type.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"otherAddress"})
public class OtherAddresses {
    @JsonProperty("otherAddress")
    @JacksonXmlProperty(localName = "otherAddress", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<OtherAddress> otherAddress;

    public OtherAddresses() {
        otherAddress = new ArrayList<>();
    }

    public OtherAddresses(List<OtherAddress> otherAddress) {
        super();
        this.otherAddress = otherAddress;
    }

    /**
     * <p>Gets the value of the otherAddress property.</p>
     *
     * @return possible object is {@link OtherAddress }
     */
    @JsonProperty("otherAddress")
    @JacksonXmlElementWrapper(useWrapping = false)
    public List<OtherAddress> getOtherAddress() {
        return otherAddress;
    }

    /**
     * <p>Sets the value of the otherAddress property.</p>
     *
     * @param otherAddress allowed object is {@link OtherAddress }
     */
    @JsonProperty("otherAddress")
    @JacksonXmlElementWrapper(useWrapping = false)
    public void setOtherAddress(List<OtherAddress> otherAddress) {
        this.otherAddress = otherAddress;
    }

    @Override
    public String toString() {
        return "OtherAddress{" + "otherAddress=" + otherAddress + '}';
    }
}
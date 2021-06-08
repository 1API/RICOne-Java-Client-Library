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
 * <p>Java class for xTelephoneListType complex type.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({"phoneNumber"})
public class OtherPhoneNumbers {
    @JsonProperty("phoneNumber")
    @JacksonXmlProperty(localName = "phoneNumber", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<PhoneNumber> phoneNumber;

    public OtherPhoneNumbers() {
        phoneNumber = new ArrayList<>();
    }

    public OtherPhoneNumbers(List<PhoneNumber> phoneNumber) {
        super();
        this.phoneNumber = phoneNumber;
    }

    /**
     * <p>Gets the value of the phoneNumber property.</p>
     * <p>The telephone number including the area code, and extension, if applicable.</p>
     *
     * @return possible object is {@link PhoneNumber }
     */
    @JsonProperty("phoneNumber")
    @JacksonXmlProperty(localName = "phoneNumber", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @JacksonXmlElementWrapper(useWrapping = false)
    public List<PhoneNumber> getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * <p>Sets the value of the phoneNumber property.</p>
     * <p>The telephone number including the area code, and extension, if applicable.</p>
     *
     * @param phoneNumber allowed object is {@link PhoneNumber }
     */
    @JsonProperty("phoneNumber")
    @JacksonXmlProperty(localName = "phoneNumber", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @JacksonXmlElementWrapper(useWrapping = false)
    public void setPhoneNumber(List<PhoneNumber> phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "OtherPhoneNumbers{" + "phoneNumber=" + phoneNumber + '}';
    }
}
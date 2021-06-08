package riconeapi.library.client.response.model;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.stream.Stream;

/**
 * <p>Java class for xTelephoneType complex type.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({"phoneNumberType", "number", "primaryIndicator"})
public class PhoneNumber {
    @JsonProperty("phoneNumberType")
    @JacksonXmlProperty(localName = "phoneNumberType", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private String phoneNumberType;

    @JsonProperty("number")
    @JacksonXmlProperty(localName = "number", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private String number;

    @JsonProperty("primaryIndicator")
    @JacksonXmlProperty(localName = "primaryIndicator", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private String primaryIndicator;

    public PhoneNumber() {
    }

    public PhoneNumber(String phoneNumberType, String number, String primaryIndicator) {
        super();
        this.phoneNumberType = phoneNumberType;
        this.number = number;
        this.primaryIndicator = primaryIndicator;
    }

    /**
     * <p>Gets the value of the phoneNumberType property.</p>
     * <p>The type of communication number listed for a person.</p>
     *
     * @return possible object is {@link String }
     */
    @JsonProperty("phoneNumberType")
    public String getPhoneNumberType() {
        return phoneNumberType;
    }

    /**
     * <p>Sets the value of the phoneNumberType property.</p>
     * <p>The type of communication number listed for a person.</p>
     *
     * @param phoneNumberType allowed object is {@link String }
     */
    @JsonProperty("phoneNumberType")
    public void setPhoneNumberType(String phoneNumberType) {
        this.phoneNumberType = phoneNumberType;
    }

    /**
     * <p>Gets the value of the number property.</p>
     * <p>The telephone number including the area code, and extension, if applicable.</p>
     *
     * @return possible object is {@link String }
     */
    @JsonProperty("number")
    public String getNumber() {
        return number;
    }

    /**
     * <p>Sets the value of the number property.</p>
     * <p>The telephone number including the area code, and extension, if applicable.</p>
     *
     * @param number allowed object is {@link String }
     */
    @JsonProperty("number")
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * <p>Gets the value of the primaryIndicator property.</p>
     * <p>An indication that the telephone number should be used as the principal number for a person or organization.</p>
     *
     * @return possible object is {@link String }
     */
    @JsonProperty("primaryIndicator")
    public String getPrimaryIndicator() {
        return primaryIndicator;
    }

    /**
     * <p>Sets the value of the primaryIndicator property.</p>
     * <p>An indication that the telephone number should be used as the principal number for a person or organization.</p>
     *
     * @param primaryIndicator allowed object is {@link String }
     */
    @JsonProperty("primaryIndicator")
    public void setPrimaryIndicator(String primaryIndicator) {
        this.primaryIndicator = primaryIndicator;
    }

    @JsonIgnore
    public boolean isEmptyObject() {
        return Stream.of(phoneNumberType, number, primaryIndicator).allMatch(Objects::isNull);
    }

    @Override
    public String toString() {
        return "PhoneNumber{" + "phoneNumberType='" + phoneNumberType + '\'' + ", number='" + number + '\'' + ", primaryIndicator='" + primaryIndicator + '\'' + '}';
    }
}
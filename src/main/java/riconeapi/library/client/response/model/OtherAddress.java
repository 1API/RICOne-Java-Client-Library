package riconeapi.library.client.response.model;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.stream.Stream;

/**
 * <p>Java class for xPersonAddressType complex type.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"addressType", "line1", "line2", "city", "stateProvince", "countryCode", "postalCode"})
public class OtherAddress {
    @JsonProperty("addressType")
    @JacksonXmlProperty(localName = "addressType", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private String addressType;

    @JsonProperty("line1")
    @JacksonXmlProperty(localName = "line1", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private String line1;

    @JsonProperty("line2")
    @JacksonXmlProperty(localName = "line2", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private String line2;

    @JsonProperty("city")
    @JacksonXmlProperty(localName = "city", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private String city;

    @JsonProperty("stateProvince")
    @JacksonXmlProperty(localName = "stateProvince", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private String stateProvince;

    @JsonProperty("countryCode")
    @JacksonXmlProperty(localName = "countryCode", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private String countryCode;

    @JsonProperty("postalCode")
    @JacksonXmlProperty(localName = "postalCode", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private String postalCode;

    public OtherAddress() { }

    public OtherAddress(String addressType, String line1, String line2, String city, String stateProvince, String countryCode, String postalCode) {
        super();
        this.addressType = addressType;
        this.line1 = line1;
        this.line2 = line2;
        this.city = city;
        this.stateProvince = stateProvince;
        this.countryCode = countryCode;
        this.postalCode = postalCode;
    }

    /**
     * <p>Gets the value of the addressType property.</p>
     * <p>The type of address listed for an organization. Generally the mailing address.</p>
     *
     * @return possible object is {@link String }
     */
    @JsonProperty("addressType")
    public String getAddressType() {
        return addressType;
    }

    /**
     * <p>Sets the value of the addressType property.</p>
     * <p>The type of address listed for an organization, learner or a parent, guardian, family member or related person. Generally the mailing address.</p>
     *
     * @param addressType allowed object is {@link String }
     */
    @JsonProperty("addressType")
    public void setAddressType(String addressType) {
        this.addressType = addressType;
    }

    /**
     * <p>Gets the value of the line1 property.</p>
     * <p>The first line of the address.</p>
     *
     * @return possible object is {@link String }
     */
    @JsonProperty("line1")
    public String getLine1() {
        return line1;
    }

    /**
     * <p>Sets the value of the line1 property.</p>
     * <p>The first line of the address.</p>
     *
     * @param line1 allowed object is {@link String }
     */
    @JsonProperty("line1")
    public void setLine1(String line1) {
        this.line1 = line1;
    }

    /**
     * <p>Gets the value of the line2 property.</p>
     * <p>The second line of the address.</p>
     *
     * @return possible object is {@link String }
     */
    @JsonProperty("line2")
    public String getLine2() {
        return line2;
    }

    /**
     * <p>Sets the value of the line2 property.</p>
     * <p>The second line of the address.</p>
     *
     * @param line2 allowed object is {@link String }
     */
    @JsonProperty("line2")
    public void setLine2(String line2) {
        this.line2 = line2;
    }

    /**
     * <p>Gets the value of the city property.</p>
     * <p>The name of the city in which an address is located.</p>
     *
     * @return possible object is {@link String }
     */
    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    /**
     * <p>Sets the value of the city property.</p>
     * <p>The name of the city in which an address is located.</p>
     *
     * @param city allowed object is {@link String }
     */
    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * <p>Gets the value of the stateProvince property.</p>
     * <p>The abbreviation for the state, province or outlying area in which an address is located.</p>
     *
     * @return possible object is {@link String }
     */
    @JsonProperty("stateProvince")
    public String getStateProvince() {
        return stateProvince;
    }

    /**
     * <p>Sets the value of the stateProvince property.</p>
     * <p>The abbreviation for the state, province or outlying area in which an address is located.</p>
     *
     * @param stateProvince allowed object is {@link String }
     */
    @JsonProperty("stateProvince")
    public void setStateProvince(String stateProvince) {
        this.stateProvince = stateProvince;
    }

    /**
     * <p>Gets the value of the countryCode property.</p>
     * <p>The unique two character International Organization for Standardization (ISO) code for the country in which an address is located.</p>
     *
     * @return possible object is {@link String }
     */
    @JsonProperty("countryCode")
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * <p>Sets the value of the countryCode property.</p>
     * <p>The unique two character International Organization for Standardization (ISO) code for the country in which an address is located.</p>
     *
     * @param countryCode allowed object is {@link String }
     */
    @JsonProperty("countryCode")
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /**
     * <p>Gets the value of the postalCode property.</p>
     * <p>A number that identifies each postal delivery area in the locale used as a portion of an address.</p>
     *
     * @return possible object is {@link String }
     */
    @JsonProperty("postalCode")
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * <p>Sets the value of the postalCode property.</p>
     * <p>A number that identifies each postal delivery area in the locale used as a portion of an address.</p>
     *
     * @param postalCode allowed object is {@link String }
     */
    @JsonProperty("postalCode")
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @JsonIgnore
    public boolean isEmptyObject() {
        return Stream.of(addressType, line1, line2, city, stateProvince, countryCode, postalCode).allMatch(Objects::isNull);
    }

    @Override
    public String toString() {
        return "OtherAddress{" + "addressType='" + addressType + '\'' + ", line1='" + line1 + '\'' + ", line2='" + line2 + '\'' + ", city='" + city + '\'' + ", stateProvince='" + stateProvince + '\'' + ", countryCode='" + countryCode + '\'' + ", postalCode='" + postalCode + '\'' + '}';
    }
}
package riconeapi.models.xpress;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder({
        "addressType",
        "line1",
        "line2",
        "city",
        "stateProvince",
        "countryCode",
        "postalCode"
})
public class XPersonAddressType {

    @JsonProperty("addressType")
    private String addressType;
    @JsonProperty("line1")
    private String line1;
    @JsonProperty("line2")
    private String line2;
    @JsonProperty("city")
    private String city;
    @JsonProperty("stateProvince")
    private String stateProvince;
    @JsonProperty("countryCode")
    private String countryCode;
    @JsonProperty("postalCode")
    private String postalCode;

    public XPersonAddressType() {
    }

    public XPersonAddressType(String addressType, String line1, String line2, String city, String stateProvince, String countryCode, String postalCode) {
        super();
        this.addressType = addressType;
        this.line1 = line1;
        this.line2 = line2;
        this.city = city;
        this.stateProvince = stateProvince;
        this.countryCode = countryCode;
        this.postalCode = postalCode;
    }

    @JsonProperty("addressType")
    public String getAddressType() {
        return addressType;
    }

    @JsonProperty("addressType")
    public void setAddressType(String addressType) {
        this.addressType = addressType;
    }

    @JsonProperty("line1")
    public String getLine1() {
        return line1;
    }

    @JsonProperty("line1")
    public void setLine1(String line1) {
        this.line1 = line1;
    }

    @JsonProperty("line2")
    public String getLine2() {
        return line2;
    }

    @JsonProperty("line2")
    public void setLine2(String line2) {
        this.line2 = line2;
    }

    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    @JsonProperty("stateProvince")
    public String getStateProvince() {
        return stateProvince;
    }

    @JsonProperty("stateProvince")
    public void setStateProvince(String stateProvince) {
        this.stateProvince = stateProvince;
    }

    @JsonProperty("countryCode")
    public String getCountryCode() {
        return countryCode;
    }

    @JsonProperty("countryCode")
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @JsonProperty("postalCode")
    public String getPostalCode() {
        return postalCode;
    }

    @JsonProperty("postalCode")
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @Override public String toString()
    {
        return "XPersonAddressType{" + "addressType='" + addressType + '\'' + ", line1='" + line1 + '\'' + ", line2='" + line2 + '\'' + ", city='" + city + '\'' + ", stateProvince='" + stateProvince + '\'' + ", countryCode='" + countryCode + '\'' + ", postalCode='" + postalCode + '\'' + '}';
    }
}
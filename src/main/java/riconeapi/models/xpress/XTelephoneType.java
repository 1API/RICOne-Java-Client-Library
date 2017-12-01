package riconeapi.models.xpress;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "phoneNumberType",
        "number",
        "primaryIndicator"
})
public class XTelephoneType
{

    @JsonProperty("phoneNumberType")
    private String phoneNumberType;
    @JsonProperty("number")
    private String number;
    @JsonProperty("primaryIndicator")
    private Boolean primaryIndicator;

    public XTelephoneType() {
    }

    public XTelephoneType(String phoneNumberType, String number, Boolean primaryIndicator) {
        super();
        this.phoneNumberType = phoneNumberType;
        this.number = number;
        this.primaryIndicator = primaryIndicator;
    }

    @JsonProperty("phoneNumberType")
    public String getPhoneNumberType() {
        return phoneNumberType;
    }

    @JsonProperty("phoneNumberType")
    public void setPhoneNumberType(String phoneNumberType) {
        this.phoneNumberType = phoneNumberType;
    }

    @JsonProperty("number")
    public String getNumber() {
        return number;
    }

    @JsonProperty("number")
    public void setNumber(String number) {
        this.number = number;
    }

    @JsonProperty("primaryIndicator")
    public Boolean isPrimaryIndicator() {
        return primaryIndicator;
    }

    @JsonProperty("primaryIndicator")
    public void setPrimaryIndicator(Boolean primaryIndicator) {
        this.primaryIndicator = primaryIndicator;
    }

    @Override public String toString()
    {
        return "XTelephoneType{" + "phoneNumberType='" + phoneNumberType + '\'' + ", number='" + number + '\'' + ", primaryIndicator=" + primaryIndicator + '}';
    }
}


package riconeapi.models.xpress;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.xml.datatype.XMLGregorianCalendar;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder({
        "races",
        "hispanicLatinoEthnicity",
        "sex",
        "birthDate",
        "countryOfBirth",
        "usCitizenshipStatus"
})
public class XDemographicsType {

    @JsonProperty("races")
    private XRaceListType races;
    @JsonProperty("hispanicLatinoEthnicity")
    private Boolean hispanicLatinoEthnicity;
    @JsonProperty("sex")
    private String sex;
    @JsonProperty("birthDate")
    private XMLGregorianCalendar birthDate;
    @JsonProperty("countryOfBirth")
    private String countryOfBirth;
    @JsonProperty("usCitizenshipStatus")
    private String usCitizenshipStatus;

    public XDemographicsType() {
    }

    public XDemographicsType(XRaceListType races, Boolean hispanicLatinoEthnicity, String sex, XMLGregorianCalendar birthDate, String countryOfBirth, String usCitizenshipStatus) {
        super();
        this.races = races;
        this.hispanicLatinoEthnicity = hispanicLatinoEthnicity;
        this.sex = sex;
        this.birthDate = birthDate;
        this.countryOfBirth = countryOfBirth;
        this.usCitizenshipStatus = usCitizenshipStatus;
    }

    @JsonProperty("races")
    public XRaceListType getRaces() {
        return races;
    }

    @JsonProperty("races")
    public void setRaces(XRaceListType races) {
        this.races = races;
    }

    @JsonProperty("hispanicLatinoEthnicity")
    public Boolean isHispanicLatinoEthnicity() {
        return hispanicLatinoEthnicity;
    }

    @JsonProperty("hispanicLatinoEthnicity")
    public void setHispanicLatinoEthnicity(Boolean hispanicLatinoEthnicity) {
        this.hispanicLatinoEthnicity = hispanicLatinoEthnicity;
    }

    @JsonProperty("sex")
    public String getSex() {
        return sex;
    }

    @JsonProperty("sex")
    public void setSex(String sex) {
        this.sex = sex;
    }

    @JsonProperty("birthDate")
    public XMLGregorianCalendar getBirthDate() {
        return birthDate;
    }

    @JsonProperty("birthDate")
    public void setBirthDate(XMLGregorianCalendar birthDate) {
        this.birthDate = birthDate;
    }

    @JsonProperty("countryOfBirth")
    public String getCountryOfBirth() {
        return countryOfBirth;
    }

    @JsonProperty("countryOfBirth")
    public void setCountryOfBirth(String countryOfBirth) {
        this.countryOfBirth = countryOfBirth;
    }

    @JsonProperty("usCitizenshipStatus")
    public String getUsCitizenshipStatus() {
        return usCitizenshipStatus;
    }

    @JsonProperty("usCitizenshipStatus")
    public void setUsCitizenshipStatus(String usCitizenshipStatus) {
        this.usCitizenshipStatus = usCitizenshipStatus;
    }

    @Override public String toString()
    {
        return "XDemographicsType{" + "races=" + races + ", hispanicLatinoEthnicity=" + hispanicLatinoEthnicity + ", sex='" + sex + '\'' + ", birthDate=" + birthDate + ", countryOfBirth='" + countryOfBirth + '\'' + ", usCitizenshipStatus='" + usCitizenshipStatus + '\'' + '}';
    }
}
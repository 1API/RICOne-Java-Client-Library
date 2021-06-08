package riconeapi.library.client.response.model;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.stream.Stream;

/**
 * <p>Java class for xDemographicsType complex type.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"races", "hispanicLatinoEthnicity", "sex", "birthDate", "countryOfBirth", "usCitizenshipStatus"})
public class Demographics {
    @JsonProperty("races")
    @JacksonXmlProperty(localName = "races", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private Races races;

    @JsonProperty("hispanicLatinoEthnicity")
    @JacksonXmlProperty(localName = "hispanicLatinoEthnicity", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private String hispanicLatinoEthnicity;

    @JsonProperty("sex")
    @JacksonXmlProperty(localName = "sex", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private String sex;

    @JsonProperty("birthDate")
    @JacksonXmlProperty(localName = "birthDate", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private String birthDate;

    @JsonProperty("countryOfBirth")
    @JacksonXmlProperty(localName = "countryOfBirth", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private String countryOfBirth;

    @JsonProperty("usCitizenshipStatus")
    @JacksonXmlProperty(localName = "usCitizenshipStatus", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private String usCitizenshipStatus;

    public Demographics() { }

    public Demographics(Races races, String hispanicLatinoEthnicity, String sex, String birthDate, String countryOfBirth, String usCitizenshipStatus) {
        super();
        this.races = races;
        this.hispanicLatinoEthnicity = hispanicLatinoEthnicity;
        this.sex = sex;
        this.birthDate = birthDate;
        this.countryOfBirth = countryOfBirth;
        this.usCitizenshipStatus = usCitizenshipStatus;
    }

    /**
     * <p>Gets the value of the races property.</p>
     * <p>A list of races.</p>
     *
     * @return possible object is {@link Races }
     */
    @JsonProperty("races")
    public Races getRaces() {
        return races;
    }

    /**
     * <p>Sets the value of the races property.</p>
     * <p>A list of races.</p>
     *
     * @param races allowed object is {@link Races }
     */
    @JsonProperty("races")
    public void setRaces(Races races) {
        this.races = races;
    }

    /**
     * <p>Gets the value of the hispanicLatinoEthnicity property.</p>
     * <p>An indication that the person traces his or her origin or descent to Mexico, Puerto Rico, Cuba, Central and South America, and other Spanish cultures, regardless of race.</p>
     *
     * @return possible object is {@link String }
     */
    @JsonProperty("hispanicLatinoEthnicity")
    public String getHispanicLatinoEthnicity() {
        return hispanicLatinoEthnicity;
    }

    /**
     * <p>Sets the value of the hispanicLatinoEthnicity property.</p>
     * <p>An indication that the person traces his or her origin or descent to Mexico, Puerto Rico, Cuba, Central and South America, and other Spanish cultures, regardless of race.</p>
     *
     * @param hispanicLatinoEthnicity allowed object is {@link String }
     */
    @JsonProperty("hispanicLatinoEthnicity")
    public void setHispanicLatinoEthnicity(String hispanicLatinoEthnicity) {
        this.hispanicLatinoEthnicity = hispanicLatinoEthnicity;
    }

    /**
     * <p>Gets the value of the sex property.</p>
     * <p>The concept describing the biological traits that distinguish the males and females of a species.</p>
     *
     * @return possible object is {@link String }
     */
    @JsonProperty("sex")
    public String getSex() {
        return sex;
    }

    /**
     * <p>Sets the value of the sex property.</p>
     * <p>The concept describing the biological traits that distinguish the males and females of a species.</p>
     *
     * @param sex allowed object is {@link String }
     */
    @JsonProperty("sex")
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * <p>Gets the value of the birthDate property.</p>
     * <p>The year, month and day on which a person was born.</p>
     *
     * @return possible object is {@link String }
     */
    @JsonProperty("birthDate")
    public String getBirthDate() {
        return birthDate;
    }

    /**
     * <p>Sets the value of the birthDate property.</p>
     * <p>The year, month and day on which a person was born.</p>
     *
     * @param birthDate allowed object is {@link String }
     */
    @JsonProperty("birthDate")
    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    /**
     * <p>Gets the value of the countryOfBirth property.</p>
     * <p>The country in which a person was born.</p>
     *
     * @return possible object is {@link String }
     */
    @JsonProperty("countryOfBirth")
    public String getCountryOfBirth() {
        return countryOfBirth;
    }

    /**
     * <p>Sets the value of the countryOfBirth property.</p>
     * <p>The country in which a person was born.</p>
     *
     * @param countryOfBirth allowed object is {@link String }
     */
    @JsonProperty("countryOfBirth")
    public void setCountryOfBirth(String countryOfBirth) {
        this.countryOfBirth = countryOfBirth;
    }

    /**
     * <p>Gets the value of the usCitizenshipStatus property.</p>
     * <p>An indicator of whether or not the person is a US citizen.</p>
     *
     * @return possible object is {@link String }
     */
    @JsonProperty("usCitizenshipStatus")
    public String getUsCitizenshipStatus() {
        return usCitizenshipStatus;
    }

    /**
     * <p>Sets the value of the usCitizenshipStatus property.</p>
     * <p>An indicator of whether or not the person is a US citizen.</p>
     *
     * @param usCitizenshipStatus allowed object is {@link String }
     */
    @JsonProperty("usCitizenshipStatus")
    public void setUsCitizenshipStatus(String usCitizenshipStatus) {
        this.usCitizenshipStatus = usCitizenshipStatus;
    }

    @JsonIgnore
    public boolean isEmptyObject() {
        return Stream.of(races, hispanicLatinoEthnicity, sex, birthDate, countryOfBirth, usCitizenshipStatus).allMatch(Objects::isNull);
    }

    @Override
    public String toString() {
        return "Demographics{" + "races=" + races + ", hispanicLatinoEthnicity='" + hispanicLatinoEthnicity + '\'' + ", sex='" + sex + '\'' + ", birthDate='" + birthDate + '\'' + ", countryOfBirth='" + countryOfBirth + '\'' + ", usCitizenshipStatus='" + usCitizenshipStatus + '\'' + '}';
    }
}
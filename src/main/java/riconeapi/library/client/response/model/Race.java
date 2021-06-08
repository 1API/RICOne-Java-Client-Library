package riconeapi.library.client.response.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * <p>Java class for xRaceType complex type.</p>
 * <p>Indicates the racial origins of a person.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"race"})
public class Race {
    @JsonProperty("race")
    @JacksonXmlProperty(localName = "race", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private String race;

    public Race() { }

    public Race(String race) {
        super();
        this.race = race;
    }

    /**
     * <p>Gets the value of the race property.</p>
     * <p>Indicates the racial origins of a person. The possible values are: AmericanIndianOrAlaskaNative, Asian, BlackOrAfricanAmerican, NativeHawaiianOrOtherPacificIslander, White, DemographicRaceTwoOrMoreRaces.</p>
     * @return possible object is {@link String }
     */
    @JsonProperty("race")
    public String getRace() {
        return race;
    }

    /**
     * <p>Sets the value of the race property.</p>
     * <p>Indicates the racial origins of a person. The possible values are: AmericanIndianOrAlaskaNative, Asian, BlackOrAfricanAmerican, NativeHawaiianOrOtherPacificIslander, White, DemographicRaceTwoOrMoreRaces.</p>
     * @param race allowed object is {@link String }
     */
    @JsonProperty("race")
    public void setRace(String race) {
        this.race = race;
    }

    @Override
    public String toString() {
        return "Race{" + "race='" + race + '\'' + '}';
    }
}
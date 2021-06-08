package riconeapi.library.client.response.model;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>Java class for xRaceListType complex type.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"race"})
public class Races {
    @JsonProperty("race")
    @JacksonXmlProperty(localName = "race", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<Race> race;

    public Races() {
        race = new ArrayList<>();
    }

    public Races(List<Race> race) {
        super();
        this.race = race;
    }

    /**
     * <p>Gets the value of the race property.</p>
     *
     * @return possible object is {@link Race }
     */
    @JsonProperty("race")
    @JacksonXmlElementWrapper(useWrapping = false)
    public List<Race> getRace() {
        return race;
    }

    /**
     * <p>Sets the value of the race property.</p>
     *
     * @param race allowed object is {@link Race }
     */
    @JsonProperty("race")
    @JacksonXmlElementWrapper(useWrapping = false)
    public void setRace(List<Race> race) {
        this.race = race;
    }

    @JsonIgnore
    public boolean isEmptyObject() {
        return race.isEmpty();
    }

    @Override
    public String toString() {
        return "Races{" + "race=" + race + '}';
    }
}
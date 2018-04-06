
package riconeapi.models.xpress;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder({
        "race"
})
public class XRaceListType {

    @JsonProperty("race")
    private List<XRaceType> race = new ArrayList<>();

    public XRaceListType() {
    }

    public XRaceListType(List<XRaceType> race) {
        super();
        this.race = race;
    }

    @JsonProperty("race")
    public List<XRaceType> getRace() {
        return race;
    }

    @JsonProperty("race")
    public void setRace(List<XRaceType> race) {
        this.race = race;
    }

}

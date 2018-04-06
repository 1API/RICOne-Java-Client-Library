
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
        "relationship"
})
public class XContactStudentRelationshipListType {

    @JsonProperty("relationship")
    private List<XContactStudentRelationshipType> relationship = new ArrayList<>();

    public XContactStudentRelationshipListType() {
    }

    public XContactStudentRelationshipListType(List<XContactStudentRelationshipType> relationship) {
        super();
        this.relationship = relationship;
    }

    @JsonProperty("relationship")
    public List<XContactStudentRelationshipType> getRelationship() {
        return relationship;
    }

    @JsonProperty("relationship")
    public void setRelationship(List<XContactStudentRelationshipType> relationship) {
        this.relationship = relationship;
    }

    @Override public String toString()
    {
        return "XContactStudentRelationshipListType{" + "relationship=" + relationship + '}';
    }
}

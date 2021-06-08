package riconeapi.library.client.response.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>Java class for xContactStudentRelationshipListType complex type.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"relationship"})
public class Relationships {
    @JsonProperty("relationship")
    @JacksonXmlProperty(localName = "relationship", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<Relationship> relationship;

    public Relationships() {
        relationship = new ArrayList<>();
    }

    public Relationships(List<Relationship> relationship) {
        super();
        this.relationship = relationship;
    }

    /**
     * <p>Gets the value of the relationship property.</p>
     *
     * @return possible object is {@link Relationship }
     */
    @JsonProperty("relationship")
    @JacksonXmlElementWrapper(useWrapping = false)
    public List<Relationship> getRelationship() {
        return relationship;
    }

    /**
     * <p>Sets the value of the relationship property.</p>
     *
     * @param relationship allowed object is {@link Relationship }
     */
    @JsonProperty("relationship")
    @JacksonXmlElementWrapper(useWrapping = false)
    public void setRelationship(List<Relationship> relationship) {
        this.relationship = relationship;
    }

    @Override
    public String toString() {
        return "Relationships{" + "relationship=" + relationship + '}';
    }
}
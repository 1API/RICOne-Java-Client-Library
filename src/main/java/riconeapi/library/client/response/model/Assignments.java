package riconeapi.library.client.response.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>Java class for xAssignmentListType</p>
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"assignment"})
public class Assignments implements Serializable {
    private final static long serialVersionUID = 5013695951890510041L;
    @JsonProperty("assignment")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<Assignment> assignment = new ArrayList<>();

    public Assignments() { }

    public Assignments(List<Assignment> assignment) {
        super();
        this.assignment = assignment;
    }

    /**
     * <p>Gets the value of the assignment property.</p>
     *
     * @return possible object is {@link Assignment }
     */
    @JsonProperty("assignment")
    @JacksonXmlElementWrapper(useWrapping = false)
    public List<Assignment> getAssignment() {
        return assignment;
    }

    /**
     * <p>Sets the value of the assignment property.</p>
     *
     * @param assignment allowed object is {@link Assignment }
     */
    @JsonProperty("assignment")
    @JacksonXmlElementWrapper(useWrapping = false)
    public void setAssignment(List<Assignment> assignment) {
        this.assignment = assignment;
    }

}
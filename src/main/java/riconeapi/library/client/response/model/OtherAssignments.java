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
 * <p>Java class for xStaffPersonAssignmentListType complex type.</p>
 * <p>A list of staff person assignments.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"staffPersonAssignment"})
public class OtherAssignments {
    @JsonProperty("staffPersonAssignment")
    @JacksonXmlProperty(localName = "staffPersonAssignment", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<StaffPersonAssignment> staffPersonAssignment;

    public OtherAssignments() {
        staffPersonAssignment = new ArrayList<>();
    }

    public OtherAssignments(List<StaffPersonAssignment> staffPersonAssignment) {
        super();
        this.staffPersonAssignment = staffPersonAssignment;
    }

    /**
     * <p>Gets the value of the staffPersonAssignment property.</p>
     * <p>The location and function to which a staff person is assigned.</p>
     *
     * @return possible object is {@link StaffPersonAssignment }
     */
    @JsonProperty("staffPersonAssignment")
    @JacksonXmlElementWrapper(useWrapping = false)
    public List<StaffPersonAssignment> getStaffPersonAssignment() {
        return staffPersonAssignment;
    }

    /**
     * <p>Sets the value of the staffPersonAssignment property.</p>
     * <p>The location and function to which a staff person is assigned.</p>
     *
     * @param staffPersonAssignment allowed object is {@link StaffPersonAssignment }
     */
    @JsonProperty("staffPersonAssignment")
    @JacksonXmlElementWrapper(useWrapping = false)
    public void setStaffPersonAssignment(List<StaffPersonAssignment> staffPersonAssignment) {
        this.staffPersonAssignment = staffPersonAssignment;
    }

    @Override
    public String toString() {
        return "OtherAssignments{" + "staffPersonAssignment=" + staffPersonAssignment + '}';
    }
}
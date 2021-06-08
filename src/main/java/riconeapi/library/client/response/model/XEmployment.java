package riconeapi.library.client.response.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import riconeapi.library.client.common.Model;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.Objects;
import java.util.stream.Stream;

/**
 * <p>xEmployment is a composite object that provides information about an employee.</p>
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"@refId", "type", "manager", "hireDate", "terminationDate", "active", "removeEmployee", "assignments"})
@JsonRootName(value = "xEmployment")
@JacksonXmlRootElement(localName = "xEmployment")
@XmlRootElement(name = "xEmployment")
public class XEmployment extends Model implements Serializable {
    private final static long serialVersionUID = 6768763214259681013L;
    @JsonProperty("@refId")
    private String refId;
    @JsonProperty("type")
    private String type;
    @JsonProperty("manager")
    private Manager manager;
    @JsonProperty("hireDate")
    private String hireDate;
    @JsonProperty("terminationDate")
    private String terminationDate;
    @JsonProperty("active")
    private Boolean active;
    @JsonProperty("removeEmployee")
    private Boolean removeEmployee;
    @JsonProperty("assignments")
    private Assignments assignments;
    @JsonProperty("metadata")
    private Metadata metadata;

    public XEmployment() { }

    public XEmployment(String refId, String type, Manager manager, String hireDate, String terminationDate, Boolean active, Boolean removeEmployee, Assignments assignments, Metadata metadata) {
        super();
        this.refId = refId;
        this.type = type;
        this.manager = manager;
        this.hireDate = hireDate;
        this.terminationDate = terminationDate;
        this.active = active;
        this.removeEmployee = removeEmployee;
        this.assignments = assignments;
        this.metadata = metadata;
    }

    /**
     * <p>Gets the value of the refId property.</p>
     * <p>The refid to which this employee applies.</p>
     *
     * @return possible object is {@link String }
     */
    @JsonProperty("@refId")
    public String getRefId() {
        return refId;
    }

    /**
     * <p>Sets the value of the refId property.</p>
     * <p>The refid to which this employee applies.</p>
     *
     * @param refId allowed object is {@link String }
     */
    @JsonProperty("@refId")
    public void setRefId(String refId) {
        this.refId = refId;
    }

    /**
     * <p>Gets the value of the type property.</p>
     * <p>Employee's current position type.</p>
     *
     * @return possible object is {@link String }
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * <p>Sets the value of the type property.</p>
     * <p>Employee's current position type.</p>
     *
     * @param type allowed object is {@link String }
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>Gets the value of the manager property.</p>
     * <p>The staff member's manage.</p>
     *
     * @return possible object is {@link Manager }
     */
    @JsonProperty("manager")
    public Manager getManager() {
        return manager;
    }

    /**
     * <p>Sets the value of the manager property.</p>
     * <p>The staff member's manager.</p>
     *
     * @param manager allowed object is {@link Manager }
     */
    @JsonProperty("manager")
    public void setManager(Manager manager) {
        this.manager = manager;
    }

    /**
     * <p>Gets the value of the hireDate property.</p>
     * <p>Date the employee was hired.</p>
     *
     * @return possible object is {@link String }
     */
    @JsonProperty("hireDate")
    public String getHireDate() {
        return hireDate;
    }

    /**
     * <p>Sets the value of the hireDate property.</p>
     * <p>Date the employee was hired.</p>
     *
     * @param hireDate allowed object is {@link String }
     */
    @JsonProperty("hireDate")
    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    /**
     * <p>Gets the value of the terminationDate property.</p>
     * <p>Date the employee resigned. Present if a HireDate is entered and a TerminationDate is available.</p>
     *
     * @return possible object is {@link String }
     */
    @JsonProperty("terminationDate")
    public String getTerminationDate() {
        return terminationDate;
    }

    /**
     * <p>Sets the value of the terminationDate property.</p>
     * <p>Date the employee resigned. Present if a HireDate is entered and a TerminationDate is available.</p>
     *
     * @param terminationDate allowed object is {@link String }
     */
    @JsonProperty("terminationDate")
    public void setTerminationDate(String terminationDate) {
        this.terminationDate = terminationDate;
    }

    /**
     * <p>Gets the value of the active property.</p>
     * <p>Staff is currently active and/or employed.</p>
     *
     * @return possible object is {@link Boolean }
     */
    @JsonProperty("active")
    public Boolean getActive() {
        return active;
    }

    /**
     * <p>Sets the value of the active property.</p>
     * <p>Staff is currently active and/or employed.</p>
     *
     * @param active allowed object is {@link Boolean }
     */
    @JsonProperty("active")
    public void setActive(Boolean active) {
        this.active = active;
    }

    /**
     * <p>Gets the value of the removeEmployee property.</p>
     * <p>Flag to mark whether staff should be removed.</p>
     *
     * @return possible object is {@link Boolean }
     */
    @JsonProperty("removeEmployee")
    public Boolean getRemoveEmployee() {
        return removeEmployee;
    }

    /**
     * <p>Sets the value of the removeEmployee property.</p>
     * <p>Flag to mark whether staff should be removed.</p>
     *
     * @param removeEmployee allowed object is {@link Boolean }
     */
    @JsonProperty("removeEmployee")
    public void setRemoveEmployee(Boolean removeEmployee) {
        this.removeEmployee = removeEmployee;
    }

    /**
     * <p>Gets the value of the assignments property.</p>
     * <p>The district, school, and function to which the person is assigned.</p>
     *
     * @return possible object is {@link Assignments }
     */
    @JsonProperty("assignments")
    public Assignments getAssignments() {
        return assignments;
    }

    /**
     * <p>Sets the value of the assignments property.</p>
     * <p>The district, school, and function to which the person is assigned.</p>
     *
     * @param assignments allowed object is {@link Assignments }
     */
    @JsonProperty("assignments")
    public void setAssignments(Assignments assignments) {
        this.assignments = assignments;
    }

    /**
     * <p>Gets the value of the metadata property.</p>
     * <p>An object containing additional information about the record.</p>
     *
     * @return metadata allowed object is {@link Metadata }
     */
    @JsonProperty("metadata")
    public Metadata getMetadata() {
        return metadata;
    }

    /**
     * <p>Sets the value of the metadata property.</p>
     * <p>An object containing additional information about the record.</p>
     *
     * @param metadata allowed object is {@link Metadata }
     */
    @JsonProperty("metadata")
    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    @Override
    public boolean isEmpty() {
        return Stream.of(refId, type, manager, hireDate, terminationDate, active, removeEmployee, assignments, metadata).allMatch(Objects::isNull);
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        XEmployment that = (XEmployment) o;
        return Objects.equals(refId, that.refId) &&
            Objects.equals(type, that.type) &&
            Objects.equals(manager, that.manager) &&
            Objects.equals(hireDate, that.hireDate) &&
            Objects.equals(terminationDate, that.terminationDate) &&
            Objects.equals(active, that.active) &&
            Objects.equals(removeEmployee, that.removeEmployee) &&
            Objects.equals(assignments, that.assignments) &&
            Objects.equals(metadata, that.metadata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(refId, type, manager, hireDate, terminationDate, active, removeEmployee, assignments, metadata);
    }

    @Override
    public String toString() {
        return "XEmployment{" + "refId='" + refId + '\'' + ", type='" + type + '\'' + ", manager=" + manager + ", hireDate='" + hireDate + '\'' + ", terminationDate='" + terminationDate + '\'' + ", active='" + active + '\'' + ", removeEmployee='" + removeEmployee + '\'' + ", assignments=" + assignments + ", metadata=" + metadata + '}';
    }
}
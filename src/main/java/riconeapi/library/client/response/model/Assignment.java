package riconeapi.library.client.response.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.io.Serializable;
import java.util.Objects;
import java.util.stream.Stream;

/**
 * <p>Java class for xAssignmentType complex type.</p>
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"leaRefId", "schoolRefId", "type", "department", "positionTitle", "manager", "hireDate", "terminationDate", "active", "removeEmployee"})
public class Assignment implements Serializable {
    private final static long serialVersionUID = 3825325857306273147L;
    @JsonProperty("leaRefId")
    private String leaRefId;
    @JsonProperty("schoolRefId")
    private String schoolRefId;
    @JsonProperty("type")
    private String type;
    @JsonProperty("department")
    private String department;
    @JsonProperty("positionTitle")
    private String positionTitle;
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

    public Assignment() { }

    public Assignment(String leaRefId, String schoolRefId, String type, String department, String positionTitle, Manager manager, String hireDate, String terminationDate, Boolean active, Boolean removeEmployee) {
        super();
        this.leaRefId = leaRefId;
        this.schoolRefId = schoolRefId;
        this.type = type;
        this.department = department;
        this.positionTitle = positionTitle;
        this.manager = manager;
        this.hireDate = hireDate;
        this.terminationDate = terminationDate;
        this.active = active;
        this.removeEmployee = removeEmployee;
    }

    /**
     * <p>Gets the value of the leaRefId property.</p>
     * <p>The refId for the LEA.</p>
     *
     * @return possible object is {@link String }
     */
    @JsonProperty("leaRefId")
    public String getLeaRefId() {
        return leaRefId;
    }

    /**
     * <p>Sets the value of the leaRefId property.</p>
     * <p>The refId for the LEA.</p>
     *
     * @param leaRefId allowed object is {@link String }
     */
    @JsonProperty("leaRefId")
    public void setLeaRefId(String leaRefId) {
        this.leaRefId = leaRefId;
    }

    /**
     * <p>Gets the value of the schoolRefId property.</p>
     * <p>RefId of the school.</p>
     *
     * @return possible object is {@link String }
     */
    @JsonProperty("schoolRefId")
    public String getSchoolRefId() {
        return schoolRefId;
    }

    /**
     * <p>Sets the value of the schoolRefId property.</p>
     * <p>RefId of the school.</p>
     *
     * @param schoolRefId allowed object is {@link String }
     */
    @JsonProperty("schoolRefId")
    public void setSchoolRefId(String schoolRefId) {
        this.schoolRefId = schoolRefId;
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
     * <p>Gets the value of the department property.</p>
     * <p>The staff member's department.</p>
     *
     * @return possible object is {@link String }
     */
    @JsonProperty("department")
    public String getDepartment() {
        return department;
    }

    /**
     * <p>Sets the value of the department property.</p>
     * <p>The staff member's department.</p>
     *
     * @param department allowed object is {@link String }
     */
    @JsonProperty("department")
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * <p>Gets the value of the positionTitle property.</p>
     * <p>Employee's current position title.</p>
     *
     * @return possible object is {@link String }
     */
    @JsonProperty("positionTitle")
    public String getPositionTitle() {
        return positionTitle;
    }

    /**
     * <p>Sets the value of the positionTitle property.</p>
     * <p>Employee's current position title.</p>
     *
     * @param positionTitle allowed object is {@link String }
     */
    @JsonProperty("positionTitle")
    public void setPositionTitle(String positionTitle) {
        this.positionTitle = positionTitle;
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

    @JsonIgnore
    public boolean isEmptyObject() {
        return Stream.of(leaRefId, schoolRefId, type, department, positionTitle, manager, hireDate, terminationDate, active, removeEmployee).allMatch(Objects::isNull);
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Assignment that = (Assignment) o;
        return Objects.equals(leaRefId, that.leaRefId) &&
            Objects.equals(schoolRefId, that.schoolRefId) &&
            Objects.equals(type, that.type) &&
            Objects.equals(department, that.department) &&
            Objects.equals(positionTitle, that.positionTitle) &&
            Objects.equals(manager, that.manager) &&
            Objects.equals(hireDate, that.hireDate) &&
            Objects.equals(terminationDate, that.terminationDate) &&
            Objects.equals(active, that.active) &&
            Objects.equals(removeEmployee, that.removeEmployee);
    }

    @Override
    public int hashCode() {
        return Objects.hash(leaRefId, schoolRefId, type, department, positionTitle, manager, hireDate, terminationDate, active, removeEmployee);
    }

    @Override
    public String toString() {
        return "Assignment{" + "leaRefId='" + leaRefId + '\'' + ", schoolRefId='" + schoolRefId + '\'' + ", type='" + type + '\'' + ", department='" + department + '\'' + ", positionTitle='" + positionTitle + '\'' + ", manager=" + manager + ", hireDate='" + hireDate + '\'' + ", terminationDate='" + terminationDate + '\'' + ", active=" + active + ", removeEmployee=" + removeEmployee + '}';
    }
}
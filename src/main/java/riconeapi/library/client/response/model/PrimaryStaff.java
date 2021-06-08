package riconeapi.library.client.response.model;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.math.BigDecimal;
import java.util.Objects;
import java.util.stream.Stream;

/**
 * <p>Java class for xStaffReferenceType complex type.</p>
 * <p>A list of staff references.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"staffPersonReference", "teacherOfRecord", "percentResponsible"})
public class PrimaryStaff {

    @JsonProperty("staffPersonReference")
    @JacksonXmlProperty(localName = "staffPersonReference", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private StaffPersonReference staffPersonReference;

    @JsonProperty("teacherOfRecord")
    @JacksonXmlProperty(localName = "teacherOfRecord", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private Boolean teacherOfRecord;

    @JsonProperty("percentResponsible")
    @JacksonXmlProperty(localName = "percentResponsible", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private BigDecimal percentResponsible;

    public PrimaryStaff() { }

    public PrimaryStaff(StaffPersonReference staffPersonReference, Boolean teacherOfRecord, BigDecimal percentResponsible) {
        super();
        this.staffPersonReference = staffPersonReference;
        this.teacherOfRecord = teacherOfRecord;
        this.percentResponsible = percentResponsible;
    }

    /**
     * <p>Gets the value of the staffPersonReference property.</p>
     * <p>A collection of information about a staff person.</p>
     *
     * @return possible object is {@link StaffPersonReference }
     */
    @JsonProperty("staffPersonReference")
    public StaffPersonReference getStaffPersonReference() {
        return staffPersonReference;
    }

    /**
     * <p>Sets the value of the staffPersonReference property.</p>
     * <p>A collection of information about a staff person.</p>
     *
     * @param staffPersonReference allowed object is {@link StaffPersonReference }
     */
    @JsonProperty("staffPersonReference")
    public void setStaffPersonReference(StaffPersonReference staffPersonReference) {
        this.staffPersonReference = staffPersonReference;
    }

    /**
     * <p>Gets the value of the teacherOfRecord property.</p>
     * <p>Staff member who has a Teacher of Record responsibility for a Class Section based upon the state's definition of Teacher of Record.</p>
     *
     * @return possible object is {@link Boolean }
     */
    @JsonProperty("teacherOfRecord")
    public Boolean getTeacherOfRecord() {
        return teacherOfRecord;
    }

    /**
     * <p>Sets the value of the teacherOfRecord property.</p>
     * <p>Staff member who has a Teacher of Record responsibility for a Class Section based upon the state's definition of Teacher of Record.</p>
     *
     * @param teacherOfRecord allowed object is {@link Boolean }
     */
    @JsonProperty("teacherOfRecord")
    public void setTeacherOfRecord(Boolean teacherOfRecord) {
        this.teacherOfRecord = teacherOfRecord;
    }

    /**
     * <p>Gets the value of the percentResponsible property.</p>
     * <p>A percentage used to weight the educator's assigned responsibility for student learning in a Class Section, particularly when more than one educator is assigned to the class section.</p>
     *
     * @return possible object is {@link BigDecimal }
     */
    @JsonProperty("percentResponsible")
    public BigDecimal getPercentResponsible() {
        return percentResponsible;
    }

    /**
     * <p>Sets the value of the percentResponsible property.</p>
     * <p>A percentage used to weight the educator's assigned responsibility for student learning in a Class Section, particularly when more than one educator is assigned to the class section.</p>
     *
     * @param percentResponsible allowed object is {@link BigDecimal }
     */
    @JsonProperty("percentResponsible")
    public void setPercentResponsible(BigDecimal percentResponsible) {
        this.percentResponsible = percentResponsible;
    }

    @JsonIgnore
    public boolean isEmptyObject() {
        return Stream.of(staffPersonReference, teacherOfRecord, percentResponsible).allMatch(Objects::isNull);
    }

    @Override
    public String toString() {
        return "PrimaryStaff{" + "staffPersonReference=" + staffPersonReference + ", teacherOfRecord='" + teacherOfRecord + '\'' + ", percentResponsible='" + percentResponsible + '\'' + '}';
    }
}
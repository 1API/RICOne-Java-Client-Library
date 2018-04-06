
package riconeapi.models.xpress;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.math.BigDecimal;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder({
        "staffPersonReference",
        "teacherOfRecord",
        "percentResponsible"
})
public class XStaffReferenceType {

    @JsonProperty("staffPersonReference")
    private XPersonReferenceType staffPersonReference;
    @JsonProperty("teacherOfRecord")
    private Boolean teacherOfRecord;
    @JsonProperty("percentResponsible")
    private BigDecimal percentResponsible;

    public XStaffReferenceType() {
    }

    public XStaffReferenceType(XPersonReferenceType staffPersonReference, Boolean teacherOfRecord, BigDecimal percentResponsible) {
        super();
        this.staffPersonReference = staffPersonReference;
        this.teacherOfRecord = teacherOfRecord;
        this.percentResponsible = percentResponsible;
    }

    @JsonProperty("staffPersonReference")
    public XPersonReferenceType getStaffPersonReference() {
        return staffPersonReference;
    }

    @JsonProperty("staffPersonReference")
    public void setStaffPersonReference(XPersonReferenceType staffPersonReference) {
        this.staffPersonReference = staffPersonReference;
    }

    @JsonProperty("teacherOfRecord")
    public Boolean isTeacherOfRecord() {
        return teacherOfRecord;
    }

    @JsonProperty("teacherOfRecord")
    public void setTeacherOfRecord(Boolean teacherOfRecord) {
        this.teacherOfRecord = teacherOfRecord;
    }

    @JsonProperty("percentResponsible")
    public BigDecimal getPercentResponsible() {
        return percentResponsible;
    }

    @JsonProperty("percentResponsible")
    public void setPercentResponsible(BigDecimal percentResponsible) {
        this.percentResponsible = percentResponsible;
    }

    @Override public String toString()
    {
        return "XStaffReferenceType{" + "staffPersonReference=" + staffPersonReference + ", teacherOfRecord=" + teacherOfRecord + ", percentResponsible=" + percentResponsible + '}';
    }
}

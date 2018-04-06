
package riconeapi.models.xpress;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.math.BigInteger;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder({
        "studentRefId",
        "relationshipCode",
        "restrictions",
        "livesWith",
        "primaryContactIndicator",
        "emergencyContactIndicator",
        "financialResponsibilityIndicator",
        "custodialIndicator",
        "communicationsIndicator",
        "contactSequence"
})
public class XContactStudentRelationshipType {

    @JsonProperty("studentRefId")
    private String studentRefId;
    @JsonProperty("relationshipCode")
    private String relationshipCode;
    @JsonProperty("restrictions")
    private String restrictions;
    @JsonProperty("livesWith")
    private Boolean livesWith;
    @JsonProperty("primaryContactIndicator")
    private Boolean primaryContactIndicator;
    @JsonProperty("emergencyContactIndicator")
    private Boolean emergencyContactIndicator;
    @JsonProperty("financialResponsibilityIndicator")
    private Boolean financialResponsibilityIndicator;
    @JsonProperty("custodialIndicator")
    private Boolean custodialIndicator;
    @JsonProperty("communicationsIndicator")
    private Boolean communicationsIndicator;
    @JsonProperty("contactSequence")
    private BigInteger contactSequence;

    public XContactStudentRelationshipType() {
    }

    public XContactStudentRelationshipType(String studentRefId, String relationshipCode, String restrictions, Boolean livesWith, Boolean primaryContactIndicator, Boolean emergencyContactIndicator, Boolean financialResponsibilityIndicator, Boolean custodialIndicator, Boolean communicationsIndicator, BigInteger contactSequence) {
        super();
        this.studentRefId = studentRefId;
        this.relationshipCode = relationshipCode;
        this.restrictions = restrictions;
        this.livesWith = livesWith;
        this.primaryContactIndicator = primaryContactIndicator;
        this.emergencyContactIndicator = emergencyContactIndicator;
        this.financialResponsibilityIndicator = financialResponsibilityIndicator;
        this.custodialIndicator = custodialIndicator;
        this.communicationsIndicator = communicationsIndicator;
        this.contactSequence = contactSequence;
    }

    @JsonProperty("studentRefId")
    public String getStudentRefId() {
        return studentRefId;
    }

    @JsonProperty("studentRefId")
    public void setStudentRefId(String studentRefId) {
        this.studentRefId = studentRefId;
    }

    @JsonProperty("relationshipCode")
    public String getRelationshipCode() {
        return relationshipCode;
    }

    @JsonProperty("relationshipCode")
    public void setRelationshipCode(String relationshipCode) {
        this.relationshipCode = relationshipCode;
    }

    @JsonProperty("restrictions")
    public String getRestrictions() {
        return restrictions;
    }

    @JsonProperty("restrictions")
    public void setRestrictions(String restrictions) {
        this.restrictions = restrictions;
    }

    @JsonProperty("livesWith")
    public Boolean isLivesWith() {
        return livesWith;
    }

    @JsonProperty("livesWith")
    public void setLivesWith(Boolean livesWith) {
        this.livesWith = livesWith;
    }

    @JsonProperty("primaryContactIndicator")
    public Boolean isPrimaryContactIndicator() {
        return primaryContactIndicator;
    }

    @JsonProperty("primaryContactIndicator")
    public void setPrimaryContactIndicator(Boolean primaryContactIndicator) {
        this.primaryContactIndicator = primaryContactIndicator;
    }

    @JsonProperty("emergencyContactIndicator")
    public Boolean isEmergencyContactIndicator() {
        return emergencyContactIndicator;
    }

    @JsonProperty("emergencyContactIndicator")
    public void setEmergencyContactIndicator(Boolean emergencyContactIndicator) {
        this.emergencyContactIndicator = emergencyContactIndicator;
    }

    @JsonProperty("financialResponsibilityIndicator")
    public Boolean isFinancialResponsibilityIndicator() {
        return financialResponsibilityIndicator;
    }

    @JsonProperty("financialResponsibilityIndicator")
    public void setFinancialResponsibilityIndicator(Boolean financialResponsibilityIndicator) {
        this.financialResponsibilityIndicator = financialResponsibilityIndicator;
    }

    @JsonProperty("custodialIndicator")
    public Boolean isCustodialIndicator() {
        return custodialIndicator;
    }

    @JsonProperty("custodialIndicator")
    public void setCustodialIndicator(Boolean custodialIndicator) {
        this.custodialIndicator = custodialIndicator;
    }

    @JsonProperty("communicationsIndicator")
    public Boolean isCommunicationsIndicator() {
        return communicationsIndicator;
    }

    @JsonProperty("communicationsIndicator")
    public void setCommunicationsIndicator(Boolean communicationsIndicator) {
        this.communicationsIndicator = communicationsIndicator;
    }

    @JsonProperty("contactSequence")
    public BigInteger getContactSequence() {
        return contactSequence;
    }

    @JsonProperty("contactSequence")
    public void setContactSequence(BigInteger contactSequence) {
        this.contactSequence = contactSequence;
    }

    @Override public String toString()
    {
        return "XContactStudentRelationshipType{" + "studentRefId='" + studentRefId + '\'' + ", relationshipCode='" + relationshipCode + '\'' + ", restrictions='" + restrictions + '\'' + ", livesWith=" + livesWith + ", primaryContactIndicator=" + primaryContactIndicator
                + ", emergencyContactIndicator=" + emergencyContactIndicator + ", financialResponsibilityIndicator=" + financialResponsibilityIndicator + ", custodialIndicator=" + custodialIndicator + ", communicationsIndicator=" + communicationsIndicator + ", contactSequence=" + contactSequence
                + '}';
    }
}

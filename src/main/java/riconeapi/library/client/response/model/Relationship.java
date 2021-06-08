package riconeapi.library.client.response.model;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.stream.Stream;

/**
 * <p>Java class for xContactStudentRelationshipType complex type.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"studentRefId", "relationshipCode", "restrictions", "livesWith", "primaryContactIndicator", "emergencyContactIndicator", "financialResponsibilityIndicator", "custodialIndicator", "communicationsIndicator", "contactSequence"})
public class Relationship {
    /**
     *
     */
    @JsonProperty("studentRefId")
    @JacksonXmlProperty(localName = "studentRefId", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private String studentRefId;

    @JsonProperty("relationshipCode")
    @JacksonXmlProperty(localName = "relationshipCode", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private String relationshipCode;

    @JsonProperty("restrictions")
    @JacksonXmlProperty(localName = "restrictions", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private String restrictions;

    @JsonProperty("livesWith")
    @JacksonXmlProperty(localName = "livesWith", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private Boolean livesWith;

    @JsonProperty("primaryContactIndicator")
    @JacksonXmlProperty(localName = "primaryContactIndicator", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private Boolean primaryContactIndicator;

    @JsonProperty("emergencyContactIndicator")
    @JacksonXmlProperty(localName = "emergencyContactIndicator", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private Boolean emergencyContactIndicator;

    @JsonProperty("financialResponsibilityIndicator")
    @JacksonXmlProperty(localName = "financialResponsibilityIndicator", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private Boolean financialResponsibilityIndicator;

    @JsonProperty("custodialIndicator")
    @JacksonXmlProperty(localName = "custodialIndicator", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private Boolean custodialIndicator;

    @JsonProperty("communicationsIndicator")
    @JacksonXmlProperty(localName = "communicationsIndicator", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private Boolean communicationsIndicator;

    @JsonProperty("contactSequence")
    @JacksonXmlProperty(localName = "contactSequence", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private String contactSequence;

    public Relationship() { }

    public Relationship(String studentRefId, String relationshipCode, String restrictions, Boolean livesWith, Boolean primaryContactIndicator, Boolean emergencyContactIndicator, Boolean financialResponsibilityIndicator, Boolean custodialIndicator, Boolean communicationsIndicator, String contactSequence) {
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

    /**
     * <p>Gets the value of the studentRefId property.</p>
     * <p>The refid to which this student applies.</p>
     *
     * @return possible object is {@link String }
     */
    @JsonProperty("studentRefId")
    public String getStudentRefId() {
        return studentRefId;
    }

    /**
     * <p>Sets the value of the studentRefId property.</p>
     * <p>The refid to which this student applies.</p>
     *
     * @param studentRefId allowed object is {@link String }
     */
    @JsonProperty("studentRefId")
    public void setStudentRefId(String studentRefId) {
        this.studentRefId = studentRefId;
    }

    /**
     * <p>Gets the value of the relationshipCode property.</p>
     * <p>The nature of the person's relationship to a learner. The learner may be an Early Learning Child, K12 Student, Postsecondary Student, or an adult learner in a workforce education program.</p>
     *
     * @return possible object is {@link String }
     */
    @JsonProperty("relationshipCode")
    public String getRelationshipCode() {
        return relationshipCode;
    }

    /**
     * <p>Sets the value of the relationshipCode property.</p>
     * <p>The nature of the person's relationship to a learner. The learner may be an Early Learning Child, K12 Student, Postsecondary Student, or an adult learner in a workforce education program.</p>
     *
     * @param relationshipCode allowed object is {@link String }
     */
    @JsonProperty("relationshipCode")
    public void setRelationshipCode(String relationshipCode) {
        this.relationshipCode = relationshipCode;
    }

    /**
     * <p>Gets the value of the restrictions property.</p>
     * <p>Restrictions for student and/or teacher contact with the individual (e.g., the student may not be picked up by the individual.</p>
     *
     * @return possible object is {@link String }
     */
    @JsonProperty("restrictions")
    public String getRestrictions() {
        return restrictions;
    }

    /**
     * <p>Sets the value of the restrictions property.</p>
     * <p>Restrictions for student and/or teacher contact with the individual (e.g., the student may not be picked up by the individual.</p>
     *
     * @param restrictions allowed object is {@link String }
     */
    @JsonProperty("restrictions")
    public void setRestrictions(String restrictions) {
        this.restrictions = restrictions;
    }

    /**
     * <p>Gets the value of the livesWith property.</p>
     * <p>Indicates whether or not the learner lives with the related person.</p>
     *
     * @return possible object is {@link Boolean }
     */
    @JsonProperty("livesWith")
    public Boolean getLivesWith() {
        return livesWith;
    }

    /**
     * <p>Sets the value of the livesWith property.</p>
     * <p>Indicates whether or not the learner lives with the related person.</p>
     *
     * @param livesWith allowed object is {@link Boolean }
     */
    @JsonProperty("livesWith")
    public void setLivesWith(Boolean livesWith) {
        this.livesWith = livesWith;
    }

    /**
     * <p>Gets the value of the primaryContactIndicator property.</p>
     * <p>Indicates that a person is a primary contact within the specified context, such as a primary parental contact specified in Person Relationship to Learner or a primary administrative contact for an organization.</p>
     *
     * @return possible object is {@link Boolean }
     */
    @JsonProperty("primaryContactIndicator")
    public Boolean getPrimaryContactIndicator() {
        return primaryContactIndicator;
    }

    /**
     * <p>Sets the value of the primaryContactIndicator property.</p>
     * <p>Indicates that a person is a primary contact within the specified context, such as a primary parental contact specified in Person Relationship to Learner or a primary administrative contact for an organization.</p>
     *
     * @param primaryContactIndicator allowed object is {@link Boolean }
     */
    @JsonProperty("primaryContactIndicator")
    public void setPrimaryContactIndicator(Boolean primaryContactIndicator) {
        this.primaryContactIndicator = primaryContactIndicator;
    }

    /**
     * <p>Gets the value of the emergencyContactIndicator property.</p>
     * <p>Indicates whether or not the person is a designated emergency contact for the learner.</p>
     *
     * @return possible object is {@link Boolean }
     */
    @JsonProperty("emergencyContactIndicator")
    public Boolean getEmergencyContactIndicator() {
        return emergencyContactIndicator;
    }

    /**
     * <p>Sets the value of the emergencyContactIndicator property.</p>
     * <p>Indicates whether or not the person is a designated emergency contact for the learner.</p>
     *
     * @param emergencyContactIndicator allowed object is {@link Boolean }
     */
    @JsonProperty("emergencyContactIndicator")
    public void setEmergencyContactIndicator(Boolean emergencyContactIndicator) {
        this.emergencyContactIndicator = emergencyContactIndicator;
    }

    /**
     * <p>Gets the value of the financialResponsibilityIndicator property.</p>
     * <p></p>
     *
     * @return possible object is {@link Boolean }
     */
    @JsonProperty("financialResponsibilityIndicator")
    public Boolean getFinancialResponsibilityIndicator() {
        return financialResponsibilityIndicator;
    }

    /**
     * <p>Sets the value of the financialResponsibilityIndicator property.</p>
     * <p></p>
     *
     * @param financialResponsibilityIndicator allowed object is {@link Boolean }
     */
    @JsonProperty("financialResponsibilityIndicator")
    public void setFinancialResponsibilityIndicator(Boolean financialResponsibilityIndicator) {
        this.financialResponsibilityIndicator = financialResponsibilityIndicator;
    }

    /**
     * <p>Gets the value of the custodialIndicator property.</p>
     * <p>An indication that a person has legal custody of a child.</p>
     *
     * @return possible object is {@link Boolean }
     */
    @JsonProperty("custodialIndicator")
    public Boolean getCustodialIndicator() {
        return custodialIndicator;
    }

    /**
     * <p>Sets the value of the custodialIndicator property.</p>
     * <p>An indication that a person has legal custody of a child.</p>
     *
     * @param custodialIndicator allowed object is {@link Boolean }
     */
    @JsonProperty("custodialIndicator")
    public void setCustodialIndicator(Boolean custodialIndicator) {
        this.custodialIndicator = custodialIndicator;
    }

    /**
     * <p>Gets the value of the communicationsIndicator property.</p>
     * <p></p>
     *
     * @return possible object is {@link Boolean }
     */
    @JsonProperty("communicationsIndicator")
    public Boolean getCommunicationsIndicator() {
        return communicationsIndicator;
    }

    /**
     * <p>Sets the value of the communicationsIndicator property.</p>
     * <p></p>
     *
     * @param communicationsIndicator allowed object is {@link Boolean }
     */
    @JsonProperty("communicationsIndicator")
    public void setCommunicationsIndicator(Boolean communicationsIndicator) {
        this.communicationsIndicator = communicationsIndicator;
    }

    /**
     * <p>Gets the value of the contactSequence property.</p>
     * <p>The numeric order in the preferred sequence and priority for contacting a person related to the learner.</p>
     *
     * @return possible object is {@link String }
     */
    @JsonProperty("contactSequence")
    public String getContactSequence() {
        return contactSequence;
    }

    /**
     * <p>Sets the value of the contactSequence property.</p>
     * <p>The numeric order in the preferred sequence and priority for contacting a person related to the learner.</p>
     *
     * @param contactSequence allowed object is {@link String }
     */
    @JsonProperty("contactSequence")
    public void setContactSequence(String contactSequence) {
        this.contactSequence = contactSequence;
    }

    @JsonIgnore
    public boolean isEmptyObject() {
        return Stream.of(studentRefId, relationshipCode, restrictions, livesWith, primaryContactIndicator, emergencyContactIndicator, financialResponsibilityIndicator, custodialIndicator, communicationsIndicator, contactSequence).allMatch(Objects::isNull);
    }

    @Override
    public String toString() {
        return "Relationship{" + "studentRefId='" + studentRefId + '\'' + ", relationshipCode='" + relationshipCode + '\'' + ", restrictions='" + restrictions + '\'' + ", livesWith='" + livesWith + '\'' + ", primaryContactIndicator='" + primaryContactIndicator + '\'' + ", emergencyContactIndicator='" + emergencyContactIndicator + '\'' + ", financialResponsibilityIndicator='" + financialResponsibilityIndicator + '\'' + ", custodialIndicator='" + custodialIndicator + '\'' + ", communicationsIndicator='" + communicationsIndicator + '\'' + ", contactSequence='" + contactSequence + '\'' + '}';
    }
}
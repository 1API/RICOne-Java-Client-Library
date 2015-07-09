
package riconeapi.models.sifxpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * xCourse is a composite object that provides essential information about a course. The refId of a xCourse object coincides with the refId of a corresponding course object.
 * 
 * <p>Java class for xCourseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="xCourseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sifassociation.org/datamodel/na/3.2}gSIF_CompositeType">
 *       &lt;sequence>
 *         &lt;element name="schoolRefId" type="{http://www.sifassociation.org/datamodel/na/3.2}gRefIdPointerType"/>
 *         &lt;element name="schoolCourseId" type="{http://www.sifassociation.org/datamodel/na/3.2}xCourseIdType" minOccurs="0"/>
 *         &lt;element name="leaCourseId" type="{http://www.sifassociation.org/datamodel/na/3.2}xCourseIdType" minOccurs="0"/>
 *         &lt;element name="otherIds" type="{http://www.sifassociation.org/datamodel/na/3.2}xOtherCourseIdListType" minOccurs="0"/>
 *         &lt;element name="courseTitle" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="subject" type="{http://www.sifassociation.org/datamodel/na/3.2}xSubjectType" minOccurs="0"/>
 *         &lt;element name="applicableEducationLevels" type="{http://www.sifassociation.org/datamodel/na/3.2}xApplicableEducationLevelListType" minOccurs="0"/>
 *         &lt;element name="scedCourseCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="scedCourseLevelCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="scedCourseSubjectAreaCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xCourseType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "schoolRefId",
    "schoolCourseId",
    "leaCourseId",
    "otherIds",
    "courseTitle",
    "description",
    "subject",
    "applicableEducationLevels",
    "scedCourseCode",
    "scedCourseLevelCode",
    "scedCourseSubjectAreaCode"
})
public class XCourseType
    extends GSIFCompositeType
{
	public XCourseType()
    {
        refId = null;
        schoolRefId = null;
        schoolCourseId = null;
        leaCourseId = null;
        otherIds = new XOtherCourseIdListType();
        courseTitle = null;
        description = null;
        subject = null;
        applicableEducationLevels = new XApplicableEducationLevelListType();
        scedCourseCode = null;
        scedCourseLevelCode = null;
        scedCourseSubjectAreaCode = null;
    }

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String schoolRefId;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String schoolCourseId;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String leaCourseId;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected XOtherCourseIdListType otherIds;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String courseTitle;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String description;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String subject;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected XApplicableEducationLevelListType applicableEducationLevels;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String scedCourseCode;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String scedCourseLevelCode;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String scedCourseSubjectAreaCode;

    /**
     * Gets the value of the schoolRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchoolRefId() {
        return schoolRefId;
    }

    /**
     * Sets the value of the schoolRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchoolRefId(String value) {
        this.schoolRefId = value;
    }

    /**
     * Gets the value of the schoolCourseId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchoolCourseId() {
        return schoolCourseId;
    }

    /**
     * Sets the value of the schoolCourseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchoolCourseId(String value) {
        this.schoolCourseId = value;
    }

    /**
     * Gets the value of the leaCourseId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeaCourseId() {
        return leaCourseId;
    }

    /**
     * Sets the value of the leaCourseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeaCourseId(String value) {
        this.leaCourseId = value;
    }

    /**
     * Gets the value of the otherIds property.
     * 
     * @return
     *     possible object is
     *     {@link XOtherCourseIdListType }
     *     
     */
    public XOtherCourseIdListType getOtherIds() {
        return otherIds;
    }

    /**
     * Sets the value of the otherIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link XOtherCourseIdListType }
     *     
     */
    public void setOtherIds(XOtherCourseIdListType value) {
        this.otherIds = value;
    }

    /**
     * Gets the value of the courseTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourseTitle() {
        return courseTitle;
    }

    /**
     * Sets the value of the courseTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourseTitle(String value) {
        this.courseTitle = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the subject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Sets the value of the subject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubject(String value) {
        this.subject = value;
    }

    /**
     * Gets the value of the applicableEducationLevels property.
     * 
     * @return
     *     possible object is
     *     {@link XApplicableEducationLevelListType }
     *     
     */
    public XApplicableEducationLevelListType getApplicableEducationLevels() {
        return applicableEducationLevels;
    }

    /**
     * Sets the value of the applicableEducationLevels property.
     * 
     * @param value
     *     allowed object is
     *     {@link XApplicableEducationLevelListType }
     *     
     */
    public void setApplicableEducationLevels(XApplicableEducationLevelListType value) {
        this.applicableEducationLevels = value;
    }

    /**
     * Gets the value of the scedCourseCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScedCourseCode() {
        return scedCourseCode;
    }

    /**
     * Sets the value of the scedCourseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScedCourseCode(String value) {
        this.scedCourseCode = value;
    }

    /**
     * Gets the value of the scedCourseLevelCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScedCourseLevelCode() {
        return scedCourseLevelCode;
    }

    /**
     * Sets the value of the scedCourseLevelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScedCourseLevelCode(String value) {
        this.scedCourseLevelCode = value;
    }

    /**
     * Gets the value of the scedCourseSubjectAreaCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScedCourseSubjectAreaCode() {
        return scedCourseSubjectAreaCode;
    }

    /**
     * Sets the value of the scedCourseSubjectAreaCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScedCourseSubjectAreaCode(String value) {
        this.scedCourseSubjectAreaCode = value;
    }

}

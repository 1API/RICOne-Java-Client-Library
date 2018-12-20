
package riconeapi.models.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * xCalendar is a composite object that provides information about sessions held at a particular school during a given school year. The refId of a xCalendar object coincides with the refId of a corresponding schoolCalendar object.
 * 
 * <p>Java class for xCalendarType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="xCalendarType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sifassociation.org/datamodel/na/3.2}gSIF_CompositeType">
 *       &lt;sequence>
 *         &lt;element name="schoolRefId" type="{http://www.sifassociation.org/datamodel/na/3.2}gRefIdPointerType"/>
 *         &lt;element name="schoolYear" type="{http://www.sifassociation.org/datamodel/na/3.2}xSchoolYearType" minOccurs="0"/>
 *         &lt;element name="sessions" type="{http://www.sifassociation.org/datamodel/na/3.2}xSessionListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xCalendarType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "schoolRefId",
    "schoolYear",
    "sessions",
    "metadata"
})
public class XCalendarType
    extends GSIFCompositeType implements IType<XCalendarType>
{
	public XCalendarType()
    {
        refId = null;
        schoolRefId = null;
        schoolYear = null;
        sessions = new XSessionListType();
        metadata = new XMetadata();
    }

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String schoolRefId;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected XMLGregorianCalendar schoolYear;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected XSessionListType sessions;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected XMetadata metadata;

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
     * Gets the value of the schoolYear property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSchoolYear() {
        return schoolYear;
    }

    /**
     * Sets the value of the schoolYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSchoolYear(XMLGregorianCalendar value) {
        this.schoolYear = value;
    }

    /**
     * Gets the value of the sessions property.
     * 
     * @return
     *     possible object is
     *     {@link XSessionListType }
     *     
     */
    public XSessionListType getSessions() {
        return sessions;
    }

    /**
     * Sets the value of the sessions property.
     * 
     * @param value
     *     allowed object is
     *     {@link XSessionListType }
     *     
     */
    public void setSessions(XSessionListType value) {
        this.sessions = value;
    }

    public XMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(XMetadata metadata) {
        this.metadata = metadata;
    }

    @Override
    public XCalendarType getObject() {
        return this;
    }
}

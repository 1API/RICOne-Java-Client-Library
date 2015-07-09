
package riconeapi.models.sifxpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for xMeetingTimeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="xMeetingTimeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="timeTableDay" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="classMeetingDays" type="{http://www.sifassociation.org/datamodel/na/3.2}xDayListType" minOccurs="0"/>
 *         &lt;element name="timeTablePeriod" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="roomNumber" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="classBeginningTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;element name="classEndingTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xMeetingTimeType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "timeTableDay",
    "classMeetingDays",
    "timeTablePeriod",
    "roomNumber",
    "classBeginningTime",
    "classEndingTime"
})
public class XMeetingTimeType {

	public XMeetingTimeType()
    {
        timeTableDay = null;
        classMeetingDays = new XDayListType();
        timeTablePeriod = null;
        roomNumber = null;
        classBeginningTime = null;
        classEndingTime = null;

    }
	
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String timeTableDay;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected XDayListType classMeetingDays;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String timeTablePeriod;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String roomNumber;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar classBeginningTime;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar classEndingTime;

    /**
     * Gets the value of the timeTableDay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeTableDay() {
        return timeTableDay;
    }

    /**
     * Sets the value of the timeTableDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeTableDay(String value) {
        this.timeTableDay = value;
    }

    /**
     * Gets the value of the classMeetingDays property.
     * 
     * @return
     *     possible object is
     *     {@link XDayListType }
     *     
     */
    public XDayListType getClassMeetingDays() {
        return classMeetingDays;
    }

    /**
     * Sets the value of the classMeetingDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link XDayListType }
     *     
     */
    public void setClassMeetingDays(XDayListType value) {
        this.classMeetingDays = value;
    }

    /**
     * Gets the value of the timeTablePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeTablePeriod() {
        return timeTablePeriod;
    }

    /**
     * Sets the value of the timeTablePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeTablePeriod(String value) {
        this.timeTablePeriod = value;
    }

    /**
     * Gets the value of the roomNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomNumber() {
        return roomNumber;
    }

    /**
     * Sets the value of the roomNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomNumber(String value) {
        this.roomNumber = value;
    }

    /**
     * Gets the value of the classBeginningTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getClassBeginningTime() {
        return classBeginningTime;
    }

    /**
     * Sets the value of the classBeginningTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setClassBeginningTime(XMLGregorianCalendar value) {
        this.classBeginningTime = value;
    }

    /**
     * Gets the value of the classEndingTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getClassEndingTime() {
        return classEndingTime;
    }

    /**
     * Sets the value of the classEndingTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setClassEndingTime(XMLGregorianCalendar value) {
        this.classEndingTime = value;
    }

}

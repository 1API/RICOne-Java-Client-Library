
package riconeapi.models.sifxpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A list of days.
 * 
 * <p>Java class for xDayListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="xDayListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bellScheduleDay" type="{http://www.sifassociation.org/datamodel/na/3.2}xDayOfWeekType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xDayListType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "bellScheduleDay"
})
public class XDayListType {
	public XDayListType()
    {
        bellScheduleDay = null;
    }

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String bellScheduleDay;

    /**
     * Gets the value of the bellScheduleDay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBellScheduleDay() {
        return bellScheduleDay;
    }

    /**
     * Sets the value of the bellScheduleDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBellScheduleDay(String value) {
        this.bellScheduleDay = value;
    }

}

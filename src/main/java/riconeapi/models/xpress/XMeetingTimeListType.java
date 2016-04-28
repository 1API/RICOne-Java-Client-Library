
package riconeapi.models.xpress;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for xMeetingTimeListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="xMeetingTimeListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="meetingTime" type="{http://www.sifassociation.org/datamodel/na/3.2}xMeetingTimeType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xMeetingTimeListType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "meetingTime"
})
public class XMeetingTimeListType {

	 public XMeetingTimeListType()
     {
         meetingTime = new ArrayList<XMeetingTimeType>();
     }
	 
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected List<XMeetingTimeType> meetingTime;

    /**
     * Gets the value of the meetingTime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the meetingTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeetingTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XMeetingTimeType }
     * 
     * 
     */
    public List<XMeetingTimeType> getMeetingTime() {
        if (meetingTime == null) {
            meetingTime = new ArrayList<XMeetingTimeType>();
        }
        return this.meetingTime;
    }
	
	public void setMeetingTime(List<XMeetingTimeType> meetingTime)
	{
		this.meetingTime = meetingTime;
	}

}

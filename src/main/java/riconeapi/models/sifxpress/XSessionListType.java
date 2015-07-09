
package riconeapi.models.sifxpress;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A list of sessions.
 * 
 * <p>Java class for xSessionListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="xSessionListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sessionList" type="{http://www.sifassociation.org/datamodel/na/3.2}xSessionType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xSessionListType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "sessionList"
})
public class XSessionListType {

	public XSessionListType()
    {
        sessionList = new ArrayList<XSessionType>();
    }
	
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected List<XSessionType> sessionList;

    /**
     * Gets the value of the sessionList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sessionList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSessionList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XSessionType }
     * 
     * 
     */
    public List<XSessionType> getSessionList() {
        if (sessionList == null) {
            sessionList = new ArrayList<XSessionType>();
        }
        return this.sessionList;
    }

}

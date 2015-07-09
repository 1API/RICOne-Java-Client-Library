
package riconeapi.models.sifxpress;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A list of applicable education levels.
 * 
 * <p>Java class for xApplicableEducationLevelListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="xApplicableEducationLevelListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="applicableEducationLevel" type="{http://www.sifassociation.org/datamodel/na/3.2}xGradeLevelType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xApplicableEducationLevelListType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "applicableEducationLevel"
})
public class XApplicableEducationLevelListType {

	public XApplicableEducationLevelListType()
    {
        applicableEducationLevel = new ArrayList<String>();
    }
	
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected List<String> applicableEducationLevel;

    /**
     * Gets the value of the applicableEducationLevel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the applicableEducationLevel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplicableEducationLevel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getApplicableEducationLevel() {
        if (applicableEducationLevel == null) {
            applicableEducationLevel = new ArrayList<String>();
        }
        return this.applicableEducationLevel;
    }

}

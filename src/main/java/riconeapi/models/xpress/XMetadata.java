package riconeapi.models.xpress;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "metadata", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
        "schoolYear",
        "lastModified"
})
public class XMetadata {
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String schoolYear;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastModified;

    public String getSchoolYear() {
        return schoolYear;
    }

    public void setSchoolYear(String schoolYear) {
        this.schoolYear = schoolYear;
    }

    public XMLGregorianCalendar getLastModified() {
        return lastModified;
    }

    public void setLastModified(XMLGregorianCalendar lastModified) {
        this.lastModified = lastModified;
    }
}

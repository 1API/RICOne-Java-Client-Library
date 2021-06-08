package riconeapi.library.client.response.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import riconeapi.library.client.common.Model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * <p>Java class for xEmployments complex type.</p>
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"xEmployment"})
@JsonRootName(value = "xEmployments")
@JacksonXmlRootElement(localName = "xEmployments")
public class XEmployments extends Model implements Serializable {
    private final static long serialVersionUID = -6300993418262917168L;
    @JsonProperty("xEmployment")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<XEmployment> xEmployments;

    public XEmployments() { xEmployments = new ArrayList<>(); }

    public XEmployments(List<XEmployment> xEmployments) {
        super();
        this.xEmployments = xEmployments;
    }

    /**
     * <p>Gets the value of the xEmployment property.</p>
     *
     * @return object of {@link XEmployment }
     */
    @JsonProperty("xEmployment")
    @JacksonXmlElementWrapper(useWrapping = false)
    public List<XEmployment> getXEmployments() {
        return xEmployments;
    }

    /**
     * <p>Sets the value of the xCalendar property.</p>
     *
     * @param xEmployments allowed object is {@link XEmployment }
     */
    @JsonProperty("xEmployment")
    @JacksonXmlElementWrapper(useWrapping = false)
    public void setXEmployments(List<XEmployment> xEmployments) {
        this.xEmployments = xEmployments;
    }

    @Override
    public boolean isEmpty() {
        return xEmployments.isEmpty();
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        XEmployments that = (XEmployments) o;
        return Objects.equals(xEmployments, that.xEmployments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xEmployments);
    }

    @Override
    public String toString() {
        return "XEmployments{" +
            "xEmployments=" + xEmployments +
            "} " + super.toString();
    }
}
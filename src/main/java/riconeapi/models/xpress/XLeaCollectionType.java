package riconeapi.models.xpress;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "xLea"
})

@JsonIgnoreProperties(ignoreUnknown = true)
public class XLeaCollectionType
{
    @JacksonXmlElementWrapper(localName = "xLea", useWrapping = false)
//    @JacksonXmlProperty(localName = "xLea")
    @JsonProperty("xLea")
    private List<XLeaType> xLea = new ArrayList<XLeaType>();

    public XLeaCollectionType() {
    }

    public XLeaCollectionType(List<XLeaType> xLea) {
        super();
        this.xLea = xLea;
    }

    @JacksonXmlElementWrapper(localName = "xLea", useWrapping = false)
//    @JacksonXmlProperty(localName = "xLea")
    @JsonProperty("xLea")
    public List<XLeaType> getXLea() {
        return xLea;
    }

    @JacksonXmlElementWrapper(localName = "xLea", useWrapping = false)
//    @JacksonXmlProperty(localName = "xLea")
    @JsonProperty("xLea")
    public void setxLea(List<XLeaType> xLea) {
        this.xLea = xLea;
    }

    @Override public String toString()
    {
        return "XLeaCollectionType{" + "xLea=" + xLea + '}';
    }
}

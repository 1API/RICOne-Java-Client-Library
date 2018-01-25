package riconeapi.models.xpress;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "xLea"
})

//@JsonIgnoreProperties(ignoreUnknown = true)
@JsonRootName(value = "xLeas") // WHY DID THIS WORK?!?!?!??!
public class XLeaCollectionType
{
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("xLea")
    private List<XLeaType> xLea = new ArrayList<XLeaType>();

    public XLeaCollectionType() {
    }

    public XLeaCollectionType(List<XLeaType> xLea) {
        super();
        this.xLea = xLea;
    }

    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("xLea")
    public List<XLeaType> getXLea() {
        return xLea;
    }

    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("xLea")
    public void setxLea(List<XLeaType> xLea) {
        this.xLea = xLea;
    }

    @Override public String toString()
    {
        return "XLeaCollectionType{" + "xLea=" + xLea + '}';
    }
}

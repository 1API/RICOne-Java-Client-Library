package riconeapi.models.xpress;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "xLea"
})
@JsonRootName(value = "xLeas")
public class XLeaCollectionType
{
    @JsonProperty("xLea")
    private List<XLeaType> xLea = new ArrayList<XLeaType>();

    public XLeaCollectionType() {
    }

    public XLeaCollectionType(List<XLeaType> xLea) {
        super();
        this.xLea = xLea;
    }

    @JsonProperty("xLea")
    public List<XLeaType> getXLea() {
        return xLea;
    }

    @JsonProperty("xLea")
    public void setxLea(List<XLeaType> xLea) {
        this.xLea = xLea;
    }

    @Override public String toString()
    {
        return "XLeaCollectionType{" + "xLea=" + xLea + '}';
    }
}

package riconeapi.models.xpress;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "xLeas"
})
@JsonIgnoreProperties(ignoreUnknown = true)
@JacksonXmlRootElement(localName = "xLeas", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
@JsonRootName("xLeas")
public class XLeaCollectionTypeResponse
{
    @JacksonXmlElementWrapper(localName = "xLeas", useWrapping = false)
//    @JacksonXmlProperty(localName = "xLeas")
    @JsonProperty("xLeas")
    private XLeaCollectionType xLeas;

    public XLeaCollectionTypeResponse() {
    }

    public XLeaCollectionTypeResponse(XLeaCollectionType xLeas) {
        super();
        this.xLeas = xLeas;
    }

    @JacksonXmlElementWrapper(localName = "xLeas", useWrapping = false)
//    @JacksonXmlProperty(localName = "xLeas")
    @JsonProperty("xLeas")
    public XLeaCollectionType getXLeas() {
        return xLeas;
    }

    @JacksonXmlElementWrapper(localName = "xLeas", useWrapping = false)
//    @JacksonXmlProperty(localName = "xLeas")
    @JsonProperty("xLeas")
    public void setxLeas(XLeaCollectionType xLeas) {
        this.xLeas = xLeas;
    }

    @Override public String toString()
    {
        return "XLeaCollectionTypeResponse{" + "xLeas=" + xLeas + '}';
    }
}

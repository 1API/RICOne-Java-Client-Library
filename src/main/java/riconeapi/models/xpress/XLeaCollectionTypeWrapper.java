package riconeapi.models.xpress;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "xLeas"
})
public class XLeaCollectionTypeWrapper
{
    @JsonProperty("xLeas")
    private XLeaCollectionType xLeas;

    public XLeaCollectionTypeWrapper() {
    }

    public XLeaCollectionTypeWrapper(XLeaCollectionType xLeas) {
        super();
        this.xLeas = xLeas;
    }

    @JsonProperty("xLeas")
    public XLeaCollectionType getXLeas() {
        return xLeas;
    }

    @JsonProperty("xLeas")
    public void setxLeas(XLeaCollectionType xLeas) {
        this.xLeas = xLeas;
    }

    @Override public String toString()
    {
        return "XLeaCollectionTypeWrapper{" + "xLeas=" + xLeas + '}';
    }
}

package riconeapi.models.xpress;

import com.fasterxml.jackson.annotation.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder({
        "xLea"
})
public class XLeaTypeWrapper
{
    @JsonProperty("xLea")
    private XLeaType xLea;

    public XLeaTypeWrapper() {
    }

    public XLeaTypeWrapper(XLeaType xLea) {
        super();
        this.xLea = xLea;
    }

    @JsonProperty("xLea")
    public XLeaType getXLea() {
        return xLea;
    }

    @JsonProperty("xLea")
    public void setXLea(XLeaType xLea) {
        this.xLea = xLea;
    }

    @Override
    public String toString() {
        return "XLeaTypeWrapper{" +
                "xLea=" + xLea +
                '}';
    }
}
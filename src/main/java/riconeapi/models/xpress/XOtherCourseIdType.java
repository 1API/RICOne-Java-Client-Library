
package riconeapi.models.xpress;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "type",
        "id"
})
public class XOtherCourseIdType {

    @JsonProperty("type")
    private String type;
    @JsonProperty("id")
    private String id;

    public XOtherCourseIdType() {
    }

    public XOtherCourseIdType(String type, String id) {
        super();
        this.type = type;
        this.id = id;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @Override public String toString()
    {
        return "XOtherCourseIdType{" + "type='" + type + '\'' + ", id='" + id + '\'' + '}';
    }
}

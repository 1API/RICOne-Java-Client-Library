package riconeapi.library.client.response.model;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.stream.Stream;

/**
 * <p>Java class for xOtherPersonIdType complex type.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"type", "id"})
public class OtherId {
    @JsonProperty("type")
    @JacksonXmlProperty(localName = "type", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private String type;

    @JsonProperty("id")
    @JacksonXmlProperty(localName = "id", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private String id;

    public OtherId() { }

    public OtherId(String type, String id) {
        super();
        this.type = type;
        this.id = id;
    }

    /**
     * <p>Gets the value of the type property.</p>
     * <p>A coding scheme that is used for identification and record-keeping purposes by schools, social services, or other agencies to refer to a student.</p>
     *
     * @return possible object is {@link String }
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * <p>Sets the value of the type property.</p>
     * <p>A coding scheme that is used for identification and record-keeping purposes by schools, social services, or other agencies to refer to a student.</p>
     *
     * @param type allowed object is {@link String }
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>Gets the value of the id property.</p>
     * <p>A unique number or alphanumeric code assigned to a student by a school, school system, a state, or other agency or entity.</p>
     *
     * @return possible object is {@link String }
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * <p>Sets the value of the id property.</p>
     * <p>A unique number or alphanumeric code assigned to a student by a school, school system, a state, or other agency or entity.</p>
     *
     * @param id allowed object is {@link String }
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonIgnore
    public boolean isEmptyObject() {
        return Stream.of(type, id).allMatch(Objects::isNull);
    }

    @Override
    public String toString() {
        return "OtherId{" + "type='" + type + '\'' + ", id='" + id + '\'' + '}';
    }
}
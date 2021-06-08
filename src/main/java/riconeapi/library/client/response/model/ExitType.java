package riconeapi.library.client.response.model;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

/**
 * <p>Java class for xOtherCodeListType complex type.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({"code", "otherCode"})
public class ExitType {
    @JsonProperty("code")
    @JacksonXmlProperty(localName = "code", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private String code;

    @JsonProperty("otherCode")
    @JacksonXmlProperty(localName = "otherCode", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private List<OtherCode> otherCode;

    public ExitType() {
        otherCode = new ArrayList<>();
    }

    public ExitType(String code, List<OtherCode> otherCode) {
        super();
        this.code = code;
        this.otherCode = otherCode;
    }

    /**
     * <p>Gets the value of the code property.</p>
     * <p>The type of exit code for an enrollment.</p>
     *
     * @return possible object is {@link String }
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * <p>Sets the value of the code property.</p>
     * <p>The type of exit code for an enrollment.</p>
     *
     * @param code allowed object is {@link String }
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * <p>Gets the value of the otherCode property.</p>
     * <p>A list of other exit codes for an enrollment.</p>
     *
     * @return possible object is {@link OtherCode }
     */
    @JsonProperty("otherCode")
    public List<OtherCode> getOtherCode() {
        return otherCode;
    }

    /**
     * <p>Sets the value of the otherCode property.</p>
     * <p>A list of other exit codes for an enrollment.</p>
     *
     * @param otherCode allowed object is {@link OtherCode }
     */
    @JsonProperty("otherCode")
    public void setOtherCode(List<OtherCode> otherCode) {
        this.otherCode = otherCode;
    }

    @JsonIgnore
    public boolean isEmptyObject() {
        return Stream.of(code, otherCode).allMatch(Objects::isNull) || (code.isEmpty() && otherCode.isEmpty());
    }

    @Override
    public String toString() {
        return "ExitType{" + "code='" + code + '\'' + ", otherCode=" + otherCode + '}';
    }
}
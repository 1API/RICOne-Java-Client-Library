
package riconeapi.models.xpress;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder({
        "refId",
        "localId",
        "givenName",
        "familyName"
})

public class XPersonReferenceType {

    @JsonProperty("refId")
    private String refId;
    @JsonProperty("localId")
    private String localId;
    @JsonProperty("givenName")
    private String givenName;
    @JsonProperty("familyName")
    private String familyName;

    public XPersonReferenceType() {
    }

    public XPersonReferenceType(String refId, String localId, String givenName, String familyName) {
        super();
        this.refId = refId;
        this.localId = localId;
        this.givenName = givenName;
        this.familyName = familyName;
    }

    @JsonProperty("refId")
    public String getRefId() {
        return refId;
    }

    @JsonProperty("refId")
    public void setRefId(String refId) {
        this.refId = refId;
    }

    @JsonProperty("localId")
    public String getLocalId() {
        return localId;
    }

    @JsonProperty("localId")
    public void setLocalId(String localId) {
        this.localId = localId;
    }

    @JsonProperty("givenName")
    public String getGivenName() {
        return givenName;
    }

    @JsonProperty("givenName")
    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    @JsonProperty("familyName")
    public String getFamilyName() {
        return familyName;
    }

    @JsonProperty("familyName")
    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    @Override public String toString()
    {
        return "XPersonReferenceType{" + "refId='" + refId + '\'' + ", localId='" + localId + '\'' + ", givenName='" + givenName + '\'' + ", familyName='" + familyName + '\'' + '}';
    }
}
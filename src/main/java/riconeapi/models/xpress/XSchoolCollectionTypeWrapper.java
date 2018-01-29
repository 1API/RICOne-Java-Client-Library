package riconeapi.models.xpress;

import com.fasterxml.jackson.annotation.*;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"xSchools"
})
public class XSchoolCollectionTypeWrapper {

	@JsonProperty("xSchools")
	private XSchoolCollectionType xSchools;

	public XSchoolCollectionTypeWrapper() {
	}

	public XSchoolCollectionTypeWrapper(XSchoolCollectionType xSchools) {
	super();
	this.xSchools = xSchools;
	}

	@JsonProperty("xSchools")
	public XSchoolCollectionType getXSchools() {
	return xSchools;
	}

	@JsonProperty("xSchools")
	public void setXSchools(XSchoolCollectionType xSchools) {
	this.xSchools = xSchools;
	}

	@Override public String toString()
	{
		return "XSchoolCollectionTypeWrapper{" + "xSchools=" + xSchools + '}';
	}
}
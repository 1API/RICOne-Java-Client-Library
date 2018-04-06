package riconeapi.models.xpress;

import com.fasterxml.jackson.annotation.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder({
		"xSchool"
})
public class XSchoolTypeWrapper
{
	@JsonProperty("xSchool")
	private XSchoolType xSchool;

	public XSchoolTypeWrapper()
	{
	}

	public XSchoolTypeWrapper(XSchoolType xSchool)
	{
		super();
		this.xSchool = xSchool;
	}

	@JsonProperty("xSchool")
	public XSchoolType getxSchool()
	{
		return xSchool;
	}

	@JsonProperty("xSchool")
	public void setxSchool(XSchoolType xSchool)
	{
		this.xSchool = xSchool;
	}

	@Override public String toString()
	{
		return "XSchoolTypeWrapper{" + "xSchool=" + xSchool + '}';
	}
}

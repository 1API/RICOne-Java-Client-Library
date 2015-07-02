package riconeapi.models.authentication;

import java.io.Serializable;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class UserInfo implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String id;
	private String user_name;
	private String token;
	private List<Endpoint> endpoint;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public List<Endpoint> getEndpoint() {
		return endpoint;
	}
	public void setEndpoint(List<Endpoint> endpoint) {
		this.endpoint = endpoint;
	}
	
	
}

/**
 * @author      Andrew Pieniezny <andrew.pieniezny@neric.org>
 * @version     1.1.1
 * @since       Sep 10, 2015
 * Filename		Endpoint.java
 */
package riconeapi.models.authentication;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Endpoint type contatins enpoint name, href, and token
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Endpoint implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@JsonProperty("name")
	private String name;
	@JsonProperty("href")
	private String href;
	@JsonProperty("provider_id")
	private String providerId;
	@JsonProperty("token")
	private String token;

	/**
	* 
	* @return
	* The name
	*/
	@JsonProperty("name")
	public String getName() {
	return name;
	}

	/**
	* 
	* @param name
	* The name
	*/
	@JsonProperty("name")
	public void setName(String name) {
	this.name = name;
	}

	/**
	* 
	* @return
	* The href
	*/
	@JsonProperty("href")
	public String getHref() {
	return href;
	}

	/**
	* 
	* @param href
	* The href
	*/
	@JsonProperty("href")
	public void setHref(String href) {
	this.href = href;
	}

	/**
	* 
	* @return
	* The providerId
	*/
	@JsonProperty("provider_id")
	public String getProviderId() {
	return providerId;
	}

	/**
	* 
	* @param providerId
	* The provider_id
	*/
	@JsonProperty("provider_id")
	public void setProviderId(String providerId) {
	this.providerId = providerId;
	}

	/**
	* 
	* @return
	* The token
	*/
	@JsonProperty("token")
	public String getToken() {
	return token;
	}

	/**
	* 
	* @param token
	* The token
	*/
	@JsonProperty("token")
	public void setToken(String token) {
	this.token = token;
	}

}

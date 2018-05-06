package hello;


import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Data implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@JsonProperty("API_ORIGIN")
	private String apiOrigin;

	public String getApiOrigin() {
		return apiOrigin;
	}

	public void setApiOrigin(String apiOrigin) {
		this.apiOrigin = apiOrigin;
	}
	
	
	
	
}

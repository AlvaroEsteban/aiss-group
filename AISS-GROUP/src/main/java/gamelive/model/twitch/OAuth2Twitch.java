package gamelive.model.twitch;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
 "access_token",
 "refresh_token",
 "expires_in",
 "scope"
})
public class OAuth2Twitch {
	@JsonProperty("access_token")
	private String accessToken;
	@JsonProperty("refresh_token")
	private String refreshToken;
	@JsonProperty("expires_in")
	private Integer expiresIn;
	@JsonProperty("scope")
	private List<String> scope;
	@JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	
	@JsonProperty("access_token")
	public String getAccessToken() {
		return accessToken;
	}
	@JsonProperty("access_token")
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}
	@JsonProperty("refresh_token")
	public String getRefreshToken() {
		return refreshToken;
	}
	@JsonProperty("refresh_token")
	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}
	@JsonProperty("expires_in")
	public Integer getExpiresIn() {
		return expiresIn;
	}
	@JsonProperty("expires_in")
	public void setExpiresIn(Integer expiresIn) {
		this.expiresIn = expiresIn;
	}
	@JsonProperty("scope")
	public List<String> getScope() {
		return scope;
	}
	@JsonProperty("scope")
	public void setScope(List<String> scope) {
		this.scope = scope;
	}
	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return additionalProperties;
	}
	@JsonAnySetter
	public void setAdditionalProperties(Map<String, Object> additionalProperties) {
		this.additionalProperties = additionalProperties;
	}
	
	
	
}

package gamelive.model.giantbomb;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "api_detail_url",
    "id",
    "name",
    "site_detail_url",
    
})
public class General {
	@JsonProperty("api_detail_url")
	private String apiDetailUrl;
	@JsonProperty("id")
	private Integer id;
	@JsonProperty("name")
	private String name;
	@JsonProperty("site_detail_url")
	private String siteDetailUrl;
	@JsonIgnore
	Map<String,Object> additionalProperties = new HashMap<String, Object>();
	
	@JsonProperty("api_detail_url")
	public String getApiDetailUrl() {
		return apiDetailUrl;
	}
	@JsonProperty("api_detail_url")
	public void setApiDetailUrl(String apiDetailUrl) {
		this.apiDetailUrl = apiDetailUrl;
	}
	@JsonProperty("id")
	public Integer getId() {
		return id;
	}
	@JsonProperty("id")
	public void setId(Integer id) {
		this.id = id;
	}
	@JsonProperty("name")
	public String getName() {
		return name;
	}
	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}
	@JsonProperty("site_detail_url")
	public String getSiteDetailUrl() {
		return siteDetailUrl;
	}
	@JsonProperty("site_detail_url")
	public void setSiteDetailUrl(String siteDetailUrl) {
		this.siteDetailUrl = siteDetailUrl;
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

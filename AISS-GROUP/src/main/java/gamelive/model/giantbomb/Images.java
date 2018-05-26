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
    "icon_url",
    "medium_url",
    "screen_url",
    "small_url",
    "super_url",
    "thumb_url",
    "tiny_url",
    "original",
    "tags"
})
public class Images {
	 @JsonProperty("icon_url")
	    private String iconUrl;
	    @JsonProperty("medium_url")
	    private String mediumUrl;
	    @JsonProperty("screen_url")
	    private String screenUrl;
	    @JsonProperty("small_url")
	    private String smallUrl;
	    @JsonProperty("super_url")
	    private String superUrl;
	    @JsonProperty("thumb_url")
	    private String thumbUrl;
	    @JsonProperty("tiny_url")
	    private String tinyUrl;
	    @JsonProperty("original")
	    private String original;
	    @JsonProperty("tags")
	    private String tags;
	    @JsonIgnore
	    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	    
	    @JsonProperty("icon_url")
	    public String getIconUrl() {
	        return iconUrl;
	    }

	    @JsonProperty("icon_url")
	    public void setIconUrl(String iconUrl) {
	        this.iconUrl = iconUrl;
	    }

	    @JsonProperty("medium_url")
	    public String getMediumUrl() {
	        return mediumUrl;
	    }

	    @JsonProperty("medium_url")
	    public void setMediumUrl(String mediumUrl) {
	        this.mediumUrl = mediumUrl;
	    }

	    @JsonProperty("screen_url")
	    public String getScreenUrl() {
	        return screenUrl;
	    }

	    @JsonProperty("screen_url")
	    public void setScreenUrl(String screenUrl) {
	        this.screenUrl = screenUrl;
	    }

	    @JsonProperty("small_url")
	    public String getSmallUrl() {
	        return smallUrl;
	    }

	    @JsonProperty("small_url")
	    public void setSmallUrl(String smallUrl) {
	        this.smallUrl = smallUrl;
	    }

	    @JsonProperty("super_url")
	    public String getSuperUrl() {
	        return superUrl;
	    }

	    @JsonProperty("super_url")
	    public void setSuperUrl(String superUrl) {
	        this.superUrl = superUrl;
	    }

	    @JsonProperty("thumb_url")
	    public String getThumbUrl() {
	        return thumbUrl;
	    }

	    @JsonProperty("thumb_url")
	    public void setThumbUrl(String thumbUrl) {
	        this.thumbUrl = thumbUrl;
	    }

	    @JsonProperty("tiny_url")
	    public String getTinyUrl() {
	        return tinyUrl;
	    }

	    @JsonProperty("tiny_url")
	    public void setTinyUrl(String tinyUrl) {
	        this.tinyUrl = tinyUrl;
	    }

	    @JsonProperty("original")
	    public String getOriginal() {
	        return original;
	    }

	    @JsonProperty("original")
	    public void setOriginal(String original) {
	        this.original = original;
	    }

	    @JsonProperty("tags")
	    public String getTags() {
	        return tags;
	    }

	    @JsonProperty("tags")
	    public void setTags(String tags) {
	        this.tags = tags;
	    }

	    @JsonAnyGetter
	    public Map<String, Object> getAdditionalProperties() {
	        return this.additionalProperties;
	    }

	    @JsonAnySetter
	    public void setAdditionalProperty(String name, Object value) {
	        this.additionalProperties.put(name, value);
	    }
}

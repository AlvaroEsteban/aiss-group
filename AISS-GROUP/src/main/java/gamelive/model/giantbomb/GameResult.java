package gamelive.model.giantbomb;

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
    "aliases",
    "api_detail_url",
    "date_added",
    "date_last_updated",
    "deck",
    "description",
    "expected_release_day",
    "expected_release_month",
    "expected_release_quarter",
    "expected_release_year",
    "guid",
    "id",
    "image",
    "image_tags",
    "name",
    "number_of_user_reviews",
    "original_game_rating",
    "original_release_date",
    "platforms",
    "site_detail_url",
    "images",
    "videos",
    "characters",
    "concepts",
    "developers",
    "first_appearance_characters",
    "first_appearance_concepts",
    "first_appearance_locations",
    "first_appearance_objects",
    "first_appearance_people",
    "franchises",
    "genres",
    "killed_characters",
    "locations",
    "objects",
    "people",
    "publishers",
    "releases",
    "dlcs",
    "similar_games",
    "themes"
})
public class GameResult {
	 @JsonProperty("aliases")
	    private String aliases;
	    @JsonProperty("api_detail_url")
	    private String apiDetailUrl;
	    @JsonProperty("date_added")
	    private String dateAdded;
	    @JsonProperty("date_last_updated")
	    private String dateLastUpdated;
	    @JsonProperty("deck")
	    private String deck;
	    @JsonProperty("description")
	    private String description;
	    @JsonProperty("expected_release_day")
	    private Object expectedReleaseDay;
	    @JsonProperty("expected_release_month")
	    private Object expectedReleaseMonth;
	    @JsonProperty("expected_release_quarter")
	    private Object expectedReleaseQuarter;
	    @JsonProperty("expected_release_year")
	    private Object expectedReleaseYear;
	    @JsonProperty("guid")
	    private String guid;
	    @JsonProperty("id")
	    private Integer id;
	    @JsonProperty("image")
	    private Image image;
	    @JsonProperty("image_tags")
	    private List<ImageTag> imageTags = null;
	    @JsonProperty("name")
	    private String name;
	    @JsonProperty("number_of_user_reviews")
	    private Integer numberOfUserReviews;
	    @JsonProperty("original_game_rating")
	    private List<OriginalGameRating> originalGameRating = null;
	    @JsonProperty("original_release_date")
	    private String originalReleaseDate;
	    @JsonProperty("platforms")
	    private List<Platform> platforms = null;
	    @JsonProperty("site_detail_url")
	    private String siteDetailUrl;
	    @JsonProperty("images")
	    private List<Images> images;
	    @JsonProperty("videos")
	    private List<General> videos;
	    @JsonProperty("characters")
	    private List<General> characters;
	    @JsonProperty("concepts")
	    private List<General> concepts;
	    @JsonProperty("developers")
	    private List<General> developers;
	    @JsonProperty("first_appearance_characters")
	    private List<General> firstAppearanceCharacters;
	    @JsonProperty("first_appearance_concepts")
	    private List<General> firstAppearanceConcepts;
	    @JsonProperty("first_appearance_locations")
	    private List<General> firstAppearanceLocations;
	    @JsonProperty("first_appearance_objects")
	    private List<General> firstAppearanceObjects;
	    @JsonProperty("first_appearance_people")
	    private List<General> firstAppearancePeople;
	    @JsonProperty("franchises")
	    private List<General> franchises;
	    @JsonProperty("genres")
	    private List<General> genres;
	    @JsonProperty("killed_characters")
	    private List<General> killedCharacters;
	    @JsonProperty("locations")
	    private List<General> locations;
	    @JsonProperty("objects")
	    private List<General> objects;
	    @JsonProperty("people")
	    private List<General> people;
	    @JsonProperty("publishers")
	    private List<General> publishers;
	    @JsonProperty("releases")
	    private List<General> releases;
	    @JsonProperty("dlcs")
	    private List<General> dlcs;
	    @JsonProperty("similar_games")
	    private List<General> similarGames;
	    @JsonProperty("themes")
	    private List<General> themes;
	    @JsonIgnore
	    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	    
	    @JsonProperty("aliases")
		public String getAliases() {
			return aliases;
		}
	    @JsonProperty("aliases")
		public void setAliases(String aliases) {
			this.aliases = aliases;
		}
	    @JsonProperty("api_detail_url")
		public String getApiDetailUrl() {
			return apiDetailUrl;
		}
	    @JsonProperty("api_detail_url")
		public void setApiDetailUrl(String apiDetailUrl) {
			this.apiDetailUrl = apiDetailUrl;
		}
	    @JsonProperty("date_added")
		public String getDateAdded() {
			return dateAdded;
		}
	    @JsonProperty("date_added")
		public void setDateAdded(String dateAdded) {
			this.dateAdded = dateAdded;
		}
	    @JsonProperty("date_last_updated")
		public String getDateLastUpdated() {
			return dateLastUpdated;
		}
	    @JsonProperty("date_last_updated")
		public void setDateLastUpdated(String dateLastUpdated) {
			this.dateLastUpdated = dateLastUpdated;
		}
	    @JsonProperty("deck")
		public String getDeck() {
			return deck;
		}
	    @JsonProperty("deck")
		public void setDeck(String deck) {
			this.deck = deck;
		}
	    @JsonProperty("description")
		public String getDescription() {
			return description;
		}
	    @JsonProperty("description")
		public void setDescription(String description) {
			this.description = description;
		}
	    @JsonProperty("expected_release_day")
		public Object getExpectedReleaseDay() {
			return expectedReleaseDay;
		}
	    @JsonProperty("expected_release_day")
		public void setExpectedReleaseDay(Object expectedReleaseDay) {
			this.expectedReleaseDay = expectedReleaseDay;
		}
	    @JsonProperty("expected_release_month")
		public Object getExpectedReleaseMonth() {
			return expectedReleaseMonth;
		}
	    @JsonProperty("expected_release_month")
		public void setExpectedReleaseMonth(Object expectedReleaseMonth) {
			this.expectedReleaseMonth = expectedReleaseMonth;
		}
	    @JsonProperty("expected_release_quarter")
		public Object getExpectedReleaseQuarter() {
			return expectedReleaseQuarter;
		}
	    @JsonProperty("expected_release_quarter")
		public void setExpectedReleaseQuarter(Object expectedReleaseQuarter) {
			this.expectedReleaseQuarter = expectedReleaseQuarter;
		}
	    @JsonProperty("expected_release_year")
		public Object getExpectedReleaseYear() {
			return expectedReleaseYear;
		}
	    @JsonProperty("expected_release_year")
		public void setExpectedReleaseYear(Object expectedReleaseYear) {
			this.expectedReleaseYear = expectedReleaseYear;
		}
	    @JsonProperty("guid")
		public String getGuid() {
			return guid;
		}
	    @JsonProperty("guid")
		public void setGuid(String guid) {
			this.guid = guid;
		}
	    @JsonProperty("id")
		public Integer getId() {
			return id;
		}
	    @JsonProperty("id")
		public void setId(Integer id) {
			this.id = id;
		}
	    @JsonProperty("image")
		public Image getImage() {
			return image;
		}
	    @JsonProperty("image")
		public void setImage(Image image) {
			this.image = image;
		}
	    @JsonProperty("image_tags")
		public List<ImageTag> getImageTags() {
			return imageTags;
		}
	    @JsonProperty("image_tags")
		public void setImageTags(List<ImageTag> imageTags) {
			this.imageTags = imageTags;
		}
	    @JsonProperty("name")
		public String getName() {
			return name;
		}
	    @JsonProperty("name")
		public void setName(String name) {
			this.name = name;
		}
	    @JsonProperty("number_of_user_reviews")
		public Integer getNumberOfUserReviews() {
			return numberOfUserReviews;
		}
	    @JsonProperty("number_of_user_reviews")
		public void setNumberOfUserReviews(Integer numberOfUserReviews) {
			this.numberOfUserReviews = numberOfUserReviews;
		}
	    @JsonProperty("original_game_rating")
		public List<OriginalGameRating> getOriginalGameRating() {
			return originalGameRating;
		}
	    @JsonProperty("original_game_rating")
		public void setOriginalGameRating(List<OriginalGameRating> originalGameRating) {
			this.originalGameRating = originalGameRating;
		}
	    @JsonProperty("original_release_date")
		public String getOriginalReleaseDate() {
			return originalReleaseDate;
		}
	    @JsonProperty("original_release_date")
		public void setOriginalReleaseDate(String originalReleaseDate) {
			this.originalReleaseDate = originalReleaseDate;
		}
	    @JsonProperty("platforms")
		public List<Platform> getPlatforms() {
			return platforms;
		}
	    @JsonProperty("platforms")
		public void setPlatforms(List<Platform> platforms) {
			this.platforms = platforms;
		}
	    @JsonProperty("site_detail_url")
		public String getSiteDetailUrl() {
			return siteDetailUrl;
		}
	    @JsonProperty("site_detail_url")
		public void setSiteDetailUrl(String siteDetailUrl) {
			this.siteDetailUrl = siteDetailUrl;
		}
	    @JsonProperty("images")
		public List<Images> getImages() {
			return images;
		}
	    @JsonProperty("images")
		public void setImages(List<Images> images) {
			this.images = images;
		}
	    @JsonProperty("videos")
		public List<General> getVideos() {
			return videos;
		}
	    @JsonProperty("videos")
		public void setVideos(List<General> videos) {
			this.videos = videos;
		}
	    @JsonProperty("characters")
		public List<General> getCharacters() {
			return characters;
		}
	    @JsonProperty("characters")
		public void setCharacters(List<General> characters) {
			this.characters = characters;
		}
	    @JsonProperty("concepts")
		public List<General> getConcepts() {
			return concepts;
		}
	    @JsonProperty("concepts")
		public void setConcepts(List<General> concepts) {
			this.concepts = concepts;
		}
	    @JsonProperty("developers")
		public List<General> getDevelopers() {
			return developers;
		}
	    @JsonProperty("developers")
		public void setDevelopers(List<General> developers) {
			this.developers = developers;
		}
	    @JsonProperty("first_appearance_characters")
		public List<General> getFirstAppearanceCharacters() {
			return firstAppearanceCharacters;
		}
	    @JsonProperty("first_appearance_characters")
		public void setFirstAppearanceCharacters(List<General> firstAppearanceCharacters) {
			this.firstAppearanceCharacters = firstAppearanceCharacters;
		}
	    @JsonProperty("first_appearance_concepts")
		public List<General> getFirstAppearanceConcepts() {
			return firstAppearanceConcepts;
		}
	    @JsonProperty("first_appearance_concepts")
		public void setFirstAppearanceConcepts(List<General> firstAppearanceConcepts) {
			this.firstAppearanceConcepts = firstAppearanceConcepts;
		}
	    @JsonProperty("first_appearance_locations")
		public List<General> getFirstAppearanceLocations() {
			return firstAppearanceLocations;
		}
	    @JsonProperty("first_appearance_locations")
		public void setFirstAppearanceLocations(List<General> firstAppearanceLocations) {
			this.firstAppearanceLocations = firstAppearanceLocations;
		}
	    @JsonProperty("first_appearance_objects")
		public List<General> getFirstAppearanceObjects() {
			return firstAppearanceObjects;
		}
	    @JsonProperty("first_appearance_objects")
		public void setFirstAppearanceObjects(List<General> firstAppearanceObjects) {
			this.firstAppearanceObjects = firstAppearanceObjects;
		}
	    @JsonProperty("first_appearance_people")
		public List<General> getFirstAppearancePeople() {
			return firstAppearancePeople;
		}
	    @JsonProperty("first_appearance_people")
		public void setFirstAppearancePeople(List<General> firstAppearancePeople) {
			this.firstAppearancePeople = firstAppearancePeople;
		}
	    @JsonProperty("franchises")
		public List<General> getFranchises() {
			return franchises;
		}
	    @JsonProperty("franchises")
		public void setFranchises(List<General> franchises) {
			this.franchises = franchises;
		}
	    @JsonProperty("genres")
		public List<General> getGenres() {
			return genres;
		}
	    @JsonProperty("genres")
		public void setGenres(List<General> genres) {
			this.genres = genres;
		}
	    @JsonProperty("killed_characters")
		public List<General> getKilledCharacters() {
			return killedCharacters;
		}
	    @JsonProperty("killed_characters")
		public void setKilledCharacters(List<General> killedCharacters) {
			this.killedCharacters = killedCharacters;
		}
	    @JsonProperty("locations")
		public List<General> getLocations() {
			return locations;
		}
	    @JsonProperty("locations")
		public void setLocations(List<General> locations) {
			this.locations = locations;
		}
	    @JsonProperty("objects")
		public List<General> getObjects() {
			return objects;
		}
	    @JsonProperty("objects")
		public void setObjects(List<General> objects) {
			this.objects = objects;
		}
	    @JsonProperty("people")
		public List<General> getPeople() {
			return people;
		}
	    @JsonProperty("people")
		public void setPeople(List<General> people) {
			this.people = people;
		}
	    @JsonProperty("publishers")
		public List<General> getPublishers() {
			return publishers;
		}
	    @JsonProperty("publishers")
		public void setPublishers(List<General> publishers) {
			this.publishers = publishers;
		}
	    @JsonProperty("releases")
		public List<General> getReleases() {
			return releases;
		}
	    @JsonProperty("releases")
		public void setReleases(List<General> releases) {
			this.releases = releases;
		}
	    @JsonProperty("dlcs")
		public List<General> getDlcs() {
			return dlcs;
		}
	    @JsonProperty("dlcs")
		public void setDlcs(List<General> dlcs) {
			this.dlcs = dlcs;
		}
	    @JsonProperty("similar_games")
		public List<General> getSimilarGames() {
			return similarGames;
		}
	    @JsonProperty("similar_games")
		public void setSimilarGames(List<General> similarGames) {
			this.similarGames = similarGames;
		}
	    @JsonProperty("themes")
		public List<General> getThemes() {
			return themes;
		}
	    @JsonProperty("themes")
		public void setThemes(List<General> themes) {
			this.themes = themes;
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

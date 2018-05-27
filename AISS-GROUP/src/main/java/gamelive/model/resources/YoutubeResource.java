package gamelive.model.resources;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import org.restlet.resource.ClientResource;
import org.restlet.resource.ResourceException;

import gamelive.model.youtube.YoutubeSearch;

public class YoutubeResource {
	private String access_token;
	private String uri = "https://www.googleapis.com/youtube/v3";
	public YoutubeResource(String token) {
		this.access_token = token;
	}

	public YoutubeSearch searchVideos(String query)  {
		ClientResource cr = null;
		
		YoutubeSearch ys = null;
		try {
			cr = new ClientResource(uri + "/search" + "?part=snippet&q=" + query + "&access_token=" + access_token);
			ys = cr.get(YoutubeSearch.class);
		} catch (ResourceException re) {
			System.err.println("Error al consultar los videos: " + cr.getResponse().getStatus());
		}
		return ys; 
	}
}

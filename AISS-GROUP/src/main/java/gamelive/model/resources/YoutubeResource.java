package gamelive.model.resources;

import java.util.ArrayList;
import java.util.List;

import org.restlet.resource.ClientResource;
import org.restlet.resource.ResourceException;

import gamelive.model.youtube.YoutubeSearch;
import gamelive.model.youtube.playlist.Item;
import gamelive.model.youtube.playlist.PlaylistResource;
import gamelive.model.youtube.playlist.Snippet;

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
	
	public PlaylistResource newPlayList() {
		Snippet s = new Snippet();
		s.setTitle("Gamelive");
		Item i = new Item();
		i.setSnippet(s);
		PlaylistResource nueva = new PlaylistResource();
		List<Item> l = new ArrayList<Item>();
		l.add(i);
		nueva.setItems(l);
		ClientResource cr = new ClientResource(uri + "/playlists"  +  "?part=snippet"+ "&access_token=" + access_token);
		cr.setEntityBuffering(true);
		PlaylistResource pl = cr.post(nueva, PlaylistResource.class);
		return pl;
	}
}

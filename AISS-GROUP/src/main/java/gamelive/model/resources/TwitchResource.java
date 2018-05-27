package gamelive.model.resources;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import org.restlet.resource.ClientResource;
import org.restlet.resource.ResourceException;

import gamelive.model.twitch.OAuth2Twitch;
import gamelive.model.twitch.StreamSearch;
import gamelive.model.twitch.User;



public class TwitchResource {
	private String client_id = "pbfpd1osbjx3ytibh3gloui8f5lnhd";
		public StreamSearch getStreamsByGame(String game) throws UnsupportedEncodingException {
			ClientResource cr = null;
			String uri = "https://api.twitch.tv/kraken/search/streams?query=";
			String gameEncoded = URLEncoder.encode(game, "UTF-8");
			StreamSearch streams = null;
			try {
				cr = new ClientResource(uri + "?game=" + gameEncoded + "&client_id=" + client_id);
				
				streams = cr.get(StreamSearch.class);
			} catch (ResourceException re) {
				System.err.println("Error al consultar los directos: " + cr.getResponse().getStatus());
			}
			return streams; 
		}
		
		public User getUser(String accessToken) {
			ClientResource cr = null;
			String uri = "https://api.twitch.tv/kraken/user";
			User us = null;
			try {
				cr = new ClientResource(uri + "=client_id=" + client_id + "&token=" + accessToken);
				us = cr.get(User.class);
			} catch (ResourceException re) {
				System.err.println("Error al obtener el usuario" + cr.getResponse().getStatus());
			}
			return us;
		}
		
	
		
		
	}


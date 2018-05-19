package gamelive.model.resources;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.restlet.resource.ClientResource;

import gamelive.model.giantbomb.Games;

public class GiantbombResource {
	private static final String IGN_API_KEY = "96760692f38e4e2500b287013d18a046119bb693";
	private static final String RESPONSE_DATA_FORMAT = "JSON";
	private static final Logger log = Logger.getLogger(NewSearchResource.class.getName());
	
	
	public Games getGames() {

		
		String uri = "https://www.giantbomb.com/api/games/?api_key="+ IGN_API_KEY +"&format=" + RESPONSE_DATA_FORMAT;
		
		log.log(Level.FINE, "IGN URI: " + uri);
		
		ClientResource cr = new ClientResource(uri);
		
		Games g = cr.get(Games.class);
		
	    return g;
	}
}

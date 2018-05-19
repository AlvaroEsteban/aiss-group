package gamelive.model.resources;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.restlet.resource.ClientResource;

import gamelive.model.giantbomb.Games;

public class GiantBombSearchResource {

	private static final String IGN_API_KEY = "8c6c2a4e54fa227fae916469a81f1345b6058833";
	private static final String RESPONSE_DATA_FORMAT = "JSON";
	private static final String resultsNumber = "6";
	private static final Logger log = Logger.getLogger(NewSearchResource.class.getName());
	
	
	public Games getGamesByName(String name) {

		
		String uri = "https://www.giantbomb.com/api/games/?api_key="+ IGN_API_KEY + "&filter=name:" + name + "&filter=limit:" + resultsNumber +"&format=" + RESPONSE_DATA_FORMAT;
		
		log.log(Level.FINE, "IGN URI: " + uri);
		
		ClientResource cr = new ClientResource(uri);
		
		Games g = cr.get(Games.class);
		
	    return g;
	}
	
	
}

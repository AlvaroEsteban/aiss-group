package gamelive.model.resources;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.restlet.resource.ClientResource;

import gamelive.model.giantbomb.Result;

public class GiantBombGameResource {
	private static final String IGN_API_KEY = "96760692f38e4e2500b287013d18a046119bb693";
	private static final String RESPONSE_DATA_FORMAT = "JSON";
	private static final Logger log = Logger.getLogger(GiantBombGameResource.class.getName());
	
	public Result getResult(String guid) {
		
		String uri = "https://www.giantbomb.com/api/game/" + guid + "/?api_key=" + IGN_API_KEY + "&format=" + RESPONSE_DATA_FORMAT;
		
		log.log(Level.FINE, "Buscando tu videojuego");
		
		
		ClientResource cr = new ClientResource(uri);
		Result r = cr.get(Result.class);
		
		return r;
	}
	
}

package gamelive.model.resources;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.restlet.resource.ClientResource;

import gamelive.model.ign.NewSearch;

public class NewSearchResource {

	private static final String IGN_API_KEY = "96d1393e32da4fc496725ad1f0805d54";
	private static final Logger log = Logger.getLogger(NewSearchResource.class.getName());
	
	
	public NewSearch getNews() {

		
		String uri = "https://newsapi.org/v2/top-headlines?sources=ign&apiKey="+ IGN_API_KEY;
		
		log.log(Level.FINE, "IGN URI: " + uri);
		
		ClientResource cr = new ClientResource(uri);
		
		NewSearch n = cr.get(NewSearch.class);
		
	    return n;
	}
}

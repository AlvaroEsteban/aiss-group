package gamelive.model.resources;

import static org.junit.Assert.*;

import org.junit.Test;
import org.restlet.resource.ClientResource;

import gamelive.model.giantbomb.Games;

public class GiantBombSearchResourceTest {

	@Test
	public void testGetGamesByNameLimit() {
		String name = "battlefield";
		String resultsNumber = "6";
		String uri = "https://www.giantbomb.com/api/search/?api_key=8c6c2a4e54fa227fae916469a81f1345b6058833&query=" 
						+ name + "&limit="+ resultsNumber + "&format=JSON";
		
		ClientResource cr = new ClientResource(uri);
		
		Games g = cr.get(Games.class);	
		
		assertTrue("La cantidad de videojuegos es superior al límite", g.getResults().size() <= 6);
		
	}
	
	@Test
	public void testGetGamesByNameNotNull() {
		String name = "battlefield";
		String resultsNumber = "6";
		String uri = "https://www.giantbomb.com/api/search/?api_key=8c6c2a4e54fa227fae916469a81f1345b6058833&query=" 
						+ name + "&limit="+ resultsNumber + "&format=JSON";
		
		ClientResource cr = new ClientResource(uri);
		
		Games g = null;
		g = cr.get(Games.class);
		assertNotNull("La consulta devuelve valor nulo", g);
		
		
	}

}

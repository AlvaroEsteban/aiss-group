package gamelive.model.resources;

import static org.junit.Assert.*;

import org.junit.Test;
import org.restlet.resource.ClientResource;

import gamelive.model.giantbomb.Game;

public class GiantBombGameResourceTest {

	@Test
	public void testGetResult() {
		String uri = "https://www.giantbomb.com/api/game/3030-4725/?api_key=8c6c2a4e54fa227fae916469a81f1345b6058833&format=JSON";
		ClientResource cr = new ClientResource(uri);
		Game ga = null;
		ga = cr.get(Game.class);
		
		assertNotNull("El resultado es nulo", ga);
	}

}

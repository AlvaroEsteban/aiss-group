package gamelive.model.resources;

import static org.junit.Assert.*;

import org.junit.Test;
import org.restlet.resource.ClientResource;

import gamelive.model.ign.NewSearch;

public class NewSearchResourceTest {

	@Test
	public void testGetNews() {
		
		String url = "https://newsapi.org/v2/top-headlines?sources=ign&apiKey=96d1393e32da4fc496725ad1f0805d54";
		
		ClientResource cr = new ClientResource(url);
		
		NewSearch n = null;
		n = cr.get(NewSearch.class);
		
		assertNotNull("Resultado nulo", n);
	}

}

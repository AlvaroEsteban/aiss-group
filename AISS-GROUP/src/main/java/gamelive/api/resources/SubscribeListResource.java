package gamelive.api.resources;

import java.net.URI;
import java.util.Collection;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.core.Response.ResponseBuilder;

import org.jboss.resteasy.spi.BadRequestException;
import org.jboss.resteasy.spi.NotFoundException;

import gamelive.api.model.Game;
import gamelive.api.model.GameSubscribeList;
import gamelive.model.repository.GameLiveRepository;
import gamelive.model.repository.GameLiveRepositoryImpl;


@Path("/subscribeList")
public class SubscribeListResource {

	private static SubscribeListResource _instance=null;
	GameLiveRepository repository;
	
	private SubscribeListResource() {
		repository=GameLiveRepositoryImpl.getInstance();
	}
	
	public static SubscribeListResource getInstance()
	{
		if(_instance==null)
				_instance=new SubscribeListResource();
		return _instance;
	}
	
	
	@GET
	@Produces("application/json")
	public Collection<GameSubscribeList> getAllGameSubscribeLists()
	{
		return repository.getAllGameSubscribeList();
	}
	
	@POST	
	@Path("/{subscribeListId}/{gameId}")
	@Consumes("text/plain")
	@Produces("application/json")
	public Response addGameToSubscribelist(@Context UriInfo uriInfo,@PathParam("subscribeListId") String subscribeListId, 
			@PathParam("gameId") String gameId){				
		
		GameSubscribeList gsl = repository.getGameSubscribeList(subscribeListId);	
		if (gsl == null)
			throw new NotFoundException("La lista no se ha encontrado");
		
		List<Game> games = (List<Game>) repository.getAllGames();
		Game juegoAdd = null;
		for (Game game : games) {
			if(game.getId().equals(gameId)){
				juegoAdd = game;
			}
		}

		if (juegoAdd==null)
			throw new NotFoundException("El juego no se ha encontrado");
		
			
		repository.getGameSubscribeList(subscribeListId).getGames().add(juegoAdd);

		// Builds the response
		UriBuilder ub = uriInfo.getAbsolutePathBuilder().path(this.getClass(), "get");
		URI uri = ub.build(gsl);
		ResponseBuilder resp = Response.created(uri);
		resp.entity(gsl);			
		return resp.build();
	}
	
}

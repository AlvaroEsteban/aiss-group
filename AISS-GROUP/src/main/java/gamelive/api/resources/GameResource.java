package gamelive.api.resources;

import java.util.Collection;

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
import javax.ws.rs.core.UriInfo;

import gamelive.api.model.Game;
import gamelive.model.repository.GameSubscribeListRepository;
import gamelive.model.repository.MapGameSubscribeListRepository;

@Path("/games")
public class GameResource {

	public static GameResource _instance=null;
	GameSubscribeListRepository repository;
	
	private GameResource(){
//		repository= MapGameSubscribeListRepository.getInstance();
	}
	
	public static GameResource getInstance()
	{
		if(_instance==null)
			_instance=new GameResource();
		return _instance; 
	}
	
	@GET
	@Produces("application/json")
	public Collection<Game> getAll()
	{
		return null;
	}
	
	@GET
	@Path("/{id}")
	@Produces("application/json")
	public Game get(@PathParam("id") String songId)
	{
		
		return null;
	}
	
	@POST
	@Consumes("application/json")
	@Produces("application/json")
	public Response addSong(@Context UriInfo uriInfo, Game song) {
		return null;
	}
	
	
	@PUT
	@Consumes("application/json")
	public Response updateSong(Game song) {
		return null;
	}
	
	@DELETE
	@Path("/{id}")
	public Response removeSong(@PathParam("id") String songId) {
		return null;
	}
	
}
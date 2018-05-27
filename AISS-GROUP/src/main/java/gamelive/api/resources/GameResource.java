package gamelive.api.resources;

import java.net.URI;
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
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.core.Response.ResponseBuilder;

import org.jboss.resteasy.spi.BadRequestException;

import gamelive.api.model.Game;
import gamelive.model.repository.GameLiveRepository;
import gamelive.model.repository.GameLiveRepositoryImpl;
import gamelive.utility.Utils;
import javassist.NotFoundException;

@Path("/games")
public class GameResource {

	public static GameResource _instance=null;
	GameLiveRepository repository;
	
	private GameResource(){
		repository= GameLiveRepositoryImpl.getInstance();
	}
	
	public static GameResource getInstance()
	{
		if(_instance==null)
			_instance=new GameResource();
		return _instance; 
	}
	
	/**
	 * 
	 * @return El método devuelve todos los juegos que hay en todas las listas de subscripción
	 */
	@GET
	@Produces("application/json")
	public Collection<Game> getAll()
	{
		return repository.getAllGames();
	}
	
	@GET
	@Path("/{id}")
	@Produces("application/json")
	public Game get(@PathParam("id") String gameId) throws NotFoundException
	{
		Game g = repository.getGame(gameId);
		
		if(g == null){
			throw new NotFoundException("The game with id="+ gameId +" was not found"); 
		}
		return g;
	}
	
	@POST
	@Consumes("application/json")
	@Produces("application/json")
	public Response addGame(@Context UriInfo uriInfo, Game game) {
		if(Utils.isBlank(game.getTitulo())){
			throw new BadRequestException("El titulo del juego no puede ser nulo.");
		}
		
		repository.addGame(game);
		
		UriBuilder ub = uriInfo.getAbsolutePathBuilder().path(this.getClass(), "get");
		URI uri = ub.build(game.getId());
		ResponseBuilder rsponse = Response.created(uri);
		rsponse.entity(game);
		return rsponse.build();
	}
	
	
	@PUT
	@Consumes("application/json")
	public Response updateGame(Game game) throws NotFoundException {
		Game repoGame = repository.getGame(game.getId());
		if(repoGame == null){
			throw new NotFoundException("El juego con id="+game.getId() + " no se ha encontrado.");
		}
		
		if(!Utils.isBlank(game.getTitulo()) && !Utils.isBlank(game.getCompania()) && !Utils.isBlank(game.getIdioma())
			&& !Utils.isBlank(game.getPlataforma())){
			repository.updateGame(game);
		}else{
			throw new BadRequestException("Algunos de los valores del juego no están rellenos.");
		}
			
		return Response.noContent().build();
	}
	
	@DELETE
	@Path("/{id}")
	public Response removeGame(@PathParam("id") String gameId) throws NotFoundException {
		Game repoGame = repository.getGame(gameId);
		if(repoGame == null){
			throw new NotFoundException("El juego con id=" + gameId + " no ha sido encontrado.");
		}else{
			repository.deleteGame(gameId);
		}
		return Response.noContent().build();
	}
	
}
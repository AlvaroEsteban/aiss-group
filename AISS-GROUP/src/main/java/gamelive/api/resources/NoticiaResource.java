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

import gamelive.api.model.Game;
import gamelive.api.model.Noticia;
import gamelive.model.repository.GameLiveRepository;
import gamelive.model.repository.GameLiveRepositoryImpl;
import gamelive.utility.Utils;
import javassist.NotFoundException;

@Path("/noticias")
public class NoticiaResource {
	public static NoticiaResource _instance=null;
	GameLiveRepository repository;
	
	private NoticiaResource(){
		repository= GameLiveRepositoryImpl.getInstance();
	}
	
	public static NoticiaResource getInstance()
	{
		if(_instance==null)
			_instance=new NoticiaResource();
		return _instance; 
	}

	@GET
	@Produces("application/json")
	@Path("/{id}")
	public Collection<Noticia> getAllNoticias(@PathParam("id") String gameId){
		return repository.getAllNoticiaFromGame(gameId);
	}
	
	@POST
	@Consumes("application/json")
	@Produces("application/json")
	public Response addNoticia(@Context UriInfo uriInfo, String gid, Noticia n) {
		if(Utils.isBlank(n.getUrl())){
			throw new BadRequestException("La url de la noticia no puede ser nula");
		}
		
		repository.addNoticiaToGame(gid, n);
		
		UriBuilder ub = uriInfo.getAbsolutePathBuilder().path(this.getClass(), "get");
		URI uri = ub.build(n.getId());
		ResponseBuilder rsponse = Response.created(uri);
		rsponse.entity(n);
		return rsponse.build();
	}
	
	@DELETE
	@Path("/{id}/{idNoticia}")
	public Response removeNoticia(@PathParam("id") String gameId, @PathParam("idNoticia") String noticiaId) throws NotFoundException {
		Game repoGame = repository.getGame(gameId);
		List<Noticia> repoNoticia = (List<Noticia>) repository.getAllNoticiaFromGame(gameId);
		
		Noticia n = null;
		for (Noticia noticia : repoNoticia) {
			if(noticia.getId().equals(noticiaId)){
				n = noticia;
				break;
			}
		}
		if(repoGame == null || n == null){
			throw new NotFoundException("El juego con id=" + gameId + " no ha sido encontrado.");
		}else{
			repository.removeNoticiaFromGame(gameId, n);
		}
		return Response.noContent().build();
	}
	
	@PUT
	@Consumes("application/json")
	public Response updateNoticia(Game game, Noticia n) throws NotFoundException {
		Game repoGame = repository.getGame(game.getId());
		Noticia repoNoticia = null;
		for (Noticia noti : repoGame.getNoticias()) {
			if(noti.getId().equals(n.getId())){
				repoNoticia = noti;
				break;
			}
		}
		
		if(repoGame == null || repoNoticia == null){
			throw new NotFoundException("El juego con id="+game.getId() + " no se ha encontrado o no tiene la noticia.");
		}
		
		if(!Utils.isBlank(n.getTitulo()) && !Utils.isBlank(n.getUrl())){
			repository.updateNoticiaFromGame(repoGame.getId(), repoNoticia);
		}else{
			throw new BadRequestException("Algunos de los valores del juego no están rellenos.");
		}
			
		return Response.noContent().build();
	}
}

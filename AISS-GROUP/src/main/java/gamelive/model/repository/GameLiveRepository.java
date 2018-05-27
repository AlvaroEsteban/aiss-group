package gamelive.model.repository;

import java.util.Collection;

import gamelive.api.model.Game;
import gamelive.api.model.GameSubscribeList;
import gamelive.api.model.Noticia;

public interface GameLiveRepository {
	// Game
	public void addGame(Game s);
	public Collection<Game> getAllGames();
	public Game getGame(String gameId);
	public void updateGame(Game s);
	public void deleteGame(String gameId);
	
	// GameSubscribeList
	public void addGameToSubscribeList(GameSubscribeList p, Game g);
	public Collection<GameSubscribeList> getAllGameSubscribeList();
	public GameSubscribeList getGameSubscribeList(String gameSubscribeListId);
	public void updateGameSubscribeList(GameSubscribeList p);
	public void deleteGameSubscribeList(String gameSubscribeListId);
	public void deleteGameFromSubscribeList(String gameSubscribeListId, Game g);
	public Collection<Game> getAll(String gameSubscribeListId);
	
	//Noticias
	public void addNoticiaToGame(String gameId, Noticia n);
	public void removeNoticiaFromGame(String gameId, Noticia n);
	public Collection<Noticia> getAllNoticiaFromGame(String gameId);
	public void updateNoticiaFromGame(String gameId, Noticia n);

}

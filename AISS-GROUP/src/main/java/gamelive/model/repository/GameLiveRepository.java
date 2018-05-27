package gamelive.model.repository;

import java.util.Collection;

import gamelive.api.model.Game;
import gamelive.api.model.GameSubscribeList;

public interface GameLiveRepository {
	// Game
	public void addGame(Game s);
	public Collection<Game> getAllGames();
	public Game getGame(String gameId);
	public void updateGame(Game s);
	public void deleteGame(String gameId);
	
//	// GameSubscribeList
	public void addGameSubscribeList(GameSubscribeList p);
	public Collection<GameSubscribeList> getAllGameSubscribeList();
	public GameSubscribeList getGameSubscribeList(String gameSubscribeListId);
	public void updateGameSubscribeList(GameSubscribeList p);
	public void deleteGameSubscribeList(String gameSubscribeListId);
	public Collection<Game> getAll(String gameSubscribeListId);
	public void addGame(String gameSubscribeListId, String gameId);
	public void removeGame(String gameSubscribeListId, String gameId); 

}

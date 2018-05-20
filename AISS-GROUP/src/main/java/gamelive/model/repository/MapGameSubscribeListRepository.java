package gamelive.model.repository;

import java.util.Collection;
import java.util.Map;

import gamelive.api.model.Game;
import gamelive.api.model.GameSubscribeList;

public class MapGameSubscribeListRepository implements GameSubscribeListRepository{
	Map<String, GameSubscribeList> playlistMap;
	Map<String, Game> songMap;
	private static MapGameSubscribeListRepository instance=null;
	private int index=0;			// Index to create playlists and songs' identifiers.
	
	
	public static MapGameSubscribeListRepository getInstance() {
		
		if (instance==null) {
			instance = new MapGameSubscribeListRepository();
			instance.init();
		}
		
		return instance;
	}


	private void init() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addGame(Game s) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public Collection<Game> getAllGames() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Game getGame(String songId) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void updateGame(Game s) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void deleteGame(String songId) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void addGameSubscribeList(GameSubscribeList p) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public Collection<GameSubscribeList> getAllGameSubscribeList() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public GameSubscribeList getGameSubscribeList(String gameSubscribeListId) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void updateGameSubscribeList(GameSubscribeList p) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void deleteGameSubscribeList(String gameSubscribeListId) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public Collection<Game> getAll(String gameSubscribeListId) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void addGame(String gameSubscribeListId, String gameId) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void removeGame(String gameSubscribeListId, String gameId) {
		// TODO Auto-generated method stub
		
	}
	
}

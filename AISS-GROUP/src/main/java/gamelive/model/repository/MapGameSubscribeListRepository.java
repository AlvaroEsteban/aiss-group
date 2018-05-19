package gamelive.model.repository;

import java.util.Map;

import gamelive.api.model.Game;
import gamelive.api.model.GameSubscribeList;

public class MapGameSubscribeListRepository {
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
	
}

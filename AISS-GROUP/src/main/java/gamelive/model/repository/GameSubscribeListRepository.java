package gamelive.model.repository;

import java.util.Collection;

import gamelive.api.model.Game;

public interface GameSubscribeListRepository {
	// Game
	public void addSong(Game s);
	public Collection<Game> getAllSongs();
	public Game getSong(String songId);
	public void updateSong(Game s);
	public void deleteSong(String songId);
	
//	// GameSubscribeList
//	public void addPlaylist(Playlist p);
//	public Collection<Playlist> getAllPlaylists();
//	public Playlist getPlaylist(String playlistId);
//	public void updatePlaylist(Playlist p);
//	public void deletePlaylist(String playlistId);
//	public Collection<Game> getAll(String playlistId);
//	public void addSong(String playlistId, String songId);
//	public void removeSong(String playlistId, String songId); 

}

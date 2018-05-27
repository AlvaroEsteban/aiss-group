package gamelive.model.repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import gamelive.api.model.Game;
import gamelive.api.model.GameSubscribeList;
import gamelive.api.model.Noticia;
import gamelive.utility.Utils;

public class GameLiveRepositoryImpl implements GameLiveRepository{
	Map<String, GameSubscribeList> subscribeList;
	Map<String, Game> games;
	private static GameLiveRepositoryImpl instance=null;
	private int index=0;
	
	
	public static GameLiveRepositoryImpl getInstance() {
		
		if (instance==null) {
			instance = new GameLiveRepositoryImpl();
			instance.init();
		}
		
		return instance;
	}


	private void init() {
		//Inicializamos los mapas
		subscribeList = new HashMap<String, GameSubscribeList>();
		games = new HashMap<String, Game>();
		
		//Creamos los objetos a incluir en los mapas
		Noticia n1 = new Noticia("n001", "https://www.3djuegos.com/novedades/noticias/juegos/0f0f0f0/fecha/",
				"Noticia juego 1","Aquí iría el contenido del juego 1");
		Noticia n2 = new Noticia("n002", "https://www.3djuegos.com/novedades/noticias/juegos/0f0f0f0/fecha/",
				"Noticia juego 2","Aquí iría el contenido del juego 2");
		Noticia n3 = new Noticia("n003", "https://www.3djuegos.com/novedades/noticias/juegos/0f0f0f0/fecha/",
				"Noticia juego 3","Aquí iría el contenido del juego 3");
		Noticia n4 = new Noticia("n004", "https://www.3djuegos.com/novedades/noticias/juegos/0f0f0f0/fecha/",
				"Noticia juego 4","Aquí iría el contenido del juego 4");
		Noticia n5 = new Noticia("n005", "https://www.3djuegos.com/novedades/noticias/juegos/0f0f0f0/fecha/",
				"Noticia juego 5","Aquí iría el contenido del juego 5");
		
		List<Noticia> ln1 = new ArrayList();
		ln1.add(n1);
		ln1.add(n3);
		ln1.add(n5);
		List<Noticia> ln2 = new ArrayList();
		ln1.add(n1);
		ln1.add(n2);
		ln1.add(n4);
		List<Noticia> ln3 = new ArrayList();
		ln1.add(n2);
		ln1.add(n3);
		ln1.add(n4);
		
		Game g1 = new Game("g001","NFS","EA Games","PS4","Spanish",ln1);
		Game g2 = new Game("g002","Horizon Forza motor","EA Games","XBOX","Spanish",ln2);
		Game g3 = new Game("g003","Moto GP 07/08","EA Games","PS2","Spanish",ln3);
		Game g4 = new Game("g004","Call of duty","Origin","PC","English",ln1);
		Game g5 = new Game("g005","Battlefield","Casi Games","PS4","English",ln2);
		
		games.put("g1", g1);
		games.put("g2", g2);
		games.put("g3", g3);
		games.put("g4", g4);
		games.put("g5", g5);
		
		List<Game> lg = new ArrayList();
		lg.add(g2);
		lg.add(g4);
		
		GameSubscribeList gbl = new GameSubscribeList("gbl001", lg, "Mi lista", "PS", "Esta es la lista mia");
		subscribeList.put("gsl001", gbl);
	}

	@Override
	public void addGame(Game s) {
		String indx = "n";
		if(Utils.isBlank(s.getId()) || games.get(s.getId())!= null){
			index += 1;
			indx += String.valueOf(index);
		}else{
			indx = s.getId();
		}
		games.put(indx, s);
	}


	@Override
	public Collection<Game> getAllGames() {
		return games.values();
	}


	@Override
	public Game getGame(String gameId) {
		return games.get(gameId);
	}


	@Override
	public void updateGame(Game s) {
		if (games.values().contains(s)) {
			games.put(s.getId(), s);
		}		
	}


	@Override
	public void deleteGame(String gId) {
		for (String id : games.keySet()) {
			if(games.get(id).equals(gId)){
				games.remove(id);
				break;
			}
		}
	}


	@Override
	public void addGameToSubscribeList(GameSubscribeList p, Game g) {
		for (String idSl : subscribeList.keySet()) {
			if(subscribeList.get(idSl).getId().equals(p.getId())){
				subscribeList.get(idSl).getGames().add(g);
				break;
			}
		}
	}


	@Override
	public Collection<GameSubscribeList> getAllGameSubscribeList() {
		return subscribeList.values();
	}


	@Override
	public GameSubscribeList getGameSubscribeList(String gameSubscribeListId) {
		for (String idSl : subscribeList.keySet()) {
			if(subscribeList.get(idSl).getId().equals(gameSubscribeListId)){
				return subscribeList.get(idSl);
			}
		}
		return null;
	}


	@Override
	public void updateGameSubscribeList(GameSubscribeList p) {
		for (String idSl : subscribeList.keySet()) {
			if(subscribeList.get(idSl).getId().equals(p.getId())){
				subscribeList.put(idSl, p);
				break;
			}
		}
	}


	@Override
	public void deleteGameSubscribeList(String p) {
		subscribeList.remove(p);
	}
	
	@Override
	public void deleteGameFromSubscribeList(String gameSubscribeListId, Game g){
		subscribeList.get(gameSubscribeListId).getGames().remove(g);
	}


	@Override
	public Collection<Game> getAll(String gameSubscribeListId) {
		return subscribeList.get(gameSubscribeListId).getGames();
	}


	@Override
	public void addNoticiaToGame(String gameId, Noticia n) {
		games.get(gameId).getNoticias().add(n);
	}


	@Override
	public void removeNoticiaFromGame(String gameId, Noticia n) {
		games.get(gameId).getNoticias().remove(n);
	}


	@Override
	public Collection<Noticia> getAllNoticiaFromGame(String gameId) {
		return games.get(gameId).getNoticias();
	}


	@Override
	public void updateNoticiaFromGame(String gId, Noticia n) {
	
		for (Noticia noticia : games.get(gId).getNoticias()) {
			if(noticia.getId().equals(n.getId())){
				games.get(gId).getNoticias().remove(noticia);
				games.get(gId).getNoticias().add(n);
			}
		}
	}

	
}

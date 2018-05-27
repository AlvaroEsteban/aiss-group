package gamelive.api.model;

import java.util.List;

public class GameSubscribeList {
	
	private String id;
	private List<Game> games;
	private String nombre;
	private String plataforma;
	private String descripcion;
	
	public GameSubscribeList() {
		super();
	}

	public GameSubscribeList(String id, List<Game> games, String nombre, String plataforma, String descripcion) {
		super();
		this.id = id;
		this.games = games;
		this.nombre = nombre;
		this.plataforma = plataforma;
		this.descripcion = descripcion;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<Game> getGames() {
		return games;
	}

	public void setGames(List<Game> games) {
		this.games = games;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	
}

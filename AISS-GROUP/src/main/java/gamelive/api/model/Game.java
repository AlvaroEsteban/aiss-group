package gamelive.api.model;

import java.util.List;

public class Game {

	private String id;
	private String titulo;
	private String compania;
	private String plataforma;
	private String idioma;
	private List<Noticia> noticias;
	
	public Game() {
		super();
	}
	
	public Game(String id, String titulo, String compania, String plataforma, String idioma, List<Noticia> noticias) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.compania = compania;
		this.plataforma = plataforma;
		this.idioma = idioma;
		this.noticias.addAll(noticias);
	}

	public Game(String titulo, String compania, String plataforma, String idioma) {
		super();
		this.titulo = titulo;
		this.compania = compania;
		this.plataforma = plataforma;
		this.idioma = idioma;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getCompania() {
		return compania;
	}
	public void setCompania(String compania) {
		this.compania = compania;
	}
	public String getPlataforma() {
		return plataforma;
	}
	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}
	public String getIdioma() {
		return idioma;
	}
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public List<Noticia> getNoticias() {
		return noticias;
	}

	public void setNoticias(List<Noticia> noticias) {
		this.noticias = noticias;
	}
	
	
	
}

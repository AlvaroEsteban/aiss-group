package gamelive.api.model;

public class Noticia {
	
	private String id;
	private String url;
	private String titulo;
	private String contenido;
	
	public Noticia() {
		super();
	}
	
	public Noticia(String id, String url, String titulo, String contenido) {
		super();
		this.id = id;
		this.url = url;
		this.titulo = titulo;
		this.contenido = contenido;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getContenido() {
		return contenido;
	}
	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	
}

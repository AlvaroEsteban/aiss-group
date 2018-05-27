package gamelive.api.model;

public class Noticia {
	
	private String id;
	private String url;
	private String titulo;
	private String contenido;
	
	public Noticia() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Noticia(String id, String url, String title, String contenido) {
		super();
		this.id = id;
		this.url = url;
		this.titulo = title;
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
	public String getTitle() {
		return titulo;
	}
	public void setTitle(String title) {
		this.titulo = title;
	}
	public String getContenido() {
		return contenido;
	}
	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	
}

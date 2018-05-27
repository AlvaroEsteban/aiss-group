package gamelive.api.model;

public class Perfil {
	
	private String id;
	private String nick;
	private String email;
	
	public Perfil() {
		super();
	}
	
	public Perfil(String id, String nick, String email) {
		super();
		this.id = id;
		this.nick = nick;
		this.email = email;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}

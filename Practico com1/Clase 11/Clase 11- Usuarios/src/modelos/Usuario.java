package modelos;

public class Usuario {

	private String username;
	private String password;
	private String nickname;
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getUsername() {
		return username;
	}
	public Usuario(String username, String password, String nickname) {
		super();
		this.username = username;
		this.password = password;
		this.nickname = nickname;
	}
	
	
	
	
}
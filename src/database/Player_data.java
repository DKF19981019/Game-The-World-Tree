package database;

public class Player_data {

	private String name;
	private String password;
	private int glod;
	private int friendVerify;
	private String game;
	private int gametime;
	private int banned;
	private String mail;
	
	
	protected Player_data(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}


	public Player_data(String name, String password, int glod,
			int friendVerify, String game, int gametime, int banned, String mail) {
		super();
		this.name = name;
		this.password = password;
		this.glod = glod;
		this.friendVerify = friendVerify;
		this.game = game;
		this.gametime = gametime;
		this.banned = banned;
		this.mail = mail;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public int getGlod() {
		return glod;
	}


	public void setGlod(int glod) {
		this.glod = glod;
	}


	public int getFriendVerify() {
		return friendVerify;
	}


	public void setFriendVerify(int friendVerify) {
		this.friendVerify = friendVerify;
	}


	public String getGame() {
		return game;
	}


	public void setGame(String game) {
		this.game = game;
	}


	public int getGametime() {
		return gametime;
	}


	public void setGametime(int gametime) {
		this.gametime = gametime;
	}


	public int getBanned() {
		return banned;
	}


	public void setBanned(int banned) {
		this.banned = banned;
	}


	public String getMail() {
		return mail;
	}


	public void setMail(String mail) {
		this.mail = mail;
	}


}
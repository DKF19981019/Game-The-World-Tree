package database;

public class Game_data {
	private String stroyName;
	private String stroyTime;
	private int progress;
	private String cg;
	private String player;
	private String lock;
	
	
	public Game_data(String stroyName, String stroyTime, int progress,
			String cg, String player) {
		super();
		this.stroyName = stroyName;
		this.stroyTime = stroyTime;
		this.progress = progress;
		this.cg = cg;
		this.player = player;
	}



	public String getStroyName() {
		return stroyName;
	}



	public void setStroyName(String stroyName) {
		this.stroyName = stroyName;
	}



	public String getStroyTime() {
		return stroyTime;
	}



	public void setStroyTime(String stroyTime) {
		this.stroyTime = stroyTime;
	}



	public int getProgress() {
		return progress;
	}



	public void setProgress(int progress) {
		this.progress = progress;
	}



	public String getCg() {
		return cg;
	}



	public void setCg(String cg) {
		this.cg = cg;
	}



	public String getPlayer() {
		return player;
	}



	public void setPlayer(String player) {
		this.player = player;
	}
	
}

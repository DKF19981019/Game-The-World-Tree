package database;

public class Chat_data {

	private String name;
	private String ip;
	private String connent;
	private String time;
	public Chat_data(String name, String ip, String connent, String time) {
		super();
		this.name = name;
		this.ip = ip;
		this.connent = connent;
		this.time = time;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getConnent() {
		return connent;
	}
	public void setConnent(String connent) {
		this.connent = connent;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return name+":"+connent+"["+time+"]";
	}
	
}

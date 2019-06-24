package database;

public class message {

	private String writor;
	private String message;
	private String time;
	
	public message(String writor, String message, String time) {
		
		this.writor = writor;
		this.message = message;
		this.time = time;
	}
	public String getWritor() {
		return writor;
	}
	public void setWritor(String writor) {
		this.writor = writor;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
}

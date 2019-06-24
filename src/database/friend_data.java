package database;

public class friend_data {

	private String name;
	private int friendVerify;
	public friend_data(String name, int friendVerify) {
		super();
		this.name = name;
		this.friendVerify = friendVerify;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getFriendVerify() {
		return friendVerify;
	}
	public void setFriendVerify(int friendVerify) {
		this.friendVerify = friendVerify;
	}
}

package database;

public class GM_data {

	private String name;
	private String password;
	private String sex;
	private String year;
	private String loginTime;
	protected GM_data(String name, String password, String sex, String year,
			String loginTime) {
		super();
		this.name = name;
		this.password = password;
		this.sex = sex;
		this.year = year;
		this.loginTime = loginTime;
	}
	public String getName() {
		return name;
	}
	protected void setName(String name) {
		this.name = name;
	}
	protected String getPassword() {
		return password;
	}
	protected void setPassword(String password) {
		this.password = password;
	}
	protected String getSex() {
		return sex;
	}
	protected void setSex(String sex) {
		this.sex = sex;
	}
	protected String getYear() {
		return year;
	}
	protected void setYear(String year) {
		this.year = year;
	}
	protected String getLoginTime() {
		return loginTime;
	}
	protected void setLoginTime(String loginTime) {
		this.loginTime = loginTime;
	}
}

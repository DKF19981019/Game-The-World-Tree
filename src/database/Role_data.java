package database;

public class Role_data {
	private String name;
	private String sex;
	private String year;
	private String dialogue;
	private String voice;
	private int favorability;
	protected Role_data(String name, String sex, String year, String dialogue,
			String voice, int favorability) {
		super();
		this.name = name;
		this.sex = sex;
		this.year = year;
		this.dialogue = dialogue;
		this.voice = voice;
		this.favorability = favorability;
	}
	protected String getName() {
		return name;
	}
	protected void setName(String name) {
		this.name = name;
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
	protected String getDialogue() {
		return dialogue;
	}
	protected void setDialogue(String dialogue) {
		this.dialogue = dialogue;
	}
	protected String getVoice() {
		return voice;
	}
	protected void setVoice(String voice) {
		this.voice = voice;
	}
	protected int getFavorability() {
		return favorability;
	}
	protected void setFavorability(int favorability) {
		this.favorability = favorability;
	}

}

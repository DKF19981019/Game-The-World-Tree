package database;

public class Dialogue_data {

	private int dialoguenumber;
	private String dialogue;
	private String role;
	
	protected Dialogue_data(int dialoguenumber, String dialogue, String role) {
		super();
		this.dialoguenumber = dialoguenumber;
		this.role = role;
		this.dialogue = dialogue;
	}
	protected int getDialoguenumber() {
		return dialoguenumber;
	}
	protected void setDialoguenumber(int dialoguenumber) {
		this.dialoguenumber = dialoguenumber;
	}
	protected String getRole() {
		return role;
	}
	protected void setRole(String role) {
		this.role = role;
	}
	protected String getDialogue() {
		return dialogue;
	}
	protected void setDialogue(String dialogue) {
		this.dialogue = dialogue;
	}

}

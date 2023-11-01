package chat.chat_other;

public class Chat_Other_DTO {
	private int chat_other_no;
	private int chat_room_no;
	private String usr_id;
	
	public Chat_Other_DTO() {}

	public Chat_Other_DTO(int chat_other_no, int chat_room_no, String usr_id) {
		super();
		this.chat_other_no = chat_other_no;
		this.chat_room_no = chat_room_no;
		this.usr_id = usr_id;
	}

	public int getChat_other_no() {
		return chat_other_no;
	}

	public void setChat_other_no(int chat_other_no) {
		this.chat_other_no = chat_other_no;
	}

	public int getChat_room_no() {
		return chat_room_no;
	}

	public void setChat_room_no(int chat_room_no) {
		this.chat_room_no = chat_room_no;
	}

	public String getUsr_id() {
		return usr_id;
	}

	public void setUsr_id(String usr_id) {
		this.usr_id = usr_id;
	}
	
	
}

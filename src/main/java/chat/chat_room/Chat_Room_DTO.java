package chat.chat_room;

public class Chat_Room_DTO {
	private int chat_room_no;
	private String title;
	private int chat_room_perm;
	private int type;
	
	public Chat_Room_DTO() {}

	public Chat_Room_DTO(int chat_room_no, String title, int chat_room_perm, int type) {
		super();
		this.chat_room_no = chat_room_no;
		this.title = title;
		this.chat_room_perm = chat_room_perm;
		this.type = type;
	}

	public int getChat_room_no() {
		return chat_room_no;
	}

	public void setChat_room_no(int chat_room_no) {
		this.chat_room_no = chat_room_no;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getChat_room_perm() {
		return chat_room_perm;
	}

	public void setChat_room_perm(int chat_room_perm) {
		this.chat_room_perm = chat_room_perm;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}
	
	
	
	
}

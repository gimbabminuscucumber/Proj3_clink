package member.follow;

public class Follow_DTO {
	private int follow_no;
	private String from_usr;
	private String to_usr;
	
	public Follow_DTO() {}

	public Follow_DTO(int follow_no, String from_usr, String to_usr) {
		super();
		this.follow_no = follow_no;
		this.from_usr = from_usr;
		this.to_usr = to_usr;
	}

	public int getFollow_no() {
		return follow_no;
	}

	public void setFollow_no(int follow_no) {
		this.follow_no = follow_no;
	}

	public String getFrom_usr() {
		return from_usr;
	}

	public void setFrom_usr(String from_usr) {
		this.from_usr = from_usr;
	}

	public String getTo_usr() {
		return to_usr;
	}

	public void setTo_usr(String to_usr) {
		this.to_usr = to_usr;
	}
	
	
}

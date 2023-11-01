package member.mentor.mentor_apply;

public class Mentor_Apply_DTO {
	private int mentor_apply_no;
	private String member_id;
	private int email;
	private String bus_card;
	
	public Mentor_Apply_DTO() {}

	public Mentor_Apply_DTO(String member_id, int email, String bus_card) {
		super();
		this.member_id = member_id;
		this.email = email;
		this.bus_card = bus_card;
	}

	public Mentor_Apply_DTO(int mentor_apply_no, String member_id, int email, String bus_card) {
		super();
		this.mentor_apply_no = mentor_apply_no;
		this.member_id = member_id;
		this.email = email;
		this.bus_card = bus_card;
	}

	public int getMentor_apply_no() {
		return mentor_apply_no;
	}

	public void setMentor_apply_no(int mentor_apply_no) {
		this.mentor_apply_no = mentor_apply_no;
	}

	public String getMember_id() {
		return member_id;
	}

	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}

	public int getEmail() {
		return email;
	}

	public void setEmail(int email) {
		this.email = email;
	}

	public String getBus_card() {
		return bus_card;
	}

	public void setBus_card(String bus_card) {
		this.bus_card = bus_card;
	}
	
	
}

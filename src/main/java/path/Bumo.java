package path;

public abstract class Bumo {
	
	private String usr_id;
	private String member_id;
	private String bmember_id;
	
	public Bumo() {}
	
	public String getUsr_id() {
		return usr_id;
	}

	public void setUsr_id(String usr_id) {
		this.usr_id = usr_id;
	}

	public String getMember_id() {
		return member_id;
	}

	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}

	public String getBmember_id() {
		return bmember_id;
	}

	public void setBmember_id(String bmember_id) {
		this.bmember_id = bmember_id;
	}
	
	
	
}

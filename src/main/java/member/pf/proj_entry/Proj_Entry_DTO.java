package member.pf.proj_entry;

public class Proj_Entry_DTO {

	private String proj_entry_no;
	private String proj_no;
	private String member_no;
	
	public Proj_Entry_DTO() {
		super();
	}
	
	public Proj_Entry_DTO(String proj_entry_no, String proj_no) {
		this.proj_entry_no = proj_entry_no;
		this.proj_no = proj_no;
	}
	
	public Proj_Entry_DTO(String proj_entry_no, String proj_no, String member_no) {
		this.proj_entry_no = proj_entry_no;
		this.proj_no = proj_no;
		this.member_no = member_no;
	}
	
	public Proj_Entry_DTO(String member_no) {
		this.member_no = member_no;
	}

	public String getProj_entry_no() {
		return proj_entry_no;
	}

	public void setProj_entry_no(String proj_entry_no) {
		this.proj_entry_no = proj_entry_no;
	}

	public String getProj_no() {
		return proj_no;
	}

	public void setProj_no(String proj_no) {
		this.proj_no = proj_no;
	}

	public String getMember_no() {
		return member_no;
	}

	public void setMember_no(String member_no) {
		this.member_no = member_no;
	}
	
	
}

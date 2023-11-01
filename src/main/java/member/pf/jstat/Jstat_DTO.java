package member.pf.jstat;

public class Jstat_DTO {
	
	private String jstat_no;
	private String member_no;
	private int jstat_cid;
	
	public Jstat_DTO() {
		super();
	}
	
	public Jstat_DTO(String jstat_no, String member_no, int jstat_cid) {
		this.jstat_no = jstat_no;
		this.member_no = member_no;
		this.jstat_cid = jstat_cid;
	}

	public String getJstat_no() {
		return jstat_no;
	}

	public void setJstat_no(String jstat_no) {
		this.jstat_no = jstat_no;
	}

	public String getMember_no() {
		return member_no;
	}

	public void setMember_no(String member_no) {
		this.member_no = member_no;
	}

	public int getJstat_cid() {
		return jstat_cid;
	}

	public void setJstat_cid(int jstat_cid) {
		this.jstat_cid = jstat_cid;
	}


}

package member.pf.proj;

public class Proj_DTO {

	private String proj_no;
	private String pf_no;
	private String member_no;
	private String name;
	private int stat;
	
	public Proj_DTO() {
		super();
	}
	
	public Proj_DTO(String proj_no, String pf_no, String member_no, String name, int stat) {
		this.proj_no = proj_no;
		this.pf_no = pf_no;
		this.member_no = member_no;
		this.name = name;
		this.stat = stat;
	}

	public String getProj_no() {
		return proj_no;
	}

	public void setProj_no(String proj_no) {
		this.proj_no = proj_no;
	}

	public String getPf_no() {
		return pf_no;
	}

	public void setPf_no(String pf_no) {
		this.pf_no = pf_no;
	}

	public String getMember_no() {
		return member_no;
	}

	public void setMember_no(String member_no) {
		this.member_no = member_no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStat() {
		return stat;
	}

	public void setStat(int stat) {
		this.stat = stat;
	}
	
	
	
}

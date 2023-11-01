package member.pf.org;

public class Org_DTO {
	
	private String org_no;
	private String pf_no;
	private String member_no;
	private int socialact_cno;
	private String name;
	private String posi;
	private int stat;
	private String text;
	
	public Org_DTO() {
		super();
	}
	
	
	public Org_DTO(String org_no, String pf_no, String member_no, int socialact_cno, String name, String posi, int stat, String text) {
		this.org_no = org_no;
		this.pf_no = pf_no;
		this.member_no = member_no;
		this.socialact_cno = socialact_cno;
		this.name = name;
		this.posi = posi;
		this.stat = stat;
		this.text = text;
	}

	public String getOrg_no() {
		return org_no;
	}

	public void setOrg_no(String org_no) {
		this.org_no = org_no;
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

	public int getSocialact_cno() {
		return socialact_cno;
	}

	public void setSocialact_cno(int socialact_cno) {
		this.socialact_cno = socialact_cno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosi() {
		return posi;
	}

	public void setPosi(String posi) {
		this.posi = posi;
	}

	public int getStat() {
		return stat;
	}

	public void setStat(int stat) {
		this.stat = stat;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}

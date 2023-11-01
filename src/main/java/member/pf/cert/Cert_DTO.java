package member.pf.cert;

public class Cert_DTO {

	private String cert_no;
	private String pf_no;
	private String member_no;
	private String name;
	private String author;
	
	public Cert_DTO() {
		super();
	}


	public Cert_DTO(String cert_no, String pf_no, String member_no, String name, String author) {
		this.cert_no = cert_no;
		this.pf_no = pf_no;
		this.member_no = member_no;
		this.name = name;
		this.author = author;
	}


	public String getCert_no() {
		return cert_no;
	}

	public void setCert_no(String cert_no) {
		this.cert_no = cert_no;
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

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	
}

package member.pf.inscert;

import java.sql.Date;

public class Inscert_DTO {

	private String inscert_no;
	private String pf_no;
	private String member_no;
	private String name;
	private String author;
	private Date inscert_date;
	
	public Inscert_DTO() {
		super();
	}

	public Inscert_DTO(String inscert_no, String pf_no, String member_no, String name, String author, Date inscert_date) {
		this.inscert_no = inscert_no;
		this.pf_no = pf_no;
		this.member_no = member_no;
		this.name = name;
		this.author = author;
		this.inscert_date = inscert_date;
	}


	public String getInscert_no() {
		return inscert_no;
	}

	public void setInscert_no(String inscert_no) {
		this.inscert_no = inscert_no;
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

	public Date getInscert_date() {
		return inscert_date;
	}

	public void setInscert_date(Date inscert_date) {
		this.inscert_date = inscert_date;
	}
	
	
	
}

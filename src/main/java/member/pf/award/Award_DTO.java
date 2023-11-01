package member.pf.award;

import java.sql.Date;

public class Award_DTO {

	private int award_no;
	private int pf_no;
	private String memberId;
	private String name;
	private String author;
	private Date award_date;
	private String detail;
	
	public Award_DTO() {
		super();
	}
	
	public Award_DTO(int award_no, int pf_no, String memberId, String name, String author, Date award_date, String detail) {
		this.award_no = award_no;
		this.pf_no = pf_no;
		this.memberId = memberId;
		this.name = name;
		this.author = author;
		this.award_date = award_date;
		this.detail = detail;
	}

	public Award_DTO(String memberId, String name, String author, Date award_date, String detail) {
		this.memberId = memberId;
		this.name = name;
		this.author = author;
		this.award_date = award_date;
		this.detail = detail;
	}

	public int getAward_no() {
		return award_no;
	}

	public void setAward_no(int award_no) {
		this.award_no = award_no;
	}

	public int getPf_no() {
		return pf_no;
	}

	public void setPf_no(int pf_no) {
		this.pf_no = pf_no;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
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

	public Date getAward_date() {
		return award_date;
	}

	public void setAward_date(Date award_date) {
		this.award_date = award_date;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}
	
	
	
}

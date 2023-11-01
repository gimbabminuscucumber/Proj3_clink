package member.pf.rest;

import java.sql.Date;

public class Rest_DTO {

	private String rest_no;
	private String pf_no;
	private String member_no;
	private int rest_rsn_no;
	private int stat;
	private Date start_date;
	private Date end_date;
	private String text;
	
	public Rest_DTO() {
		super();
	}

	public Rest_DTO(String rest_no, String pf_no, String member_no, int rest_rsn_no, int stat, Date start_date, Date end_date, String text) {
		this.rest_no = rest_no;
		this.pf_no = pf_no;
		this.member_no = member_no;
		this.rest_rsn_no = rest_rsn_no;
		this.stat = stat;
		this.start_date = start_date;
		this.end_date = end_date;
		this.text = text;
	}


	public Date getStart_date() {
		return start_date;
	}

	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}

	public Date getEnd_date() {
		return end_date;
	}

	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}

	public String getRest_no() {
		return rest_no;
	}

	public void setRest_no(String rest_no) {
		this.rest_no = rest_no;
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

	public int getRest_rsn_no() {
		return rest_rsn_no;
	}

	public void setRest_rsn_no(int rest_rsn_no) {
		this.rest_rsn_no = rest_rsn_no;
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

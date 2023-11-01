package member.pf.vol;

import java.sql.Date;

public class Vol_DTO {

	private String vol_no;
	private String pf_no;
	private String member_no;
	private String org;
	private String content;
	private int stat;
	private Date start_date;
	private Date end_date;
	private String detail;
	
	
	public Vol_DTO() {
		super();
	}
	
	public Vol_DTO(String vol_no, String pf_no, String member_no, String org, String content, int stat, Date start_date, Date end_date, String detail) {
		this.vol_no = vol_no;
		this.pf_no = pf_no;
		this.member_no = member_no;
		this.org = org;
		this.content = content;
		this.stat = stat;
		this.start_date = start_date;
		this.end_date = end_date;
		this.detail = detail;
	}

	public String getVol_no() {
		return vol_no;
	}

	public void setVol_no(String vol_no) {
		this.vol_no = vol_no;
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

	public String getOrg() {
		return org;
	}

	public void setOrg(String org) {
		this.org = org;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getStat() {
		return stat;
	}

	public void setStat(int stat) {
		this.stat = stat;
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

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}
	
}

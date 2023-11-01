package member.apply.apply;

import java.sql.Date;

public class Apply_DTO {
	
	private String apply_id;
	private String member_id;
	private int apply_stat_no;
	private String apply_form_id;
	private Date apply_date;
	
	public Apply_DTO() {
		super();
	}
	
	public Apply_DTO(String apply_id, String member_id, int apply_stat_no, String apply_form_id, Date apply_date) {
		this.apply_id = apply_id;
		this.member_id = member_id;
		this.apply_stat_no = apply_stat_no;
		this.apply_form_id = apply_form_id;
		this.apply_date = apply_date;
	}
	public Apply_DTO(String apply_id, String apply_form_id) {
		this.apply_id = apply_id;
		this.apply_form_id = apply_form_id;
	}
	
	public String getApply_id() {
		return apply_id;
	}

	public void setApply_id(String apply_id) {
		this.apply_id = apply_id;
	}

	public String getMember_id() {
		return member_id;
	}

	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}

	public int getApply_stat_no() {
		return apply_stat_no;
	}

	public void setApply_stat_no(int apply_stat_no) {
		this.apply_stat_no = apply_stat_no;
	}

	public String getApply_form_id() {
		return apply_form_id;
	}

	public void setApply_form_id(String apply_form_id) {
		this.apply_form_id = apply_form_id;
	}

	public Date getApply_date() {
		return apply_date;
	}

	public void setApply_date(Date apply_date) {
		this.apply_date = apply_date;
	}
	
	
	
}

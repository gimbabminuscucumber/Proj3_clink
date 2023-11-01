package member.recommand.rec_form;

import java.sql.Date;

public class Rec_Form_DTO {

	private int rec_form_no;
	private String rec_form_id;
	private String pf_no;
	private String rec_ask_id;
	private String member_no;
	private String detail;
	private Date form_date;
	
	public Rec_Form_DTO() {
		super();
	}
	
	// controller 에서 각 칼럼을 확인하기 위해 사용되는 메소드 (toString)
	@Override
	public String toString() {
		return rec_form_id;
	}
	
	public Rec_Form_DTO(int rec_form_no, String rec_form_id, String pf_no, String member_no, String rec_ask_id, String detail, Date form_date) {
		super();
	}
	
	public Rec_Form_DTO(String rec_form_id, String pf_no, String member_no, String rec_ask_id, String detail, Date form_date) {
		this.rec_form_id = rec_form_id;
		this.pf_no = pf_no;
		this.member_no = member_no;
		this.rec_ask_id = rec_ask_id;
		this.detail = detail;
		this.form_date = form_date;
	}

	public int getRec_form_no() {
		return rec_form_no;
	}

	public void setRec_form_no(int rec_form_no) {
		this.rec_form_no = rec_form_no;
	}

	public String getRec_form_id() {
		return rec_form_id;
	}

	public void setRec_form_id(String rec_form_id) {
		this.rec_form_id = rec_form_id;
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

	public String getRec_ask_id() {
		return rec_ask_id;
	}

	public void setRec_ask_id(String rec_ask_id) {
		this.rec_ask_id = rec_ask_id;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public Date getForm_date() {
		return form_date;
	}

	public void setForm_date(Date form_date) {
		this.form_date = form_date;
	}
	
	
}

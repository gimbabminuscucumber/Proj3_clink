package member.apply.apply_form;

public class Apply_Form_DTO {

	private String apply_form_id;
	private String member_id;
	private String title;
	private String detail;
	
	public Apply_Form_DTO() {
		super();
	}

	public Apply_Form_DTO(String apply_form_id, String member_id, String title, String detail) {
		this.apply_form_id = apply_form_id;
		this.member_id = member_id;
		this.title = title;
		this.detail = detail;
	}

	public Apply_Form_DTO(String apply_form_id, String title, String detail) {
		this.apply_form_id = apply_form_id;
		this.title = title;
		this.detail = detail;
	}

	public Apply_Form_DTO(String title, String detail) {
		this.title = title;
		this.detail = detail;
	}

	public String getMember_id() {
		return member_id;
	}

	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getApply_form_id() {
		return apply_form_id;
	}

	public void setApply_form_id(String apply_form_id) {
		this.apply_form_id = apply_form_id;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}	
	
	
	
}

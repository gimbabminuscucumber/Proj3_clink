package tech.tech_test_opt;

public class Tech_Test_Opt_DTO {
	private int tech_test_opt_no;
	private int tech_test_qna_no;
	private String detail;
	private int tech_correct;
	
	public Tech_Test_Opt_DTO() {}

	public Tech_Test_Opt_DTO(int tech_test_opt_no, int tech_test_qna_no, String detail, int tech_correct) {
		super();
		this.tech_test_opt_no = tech_test_opt_no;
		this.tech_test_qna_no = tech_test_qna_no;
		this.detail = detail;
		this.tech_correct = tech_correct;
	}

	public int getTech_test_opt_no() {
		return tech_test_opt_no;
	}

	public void setTech_test_opt_no(int tech_test_opt_no) {
		this.tech_test_opt_no = tech_test_opt_no;
	}

	public int getTech_test_qna_no() {
		return tech_test_qna_no;
	}

	public void setTech_test_qna_no(int tech_test_qna_no) {
		this.tech_test_qna_no = tech_test_qna_no;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public int getTech_correct() {
		return tech_correct;
	}

	public void setTech_correct(int tech_correct) {
		this.tech_correct = tech_correct;
	}
	
	
}

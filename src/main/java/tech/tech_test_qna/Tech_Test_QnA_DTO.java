package tech.tech_test_qna;

public class Tech_Test_QnA_DTO {
	private int tech_test_qna_no;
	private int tech_test_no;
	private String question;
	
	public Tech_Test_QnA_DTO() {}
	
	public Tech_Test_QnA_DTO(int tech_test_qna_no, int tech_test_no, String question) {
		super();
		this.tech_test_qna_no = tech_test_qna_no;
		this.tech_test_no = tech_test_no;
		this.question = question;
	}

	public int getTech_test_qna_no() {
		return tech_test_qna_no;
	}

	public void setTech_test_qna_no(int tech_test_qna_no) {
		this.tech_test_qna_no = tech_test_qna_no;
	}

	public int getTech_test_no() {
		return tech_test_no;
	}

	public void setTech_test_no(int tech_test_no) {
		this.tech_test_no = tech_test_no;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}
	
	
}

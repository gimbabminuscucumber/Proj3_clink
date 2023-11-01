package tech.extest_pract;

public class ExTest_Pract_DTO {
	private int extest_pract_no;
	private int tech_test_no;
	private String question;
	
	public ExTest_Pract_DTO() {}

	public ExTest_Pract_DTO(int extest_pract_no, int tech_test_no, String question) {
		super();
		this.extest_pract_no = extest_pract_no;
		this.tech_test_no = tech_test_no;
		this.question = question;
	}


	public int getExtest_pract_no() {
		return extest_pract_no;
	}

	public void setExtest_pract_no(int extest_pract_no) {
		this.extest_pract_no = extest_pract_no;
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

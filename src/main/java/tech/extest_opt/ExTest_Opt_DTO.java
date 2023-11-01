package tech.extest_opt;

public class ExTest_Opt_DTO {
	private int extest_opt_no;
	private int extest_pract_no;
	private String detail;
	private int ex_correct;
	
	public ExTest_Opt_DTO() {}

	public ExTest_Opt_DTO(int extest_opt_no, int extest_pract_no, String detail, int ex_correct) {
		super();
		this.extest_opt_no = extest_opt_no;
		this.extest_pract_no = extest_pract_no;
		this.detail = detail;
		this.ex_correct = ex_correct;
	}

	public int getExtest_opt_no() {
		return extest_opt_no;
	}

	public void setExtest_opt_no(int extest_opt_no) {
		this.extest_opt_no = extest_opt_no;
	}

	public int getExtest_pract_no() {
		return extest_pract_no;
	}

	public void setExtest_pract_no(int extest_pract_no) {
		this.extest_pract_no = extest_pract_no;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public int getEx_correct() {
		return ex_correct;
	}

	public void setEx_correct(int ex_correct) {
		this.ex_correct = ex_correct;
	}
	
	
}

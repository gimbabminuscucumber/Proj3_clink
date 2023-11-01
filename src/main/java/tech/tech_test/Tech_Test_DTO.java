package tech.tech_test;

public class Tech_Test_DTO {
	private int tech_test_no;
	private int tech_name_cno;
	private int tech_test_certi_no;
	
	public Tech_Test_DTO() {}

	public Tech_Test_DTO(int tech_test_no, int tech_name_cno, int tech_test_certi_no) {
		super();
		this.tech_test_no = tech_test_no;
		this.tech_name_cno = tech_name_cno;
		this.tech_test_certi_no = tech_test_certi_no;
	}

	public int getTech_test_no() {
		return tech_test_no;
	}

	public void setTech_test_no(int tech_test_no) {
		this.tech_test_no = tech_test_no;
	}

	public int getTech_name_cno() {
		return tech_name_cno;
	}

	public void setTech_name_cno(int tech_name_cno) {
		this.tech_name_cno = tech_name_cno;
	}

	public int getTech_test_certi_no() {
		return tech_test_certi_no;
	}

	public void setTech_test_certi_no(int tech_test_certi_no) {
		this.tech_test_certi_no = tech_test_certi_no;
	}
	
	
}

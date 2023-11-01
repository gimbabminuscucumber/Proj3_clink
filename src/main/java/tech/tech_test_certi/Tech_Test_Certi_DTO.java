package tech.tech_test_certi;

public class Tech_Test_Certi_DTO {
	private int tech_test_certi_no;
	private int tech_name_cno;
	private String badge;
	
	public Tech_Test_Certi_DTO() {}

	public Tech_Test_Certi_DTO(int tech_test_certi_no, int tech_name_cno, String badge) {
		super();
		this.tech_test_certi_no = tech_test_certi_no;
		this.tech_name_cno = tech_name_cno;
		this.badge = badge;
	}

	public int getTech_test_certi_no() {
		return tech_test_certi_no;
	}

	public void setTech_test_certi_no(int tech_test_certi_no) {
		this.tech_test_certi_no = tech_test_certi_no;
	}

	public int getTech_name_cno() {
		return tech_name_cno;
	}

	public void setTech_name_cno(int tech_name_cno) {
		this.tech_name_cno = tech_name_cno;
	}

	public String getBadge() {
		return badge;
	}

	public void setBadge(String badge) {
		this.badge = badge;
	}
	
	
}

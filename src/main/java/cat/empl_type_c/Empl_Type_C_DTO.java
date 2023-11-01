package cat.empl_type_c;

public class Empl_Type_C_DTO {

	private int empl_type_cno;
	private String empl_type;
	
	public Empl_Type_C_DTO() {
		super();
	}

	public Empl_Type_C_DTO(String empl_type) {
		this.empl_type = empl_type;
	}

	public Empl_Type_C_DTO(int empl_type_cno, String empl_type) {
		this.empl_type_cno = empl_type_cno;
		this.empl_type = empl_type;
	}
	
	public int getEmpl_type_cno() {
		return empl_type_cno;
	}

	public void setEmpl_type_cno(int empl_type_cno) {
		this.empl_type_cno = empl_type_cno;
	}

	public String getEmpl_type() {
		return empl_type;
	}

	public void setEmpl_type(String empl_type) {
		this.empl_type = empl_type;
	}
	
	
}

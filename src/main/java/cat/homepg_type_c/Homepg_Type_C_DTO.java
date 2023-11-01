package cat.homepg_type_c;

public class Homepg_Type_C_DTO {
	private int homepg_type_cno;
	private String name;
	
	public Homepg_Type_C_DTO() {}

	public Homepg_Type_C_DTO(int homepg_type_cno, String name) {
		super();
		this.homepg_type_cno = homepg_type_cno;
		this.name = name;
	}

	public int getHomepg_type_cno() {
		return homepg_type_cno;
	}

	public void setHomepg_type_cno(int homepg_type_cno) {
		this.homepg_type_cno = homepg_type_cno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	
}

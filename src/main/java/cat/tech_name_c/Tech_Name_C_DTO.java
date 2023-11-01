package cat.tech_name_c;

public class Tech_Name_C_DTO {
	private int tech_name_cno;
	private String name;
	private String text;
	
	public Tech_Name_C_DTO() {}

	public Tech_Name_C_DTO(int tech_name_cno, String name, String text) {
		super();
		this.tech_name_cno = tech_name_cno;
		this.name = name;
		this.text = text;
	}

	public int getTech_name_cno() {
		return tech_name_cno;
	}

	public void setTech_name_cno(int tech_name_cno) {
		this.tech_name_cno = tech_name_cno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	
}

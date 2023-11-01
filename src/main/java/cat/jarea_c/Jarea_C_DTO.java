package cat.jarea_c;

public class Jarea_C_DTO {
	
	private int jarea_cno;
	private String jarea_type;
	
	public Jarea_C_DTO() {
		super();
	}

	public Jarea_C_DTO(int jarea_cno, String jarea_type) {
		this.jarea_cno = jarea_cno;
		this.jarea_type = jarea_type;
	}

	public Jarea_C_DTO(int jarea_cno) {
		this.jarea_cno = jarea_cno;
	}

	public Jarea_C_DTO(String jarea_type) {
		this.jarea_type = jarea_type;
	}

	public int getJarea_cno() {
		return jarea_cno;
	}

	public void setJarea_cno(int jarea_cno) {
		this.jarea_cno = jarea_cno;
	}

	public String getJarea_type() {
		return jarea_type;
	}

	public void setJarea_type(String jarea_type) {
		this.jarea_type = jarea_type;
	}
	
	
}

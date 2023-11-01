package cat.lv_c;

public class Lv_C_DTO {

	private int lv_cno;
	private String lv_type;
	
	public Lv_C_DTO() {
		super();
	}

	public Lv_C_DTO(String lv_type) {
		this.lv_type = lv_type;
	}

	public Lv_C_DTO(int lv_cno, String lv_type) {
		this.lv_cno = lv_cno;
		this.lv_type = lv_type;
	}

	public int getLv_cno() {
		return lv_cno;
	}

	public void setLv_cno(int lv_cno) {
		this.lv_cno = lv_cno;
	}

	public String getLv_type() {
		return lv_type;
	}

	public void setLv_type(String lv_type) {
		this.lv_type = lv_type;
	}
	
	
}

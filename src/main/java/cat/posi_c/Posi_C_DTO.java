package cat.posi_c;

public class Posi_C_DTO {

	private int posi_cno;
	private String posi_type;
	
	public Posi_C_DTO() {
		super();
	}

	public Posi_C_DTO(String posi_type) {
		this.posi_type = posi_type;
	}

	public Posi_C_DTO(int posi_cno, String posi_type) {
		this.posi_cno = posi_cno;
		this.posi_type = posi_type;
	}

	public int getPosi_cno() {
		return posi_cno;
	}

	public void setPosi_cno(int posi_cno) {
		this.posi_cno = posi_cno;
	}

	public String getPosi_type() {
		return posi_type;
	}

	public void setPosi_type(String posi_type) {
		this.posi_type = posi_type;
	}
	
	
}

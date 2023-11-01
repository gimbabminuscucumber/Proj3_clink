package business.posi_mng;

public class Posi_Mng_DTO {
	private int posi_mng_no;
	private int depart_mng_no;
	private String name;
	
	public Posi_Mng_DTO() {}
	
	public Posi_Mng_DTO(int posi_mng_no, String name) {
		super();
		this.posi_mng_no = posi_mng_no;
		this.name = name;
	}
	
	public Posi_Mng_DTO(int posi_mng_no, int depart_mng_no, String name) {
		super();
		this.posi_mng_no = posi_mng_no;
		this.depart_mng_no = depart_mng_no;
		this.name = name;
	}

	public int getPosi_mng_no() {
		return posi_mng_no;
	}

	public void setPosi_mng_no(int posi_mng_no) {
		this.posi_mng_no = posi_mng_no;
	}

	public int getDepart_mng_no() {
		return depart_mng_no;
	}

	public void setDepart_mng_no(int depart_mng_no) {
		this.depart_mng_no = depart_mng_no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}

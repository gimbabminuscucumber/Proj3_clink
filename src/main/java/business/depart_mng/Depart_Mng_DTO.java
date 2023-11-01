package business.depart_mng;

import path.Bumo;

public class Depart_Mng_DTO extends Bumo{
	private int depart_mng_no;
	private String bmember_id;
	private String name;
	
	public Depart_Mng_DTO() {}
	
	public Depart_Mng_DTO(int depart_mng_no, String name) {
		this.depart_mng_no = depart_mng_no;
		this.name = name;
	}
	
	public Depart_Mng_DTO(int depart_mng_no, String bmember_id, String name) {
		super();
		this.depart_mng_no = depart_mng_no;
		this.bmember_id = bmember_id;
		this.name = name;
	}

	public int getDepart_mng_no() {
		return depart_mng_no;
	}

	public void setDepart_mng_no(int depart_mng_no) {
		this.depart_mng_no = depart_mng_no;
	}

	public String getBmember_id() {
		return bmember_id;
	}

	public void setBmember_id(String bmember_id) {
		this.bmember_id = bmember_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}

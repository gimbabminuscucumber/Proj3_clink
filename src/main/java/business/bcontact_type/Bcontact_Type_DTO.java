package business.bcontact_type;

public class Bcontact_Type_DTO {
	private int bcontact_type_no;
	private String type;
	
	public Bcontact_Type_DTO() {}
	
	public Bcontact_Type_DTO(int bcontact_type_no, String type) {
		super();
		this.bcontact_type_no = bcontact_type_no;
		this.type = type;
	}

	public int getBcontact_type_no() {
		return bcontact_type_no;
	}

	public void setBcontact_type_no(int bcontact_type_no) {
		this.bcontact_type_no = bcontact_type_no;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
	
}

package business.bcontact;

public class Bcontact_DTO {
	private int bcontact_no; // BCONTACT_NO
	private String bmember_id;//BMEMBER_ID
	private int bcontact_type_no;//BCONTACT_TYPE_NO
	private String contact; // CONTACT
	 
	public Bcontact_DTO() {}
	
	public Bcontact_DTO(String bmember_id, int bcontact_type_no, String contact) {
		super();
		this.bmember_id = bmember_id;
		this.bcontact_type_no = bcontact_type_no;
		this.contact = contact;
	}
	
	public Bcontact_DTO(int bcontact_no, String bmember_id, int bcontact_type_no, String contact) {
		super();
		this.bcontact_no = bcontact_no;
		this.bmember_id = bmember_id;
		this.bcontact_type_no = bcontact_type_no;
		this.contact = contact;
	}


	public int getBcontact_no() {
		return bcontact_no;
	}


	public void setBcontact_no(int bcontact_no) {
		this.bcontact_no = bcontact_no;
	}


	public String getBmember_id() {
		return bmember_id;
	}


	public void setBmember_id(String bmember_id) {
		this.bmember_id = bmember_id;
	}


	public int getBcontact_type_no() {
		return bcontact_type_no;
	}


	public void setBcontact_type_no(int bcontact_type_no) {
		this.bcontact_type_no = bcontact_type_no;
	}


	public String getContact() {
		return contact;
	}


	public void setContact(String contact) {
		this.contact = contact;
	}
	
	
	
	
	
}

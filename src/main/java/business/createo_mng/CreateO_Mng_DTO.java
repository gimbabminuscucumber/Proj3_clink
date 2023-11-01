package business.createo_mng;

import path.Bumo;

public class CreateO_Mng_DTO extends Bumo{
	private int createo_mng_no;
	private String createo_mng_id;
	private String bmember_id;
	private int posi_mng_no;
	private String name;
	private String id;
	private String pw;
	private String salt;
	
	
	public CreateO_Mng_DTO() {}
	

	public CreateO_Mng_DTO(String createo_mng_id, String bmember_id, int posi_mng_no,String name,String id, String pw, String salt) {
		super();
		this.createo_mng_id = createo_mng_id;
		this.bmember_id = bmember_id;
		this.posi_mng_no = posi_mng_no;
		this.name = name;
		this.id = id;
		this.pw = pw;
		this.salt = salt;
	}

	public CreateO_Mng_DTO(int createo_mng_no, String createo_mng_id, String bmember_id, int posi_mng_no, String name,
			String id, String pw, String salt) {
		super();
		this.createo_mng_no = createo_mng_no;
		this.createo_mng_id = createo_mng_id;
		this.bmember_id = bmember_id;
		this.posi_mng_no = posi_mng_no;
		this.name = name;
		this.id = id;
		this.pw = pw;
		this.salt = salt;
	}



	
	public int getCreateo_mng_no() {
		return createo_mng_no;
	}


	public void setCreateo_mng_no(int createo_mng_no) {
		this.createo_mng_no = createo_mng_no;
	}


	public int getPosi_mng_no() {
		return posi_mng_no;
	}
	
	public void setPosi_mng_no(int posi_mng_no) {
		this.posi_mng_no = posi_mng_no;
	}
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCreateo_mng_id() {
		return createo_mng_id;
	}


	public void setCreateo_mng_id(String createo_mng_id) {
		this.createo_mng_id = createo_mng_id;
	}


	public String getBmember_id() {
		return bmember_id;
	}


	public void setBmember_id(String bmember_id) {
		this.bmember_id = bmember_id;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getPw() {
		return pw;
	}


	public void setPw(String pw) {
		this.pw = pw;
	}


	public String getSalt() {
		return salt;
	}


	public void setSalt(String salt) {
		this.salt = salt;
	}
	
	@Override
	public String toString() {
		return "[ bmember_id:"+bmember_id+"  createo_mng_id:"+createo_mng_id+"  id:"+id;
	}
}

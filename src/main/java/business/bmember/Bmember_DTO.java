package business.bmember;

import java.sql.Date;

public class Bmember_DTO {
	private int bmember_no;
	private String bmember_id;
	private int bm_stat_no;
	private String name;
	private String eNname;
	private String email;
	private String pw;
	private String salt;
	private Date join_date;
	private String regi_Number;
	private String group_Name;
	
	public Bmember_DTO() {}

	public Bmember_DTO(int bmember_no, String bmember_id, int bm_stat_no, String name, String eNname, String email, String pw, String salt,
			Date join_date, String regi_Number, String group_Name) {
		super();
		this.bmember_no = bmember_no;
		this.bmember_id = bmember_id;
		this.bm_stat_no = bm_stat_no;
		this.name = name;
		this.eNname = eNname;
		this.email = email;
		this.pw = pw;
		this.salt = salt;
		this.join_date = join_date;
		this.regi_Number = regi_Number;
		this.group_Name = group_Name;
	}
	
	
	
	
	
	

	public int getBmember_no() {
		return bmember_no;
	}

	public void setBmember_no(int bmember_no) {
		this.bmember_no = bmember_no;
	}

	public int getBm_stat_no() {
		return bm_stat_no;
	}

	public void setBm_stat_no(int bm_stat_no) {
		this.bm_stat_no = bm_stat_no;
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

	public String geteNname() {
		return eNname;
	}

	public void seteNname(String eNname) {
		this.eNname = eNname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public Date getJoin_date() {
		return join_date;
	}

	public void setJoin_date(Date join_date) {
		this.join_date = join_date;
	}

	public String getRegi_Number() {
		return regi_Number;
	}

	public void setRegi_Number(String regi_Number) {
		this.regi_Number = regi_Number;
	}

	public String getGroup_Name() {
		return group_Name;
	}

	public void setGroup_Name(String group_Name) {
		this.group_Name = group_Name;
	}
	
	
	
	
	
	
}

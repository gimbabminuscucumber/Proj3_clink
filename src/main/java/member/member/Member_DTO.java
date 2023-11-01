package member.member;

import java.sql.Date;

import path.Bumo;

public class Member_DTO extends Bumo{
	private int member_no;
	private String member_id;
	private String first_name;
	private String last_name;
	private String email;
	private String secret_pw;
	private String salt;
	private Date join_date;
	private Date birth;
	private int decl_cnt;
	private int mentor;
	private int mentee;
	
	public Member_DTO() {}

	public Member_DTO(int member_no, String member_id, String first_name, String last_name, String email,
			String secret_pw, String salt, Date join_date, Date birth, int decl_cnt, int mentor, int mentee) {
		super();
		this.member_no = member_no;
		this.member_id = member_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.secret_pw = secret_pw;
		this.salt = salt;
		this.join_date = join_date;
		this.birth = birth;
		this.decl_cnt = decl_cnt;
		this.mentor = mentor;
		this.mentee = mentee;
	}

	public int getMember_no() {
		return member_no;
	}

	public void setMember_no(int member_no) {
		this.member_no = member_no;
	}

	public String getMember_id() {
		return member_id;
	}

	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSecret_pw() {
		return secret_pw;
	}

	public void setSecret_pw(String secret_pw) {
		this.secret_pw = secret_pw;
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

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public int getDecl_cnt() {
		return decl_cnt;
	}

	public void setDecl_cnt(int decl_cnt) {
		this.decl_cnt = decl_cnt;
	}

	public int getMentor() {
		return mentor;
	}

	public void setMentor(int mentor) {
		this.mentor = mentor;
	}

	public int getMentee() {
		return mentee;
	}

	public void setMentee(int mentee) {
		this.mentee = mentee;
	}
	
	
	
}

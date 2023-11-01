package member.pf.edu;

public class Edu_DTO {
	private String edu_no;
	private String pf_no;
	private String member_no;
	private String school;
	private int stat;
	private int degree;
	private String major;
	private String gpa;
	
	public Edu_DTO() {
		super();
	}

	
	public Edu_DTO(String edu_no, String pf_no, String member_no, String school, int stat, int degree, String major, String gpa) {
		this.edu_no = edu_no;
		this.pf_no = pf_no;
		this.member_no = member_no;
		this.school = school;
		this.stat = stat;
		this.degree = degree;
		this.major = major;
		this.gpa = gpa;
	}


	public String getEdu_no() {
		return edu_no;
	}

	public void setEdu_no(String edu_no) {
		this.edu_no = edu_no;
	}

	public String getPf_no() {
		return pf_no;
	}

	public void setPf_no(String pf_no) {
		this.pf_no = pf_no;
	}

	public String getMember_no() {
		return member_no;
	}

	public void setMember_no(String member_no) {
		this.member_no = member_no;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public int getStat() {
		return stat;
	}

	public void setStat(int stat) {
		this.stat = stat;
	}

	public int getDegree() {
		return degree;
	}

	public void setDegree(int degree) {
		this.degree = degree;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getGpa() {
		return gpa;
	}

	public void setGpa(String gpa) {
		this.gpa = gpa;
	}
	
	
}

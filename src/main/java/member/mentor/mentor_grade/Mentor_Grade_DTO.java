package member.mentor.mentor_grade;

public class Mentor_Grade_DTO {
	private int mentor_grade_no;
	private String member_id;
	private int mentor_grade_mng_no;
	private int score;
	
	public Mentor_Grade_DTO() {}

	public Mentor_Grade_DTO(int mentor_grade_no, String member_id, int mentor_grade_mng_no, int score) {
		super();
		this.mentor_grade_no = mentor_grade_no;
		this.member_id = member_id;
		this.mentor_grade_mng_no = mentor_grade_mng_no;
		this.score = score;
	}

	public int getMentor_grade_no() {
		return mentor_grade_no;
	}

	public void setMentor_grade_no(int mentor_grade_no) {
		this.mentor_grade_no = mentor_grade_no;
	}

	public String getMember_id() {
		return member_id;
	}

	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}

	public int getMentor_grade_mng_no() {
		return mentor_grade_mng_no;
	}

	public void setMentor_grade_mng_no(int mentor_grade_mng_no) {
		this.mentor_grade_mng_no = mentor_grade_mng_no;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	
}

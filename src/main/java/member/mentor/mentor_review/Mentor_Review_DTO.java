package member.mentor.mentor_review;

import java.sql.Date;

public class Mentor_Review_DTO {
	private int mentor_review_no;
	private int mentor_contact_no;
	private String member_id;
	private Date review_date;
	private String content;
	private int score;
	
	public Mentor_Review_DTO() {}

	public Mentor_Review_DTO(int mentor_review_no, int mentor_contact_no, String member_id, Date review_date, String content,
			int score) {
		super();
		this.mentor_review_no = mentor_review_no;
		this.mentor_contact_no = mentor_contact_no;
		this.member_id = member_id;
		this.review_date = review_date;
		this.content = content;
		this.score = score;
	}

	public int getMentor_review_no() {
		return mentor_review_no;
	}

	public void setMentor_review_no(int mentor_review_no) {
		this.mentor_review_no = mentor_review_no;
	}

	

	public int getMentor_contact_no() {
		return mentor_contact_no;
	}

	public void setMentor_contact_no(int mentor_contact_no) {
		this.mentor_contact_no = mentor_contact_no;
	}

	public String getMember_id() {
		return member_id;
	}

	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}

	public Date getReview_date() {
		return review_date;
	}

	public void setReview_date(Date review_date) {
		this.review_date = review_date;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	
}

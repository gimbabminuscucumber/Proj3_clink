package member.pf.exam;

import java.sql.Date;

public class Exam_DTO {

	private int exam_no;
	private int pf_no;
	private String member_no;
	private int jarea_cno;
	private int legi;
	private String name;
	private int score;
	private int lv;
	private Date exam_date;
	private String detail;
	
	public Exam_DTO() {
		super();
	}
	
	public Exam_DTO(int exam_no, int pf_no, String member_no, int jarea_cno, int legi, String name, int score, int lv, Date exam_date, String detail) {
		this.exam_no = exam_no;
		this.pf_no = pf_no;
		this.member_no = member_no;
		this.jarea_cno = jarea_cno;
		this.legi = legi;
		this.name = name;
		this.score = score;
		this.lv = lv;
		this.exam_date = exam_date;
		this.detail = detail;
	}

	public Exam_DTO(int jarea_cno, int legi, String name, int score, int lv, Date exam_date, String detail) {
		this.jarea_cno = jarea_cno;
		this.legi = legi;
		this.name = name;
		this.score = score;
		this.lv = lv;
		this.exam_date = exam_date;
		this.detail = detail;
	}

	public int getExam_no() {
		return exam_no;
	}

	public void setExam_no(int exam_no) {
		this.exam_no = exam_no;
	}

	public int getPf_no() {
		return pf_no;
	}

	public void setPf_no(int pf_no) {
		this.pf_no = pf_no;
	}

	public String getMember_no() {
		return member_no;
	}

	public void setMember_no(String member_no) {
		this.member_no = member_no;
	}

	public int getJarea_cno() {
		return jarea_cno;
	}

	public void setJarea_cno(int jarea_cno) {
		this.jarea_cno = jarea_cno;
	}

	public int getLegi() {
		return legi;
	}

	public void setLegi(int legi) {
		this.legi = legi;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getLv() {
		return lv;
	}

	public void setLv(int lv) {
		this.lv = lv;
	}

	public Date getExam_date() {
		return exam_date;
	}

	public void setExam_date(Date exam_date) {
		this.exam_date = exam_date;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}
	
	
}

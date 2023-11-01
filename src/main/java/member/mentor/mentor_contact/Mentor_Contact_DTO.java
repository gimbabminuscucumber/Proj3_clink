package member.mentor.mentor_contact;

import java.sql.Date;

public class Mentor_Contact_DTO {
	private int mentor_contact_no;
	private String mentor;
	private String mentee;
	private Date sent_date;
	private int stat;
	private Date start_date;
	private Date end_date;
	
	public Mentor_Contact_DTO() {}

	public Mentor_Contact_DTO(int mentor_contact_no, String mentor, String mentee, Date sent_date, int stat,
			Date start_date, Date end_date) {
		super();
		this.mentor_contact_no = mentor_contact_no;
		this.mentor = mentor;
		this.mentee = mentee;
		this.sent_date = sent_date;
		this.stat = stat;
		this.start_date = start_date;
		this.end_date = end_date;
	}

	public int getMentor_contact_no() {
		return mentor_contact_no;
	}

	public void setMentor_contact_no(int mentor_contact_no) {
		this.mentor_contact_no = mentor_contact_no;
	}

	public String getMentor() {
		return mentor;
	}

	public void setMentor(String mentor) {
		this.mentor = mentor;
	}

	public String getMentee() {
		return mentee;
	}

	public void setMentee(String mentee) {
		this.mentee = mentee;
	}

	public Date getSent_date() {
		return sent_date;
	}

	public void setSent_date(Date sent_date) {
		this.sent_date = sent_date;
	}

	public int getStat() {
		return stat;
	}

	public void setStat(int stat) {
		this.stat = stat;
	}

	public Date getStart_date() {
		return start_date;
	}

	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}

	public Date getEnd_date() {
		return end_date;
	}

	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}
	
	
}

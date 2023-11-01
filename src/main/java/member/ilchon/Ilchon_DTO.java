package member.ilchon;

import java.sql.Date;

public class Ilchon_DTO {
	private int ilchon_no;
	private String id1;
	private String id2;
	private int stat;
	private Date sent_date;
	private Date accepted;
	private int type;
	private int groupno;
	
	public Ilchon_DTO() {}
	

	public Ilchon_DTO(String id1, String id2,int type,int groupno) {
		super();
		this.id1 = id1;
		this.id2 = id2;
		this.type = type;
		this.groupno = groupno;
	}
	
	public Ilchon_DTO(int ilchon_no, String id1, String id2, int stat, Date sent_date, Date accepted,int type,
			int groupno) {
		super();
		this.ilchon_no = ilchon_no;
		this.id1 = id1;
		this.id2 = id2;
		this.stat = stat;
		this.sent_date = sent_date;
		this.accepted = accepted;
		this.type = type;
		this.groupno = groupno;
	}

	public int getIlchon_no() {
		return ilchon_no;
	}

	public void setIlchon_no(int ilchon_no) {
		this.ilchon_no = ilchon_no;
	}



	public String getId1() {
		return id1;
	}

	public void setId1(String id1) {
		this.id1 = id1;
	}

	public String getId2() {
		return id2;
	}

	public void setId2(String id2) {
		this.id2 = id2;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getStat() {
		return stat;
	}

	public void setStat(int stat) {
		this.stat = stat;
	}

	public Date getSent_date() {
		return sent_date;
	}

	public void setSent_date(Date sent_date) {
		this.sent_date = sent_date;
	}

	public Date getAccepted() {
		return accepted;
	}

	public void setAccepted(Date accepted) {
		this.accepted = accepted;
	}
	
	public int getGroupno() {
		return groupno;
	}
	
	public void setGroupno(int groupno) {
		this.groupno = groupno;
	}
	
	
	
	
	
}	

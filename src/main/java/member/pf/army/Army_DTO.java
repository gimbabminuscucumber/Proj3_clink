package member.pf.army;

import java.sql.Date;

public class Army_DTO {

	private String army_no;
	private String pf_no;
	private String member_no;
	private int opt;
	private int type;
	private int disch;
	private String rsn;
	private Date start_date;
	private Date end_date;
	private int termStat;

	public Army_DTO() {
		super();
	}
	
	public Army_DTO(String army_no, String pf_no, String member_no, int opt, int type, int disch, String rsn, Date start_date, Date end_date, int termStat) {
		this.army_no = army_no;
		this.pf_no = pf_no;
		this.member_no = member_no;
		this.opt = opt;
		this.type = type;
		this.disch = disch;
		this.rsn = rsn;
		this.start_date = start_date;
		this.end_date = end_date;
		this.termStat = termStat;
	}

	public Army_DTO(String apply_no, int opt, int type, int disch, String rsn, Date start_date, Date end_date, int termStat) {
		this.opt = opt;
		this.type = type;
		this.disch = disch;
		this.rsn = rsn;
		this.start_date = start_date;
		this.end_date = end_date;
		this.termStat = termStat;
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

	public String getArmy_no() {
		return army_no;
	}

	public void setArmy_no(String army_no) {
		this.army_no = army_no;
	}

	public int getOpt() {
		return opt;
	}

	public void setOpt(int opt) {
		this.opt = opt;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getDisch() {
		return disch;
	}

	public void setDisch(int disch) {
		this.disch = disch;
	}

	public String getRsn() {
		return rsn;
	}

	public void setRsn(String rsn) {
		this.rsn = rsn;
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

	public int getTermStat() {
		return termStat;
	}

	public void setTermStat(int termStat) {
		this.termStat = termStat;
	}
	
	
	
	

}

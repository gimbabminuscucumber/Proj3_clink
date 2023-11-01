package member.recommand.rec_ask;

import java.sql.Date;

public class Rec_Ask_DTO {
	
	private int rec_ask_no;
	private String rec_ask_id;
	private String member_no;
	private String to_member;
	private String content;
	private Date ask_date;
	private int relation_no;
	
	public Rec_Ask_DTO() {
		super();
	}
	
	public Rec_Ask_DTO(int rec_ask_no, String rec_ask_id, String member_no, String to_member, String content, Date ask_date, int relation_no) {
		this.rec_ask_no = rec_ask_no;
		this.rec_ask_id = rec_ask_id;
		this.member_no = member_no;
		this.to_member = to_member;
		this.content = content;
		this.ask_date = ask_date;
		this.relation_no = relation_no;
	}
	
	public Rec_Ask_DTO(String rec_ask_id, String member_no, String to_member, String content, Date ask_date, int relation_no) {
		this.rec_ask_id = rec_ask_id;
		this.member_no = member_no;
		this.to_member = to_member;
		this.content = content;
		this.ask_date = ask_date;
		this.relation_no = relation_no;
	}

	public int getRec_ask_no() {
		return rec_ask_no;
	}

	public void setRec_ask_no(int rec_ask_no) {
		this.rec_ask_no = rec_ask_no;
	}

	public String getRec_ask_id() {
		return rec_ask_id;
	}

	public void setRec_ask_id(String rec_ask_id) {
		this.rec_ask_id = rec_ask_id;
	}

	public String getMember_no() {
		return member_no;
	}

	public void setMember_no(String member_no) {
		this.member_no = member_no;
	}

	public String getTo_member() {
		return to_member;
	}

	public void setTo_member(String to_member) {
		this.to_member = to_member;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getAsk_date() {
		return ask_date;
	}

	public void setAsk_date(Date ask_date) {
		this.ask_date = ask_date;
	}

	public int getRelation_no() {
		return relation_no;
	}

	public void setRelation_no(int relation_no) {
		this.relation_no = relation_no;
	}
	
	
}

package chat.chat;

import java.sql.Date;

public class Chat_DTO {
	private int chat_no;
	private int chat_other_no;
	private int report;
	private int block;
	private int stat;
	private String detail;
	private Date receive;
	private Date sent;
	private String chat_file;
	private int del;
	
	public Chat_DTO() {}

	public Chat_DTO(int chat_other_no, String detail,
			 String chat_file,int stat) {
		super();
		this.chat_other_no = chat_other_no;
		this.detail = detail;
		this.chat_file = chat_file;
		this.stat = stat;
	}
	
	public Chat_DTO(int chat_no, int chat_other_no, int report, int block, int stat, String detail, Date receive,
			Date sent, String chat_file, int del) {
		super();
		this.chat_no = chat_no;
		this.chat_other_no = chat_other_no;
		this.report = report;
		this.block = block;
		this.stat = stat;
		this.detail = detail;
		this.receive = receive;
		this.sent = sent;
		this.chat_file = chat_file;
		this.del = del;
	}

	public int getChat_no() {
		return chat_no;
	}

	public void setChat_no(int chat_no) {
		this.chat_no = chat_no;
	}

	public int getChat_other_no() {
		return chat_other_no;
	}

	public void setChat_other_no(int chat_other_no) {
		this.chat_other_no = chat_other_no;
	}

	public int getReport() {
		return report;
	}

	public void setReport(int report) {
		this.report = report;
	}

	public int getBlock() {
		return block;
	}

	public void setBlock(int block) {
		this.block = block;
	}

	public int getStat() {
		return stat;
	}

	public void setStat(int stat) {
		this.stat = stat;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public Date getReceive() {
		return receive;
	}

	public void setReceive(Date receive) {
		this.receive = receive;
	}

	public Date getSent() {
		return sent;
	}

	public void setSent(Date sent) {
		this.sent = sent;
	}

	public String getChat_file() {
		return chat_file;
	}

	public void setChat_file(String chat_file) {
		this.chat_file = chat_file;
	}

	public int getDel() {
		return del;
	}

	public void setDel(int del) {
		this.del = del;
	}
	
	
}

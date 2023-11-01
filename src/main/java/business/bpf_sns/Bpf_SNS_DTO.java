package business.bpf_sns;

public class Bpf_SNS_DTO {
	private int bpf_sns_no;
	private String bmember_id;
	private int sns_cno;
	private String account;
	
	public Bpf_SNS_DTO() {}
	
	
	public Bpf_SNS_DTO(String bmember_id,int sns_cno, String account) {
		this.bmember_id = bmember_id;
		this.sns_cno =sns_cno;
		this.account = account;
	}
	
	public Bpf_SNS_DTO(int bpf_sns_no, String bmember_id, int sns_cno, String account) {
		super();
		this.bpf_sns_no = bpf_sns_no;
		this.bmember_id = bmember_id;
		this.sns_cno = sns_cno;
		this.account = account;
	}


	public int getSns_cno() {
		return sns_cno;
	}


	public void setSns_cno(int sns_cno) {
		this.sns_cno = sns_cno;
	}


	public int getBpf_sns_no() {
		return bpf_sns_no;
	}


	public void setBpf_sns_no(int bpf_sns_no) {
		this.bpf_sns_no = bpf_sns_no;
	}


	public String getBmember_id() {
		return bmember_id;
	}


	public void setBmember_id(String bmember_id) {
		this.bmember_id = bmember_id;
	}


	public String getAccount() {
		return account;
	}


	public void setAccount(String account) {
		this.account = account;
	}
	
	
	
	
	
	
}

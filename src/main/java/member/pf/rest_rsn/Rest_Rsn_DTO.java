package member.pf.rest_rsn;

public class Rest_Rsn_DTO {
	private int rest_rsn_no;
	private String rsn;
	
	public Rest_Rsn_DTO() {
		super();
	}

	public Rest_Rsn_DTO(int rest_rsn_no, String rsn) {
		this.rest_rsn_no = rest_rsn_no;
		this.rsn = rsn;
	}

	public int getRest_rsn_no() {
		return rest_rsn_no;
	}

	public void setRest_rsn_no(int rest_rsn_no) {
		this.rest_rsn_no = rest_rsn_no;
	}

	public String getRsn() {
		return rsn;
	}

	public void setRsn(String rsn) {
		this.rsn = rsn;
	}
	
	
}

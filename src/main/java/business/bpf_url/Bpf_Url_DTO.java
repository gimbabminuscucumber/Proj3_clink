package business.bpf_url;

public class Bpf_Url_DTO {
	private int bpf_url_no;
	private int homepg_type_cno;
	private String bmember_id;
	private String url;
	private String name;
	
	public Bpf_Url_DTO() {}
	
	public Bpf_Url_DTO(int bpf_url_no, int homepg_type_cno,String bmember_id, String url, String name) {
		super();
		this.bpf_url_no = bpf_url_no;
		this.homepg_type_cno = homepg_type_cno;
		this.bmember_id = bmember_id;
		this.url = url;
		this.name = name;
	}

	public int getHomepg_type_cno() {
		return homepg_type_cno;
	}

	public void setHomepg_type_cno(int homepg_type_cno) {
		this.homepg_type_cno = homepg_type_cno;
	}

	public int getBpf_url_no() {
		return bpf_url_no;
	}

	public void setBpf_url_no(int bpf_url_no) {
		this.bpf_url_no = bpf_url_no;
	}

	public String getBmember_id() {
		return bmember_id;
	}

	public void setBmember_id(String bmember_id) {
		this.bmember_id = bmember_id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	
}

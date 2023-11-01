package jpost.apply_mng;

public class Apply_Mng_DTO {

	private String apply_mng_no;
	private String jpost_id;
	private String apply_id;
	private int fit;
	
	// 디폴트 생성자
	public Apply_Mng_DTO() {
		super();
	}

	// Controller에서 받아야하는 데이터 생성자 
	public Apply_Mng_DTO(String apply_mng_no, String jpost_id, String apply_id, int fit) {
		this.apply_mng_no = apply_mng_no;
		this.jpost_id = jpost_id;
		this.apply_id = apply_id;
		this.fit = fit;
	}


	public String getApply_mng_no() {
		return apply_mng_no;
	}

	public void setApply_mng_no(String apply_mng_no) {
		this.apply_mng_no = apply_mng_no;
	}

	public String getJpost_id() {
		return jpost_id;
	}

	public void setJpost_id(String jpost_id) {
		this.jpost_id = jpost_id;
	}

	public String getApply_id() {
		return apply_id;
	}

	public void setApply_id(String apply_id) {
		this.apply_id = apply_id;
	}

	public int getFit() {
		return fit;
	}

	public void setFit(int fit) {
		this.fit = fit;
	}
	
	
	
	
	
}

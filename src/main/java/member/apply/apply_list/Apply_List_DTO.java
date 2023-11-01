package member.apply.apply_list;

public class Apply_List_DTO {
	private String apply_list_id;
	private int Apply_stat_no;
	private String apply_id;
	private String jpost_id;
	
	public Apply_List_DTO() {
		super();
	}
	
	public Apply_List_DTO(String apply_list_id, int Apply_stat_no, String apply_id, String jpost_id) {
		this.apply_list_id = apply_list_id;
		this.Apply_stat_no = Apply_stat_no;
		this.apply_id = apply_id;
		this.jpost_id = jpost_id;
	}

	public String getApply_list_id() {
		return apply_list_id;
	}

	public void setApply_list_id(String apply_list_id) {
		this.apply_list_id = apply_list_id;
	}

	public int getApply_stat_no() {
		return Apply_stat_no;
	}

	public void setApply_stat_no(int apply_stat_no) {
		Apply_stat_no = apply_stat_no;
	}

	public String getApply_id() {
		return apply_id;
	}

	public void setApply_id(String apply_id) {
		this.apply_id = apply_id;
	}

	public String getJpost_id() {
		return jpost_id;
	}

	public void setJpost_id(String jpost_id) {
		this.jpost_id = jpost_id;
	}
	
	
}

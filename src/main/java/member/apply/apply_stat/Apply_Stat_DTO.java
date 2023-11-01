package member.apply.apply_stat;

public class Apply_Stat_DTO {

	private int apply_stat_no;
	private String name;
	
	public Apply_Stat_DTO() {
		super();
	}
	
	public Apply_Stat_DTO(int apply_stat_no, String name) {
		this.apply_stat_no = apply_stat_no;
		this.name = name;
	}
	
	public Apply_Stat_DTO(String name) {
		this.name = name;
	}

	public int getApply_stat_no() {
		return apply_stat_no;
	}

	public void setApply_stat_no(int apply_stat_no) {
		this.apply_stat_no = apply_stat_no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}

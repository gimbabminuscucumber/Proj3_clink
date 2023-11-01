package cat.actstat_c;

public class ActStat_C_DTO {
	private int actstat_cno;
	private String name;
	
	public ActStat_C_DTO() {}

	public ActStat_C_DTO(int actstat_cno, String name) {
		super();
		this.actstat_cno = actstat_cno;
		this.name = name;
	}

	public int getActstat_cno() {
		return actstat_cno;
	}

	public void setActstat_cno(int actstat_cno) {
		this.actstat_cno = actstat_cno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}

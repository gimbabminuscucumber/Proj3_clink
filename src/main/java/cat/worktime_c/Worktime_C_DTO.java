package cat.worktime_c;

public class Worktime_C_DTO {
	
	private int worktime_cno;
	private String worktime_type;
	
	public Worktime_C_DTO() {
		super();
	}

	public Worktime_C_DTO(int worktime_cno, String worktime_type) {
		this.worktime_cno = worktime_cno;
		this.worktime_type = worktime_type;
	}

	public Worktime_C_DTO(int worktime_cno) {
		this.worktime_cno = worktime_cno;
	}

	public Worktime_C_DTO(String worktime_type) {
		this.worktime_type = worktime_type;
	}

	public int getWorktime_cno() {
		return worktime_cno;
	}

	public void setWorktime_cno(int worktime_cno) {
		this.worktime_cno = worktime_cno;
	}

	public String getWorktime_type() {
		return worktime_type;
	}

	public void setWorktime_type(String worktime_type) {
		this.worktime_type = worktime_type;
	}


}

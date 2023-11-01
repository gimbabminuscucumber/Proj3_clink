package cat.sns_c;

public class SNS_C_DTO {
	private int sns_cno;
	private String icon;
	private String name;
	
	public SNS_C_DTO() {}

	public SNS_C_DTO(int sns_cno, String icon, String name) {
		super();
		this.sns_cno = sns_cno;
		this.icon = icon;
		this.name = name;
	}


	public int getSns_cno() {
		return sns_cno;
	}

	public void setSns_cno(int sns_cno) {
		this.sns_cno = sns_cno;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}

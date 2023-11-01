package cat.city_c;

public class City_C_DTO {
	private int city_cno;
	private String ntcode;
	private String ctcode;
	private String ctname;
	
	public City_C_DTO() {
		super();
	}

	public City_C_DTO(int city_cno, String ntcode, String ctcode, String ctname) {
		this.city_cno = city_cno;
		this.ntcode = ntcode;
		this.ctcode = ctcode;
		this.ctname = ctname;
	}
	

	public int getCity_cno() {
		return city_cno;
	}

	public void setCity_cno(int city_cno) {
		this.city_cno = city_cno;
	}

	public String getNtcode() {
		return ntcode;
	}

	public void setNtcode(String ntcode) {
		this.ntcode = ntcode;
	}

	public String getCtcode() {
		return ctcode;
	}

	public void setCtcode(String ctcode) {
		this.ctcode = ctcode;
	}

	public String getCtname() {
		return ctname;
	}

	public void setCtname(String ctname) {
		this.ctname = ctname;
	}

	
	
}

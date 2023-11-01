package cat.socialact_c;

public class Socialact_C_DTO {
	private int socialact_cno;
	private String socialact_name;
	
	public Socialact_C_DTO() {
		super();
	}
	
	public Socialact_C_DTO(int socialact_cno, String socialact_name) {
		this.socialact_cno = socialact_cno;
		this.socialact_name = socialact_name;
	}

	public int getSocialact_cno() {
		return socialact_cno;
	}

	public void setSocialact_cno(int socialact_cno) {
		this.socialact_cno = socialact_cno;
	}

	public String getSocialact_name() {
		return socialact_name;
	}

	public void setSocialact_name(String socialact_name) {
		this.socialact_name = socialact_name;
	}
	
	
}

package member.mentor.mentor_grade_mng;

public class Mentor_Grade_Mng_DTO {
	private int mentor_garde_mng_no;
	private String name;
	private String img;
	private int score;
	
	public Mentor_Grade_Mng_DTO() {}

	public Mentor_Grade_Mng_DTO(int mentor_garde_mng_no, String name, String img, int score) {
		super();
		this.mentor_garde_mng_no = mentor_garde_mng_no;
		this.name = name;
		this.img = img;
		this.score = score;
	}

	public int getMentor_garde_mng_no() {
		return mentor_garde_mng_no;
	}

	public void setMentor_garde_mng_no(int mentor_garde_mng_no) {
		this.mentor_garde_mng_no = mentor_garde_mng_no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	

}

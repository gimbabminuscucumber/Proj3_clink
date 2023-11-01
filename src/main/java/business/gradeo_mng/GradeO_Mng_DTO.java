package business.gradeo_mng;

public class GradeO_Mng_DTO {


	private int gradeo_mng_no;
	private String craeteo_mng_id;
	private int grade1;
	private int grade2;
	private int grade3;
	private int grade4;

	
	public GradeO_Mng_DTO() {}


	public GradeO_Mng_DTO(String createo_mng_id,int grade1, int grade2, int grade3, int grade4) {
		super();
		this.craeteo_mng_id = createo_mng_id;
		this.grade1 = grade1;
		this.grade2 = grade2;
		this.grade3 = grade3;
		this.grade4 = grade4;
	}
	
	public GradeO_Mng_DTO(int gradeo_mng_no, String createo_mng_id, int grade1, int grade2, int grade3, int grade4) {
		super();
		this.gradeo_mng_no = gradeo_mng_no;
		this.craeteo_mng_id = createo_mng_id;
		this.grade1 = grade1;
		this.grade2 = grade2;
		this.grade3 = grade3;
		this.grade4 = grade4;
	}

	public String getCraeteo_mng_id() {
		return craeteo_mng_id;
	}
	
	
	public void setCraeteo_mng_id(String craeteo_mng_id) {
		this.craeteo_mng_id = craeteo_mng_id;
	}

	public int getGradeo_mng_no() {
		return gradeo_mng_no;
	}


	public void setGradeo_mng_no(int gradeo_mng_no) {
		this.gradeo_mng_no = gradeo_mng_no;
	}


	public int getGrade1() {
		return grade1;
	}


	public void setGrade1(int grade1) {
		this.grade1 = grade1;
	}


	public int getGrade2() {
		return grade2;
	}


	public void setGrade2(int grade2) {
		this.grade2 = grade2;
	}


	public int getGrade3() {
		return grade3;
	}


	public void setGrade3(int grade3) {
		this.grade3 = grade3;
	}


	public int getGrade4() {
		return grade4;
	}


	public void setGrade4(int grade4) {
		this.grade4 = grade4;
	}
	
	
	
	
	
	
	
}

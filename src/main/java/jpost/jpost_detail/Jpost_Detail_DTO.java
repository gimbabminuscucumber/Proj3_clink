package jpost.jpost_detail;

public class Jpost_Detail_DTO {
	
	private int jpost_detail_no;
	private String jpost_detail_id;
	private String jpost_id;
	private int jarea_cno;
	private int worktime_cno;
	private int empl_type_cno;
	private int posi_cno;
	private String task;
	private int lv_cno;
	private String salary;
	private int school_cno;
	private int type;

	// 디폴트 생성자
	public Jpost_Detail_DTO() {
		super();
	}
	
	// Controller에서 받아아하는 데이터 생성자
	public Jpost_Detail_DTO(int jarea_cno, int worktime_cno, int empl_type_cno, int posi_cno, String task, int lv_cno, String salary, int school_cno, int type) {
		this.jarea_cno = jarea_cno;
		this.worktime_cno = worktime_cno;
		this.empl_type_cno = empl_type_cno;
		this.posi_cno = posi_cno;
		this.task = task;
		this.lv_cno = lv_cno;
		this.salary = salary;
		this.school_cno = school_cno;
		this.type = type;
	}

	public Jpost_Detail_DTO(String jpost_detail_id, String jpost_id, int jarea_cno, int worktime_cno, int empl_type_cno, int posi_cno, String task, int lv_cno, String salary, int school_cno, int type) {
		this.jpost_detail_id = jpost_detail_id;
		this.jpost_id = jpost_id;
		this.jarea_cno = jarea_cno;
		this.worktime_cno = worktime_cno;
		this.empl_type_cno = empl_type_cno;
		this.posi_cno = posi_cno;
		this.task = task;
		this.lv_cno = lv_cno;
		this.salary = salary;
		this.school_cno = school_cno;
		this.type = type;
	}
	
	public int getJpost_detail_no() {
		return jpost_detail_no;
	}

	public void setJpost_detail_no(int jpost_detail_no) {
		this.jpost_detail_no = jpost_detail_no;
	}

	public String getJpost_detail_id() {
		return jpost_detail_id;
	}

	public void setjpost_detail_id(String jpost_detail_id) {
		this.jpost_detail_id = jpost_detail_id;
	}

	public String getJpost_id() {
		return jpost_id;
	}

	public void setJpost_id(String jpost_id) {
		this.jpost_id = jpost_id;
	}

	public int getEmpl_type_cno() {
		return empl_type_cno;
	}

	public void setEmpl_type_cno(int empl_type_cno) {
		this.empl_type_cno = empl_type_cno;
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getJarea_cno() {
		return jarea_cno;
	}

	public void setJarea_cno(int jarea_cno) {
		this.jarea_cno = jarea_cno;
	}

	public int getWorktime_cno() {
		return worktime_cno;
	}

	public void setWorktime_cno(int worktime_cno) {
		this.worktime_cno = worktime_cno;
	}

	public int getPosi_cno() {
		return posi_cno;
	}

	public void setPosi_cno(int posi_cno) {
		this.posi_cno = posi_cno;
	}

	public int getLv_cno() {
		return lv_cno;
	}

	public void setLv_cno(int lv_cno) {
		this.lv_cno = lv_cno;
	}

	public int getSchool_cno() {
		return school_cno;
	}

	public void setSchool_cno(int school_cno) {
		this.school_cno = school_cno;
	}

	public void setJpost_detail_id(String jpost_detail_id) {
		this.jpost_detail_id = jpost_detail_id;
	}

	
}

package member.recommand.relation;

public class Relation_DTO {

	private int relation_no;
	private String relation; 
	
	public Relation_DTO() {
		super();
	}

	public Relation_DTO(int relation_no, String relation) {
		this.relation_no = relation_no;
		this.relation = relation;
	}
	
	public Relation_DTO(String relation) {
		this.relation = relation;
	}

	public int getRelation_no() {
		return relation_no;
	}

	public void setRelation_no(int relation_no) {
		this.relation_no = relation_no;
	}

	public String getRelation() {
		return relation;
	}

	public void setRelation(String relation) {
		this.relation = relation;
	}
	
	
}

package member.mentor.mentor_grade;

public class Mentor_Grade_Service {
	private Mentor_Grade_DAO mentor_grade_dao;
	
	public Mentor_Grade_Service(Mentor_Grade_DAO mentor_grade_dao) {
		this.mentor_grade_dao = mentor_grade_dao;
	}
	
	public int createGrade(String member_id) {
		return mentor_grade_dao.createGrade(member_id);
	}
	
	public Mentor_Grade_DTO getMenteeGrade(String member_id) {
		return mentor_grade_dao.getMenteeGrade(member_id);
	}
	
	public int update(Mentor_Grade_DTO dto) {
		return mentor_grade_dao.update(dto);
	}
}

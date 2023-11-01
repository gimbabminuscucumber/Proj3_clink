package member.pf.exam;

import java.util.List;
import java.util.Map;

public class Exam_Service {

	private Exam_DAO exam_dao;
	
	public Exam_Service(Exam_DAO exam_dao) {
		this.exam_dao = exam_dao;
	}
	
	public int insert(Exam_DTO dto) {
		return exam_dao.insert(dto);
	}
	
	public int update(Exam_DTO dto) {
		return exam_dao.update(dto);
	}
	
	public int delete(String no) {
		return exam_dao.delete(no);
	}
	
	public List<Exam_DTO> selectList(Map<String, Object> map){
		return exam_dao.selectList(map);
	}
	
	public Map<String, Object> selectOne(String no){
		return exam_dao.selectOne(no);
	}
	
	public List<Map<String, Object>> examList(){
		return exam_dao.examList();
	}
}

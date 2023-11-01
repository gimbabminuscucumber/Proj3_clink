package member.pf.exam;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

public class Exam_DAO {

	private SqlSession sqlSession;
	
	public Exam_DAO(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	public int insert(Exam_DTO dto) {
		return sqlSession.insert("exam.insert", dto);
	}
	
	public int update(Exam_DTO dto) {
		return sqlSession.update("exam.update", dto);
	}
	
	public int delete(String no) {
		return sqlSession.delete("exam.delete", no);
	}
	
	public List<Exam_DTO> selectList(Map<String, Object> map){
		return sqlSession.selectList("exam.selectList", map);
	}
	
	public Map<String, Object> selectOne(String no){
		return sqlSession.selectOne("exam.selectOne", no);
	}
	
	public List<Map<String, Object>> examList(){
		return sqlSession.selectList("exam.examList()");
	}
}

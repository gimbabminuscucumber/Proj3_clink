package member.pf.cert;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

public class Cert_DAO {

	private SqlSession sqlSession;
	
	public Cert_DAO(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	public int insert(Cert_DTO dto) {
		return sqlSession.insert("cert.insert", dto);
	}
	
	public int update(Cert_DTO dto) {
		return sqlSession.update("cert.update", dto);
	}
	
	public int delete(String no) {
		return sqlSession.delete("cert.delete", no);
	}
	
	public List<Cert_DTO> selectList(Map<String, Object> map){
		return sqlSession.selectList("cert.selectList", map);
	}
	
	public Map<String, Object> selectOne(String no){
		return sqlSession.selectOne("cert.selectOne", no);
	}
	
	public List<Map<String, Object>> certList(){
		return sqlSession.selectList("cert.certList");
	}
	
}

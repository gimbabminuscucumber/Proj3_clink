package business.bpf_url;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

public class Bpf_Url_DAO {
	private SqlSession sqlsession;
	
	public Bpf_Url_DAO(SqlSession sqlsession) {
		this.sqlsession = sqlsession;
	}
	
	public List<Map<String,Object>> getUrlList(String id){
		return sqlsession.selectList("Bpf_Url.getUrlList", id);
	}
	
	public int insertUrl(Bpf_Url_DTO dto) {
		return sqlsession.insert("Bpf_Url.insertUrl",dto);
	}
	
	public int update(Bpf_Url_DTO dto) {
		return sqlsession.update("Bpf_Url.update", dto);
	}
	
	public int deleteOne(int no) {
		return sqlsession.delete("Bpf_Url.deleteOne", no);
	}
	
}

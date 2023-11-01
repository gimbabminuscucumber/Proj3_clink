package business.bpf_sns;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

public class Bpf_SNS_DAO {
	
	private SqlSession sqlsession;
	
	public Bpf_SNS_DAO(SqlSession sqlsession) {
		this.sqlsession = sqlsession; 
	}
	
	public List<Map<String,Object>> getSNSList(String id){
		return sqlsession.selectList("Bpf_SNS.getSNSList", id);
	}
	
	public int insert(Bpf_SNS_DTO dto) {
		return sqlsession.insert("Bpf_SNS.insert", dto);
	}
	
	public int delete(int no) {
		return sqlsession.delete("Bpf_SNS.delete",no);
	}
	
	public int update(Bpf_SNS_DTO dto) {
		return sqlsession.update("Bpf_SNS.update", dto);
	}
	
}

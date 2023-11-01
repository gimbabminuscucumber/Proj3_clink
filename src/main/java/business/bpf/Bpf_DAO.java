package business.bpf;

import java.util.Map;

import org.apache.ibatis.session.SqlSession;

public class Bpf_DAO {
	private SqlSession sqlsession;
	
	public Bpf_DAO(SqlSession sqlsession) {
		this.sqlsession = sqlsession;
	}
	
	public Bpf_DTO getOneProfile(String bmemberid) {
		return sqlsession.selectOne("Bpf.getOneProfile",bmemberid);
	}
	
	public int insertProfile(Bpf_DTO dto) {
		return sqlsession.insert("Bpf.insertProfile",dto);
	}
	
	public int updateProfile(Bpf_DTO dto) {
		return sqlsession.update("Bpf.updateProfile",dto);
	}
	
	public int updateLogo(Map<String,Object> name) {
		return sqlsession.update("Bpf.updateLogo",name);
	}
}

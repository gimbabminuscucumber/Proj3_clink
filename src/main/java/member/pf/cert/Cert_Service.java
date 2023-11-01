package member.pf.cert;

import java.util.List;
import java.util.Map;

public class Cert_Service {

	private Cert_DAO cert_dao;
	
	public Cert_Service(Cert_DAO cert_dao) {
		this.cert_dao = cert_dao;
	}
	
	public int insert(Cert_DTO dto) {
		return cert_dao.insert(dto);
	}
	
	public int update(Cert_DTO dto) {
		return cert_dao.update(dto);
	}
	
	public int delete(String no) {
		return cert_dao.delete(no);
	}
	
	public List<Cert_DTO> selectList(Map<String, Object> map){
		return cert_dao.selectList(map);
	}
	
	public Map<String, Object> selectOne(String no){
		return cert_dao.selectOne(no);
	}
	
	public List<Map<String, Object>> certList(){
		return cert_dao.certList();
	}
	
}

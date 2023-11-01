package cat.socialact_c;

import java.util.List;

public class Socialact_C_Service {

	private Socialact_C_DAO socialact_c_dao;
	
	public Socialact_C_Service(Socialact_C_DAO socialact_c_dao) {
		this.socialact_c_dao = socialact_c_dao;
	}
	
	public int insert(Socialact_C_DTO vo) {
		return socialact_c_dao.insert(vo);
	}
	
	public int update(Socialact_C_DTO vo) {
		return socialact_c_dao.update(vo);
	}
	
	public int delete(String no) {
		return socialact_c_dao.delete(no);
	}
	
	public List<Socialact_C_DTO> selectList(){
		return socialact_c_dao.selectList();
	}
	
}

package business.posi_mng;

import java.util.List;

public class Posi_Mng_Service {
	
	private Posi_Mng_DAO posi_mng_dao;
	
	public Posi_Mng_Service(Posi_Mng_DAO posi_mng_dao) {
		this.posi_mng_dao = posi_mng_dao;
	}
	
	public List<Posi_Mng_DTO> getNoList(int no){
		return posi_mng_dao.getNoList(no);
	}
	
	public int insert(Posi_Mng_DTO dto) {
		return posi_mng_dao.insert(dto);
	}
	
	public int update(Posi_Mng_DTO dto) {
		return posi_mng_dao.update(dto);
	}
	
	public int deleteDp(int no) {
		return posi_mng_dao.deleteDp(no);
	}
	
	public int delete(int no) {
		return posi_mng_dao.delete(no);
	}
}

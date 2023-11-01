package business.depart_mng;

import java.util.List;

public class Depart_Mng_Service {
	private Depart_Mng_DAO depart_mng_dao;
	
	public Depart_Mng_Service(Depart_Mng_DAO depart_mng_dao) {
		this.depart_mng_dao = depart_mng_dao;
	}
	
	public List<Depart_Mng_DTO> getList(String id){
		return depart_mng_dao.getList(id);
	}
	
	public int insert(Depart_Mng_DTO dto) {
		return depart_mng_dao.insert(dto);
	}
	
	public int update(Depart_Mng_DTO dto) {
		return depart_mng_dao.update(dto);
	}
	
	public int delete(int no) {
		return depart_mng_dao.delete(no);
	}
	
}

package business.gradeo_mng;

public class GradeO_Mng_Service {
	private GradeO_Mng_DAO gradeo_mng_dao;
	
	public GradeO_Mng_Service(GradeO_Mng_DAO gradeo_mng_dao) {
		this.gradeo_mng_dao = gradeo_mng_dao;
	}
	
	public int insert(GradeO_Mng_DTO dto) {
		return gradeo_mng_dao.insert(dto);
	}
	
}

package member.recommand.relation;

import java.util.List;

public class Relation_Service {

	private Relation_DAO relation_dao;
	
	public Relation_Service(Relation_DAO relation_dao) {
		this.relation_dao = relation_dao;
	}
	
	public List<Relation_DTO> selectList(){
		return relation_dao.selectList();
	}
	
}

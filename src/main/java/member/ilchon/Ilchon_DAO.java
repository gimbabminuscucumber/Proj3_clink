package member.ilchon;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

public class Ilchon_DAO {
	private SqlSession sqlsession;
	
	public Ilchon_DAO(SqlSession sqlsession) {
		this.sqlsession = sqlsession;
	}
	
	public int sentIlchon(Ilchon_DTO dto) {
		return sqlsession.insert("Ilchon.insertIlchon",dto);
	}
	
	public int getAskedCnt(String member_id) {
		return sqlsession.selectOne("Ilchon.getAskedCnt",member_id);
	}
	
	 public List<Map<String, Object>> getSentList(String member_id){
		 return sqlsession.selectList("Ilchon.getSentList",member_id);
	 }
	 
	 public List<Map<String, Object>> getAskedList(String member_id){
		 return sqlsession.selectList("Ilchon.getAskedList",member_id);
	 }
	 
	 public int updateAt(int no) {
		 return sqlsession.update("Ilchon.updateAt",no);
	 }
	 
	 public int getNextGroupNo() {
		 return sqlsession.selectOne("Ilchon.getNextGroupNo");
	 }
	 
	 public int delete(int gno) {
		 return sqlsession.delete("Ilchon.delete",gno);
	 }
	 
	 public List<Map<String,Object>> getIlchonList(String member_id){
		 return sqlsession.selectList("Ilchon.getIlchonList",member_id);
	 }
	 
	 public Ilchon_DTO checkMail(Map<String,Object> map) {
		 return sqlsession.selectOne("Ilchon.checkMail",map);
	 }
	 
	 public int destroy(int no) {
		 return sqlsession.delete("Ilchon.destroy",no);
	 }
	 
}

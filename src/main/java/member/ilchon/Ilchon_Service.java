package member.ilchon;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ilchon_Service {
	private Ilchon_DAO ilchon_dao;
	
	 public Ilchon_Service(Ilchon_DAO ilchon_dao) {
		 this.ilchon_dao = ilchon_dao;
	 }
	 
	 public int sentIlchon(Ilchon_DTO dto) {
		 return ilchon_dao.sentIlchon(dto);
	 }
	 
	 public int getAskedCnt(String member_id) {
		 return ilchon_dao.getAskedCnt(member_id);
	 }
	 
	 public List<Map<String, Object>> getSentList(String member_id){
		 return ilchon_dao.getSentList(member_id);
	 }
	 
	 public List<Map<String, Object>> getAskedList(String member_id){
		 return ilchon_dao.getAskedList(member_id);
	 }
	 
	 public int updateAt(int gno) {
		 return ilchon_dao.updateAt(gno);
	 }
	 
	 public int getNextGroupNo() {
		 return ilchon_dao.getNextGroupNo();
	 }
	 
	 public int delete(int gno) {
		 return ilchon_dao.delete(gno);
	 }
	 
	 public List<Map<String,Object>> getIlchonList(String member_id){
		 return ilchon_dao.getIlchonList(member_id);
	 }
	 
	 public Ilchon_DTO checkMail(String id1,String id2) {
		 Map<String , Object> map = new HashMap<String, Object>();
		 map.put("id1", id1);
		 map.put("id2", id2);
		 
		 return ilchon_dao.checkMail(map);
	 }
	 
	 public int destroy(int no) {
		 return ilchon_dao.destroy(no);
	 }

}

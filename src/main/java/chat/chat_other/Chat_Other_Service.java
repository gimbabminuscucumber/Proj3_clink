package chat.chat_other;

import java.util.List;
import java.util.Map;

public class Chat_Other_Service {
	private Chat_Other_DAO chat_other_dao;
	
	public Chat_Other_Service(Chat_Other_DAO chat_other_dao) {
		this.chat_other_dao = chat_other_dao;
	}
	
	public int joinRoom(Map<String,Object> map) {
		return chat_other_dao.joinRoom(map);
	}
	
	public Chat_Other_DTO getroomMyNo(Map<String,Object> map) {
		return chat_other_dao.getroomMyNo(map);
		
	}
	
	public List<Map<String,Object>> getMember(Map<String,Object> map){
		return chat_other_dao.getMember(map);
	}
	
	public Map<String,Object> getOneOther(int no){
		return chat_other_dao.getOneOther(no);
	}
}

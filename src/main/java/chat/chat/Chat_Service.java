package chat.chat;

import java.util.List;
import java.util.Map;

public class Chat_Service {
	private Chat_DAO chat_dao;
	
	public Chat_Service(Chat_DAO chat_dao) {
		this.chat_dao = chat_dao;
	}
	
	public int sendChat(Chat_DTO dto) {
		return chat_dao.sendChat(dto);
	}
	
	public List<Map<String,Object>> getRoomChat(int key){
		return chat_dao.getRoomChat(key);
	}
	
	public int statUp(Map<String,Object> no) {
		return chat_dao.statUp(no);
	}

}

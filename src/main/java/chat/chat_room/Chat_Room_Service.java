package chat.chat_room;

import java.util.List;
import java.util.Map;

public class Chat_Room_Service {
	private Chat_Room_DAO chat_room_dao;
	
	public Chat_Room_Service(Chat_Room_DAO chat_room_dao) {
		this.chat_room_dao = chat_room_dao;
	}
	
	public String getRoom(Map<String,Object> map) {
		return chat_room_dao.getRoom(map);
	}
	
	public int createRoom(int nextnum) {
		return chat_room_dao.createRoom(nextnum);
	}
	
	public int getNextRoom() {
		return chat_room_dao.getNextRoom();
	}
	
	public List<Map<String,Object>> getList(Map<String,Object> usr_id){
		return chat_room_dao.getList(usr_id);
	}
	
	public List<Integer> getRoomList(String usr_id){
		return chat_room_dao.getRoomList(usr_id);
	}
	
	public List<String> getRoomMember(Map<String,Object> map){
		return chat_room_dao.getRoomMember(map);
	}
	
	public String getNewNum(String id) {
		return chat_room_dao.getNewNum(id);
	}
}

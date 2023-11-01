package chat.chat_room;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

public class Chat_Room_DAO {
	private SqlSession sqlsession;
	
	public Chat_Room_DAO(SqlSession sqlsession) {
		this.sqlsession = sqlsession;
	}
	
	public String getRoom(Map<String,Object> map) {
		return sqlsession.selectOne("Chat_Room.getRoom",map);
	}
	
	public int createRoom(int nextNum) {
		return sqlsession.insert("Chat_Room.createRoom",nextNum);
	}
	
	public int getNextRoom() {
		return sqlsession.selectOne("Chat_Room.getNextRoom");
	}
	
	public List<Map<String,Object>> getList(Map<String,Object> usr_id){
		return sqlsession.selectList("Chat_Room.getList",usr_id);
	}
	
	public List<Integer> getRoomList(String usr_id){
		return sqlsession.selectList("Chat_Room.getRoomList", usr_id);
	}
	
	public List<String> getRoomMember(Map<String,Object> map){
		return sqlsession.selectList("Chat_Room.getRoomMember",map);
	}
	
	public String getNewNum(String id) {
		return sqlsession.selectOne("Chat_Room.getNewNum",id);
	}
}

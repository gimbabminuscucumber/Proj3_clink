package chat.chat;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

public class Chat_DAO {
	private SqlSession sqlsession;
	
	public Chat_DAO(SqlSession sqlsession) {
		this.sqlsession = sqlsession;
	}
	
	public int sendChat(Chat_DTO dto) {
		try {
			return sqlsession.insert("Chat.sendChat",dto);			
		}catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}
	
	public List<Map<String,Object>> getRoomChat(int key){
		return sqlsession.selectList("Chat.getRoomChat",key);
	}
	
	public int statUp(Map<String,Object> no) {
		return sqlsession.update("Chat.statUp",no);
	}
	
}

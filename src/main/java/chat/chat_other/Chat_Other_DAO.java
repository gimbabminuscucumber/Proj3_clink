package chat.chat_other;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

public class Chat_Other_DAO {
	private SqlSession sqlsession;
	
	public Chat_Other_DAO(SqlSession sqlsession) {
		this.sqlsession = sqlsession;
	}
	
	public int joinRoom(Map<String,Object> map) {
		return sqlsession.insert("Chat_Other.joinRoom",map);
	}
	
	public Chat_Other_DTO getroomMyNo(Map<String,Object> map) {
		return sqlsession.selectOne("Chat_Other.getroomMyNo",map);
	}
	
	public List<Map<String,Object>> getMember(Map<String,Object> map){
		return sqlsession.selectList("Chat_Other.getMember",map);
	}
	
	public Map<String,Object> getOneOther(int no){
		return sqlsession.selectOne("Chat_Other.getOneOther",no);
	}
}

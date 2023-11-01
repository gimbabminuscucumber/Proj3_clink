package path;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.simple.JSONObject;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import chat.chat.Chat_DTO;
import chat.chat.Chat_Service;
import chat.chat_other.Chat_Other_DTO;
import chat.chat_room.Chat_Room_Controller;

public class EchoHandler extends TextWebSocketHandler {
	private Chat_Service chat_service;
	private Chat_Room_Controller chat_room_controller;
	public EchoHandler(Chat_Service chat_service,Chat_Room_Controller chat_room_controller) {
		this.chat_service = chat_service;
		this.chat_room_controller = chat_room_controller;
	}
	
	Map<String,WebSocketSession> sessionId = new HashMap<>(); // 세션을 아이디로 묶기위한맵
	Map<Integer,List<String>> room = new HashMap<>(); //session을 방으로 묶기위한 맵
	Map<WebSocketSession,List<Integer>> removeKey = new HashMap<>();
	List<WebSocketSession> allUser = new ArrayList<WebSocketSession>();
	  //클라이언트가 연결 되었을 때 실행
    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
    	String usr_id = Encry.getChatUsrId(session.getAttributes());
        sessionId.put(usr_id, session);
        allUser.add(session);
       
        chat_room_controller.getUserSession().put(usr_id, session.getAttributes()); //websocket session의 인스턴스를 가져오기 위한 게터
        removeKey.put(session, new ArrayList<>());//유저의 방을 다삭제 하기 위한
        
        List<Integer> RoomNo = chat_room_controller.getChat_room_service().getRoomList(usr_id);//방을 만들기 위한
        
        if(RoomNo.size() != 0) {   
	        for(int no : RoomNo) { 
        		if(room.get(no) != null) {
		    		room.get(no).add(usr_id);
		    		removeKey.get(session).add(no);
        		}
	        }
        }
    }
 
    //클라이언트가 웹소켓 서버로 메시지를 전송했을 때 실행
    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
    	Chat_Other_DTO COdto = (Chat_Other_DTO)session.getAttributes().get("chatRoom");
    	String usr_id = Encry.getChatUsrId(session.getAttributes());
    	
    	int room_no = COdto.getChat_room_no();
    	int room_my_no = COdto.getChat_other_no();
    	
    	String personMessage = message.getPayload();
    	
    	int stat = 0;
    	String file = null;
    	
    	try {
	    	if(room.get(room_no) == null) {
	    		List<String> inwon = new ArrayList<String>();
	    		Map<String,Object> datamap = new HashMap<>();
	    		inwon.add(usr_id);
	    		
	    		datamap.put("roomno", room_no);
	    		datamap.put("my", Encry.getChatUsrId(session.getAttributes()));
				room.put(room_no,inwon);    		
				removeKey.get(session).add(room_no);
				addInwon(datamap);
	    	}else if(room.get(room_no).size() == 1) {
	    		Map<String,Object> datamap = new HashMap<>();
	    		datamap.put("roomno", room_no);
	    		datamap.put("my", Encry.getChatUsrId(session.getAttributes()));
	    		addInwon(datamap);
	    	}
	    	
	    	if(room.get(room_no).size() != 1) {
	    		for(String s : room.get(room_no)) {
	    			if(s != usr_id) {
	    				if(chat_room_controller.getUserSession().get(s).get("chatRoom") != null && ((Chat_Other_DTO)chat_room_controller.getUserSession().get(s).get("chatRoom")).getChat_room_no() == room_no) {
	    					stat = 1;
	    				}
	    			}
	    		}
	    	}
	    	Chat_DTO dto = new Chat_DTO(room_my_no,personMessage,file,stat);
	    	int su = chat_service.sendChat(dto);
	    	
	    	
	    	if(su == 1) {
	    		Map<Object,Object> javaMap = new HashMap<Object, Object>();
	    		javaMap.put("CHAT_OTHER_NO", room_my_no);
	    		javaMap.put("DETAIL", personMessage);
	    		javaMap.put("roomserver", COdto.getChat_room_no());
	    		
	    		JSONObject jsonMap = new JSONObject(javaMap);
	    		for(String person : room.get(room_no)) {
	    			sessionId.get(person).sendMessage(new TextMessage(jsonMap.toJSONString()));
	    		}		
	    	}
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    }
    //클라이언트 연결을 끊었을 때 실행
    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
    	String usr_id = Encry.getChatUsrId(session.getAttributes());
    	allUser.remove(session);
    	if(removeKey.get(session) != null) {
    		for(int no : removeKey.get(session)) {
    			room.get(no).remove(usr_id);
    			if(room.get(no).size() == 0) {
    				room.remove(no);
    			}
    		}
    		removeKey.remove(session);
    	}
    	sessionId.remove(usr_id);
    	chat_room_controller.getUserSession().remove(usr_id);
    }
    
    public void allToString() {
    	System.out.println("allUser: "+allUser.toString()+"  room:"+room.toString()+"  removekey:"+removeKey.toString()+"  sessionId:"+sessionId.toString()+"  UserSession:"+chat_room_controller.getUserSession());    	
    }
    
    public void addInwon(Map<String,Object> datamap) {
    	List<Map<String,Object>> map = chat_room_controller.getChat_other_service().getMember(datamap);
		
		for(Map<String,Object> m : map) {
			if(sessionId.get(m.get("USR_ID")) != null) {
				room.get(datamap.get("roomno")).add((String)m.get("USR_ID"));
				removeKey.get(sessionId.get(m.get("USR_ID"))).add((int)datamap.get("roomno"));
			}
		}
    }
    
}

package chat.chat_room;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import chat.chat.Chat_Service;
import chat.chat_other.Chat_Other_DTO;
import chat.chat_other.Chat_Other_Service;
import path.Encry;
import path.ProjectPath;

@Controller
public class Chat_Room_Controller implements ProjectPath{
	private Chat_Room_Service chat_room_service;
	private Chat_Other_Service chat_other_service;
	private Chat_Service chat_service;
	
	private Map<String,Map<String,Object>> userSession = new HashMap<>();
	
	public Chat_Room_Controller(Chat_Room_Service chat_room_service,Chat_Other_Service chat_other_service,
			Chat_Service chat_service) {
		this.chat_room_service = chat_room_service;
		this.chat_other_service = chat_other_service;
		this.chat_service = chat_service;
	}
	
	@RequestMapping("headerChat")
	@ResponseBody
	public Map<String,Object> page(String k,HttpServletRequest req) {
		String usr_id = Encry.getUsrId(req.getSession());
		k = k.isEmpty() ? null : k;
		
		Map<String,Object> Listmap = new HashMap<>();
		Listmap.put("k", k);
		Listmap.put("usr_id", usr_id);
		List<Map<String,Object>> ChatList = chat_room_service.getList(Listmap);
		
		Map<String,Object> map = new HashMap<>();
		if(!ChatList.isEmpty() &&  ChatList != null) {
			map.put("list", ChatList);			
		}
		if(!ChatList.isEmpty() && k == null && ChatList != null) {
			String newNum = chat_room_service.getNewNum(usr_id);
			map.put("newnum", newNum);
		}
		return map;
	}
	
	
//	@RequestMapping("jointwddo")
//	@ResponseBody
//	public void getMessage(String id,HttpSession session) {
//		String usr_id = Encry.getUsrId(session);
//		Map<String,Object> map = new HashMap<>();
//		map.put("opponent", id);
//		map.put("my", usr_id);
//		
//		String room_no = chat_room_service.getRoom(map);
//		
//		if(room_no == 0) {
//			int nextNum = chat_room_service.getNextRoom();
//			int su = chat_room_service.createRoom(nextNum);
//			if(su != 0) {
//				room_no = nextNum;
//				map.put("nextNum", nextNum);
//				map.put("usr_id", id);
//				chat_other_service.joinRoom(map);
//				map.put("usr_id", usr_id);
//				chat_other_service.joinRoom(map);
//			}
//		}
//		
//		map.put("roomno", room_no);
//		Chat_Other_DTO dto = chat_other_service.getroomMyNo(map);
//		userSession.get(usr_id).put("chatRoom", dto);
//	}
	
	@RequestMapping("createRoom")
	@ResponseBody
	public int insertRoom(String id,HttpSession session) {
		String usr_id = Encry.getUsrId(session);
		Map<String,Object> map = new HashMap<>();
		map.put("opponent", id);
		map.put("my", usr_id);
		
		
		String room_no = null;
		Chat_Other_DTO dto = null;
		if(getMessage(id,0, session) != null) {
			room_no = chat_room_service.getRoom(map);
			Map<String,Object> datamap = new HashMap<>();
			datamap.put("roomno", room_no);
			datamap.put("my", usr_id);
			dto = chat_other_service.getroomMyNo(datamap);
		}else {
			int nextNum = chat_room_service.getNextRoom();
			int su = chat_room_service.createRoom(nextNum);
			if(su != 0) {
				room_no = nextNum+"";
				map.put("nextNum", nextNum);
				map.put("usr_id", id);
				chat_other_service.joinRoom(map);
				map.put("usr_id", usr_id);
				chat_other_service.joinRoom(map);
			}
			
			map.put("roomno", room_no);
			dto = chat_other_service.getroomMyNo(map);
		}
		
		userSession.get(usr_id).put("chatRoom", dto);	
		return dto.getChat_other_no();
	}
	
	@RequestMapping("jointwo")
	@ResponseBody
	public Map<String,Object> getMessage(String id,int type,HttpSession session) { //roomno가 없다면 
		String usr_id = Encry.getUsrId(session);
		
		String room_no = null;
		if(type == 0) {
			Map<String,Object> map = new HashMap<>();
			map.put("opponent", id);
			map.put("my", usr_id);			
			room_no = chat_room_service.getRoom(map);
		}else if(type == 1) {
			room_no = id;
		}
			
		Map<String,Object> send = new HashMap<String, Object>();
		if(room_no != null) {
			Map<String,Object> datamap = new HashMap<>();
			datamap.put("roomno", room_no);
			datamap.put("my", usr_id);
			Chat_Other_DTO dto = chat_other_service.getroomMyNo(datamap);
			userSession.get(usr_id).put("chatRoom", dto);
			List<Map<String,Object>> memberSum = chat_other_service.getMember(datamap);
			
			Map<Object,Object> member = new HashMap<>();
			for(Map<String,Object> memberMap : memberSum) {
				member.put(memberMap.get("CHAT_OTHER_NO"), memberMap.get("NAME"));
			}
			
			List<Map<String,Object>> chat = chat_service.getRoomChat(Integer.parseInt(room_no));
	
			if(!chat.isEmpty() && Integer.parseInt(String.valueOf(chat.get(chat.size()-1).get("STAT"))) == 0 && Integer.parseInt(String.valueOf(chat.get(chat.size()-1).get("CHAT_OTHER_NO"))) != dto.getChat_other_no()) {
				Map<String,Object> map = new HashMap<>();
				map.put("usr_id", usr_id);
				map.put("room_no", room_no);
				chat_service.statUp(map);
			}
			
			
			send.put("room_no", room_no);
			send.put("member", member);
			send.put("my_other_no", dto.getChat_other_no());
			send.put("chat", chat);
		}
		if(send.isEmpty()) send = null;
		return send;
	}
	
	@RequestMapping("close")
	@ResponseBody
	public void close(HttpSession session) {
		String usr_id = Encry.getUsrId(session);
		userSession.get(usr_id).remove("chatRoom");
	}
	
	@RequestMapping("joinRoomNo")
	@ResponseBody
	public Map<String,Object> joinRoomNo(int key , HttpSession session) {
		String usr_id = Encry.getUsrId(session);
		Map<String,Object> map = new HashMap<>();
		map.put("roomno", key);
		map.put("my", usr_id);
		Chat_Other_DTO dto = chat_other_service.getroomMyNo(map);
		
		userSession.get(usr_id).put("chatRoom", dto);
		
		List<Map<String,Object>> memberSum = chat_other_service.getMember(map);
		
		Map<Object,Object> member = new HashMap<>();
		for(Map<String,Object> memberMap : memberSum) {
				member.put(memberMap.get("CHAT_OTHER_NO"), memberMap.get("NAME"));
		}
		
		List<Map<String,Object>> chat = chat_service.getRoomChat(key);
		Map<String,Object> send = new HashMap<String, Object>();
		
		send.put("member", member);
		send.put("my_other_no", dto.getChat_other_no());
		send.put("chat", chat);
		return send;
	}
	
	
	
	
	public Map<String, Map<String, Object>> getUserSession() {
		return userSession;
	}

	public void setUserSession(Map<String, Map<String, Object>> userSession) {
		this.userSession = userSession;
	}

	public Chat_Room_Service getChat_room_service() {
		return chat_room_service;
	}

	public void setChat_room_service(Chat_Room_Service chat_room_service) {
		this.chat_room_service = chat_room_service;
	}

	public Chat_Other_Service getChat_other_service() {
		return chat_other_service;
	}

	public void setChat_other_service(Chat_Other_Service chat_other_service) {
		this.chat_other_service = chat_other_service;
	}
	
	
	
}

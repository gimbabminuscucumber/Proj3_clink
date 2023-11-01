package chat.chat;

import org.springframework.stereotype.Controller;

import path.ProjectPath;

@Controller
public class Chat_Controller implements ProjectPath{
	private Chat_Service chat_service;
	
	
	public Chat_Controller(Chat_Service chat_service) {
		this.chat_service = chat_service;
	}
	
//	@RequestMapping("getRoomChat")
//	public List<Map<String,Object>> getRoomChat(int key){
//		List<Map<String,Object>> Chatting = chat_service.getRoomChat(key); 
//		return Chatting;
//	}
	
	
}

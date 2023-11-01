package chat.chat_other;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import path.ProjectPath;

@Controller
public class Chat_Other_Controller implements ProjectPath{
	private Chat_Other_Service chat_other_service;
	
	public Chat_Other_Controller(Chat_Other_Service chat_other_service) {
		this.chat_other_service = chat_other_service;
	}
	
	@RequestMapping("getOneOther")
	@ResponseBody
	public Map<String,Object> getOneOther(int key){
		return chat_other_service.getOneOther(key);
	}
	
}

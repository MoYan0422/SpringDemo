package tw.wuyuhsi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import tw.wuyuhsi.model.Members;

@Controller
public class MembersController {

	public MembersController() {
		// TODO Auto-generated constructor stub
	}
	
	@RequestMapping(path = "/membersMain.controller" ,method = RequestMethod.GET)
	public String processMainAction(Model m) {
		Members members = new Members("test","feme",18);
		m.addAttribute("members", members);
		return "members";
		
	}
	

}

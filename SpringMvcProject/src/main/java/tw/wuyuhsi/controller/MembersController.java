package tw.wuyuhsi.controller;

import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
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
	
	@RequestMapping(path = "/addMembers" ,method = RequestMethod.POST)
	public String processAction(@ModelAttribute("members")Members mem2,BindingResult result,Model m) {
		if (result.hasErrors()) {
			return "membersError";
		}
		m.addAttribute("mName",mem2.getMemberName());
		m.addAttribute("mGender",mem2.getGender());
		m.addAttribute("mAge",mem2.getAge());
		
		return "membersResult";
	}
	

}

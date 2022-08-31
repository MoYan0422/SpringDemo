package tw.wuyuhsi.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import tw.wuyuhsi.model.Account;

@Controller
public class LoginSystemController {
	
	@Autowired
	private AccountService accountService;

	@RequestMapping(path = "loginsystemmain.controller", method = RequestMethod.GET)
	public String processMainAction() {
		return "loginSystem";
	}

	@RequestMapping(path = "/checklogin.controller",method = RequestMethod.POST)
	public String processAction(@RequestParam("userName")String name ,@RequestParam("PassWord")String pwd, Model model ) {
		Map<String, String> errors = new HashMap<String,String>();
		model.addAttribute("errors", errors);
		
		if (name==null || name.length()==0) {
			errors.put("name", "name is required");
			
		}
		
		if (pwd==null || pwd.length()==0) {
			errors.put("pwd", "pwd is required");
		}
		
		if (errors!=null&&!errors.isEmpty()) {
			return "loginSystem";
		}
		
		boolean result = accountService.checkLogin(new Account(name, pwd));
		
		if (result) {
			model.addAttribute("user", name);
			model.addAttribute("pwd", pwd);
			return "loginSuccess";
			
		}
		errors.put("msg", "please input correct username or password");
		return "loginSystem";
		
	}

}

package tw.wuyuhsi.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ProfileController {
	
	@PostMapping(path ="/profiles.controller",produces = "text/plain;charset=UTF-8")
	@ResponseBody
	
	public String  processAction(@RequestParam String userName ,HttpServletResponse response) {
		
		return "message:"+userName;
	}
	

}

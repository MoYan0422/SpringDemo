package tw.wuyuhsi.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PathVariableController {
	
	@GetMapping("/memebers/{mid}")
	public String processAction(@PathVariable("mid") String memberid) {
		return "memberid: "+memberid;
	}
}

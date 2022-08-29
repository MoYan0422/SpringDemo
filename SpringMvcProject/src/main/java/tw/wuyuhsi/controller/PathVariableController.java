package tw.wuyuhsi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PathVariableController {

	public PathVariableController() {
		// TODO Auto-generated constructor stub
	}
	@RequestMapping(path = "/members/{mid}",method = RequestMethod.GET)
	public void processAction(@PathVariable("mid") String memberId) {
		System.out.println("memberId : " + memberId);
	}

}

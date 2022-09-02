package tw.wuyuhsi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ExceptionController {

	@GetMapping("/except.controller")
	public void processExceptAction() throws Exception {
		throw new Exception();
	}

}

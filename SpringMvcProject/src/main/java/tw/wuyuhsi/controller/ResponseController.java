package tw.wuyuhsi.controller;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.IOUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ResponseController {
	
	@GetMapping(path =  "/response1.controller",produces =  "text/plain;charset=UTF-8")
	@ResponseBody
	public String processResponseAction() {
		
		return "this message is from server:你好";
	}
	
	@GetMapping("/responseentity.action")
	public ResponseEntity<String> processResponseEntityAction() {
		return new ResponseEntity<String>("Custom Response Message(403 Forbidden)",HttpStatus.FORBIDDEN);
		
	}
	@GetMapping("/responseentity2.action")
	public ResponseEntity<String> processResponseEntityAction2() {
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.setContentType(MediaType.TEXT_PLAIN);
		return new ResponseEntity<String>("Custom Response Header Message",HttpStatus.OK);
		
	}
	@GetMapping(path = "/responsebyteArray.controller",produces = "text/plain;charset=UTF-8")
	@ResponseBody
	public byte[] processImgeByteArrayAction(HttpServletRequest request) throws IOException {
		InputStream resourceAsStream = request.getServletContext().getResourceAsStream("/WEB-INF/resources/images/1631334787-87858083-g_wn.jpg");
		return IOUtils.toByteArray(resourceAsStream);
	}

}

package tw.wuyuhsi.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class MyExceptionHandel {

	@ExceptionHandler(Exception.class)
	public Object exceptHandel(Exception e) {
		e.printStackTrace();
		String errMsg = "Excption";
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errMsg);
	}

}

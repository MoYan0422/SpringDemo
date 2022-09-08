package tw.wuyuhsi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import tw.wuyuhsi.model.Users;
import tw.wuyuhsi.model.UsersService;

@Controller
public class UserCheckController {
	@Autowired
	private UsersService usersService;

	@PostMapping(path = "/userscheck.controller")
	public ResponseEntity<String> processUsersCheckAction(@RequestBody Users users) {
		boolean checkLogin = usersService.checkLogin(users);
		System.out.println(users.getUserName());
		if (checkLogin) {
			return new ResponseEntity<String>("Y", HttpStatus.OK);
		}
		return new ResponseEntity<String>("N", HttpStatus.OK);

	}

}

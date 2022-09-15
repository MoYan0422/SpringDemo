package tw.wuyuhsi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tw.wuyuhsi.model.Users;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UsersService usersService;
	
	@GetMapping("/findUsers1.controller")
	public List<Users> processFindUsersLinkAction1(){
		return usersService.findUsers("ma");
	}
	@GetMapping("/findUsers2.controller")
	public List<Users> processFindUsersLinkAction2(){
		return usersService.findByNameLike("%ma%");
	}
	@GetMapping("/findAllUsers.controller")
	public List<Users> processFindAllUsersLinkAction() {
		return usersService.findAll();
	}
	

}

package tw.wuyuhsi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tw.wuyuhsi.model.UserProfiles;
import tw.wuyuhsi.model.UserProfilesService;

@RestController
public class UserProfilesController {

	@Autowired
	private UserProfilesService upService;
	
	@PostMapping("/creatuserprofiles")
	public UserProfiles processCreatUserProfilesAction(@RequestBody UserProfiles up) {
		String encode = new BCryptPasswordEncoder().encode(up.getPassword());
		up.setPassword(encode);
		return upService.createUserProfiles(up);
	}

}

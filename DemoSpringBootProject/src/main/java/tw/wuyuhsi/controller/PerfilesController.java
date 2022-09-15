package tw.wuyuhsi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import tw.wuyuhsi.model.PersonalProfiles;

@RestController
public class PerfilesController {
	@Autowired
	private PersonalProfiles personalProfiles;
	
	@GetMapping("/personalprofiles.controller")
	private PersonalProfiles processAction() {
		return personalProfiles;
	}
}

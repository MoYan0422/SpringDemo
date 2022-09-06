package tw.wuyuhsi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import tw.wuyuhsi.model.Profiles;

@Controller
public class RestCrudController {

	@Autowired
	private ProfilesService profilesService;

	@PostMapping(path = "/profiles")
	@ResponseBody
	public String processProfilesInsertAction(@RequestParam("userName") String userName,
			@RequestParam("userAddress") String userAddress, @RequestParam() String userPhone) {

		Profiles profiles = new Profiles(userName, userAddress, userPhone);
		profilesService.insert(profiles);
		return "insert ok";
	}

	@PostMapping(path = "/profiles2")
	@ResponseBody
	public Profiles processProfilesInsertAction2(@RequestBody Profiles profiles) {
		return profilesService.insert(profiles);
	}

	@GetMapping(path = "/profiles/{pid}")
	@ResponseBody
	public String processProfilesQueryAction(@PathVariable("pid") int profilesId) {
		Profiles profiles = profilesService.findById(profilesId);
		if (profiles != null) {
			return profiles.getId() + " " + profiles.getName() + " " + profiles.getAddress() + " "
					+ profiles.getPhone();
		}
		return "no result";

	}
	
	@GetMapping(path = "/profiles2/{pid}")
	@ResponseBody
	public Profiles processProfilesQueryAction2(@PathVariable("pid") int profilesId) {
		Profiles profiles = profilesService.findById(profilesId);
		if (profiles != null) {
			return profiles;
		}
		return null;

	}

	@PutMapping(path = "/profiles/{pid}")
	@ResponseBody
	public String processProfilesUpdateAction(@PathVariable("pid") int profilesId,
			@RequestParam("userName") String userName, @RequestParam("userAddress") String userAddress,
			@RequestParam() String userPhone) {
		Profiles profiles = new Profiles(profilesId, userName, userAddress, userPhone);
		profilesService.update(profiles);
		return "update ok";

	}
	
	@PutMapping(path = "/profiles2n")
	@ResponseBody
	public Profiles processProfilesUpdateAction2(@RequestBody Profiles profiles) {
		profilesService.update(profiles);
		return profiles;

	}

	@DeleteMapping(path = "/profiles/{pid}")
	@ResponseBody
	public String processProfilesDeleteAction(@PathVariable("pid") int profilesId,
			@RequestParam("userName") String userName, @RequestParam("userAddress") String userAddress,
			@RequestParam() String userPhone) {
		Profiles profiles = new Profiles(profilesId, userName, userAddress, userPhone);
		profilesService.delete(profiles);
		return "update ok";

	}
}

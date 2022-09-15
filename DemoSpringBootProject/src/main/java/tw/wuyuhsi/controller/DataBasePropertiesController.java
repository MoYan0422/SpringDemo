package tw.wuyuhsi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import tw.wuyuhsi.model.DataBaseProperties;

@RestController
public class DataBasePropertiesController {
	
	@Autowired
	private DataBaseProperties dProperties;
	
	@GetMapping("/dbproperties.controller")
	public DataBaseProperties processAction() {
		return dProperties;
	}
}

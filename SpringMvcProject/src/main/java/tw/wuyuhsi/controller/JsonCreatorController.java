package tw.wuyuhsi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import tw.leonchen.model.House;

@Controller
public class JsonCreatorController {

	
	@GetMapping("/jsoncreate.controller")
	@ResponseBody
	public String processJsonAction() throws JsonProcessingException {
		House house = new House();
		house.setHouseId(1001);
		house.setHouseName("Great house");
		
		ObjectMapper objectMapper = new ObjectMapper();
		//house轉json
		String jsonString = objectMapper.writeValueAsString(house);
		
		//json轉house
		House readValue = objectMapper.readValue(jsonString, House.class);
		
		System.out.println(readValue.getHouseId()+" "+readValue.getHouseName());
		
		return "jsonStr"+jsonString;
	}

}

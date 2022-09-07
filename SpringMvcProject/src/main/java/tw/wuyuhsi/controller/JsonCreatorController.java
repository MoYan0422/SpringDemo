package tw.wuyuhsi.controller;

import java.util.ArrayList;

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
	
	@GetMapping("/jsoncreate2.controller")
	@ResponseBody
	public House processJsonAction2() {
		House hBean2 = new House();
		hBean2.setHouseId(1002);
		hBean2.setHouseName("Happy House");
		return hBean2;
	}
	
	@GetMapping("/jsoncreate3.controller")
	@ResponseBody
	public ArrayList<House> processJsonAction3() {
		House hBean1 = new House();
		hBean1.setHouseId(1001);
		hBean1.setHouseName("Great House");
		
		House hBean2 = new House();
		hBean2.setHouseId(1002);
		hBean2.setHouseName("Happy House");
		
		ArrayList<House> list1 = new ArrayList<House>();
		list1.add(hBean1);
		list1.add(hBean2);
		
		return list1;
	}
	

}

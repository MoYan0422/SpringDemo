package tw.wuyuhsi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tw.wuyuhsi.model.Bird;

@RestController
public class BirdController {
	
	@Autowired
	private BirdService birdService;

	@GetMapping("/birdinsert.controller")
	public Bird processInsertAction() {
		Bird b1 = new Bird();
		b1.setBname("eagle");
		b1.setSize("L");
		b1.setColor("brow");
		b1.setAge(10);
		return birdService.insert(b1);
	}
	
	@GetMapping("/birdinsert2.controller")
	public Bird processInsertAction2(@RequestBody Bird bird) {
		return birdService.insert(bird);
	}
	
	@GetMapping("/birdDelete.controller")
	public String processDeleteAction() {
		birdService.deleteById(104);
		return "delete ok";
	}
	@GetMapping("/birdQuery.controller")
	public Bird processQuery() {
	  return birdService.selectById(101);
	}
	
	@GetMapping("/birdQuery.controller/{bid}")
	public Bird processQuery(@PathVariable("bid") Integer bid) {
	  return birdService.selectById(bid);
	}
	
	@GetMapping("/birdupdate.controller")
	public Bird processUpdateAction() {
		Bird bird = new Bird();
		bird.setId(102);
		bird.setBname("test");
		bird.setSize("s");
		bird.setColor("red");
		bird.setAge(3);
		return birdService.update(bird);
	}
}

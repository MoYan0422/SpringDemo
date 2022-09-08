package tw.wuyuhsi.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import tw.wuyuhsi.model.Animal;

@Controller
public class ReadAnimalController {

	ArrayList<Animal> animals = new ArrayList<Animal>();

	public ReadAnimalController() {
		animals.add(new Animal(1, "monkey"));
		animals.add(new Animal(2, "rabbit"));
		animals.add(new Animal(3, "tiger"));
		animals.add(new Animal(4, "bird"));
		animals.add(new Animal(5, "elephant"));
		animals.add(new Animal(6, "cat"));
		animals.add(new Animal(7, "hipo"));
		animals.add(new Animal(8, "zebra"));
		animals.add(new Animal(9, "lion"));
	}
	
	@PostMapping(path = "readanimal.controller")
	@ResponseBody
	public List<Animal> processSearchAnimalAction(@RequestParam("keyword") String animalName) {
		return checkSearch(animalName);
		
	}

	private List<Animal> checkSearch(String animalName) {
		ArrayList<Animal> arrayList = new ArrayList<Animal>();
		for (Animal animal : animals) {
			if(animal.getName().contains(animalName)&&animalName.length()!=0) {
				arrayList.add(animal);
			}
		}
		return arrayList;
	}

}

package tw.com.yuhsi.action;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import tw.com.yuhsi.config.SpringJavaConfig;
import tw.com.yuhsi.model.Animal;

public class DemoAnimalAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringJavaConfig.class);
		Animal animal = context.getBean("animal", 	Animal.class);
		System.out.println(animal.toString());
		
		context.close();
		
	}

}

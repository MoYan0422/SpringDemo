package tw.com.yuhsi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import tw.com.yuhsi.model.Animal;

@Configuration
public class SpringJavaConfig {
	
	
	@Bean
	public Animal animal() {
		Animal animal =new Animal();
		animal.setId(10);
		animal.setName("elephant");
		animal.setContinent("asia");
		return animal;
	}
	
	
	
}

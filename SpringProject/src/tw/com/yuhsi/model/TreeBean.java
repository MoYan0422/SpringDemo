package tw.com.yuhsi.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("tree")
@PropertySource("classpath:tree.properties")
public class TreeBean {
	
//	@Value("#{props.name}")
	@Value("${name}")
	private String name;
	
//	@Value("#{props.age}")
	@Value("${age}")
	private int age;

	public TreeBean() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "TreeBean [name=" + name + ", age=" + age + "]";
	}
	
	

}

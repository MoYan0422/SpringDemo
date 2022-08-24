package tw.com.yuhsi.model;

import java.util.Date;

public class Person {

	private String name;
	private Integer age;
	private Date data;

	public Person() {
	}

	public Person(Date date) {
		this.data = date;
	}

	public Person(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", data=" + data + "]";
	}
	
}

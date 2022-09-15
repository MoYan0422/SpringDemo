package tw.wuyuhsi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity @Table(name = "bird")
@Component
public class Bird {
	
	@Id @Column(name = "bid")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "bname")
	private String bname;
	
	@Column(name = "size")
	private String size;
	
	@Column(name = "color")
	private String color;
	
	@Column(name = "age")
	private int age;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	

}

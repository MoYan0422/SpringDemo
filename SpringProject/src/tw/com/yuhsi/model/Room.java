package tw.com.yuhsi.model;

import org.springframework.stereotype.Component;

@Component(value = "room")
public class Room {
	private int id;
	private String name;
	private String size;

	public Room() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Room [id=" + id + ", name=" + name + ", size=" + size + "]";
	}
	

}

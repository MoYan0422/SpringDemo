package tw.com.yuhsi.model;

public class Animal {
	
	private int id;
	private String name;
	private String continent;

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

	public String getContinent() {
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

	@Override
	public String toString() {
		return "Animal [id=" + id + ", name=" + name + ", continent=" + continent + "]";
	}
	

}

package tw.com.yuhsi.model;

public class TruckBean {
	private int id;
	private String brand;

	public TruckBean() {
	}

	public TruckBean(int id, String brand) {
		super();
		this.id = id;
		this.brand = brand;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "TruckBean [id=" + id + ", brand=" + brand + "]";
	}
	
	

}

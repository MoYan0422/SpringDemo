package tw.com.yuhsi.model;

import org.springframework.stereotype.Component;

@Component("house")
public class House {
	private int houseId;
	private String houseName;

	public House() {
	}

	public int getHouseId() {
		return houseId;
	}

	public void setHouseId(int houseId) {
		this.houseId = houseId;
	}

	public String getHouseName() {
		return houseName;
	}

	public void setHouseName(String houseName) {
		this.houseName = houseName;
	}

	@Override
	public String toString() {
		return "House [houseId=" + houseId + ", houseName=" + houseName + "]";
	}
	

}

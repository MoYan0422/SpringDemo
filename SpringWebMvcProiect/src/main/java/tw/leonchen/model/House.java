package tw.leonchen.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component("house")
@Entity
@Table(name = "house")
public class House {
	@Id
	@Column(name= "HOUSEID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int houseId;
	
	@Column(name = "HOUSENAME")
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

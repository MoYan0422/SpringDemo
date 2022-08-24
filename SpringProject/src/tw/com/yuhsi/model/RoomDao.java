package tw.com.yuhsi.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository(value = "roomDao")
public class RoomDao {
	
	@Autowired
	private Room room;
	
	public void showInfo() {
		System.out.println(room.getId());
		System.out.println(room.getName());
		System.out.println(room.getSize());
	}

}

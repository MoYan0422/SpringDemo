package tw.com.yuhsi.action;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import tw.com.yuhsi.model.Room;
import tw.com.yuhsi.model.RoomDao;
import tw.com.yuhsi.model.RoomService;

public class DemoRoomAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.config.xml");
		Room room1 = context.getBean("room", Room.class);
		room1.setId(100);
		room1.setName("war room");
		room1.setSize("M");
		
		System.out.println(room1.toString());
		
		RoomDao roomDao = context.getBean("roomDao", RoomDao.class);
		roomDao.showInfo();
		
		RoomService roomService = context.getBean("roomService",RoomService.class);
		roomService.shwoInfo();
		
		
		
		context.close();
	}

}

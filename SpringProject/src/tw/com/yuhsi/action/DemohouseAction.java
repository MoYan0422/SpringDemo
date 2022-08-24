package tw.com.yuhsi.action;

import java.sql.SQLException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import tw.com.yuhsi.model.House;
import tw.com.yuhsi.model.HouseService;

public class DemohouseAction {

	public static void main(String[] args) throws SQLException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.config.xml");
		HouseService resulBean = context.getBean("houseService", HouseService.class);
		House house = resulBean.selectById(1);
		if(house!=null) {
			System.out.println(house.getHouseId()+" "+house.getHouseName());
		}else {
			System.out.println("no result");
		}
		context.close();
	}

}

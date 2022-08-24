package tw.com.yuhsi.model;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service("houseService")
public class HouseService {
	@Autowired
	private HouseDAO houseDAO;

	public HouseService() {
		// TODO Auto-generated constructor stub
	}
	
	public House selectById(int houseId) throws SQLException {
		return houseDAO.selectById(houseId);
	}

}

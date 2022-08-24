package tw.com.yuhsi.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("houseDAO")
public class HouseDAO {
	
	@Autowired
	private DataSource dataSource;

	public HouseDAO() {
		// TODO Auto-generated constructor stub
	}
	
	public House selectById(int houseId) throws SQLException {
		Connection conn = dataSource.getConnection();
		String sqlstr = "select * from house where houseid= ?";
		PreparedStatement prepareStatement = conn.prepareStatement(sqlstr);
		prepareStatement.setInt(1, houseId);
		ResultSet resultSet = prepareStatement.executeQuery();
		House house = null;
		
		if(resultSet.next()) {
			house =new House();
			house.setHouseId(resultSet.getInt(1));
			house.setHouseName(resultSet.getString(2));
		}
		
		resultSet.close();
		prepareStatement.close();
		conn.close();
		
		return house;
		
	}

}

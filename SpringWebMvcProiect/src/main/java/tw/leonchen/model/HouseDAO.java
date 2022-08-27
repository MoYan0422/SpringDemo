package tw.leonchen.model;

import java.sql.SQLException;
import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("houseDAO")
public class HouseDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public HouseDAO() {
		// TODO Auto-generated constructor stub
	}

	public House selectById(int houseId) throws SQLException {
		Session session = sessionFactory.getCurrentSession();
		return session.get(House.class, houseId);
	}

	public List<House> selectAll() {
		Session session = sessionFactory.getCurrentSession();
		return session.createQuery("from House",House.class).list();
	}

}

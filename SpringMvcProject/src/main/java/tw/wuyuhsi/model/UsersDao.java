package tw.wuyuhsi.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class UsersDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public boolean checkLogin( Users users) {
		Session session = sessionFactory.openSession();
		String hql = "from Users where userName = :user";
		Query<Users> query = session.createQuery(hql, Users.class);
		System.out.println(users.getUserName());
		query.setParameter("user", users.getUserName());
		
		Users uniqueResult = query.uniqueResult();
		session.close();
		if (uniqueResult!=null) {
			return true;
		}
		return false;
		
		
	}

	
}

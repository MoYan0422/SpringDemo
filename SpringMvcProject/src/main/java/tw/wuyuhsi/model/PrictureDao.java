package tw.wuyuhsi.model;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class PrictureDao {

	@Autowired
	private SessionFactory sessionFactory;

	public PrictureDao() {
		// TODO Auto-generated constructor stub
	}

	public Picture insert(Picture been) {
		Session session = sessionFactory.openSession();
		if (been != null) {
			session.save(been);
		}
		session.close();
		return been;

	}

}

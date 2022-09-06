package tw.wuyuhsi.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class ProfilesDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public Profiles insert(Profiles profiles) {
		Session session = sessionFactory.openSession();
		
		if (profiles!=null) {
			session.save(profiles);
		}
		session.clear();
		return profiles;
	}
	
	public Profiles update(Profiles profiles) {
		Session session = sessionFactory.openSession();
		if(profiles!=null) {
			session.update(profiles);
			session.flush();
		}
		session.clear();
		return profiles;
		
	}
	
	public Profiles findById(int id) {
		Session session = sessionFactory.openSession();
		Profiles profiles = session.get(Profiles.class, id);
		session.close();
		return profiles;
	}
	
	public boolean delete(Profiles profiles) {
		Session session = sessionFactory.openSession();
		if(profiles!=null) {
			session.delete(profiles);
			session.flush();
			session.close();
			return true;
		}
		session.close();
		return false;
	}

}

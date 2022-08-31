package tw.wuyuhsi.model;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class AccountDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public AccountDao() {
		// TODO Auto-generated constructor stub
	}
	
	public boolean checkLogin(Account user) {
		Session session = sessionFactory.openSession();
		String hqlString = "from Account where userName = :name and userPwd = :pwd";
		Query<Account> query = session.createQuery(hqlString, Account.class);
		query.setParameter("name", user.getUserName());
		query.setParameter("pwd", user.getUserPwd());
		
		Account resultBean = query.uniqueResult();
		session.close();
		
		if (resultBean!=null) {
			return true;
		}
		return false;
		
		
	}

}

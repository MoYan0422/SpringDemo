package tw.wuyuhsi.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersService {
	
	@Autowired
private UsersDao usersDao;

	public boolean checkLogin( Users users) {
		return usersDao.checkLogin(users);
	}
}

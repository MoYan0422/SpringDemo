package tw.com.yuhsi.model;

public class LoginService implements IloginService {

	private LoginDao loginDao;
	
	public LoginService() {
	}

	public LoginService(LoginDao loginDao) {
		this.setLoginDao(loginDao);
	}

	@Override
	public boolean checkLogin(String user, String pwd) {
		return loginDao.checkLogin(user, pwd);
	}

	public void setLoginDao(LoginDao loginDao) {
		this.loginDao = loginDao;
	}

}

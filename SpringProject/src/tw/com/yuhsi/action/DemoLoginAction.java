package tw.com.yuhsi.action;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import tw.com.yuhsi.model.LoginService;

public class DemoLoginAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.config.xml");
		
		LoginService loginService = context.getBean("loginService",LoginService.class);
		boolean checkLogin = loginService.checkLogin("john","test123");
		System.out.println(checkLogin);
		
		LoginService loginService2 = context.getBean("loginService2",LoginService.class);
		boolean checkLogin2 = loginService2.checkLogin("Mary", "123");
		System.out.println(checkLogin2);
		
		context.close();
	}

}

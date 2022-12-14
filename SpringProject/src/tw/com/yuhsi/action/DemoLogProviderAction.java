package tw.com.yuhsi.action;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import tw.com.yuhsi.util.LogProvider;

public class DemoLogProviderAction {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.config.xml");
		
		LogProvider logProvider = (LogProvider)context.getBean("logProvider");
		logProvider.log("Stepl");
		
		
		((ConfigurableApplicationContext)context).close();
		
	}

}

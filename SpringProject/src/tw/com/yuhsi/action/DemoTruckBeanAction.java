package tw.com.yuhsi.action;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import tw.com.yuhsi.model.TruckBean;

public class DemoTruckBeanAction {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.config.xml");
		
		TruckBean truckBean = context.getBean("truckBean",TruckBean.class);
		System.out.println(truckBean.toString());
		
		TruckBean toyota = context.getBean("toyotaTruck",TruckBean.class);
		System.out.println(toyota.toString());
		
		TruckBean nissan = context.getBean("nissanTruck",TruckBean.class);
		System.out.println(nissan.toString());
		
		TruckBean ferrarit = context.getBean("ferraritTurck",TruckBean.class);
		System.out.println(ferrarit.toString());
		
		
		((ConfigurableApplicationContext)context).close();
		
	}

}

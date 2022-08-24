package tw.com.yuhsi.action;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import tw.com.yuhsi.model.WorkerDao;

public class DemoWorkerAction {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.config.xml");
		WorkerDao workerDao = context.getBean("WorkerDao",WorkerDao.class);
		workerDao.printResult();
		
		context.close();

	}

}

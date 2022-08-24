package tw.com.yuhsi.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository("WorkerDao")
public class WorkerDao {
	@Autowired@Qualifier("worker2")
	private Worker worker;

	public WorkerDao() {
		// TODO Auto-generated constructor stub
	}
	
//	@Autowired
//	public WorkerDao(@Qualifier("worker2")Worker worker) {
//		super();
//		this.worker = worker;
//	}
	
	
	public void printResult() {
		System.out.println(worker.getId());
		System.out.println(worker.getName());
		System.out.println(worker.getTitle());
		
	}
	

}

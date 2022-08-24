package tw.com.yuhsi.model;

import java.util.HashMap;

public class TruckBeanFactory {

	private HashMap<Integer, TruckBean> map = new HashMap<Integer, TruckBean>();

	public TruckBeanFactory() {
		// TODO Auto-generated constructor stub
	}

	public void setMap(HashMap<Integer, TruckBean> map) {
		this.map = map;
	}

	public TruckBean gettTruckBean(int key) {
		return map.get(key);
	}

}

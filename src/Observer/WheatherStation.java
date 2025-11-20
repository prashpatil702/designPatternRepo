package Observer;

import java.util.ArrayList;
import java.util.List;

public class WheatherStation implements ObserverSubject {
	int temp;
	List<DeviceInterFace> observers = new ArrayList<>();

	public int getTemp() {
		return temp;
	}

	public void setTemp(int temp) {
		this.temp = temp;
		notifyObserver();
		
	}

	@Override
	public void addObserver(DeviceInterFace observer) {
		// TODO Auto-generated method stub
		observers.add(observer);
		
	}

	@Override
	public void removeObserver(DeviceInterFace observer) {
		// TODO Auto-generated method stub
		observers.remove(observer);
	}

	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		for(DeviceInterFace observer:observers)
		{
			observer.showTemp(this.temp);
		}
		
	}
	
	

}

package Observer;

public interface ObserverSubject {

	public void addObserver(DeviceInterFace observer);
	public void removeObserver(DeviceInterFace observer);
	public void notifyObserver();
	
}

package Observer;

public class ObserverMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WheatherStation station = new WheatherStation();
		MobileDevice mobile = new MobileDevice();
		station.addObserver(mobile);
		TVDevice tv = new TVDevice();
		station.addObserver(tv);
		
		station.setTemp(10);
		station.setTemp(20);
	}

}

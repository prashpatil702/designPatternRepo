package Observer;

public class MobileDevice implements DeviceInterFace {


	@Override
	public void showTemp(int temp) {
		// TODO Auto-generated method stub
		System.out.println("Temp from mobile device is "+temp);
	}

}

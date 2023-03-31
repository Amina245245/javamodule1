package factorymethod;

public class Seltos implements Vehicle {

	@Override
	public void start() {
		// TODO Auto-generated method stub
System.out.println("started...." +getClass());
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
System.out.println("stopped..." +getClass());
	}

	@Override
	public void honk() {
		// TODO Auto-generated method stub
System.out.println("palm palm.."+getClass());
	}

	@Override
	public void moov() {
		// TODO Auto-generated method stub
System.out.println("its moving.."+getClass());
	}

}

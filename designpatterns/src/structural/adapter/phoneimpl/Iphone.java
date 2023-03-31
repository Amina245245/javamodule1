package structural.adapter.phoneimpl;

import structural.adapter.phoneiface.LightningPhone;

public class Iphone implements LightningPhone {
	private boolean connector;

	@Override
	public void recharge() {
		// TODO Auto-generated method stub
		if(connector) {
			System.out.println("Recharge started");
			System.out.println("Recharge finished");
		}
		else {
			System.out.println("connect lightningusb first");
		}
	}

	@Override
	public void useLightning() {
		// TODO Auto-generated method stub
		connector=true;
		System.out.println("Lightningusb connected");
	}

}

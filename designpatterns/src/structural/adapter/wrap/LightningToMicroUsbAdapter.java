package structural.adapter.wrap;

import structural.adapter.phoneiface.LightningPhone;
import structural.adapter.phoneiface.MicroUsbPhone;

public class LightningToMicroUsbAdapter implements MicroUsbPhone {
	

	   private final LightningPhone lightningPhone;

	    public  LightningToMicroUsbAdapter(LightningPhone lightningPhone) {
	        this.lightningPhone = lightningPhone;
	    }

	@Override
	public void recharge() {
		// TODO Auto-generated method stub
		lightningPhone.recharge();
	}

	@Override
	public void UseMicroUsb() {
		// TODO Auto-generated method stub
		 System.out.println("MicroUsb connected");
	        lightningPhone.useLightning();
	
	    }
	

}


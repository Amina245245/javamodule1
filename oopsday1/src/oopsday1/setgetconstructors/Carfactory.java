package oopsday1.setgetconstructors;

public class Carfactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Car jag = new Car("yellow",4000000,"toyota","innova");
System.out.println(jag.hashCode());
System.out.println(  Integer.toHexString(jag.hashCode()));
System.out.println(jag);

//jag.setColor("red");
//jag.setBrand("tata");
//jag.setModel("nexon");
//jag.setPrice(7000000);

//System.out.println(jag.getColor());
//System.out.println(jag.getBrand());
//System.out.println(jag.getModel());
//System.out.println(jag.getPrice());



Car bmw=new Car("browm",8500000,"BMW","sports SUV");
System.out.println(bmw.hashCode());
System.out.println(  Integer.toHexString(bmw.hashCode()));
System.out.println(bmw);

//bmw.setColor("white");
//bmw.setBrand("BMW"); 
//bmw.setPrice(7000000);
//bmw.setModel("Luxury SUV");
//
//System.out.println(bmw.getColor());
//System.out.println(bmw.getBrand());
//System.out.println(bmw.getPrice());
//System.out.println(bmw.getModel());

	
/*
 * jag.color="red"; jag.brand="tata"; jag.price=3000000; jag.model="nexon";
 * 
 * System.out.println(jag.color); System.out.println(jag.brand);
 * System.out.println(jag.price); System.out.println(jag.model);
 */
   
   
/*
 * Car bmw=new Car(); bmw.color="white"; bmw.brand="BMW"; bmw.price=7000000;
 * bmw.model="Luxury SUV";
 * 
 * System.out.println(bmw.color); System.out.println(bmw.brand);
 * System.out.println(bmw.price); System.out.println(bmw.model);
 */
	}

}

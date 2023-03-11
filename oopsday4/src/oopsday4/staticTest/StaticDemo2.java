package oopsday4.staticTest;

public class StaticDemo2 {
	
	 static int a;
	 static void method() {
		 
		System.out.println("from method" + a);
		//method(); is non static ,not possible.
	}

	 public void method2() {
		 System.out.println(a);
		 method();
	 }
	 
	// static public StaticDemo2()// constructor cannot be static
	 
	 public StaticDemo2()
	 {

	 
}
}

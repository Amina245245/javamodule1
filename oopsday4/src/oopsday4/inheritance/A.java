package oopsday4.inheritance;

public class A {
	 private int x;
	 private int y;
	A()
	 {
		 System.out.println("from A()");
	 }
	public A(int x, int y) {
		
		this.x = x;
		this.y = y;
		System.out.println(" from A(int,int)");
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}

}

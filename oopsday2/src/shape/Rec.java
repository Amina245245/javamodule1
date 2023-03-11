package shape;

public class Rec implements ShapeIrect {
	public double length ;
	public double  width;
	
	public Rec(double length, double width) {
		this.length = length;
		this.width = width;
	}
	

	public double getLength() {
		return length;
	}


	public void setLength(double length) {
		this.length = length;
	}


	public double getWidth() {
		return width;
	}


	public void setWidth(double width) {
		this.width = width;
	}


	@Override
	
	public void area() {
		System.out.println(length*width);
		// TODO Auto-generated method stub

	}

}

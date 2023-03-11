package oopsday3.line;

import java.util.Scanner;

public class P2 implements PointIface {
	private int x2;
	private int y2;

	public P2()
	{
	}
	@Override
	public void draw() {
		Scanner scanner=new Scanner(System.in);
		
		
		System.out.println("enter x2");
		int x2=scanner.nextInt();
		System.out.println("enter y2");
		int y2=scanner.nextInt();
		
		// TODO Auto-generated method stub

	}
}


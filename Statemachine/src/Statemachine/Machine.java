package Statemachine;

import java.util.Scanner;

public class Machine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hun=100;
		int fifty=100;
		int five=100;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the amount");
		int input=s.nextInt();
		System.out.println("enter type of denomination: 1 for hundred ,2  for five  hundred,3 for fifty");
		
		s=new Scanner(System.in);
		int denom=s.nextInt();
		
		
		int amt=0;
		int count=0;
		switch(denom)
		{
		case 1:
		
		{
			amt=input/100;
			System.out.println("Dispensed "+ amt+"hundred notes");
		      hun=hun-amt;
		      break;
		}
		case 2: 
		{ 
			amt=input/500;
			System.out.println("Dispensed "+ amt+"five hundred notes");
		     five=five -amt;
		     break;
		}
		case 3:
		{
			amt=input/50;
			System.out.println("Dispensed "+ count+"fifty notes");
		
		  fifty=fifty-amt;
		   break;
		   
		   
		}
		default:{
		System.out.println("re enter");
		break;
		}	
		}

}
}



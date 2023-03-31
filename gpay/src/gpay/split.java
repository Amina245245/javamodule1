package gpay;

import java.util.Scanner;
public class split
{
public static void main(String[] args) 
{
		// TODO Auto-generated method stub
		System.out.println("ENTER THE TOTAL AMOUNT:");
		Scanner sc=new Scanner(System.in);
		int givennumber = sc.nextInt();
		
		System.out.println("ENTER THE TOTAL NUMBER OF PEOPLE:");
		int splitnumber=sc.nextInt();
		
		int sum=0;
		for(int i=1;i<=splitnumber;i++)
		{
			System.out.println("ENTER THE IMPUT OF"+i+" USER:");
			int num=sc.nextInt();
			sum=sum+num;
		}
		
		if(sum==givennumber)
		{
			System.out.println("SUCCESS");
		}
		else
		{
			System.out.println("MONEY EXCEEDED");
		}
}
}
//		split2 s=(  givennumber , splitnumber)->{
//			
//			
//		};
		


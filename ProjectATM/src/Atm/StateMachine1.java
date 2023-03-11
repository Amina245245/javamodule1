package Atm;
import java.util.Scanner;

public class StateMachine1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int balance = 5000, withdraw, deposit;
		int hundrednotes=50;
		int fiftynotes=100;int twentynotes=250;
		int tensnotes=500;
		Scanner sc = new Scanner(System.in);
		while (true) 
		{
			System.out.println("Automated Teller Machine");
		System.out.println("Choose 1 for Withdraw");
		System.out.println("Choose 2 for Deposit");
		System.out.println("Choose 3 for Check Balance");
		System.out.println("Choose 4 for EXIT");
		System.out.print("Choose the operation you want to perform:");
		int choice = sc.nextInt();
		switch (choice)
		{
		case 1:
			System.out.print("Enter money to be withdrawn:");
			withdraw = sc.nextInt();
			if (balance >= withdraw)
			{
				balance = balance - withdraw;
			System.out.println("enter the denominations needed ");
			System.out.println("choose 1 for 100 notes");
			System.out.println("choose 2 for 50 notes");
			System.out.println("choose 3 for 20s notes");
			System.out.println("choose 4 for 10s notes");
			hundrednotes= sc.nextInt();
			fiftynotes=sc.nextInt();
			twentynotes=sc.nextInt();
			tensnotes=sc.nextInt();
			System.out.println("withdraw is successful"+hundrednotes+"hundred notes"+fiftynotes+"fifty notes"+twentynotes+"twenty notes"+tensnotes+"tens notes");
			System.out.println("please eject the card");
			} else
			{
				System.out.println("Insufficient Balance");
			}System.out.println("");
			break;
			case 2:
				System.out.print("Enter money to be deposited:");
				deposit = sc.nextInt();
				balance = balance + deposit;
				System.out.println("Your Money has been successfully deposited");
				System.out.println("");
				break;
				case 3:
				System.out.println("Balance : " + balance);
				System.out.println("");
				break;
				case 4:
					System.out.println("exit....");
					System.exit(0);
					}
		
		}
		}



	}

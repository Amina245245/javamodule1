package oopsday3.atm.menu;

//import oopsday2.atm.Account;


//import oopsday2.atm.BankOfAmerica2;
import java.util.Scanner;

import oopsday3.atm.exceptions.InsufficientFundsException;

public class BankMenu {
	
		BankOfAmerica2 boa=new BankOfAmerica2();
	
public BankMenu() {
		// TODO Auto-generated method stub
Account a1 = new Account(101,"john Doe","savings",500);
Account a2 = new Account(102,"jone Doe","savings",700);
Account a3 = new Account(103,"jason Doe","salary",850);
Account a4 = new Account(104,"jane Doe","salary",250);
Account a5 = new Account(105,"jonas Doe","pension",650);


boa.addAccount(a1);
boa.addAccount(a2);
boa.addAccount(a3);
boa.addAccount(a4);
boa.addAccount(a5);
}
public void menu() {

Scanner scanner =new Scanner(System.in);
int choice=0;
loop: do {
	System.out.println("enter your choice 1...5");
	choice=scanner.nextInt();
	switch (choice) {
	case 1:
	{   System.out.println("Account added");
	int actno=scanner.nextInt();
	boa.displayAccount(actno);
	
	break;
	}
	case 2:
	{
		System.out.println("enter actno");
		int actno=scanner.nextInt();
		System.out.println("enter amount to deposit");
		int amount =scanner.nextInt();
	
		double balance =boa.deposit(amount,actno);
		System.out.println(balance);
		break;
	}
	case 3:{ 
		System.out.println("enter actno");
		int actno=scanner.nextInt();
		System.out.println("enter withdraw amount");
		int amount =scanner.nextInt();
		double balance=0;
		try
		{
			balance=boa.withdraw(amount, actno);
		}
		catch(InsufficientFundsException e) {
			e.printStackTrace();
		}
	
		
		System.out.println(balance);

		System.out.println();
		break;
	}
	case 4:{
		System.out.println("enter actno");
		int actno=scanner.nextInt();
		System.out.println("Balance="+ boa.balanceEnquiry(actno));
		break;
		
	}
	case 5:{
		System.out.println("exiting");
		break loop;
	}
	}
}
while(choice!=5);
}
}

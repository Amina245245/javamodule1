package Paramtest;

public class PrimeNumber {
public boolean validate(  int primeNumber) {
	for(int i=2;i<primeNumber/2;i++)
	{
		if(primeNumber%i==0) {
			return false;
		}
		
	}
		return true;
	
	
}
}

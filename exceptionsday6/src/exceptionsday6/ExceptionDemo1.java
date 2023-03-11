package exceptionsday6;


import java.lang.annotation.AnnotationTypeMismatchException;
//weimport java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo1 {

	public static void main(String[] args) {
System.out.println("program task begins");
int a=10;
int b=0;
int c=a/b;
//throw new  ArithmeticException("cannot / by zero");
//System.out.println();

System.out.println("program task begins");
		try {
			Scanner scanner = new Scanner(System.in);

		 a = scanner.nextInt();

			 b = scanner.nextInt();

			 c = a / b;
			System.out.println();
		
		}
		catch (ArithmeticException e) {
			System.out.println("cannot / by zero");
			
			}
		
		catch(AnnotationTypeMismatchException e)
		
		{ System.out.println("invalid input format");
			
		}
		System.out.println("program completed task");


}
}

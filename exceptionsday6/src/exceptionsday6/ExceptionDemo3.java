package exceptionsday6;

public class ExceptionDemo3 {

	public static void main(String[] args) {
		System.out.println("program tasks begins");
		
		// TODO Auto-generated method stub
		try
		{
			System.out.println("entered  try..");
		
			int c=10/0;
			System.out.println("from try after exception.");
			
		}
		catch(Exception e) {
			
			
			System.out.println("from catch..");
			
		}
//		catch(ArithmeticException e) {
//			e.printStackTrace();
//		}
		finally {
			System.out.println("from finally..");
		}
		System.out.println("program  completed task");

	}

}

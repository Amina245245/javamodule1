package exceptionsday6;

public class ExceptionDemo2 {

	public static void main(String[] args) {

		System.out.println("program task begins");
		try {
			int b = Integer.parseInt(args[0]); // "10","20"
			int a = Integer.parseInt(args[1]);
			int c=a/b;
			String name = args[2];
			int data[] = { a, b };
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}

		catch (NumberFormatException e) {

			e.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("program task completed");
	}

}

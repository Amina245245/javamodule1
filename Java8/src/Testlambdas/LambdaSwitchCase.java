package Testlambdas;

public class LambdaSwitchCase {
	static double calculate(String operator,double x, double y) {
	return switch(operator) {
	case "+" -> x + y;
	case "-" -> x - y;
	case "*" -> x *y;
	case "/" ->{
		if(y==0) {
			throw new IllegalArgumentException("can't divide by 0");
			
		}
		yield x/y;
	}
	default -> throw new IllegalArgumentException("Unknown operator");
	};

}
	public static void main(String[] args) {
		
		System.out.println(calculate("+",30,20));
		System.out.println(calculate("-",35.5,10.5));
		System.out.println(calculate("*",3.0,2.0));
		System.out.println(calculate("/",30,5));
		
	}
}

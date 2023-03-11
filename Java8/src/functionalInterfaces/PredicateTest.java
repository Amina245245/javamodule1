package functionalInterfaces;
import java.util.function.Predicate;
import java.util.Arrays;
import java.util.List;

public class PredicateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> strings =Arrays.asList("Tamilnadu",
				"Telangana",
				"Kerala",
				"Karnataka",
				"Andhra Pradesh");
		Predicate<String>p=(String str)->{
			
			return str.length()>6;
			
					
		};
		System.out.println(p.test("Holla!"));
		desiredLength(strings,p);
	}
	
	public static void desiredLength (List<String>strings,Predicate<String>p)
	{
	for(String str:strings)
		System.out.println(p.test(str));

}
}

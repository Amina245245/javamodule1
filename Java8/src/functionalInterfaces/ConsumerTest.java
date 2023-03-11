package functionalInterfaces;
import java.util.function.Consumer;
import java.util.Arrays;
import java.util.List;

public class ConsumerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> strings =Arrays.asList("Tamilnadu",
				"Telangana",
				"Kerala",
				"Karnataka",
				"Andhra Pradesh");
		Consumer<String>consumer=(str)->{
			System.out.println(str);
		};
		consumer.accept("I am doing great");
		for(String str:strings)
		{
			consumer.accept(str);
		}
		printStrings(strings,consumer);
	}
		public static void printStrings(List<String> strings,Consumer<String>c)
		{
			for(String str:strings) {
				c.accept(str);
			}
		}
	}



package functionalInterfaces;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
public class FunctionalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

			
				List<String> strings =Arrays.asList("Tamilnadu",
						"Telangana",
						"Kerala",
						"Karnataka",
						"Andhra Pradesh");
		Function <String,Integer> f=(str)->{
			                                  return str.length();
		                                    };
		                                    printLength(strings,f);
	Function <String,String> s=(str1)->{
				                                  return str1.toUpperCase();
			                                    }; 
			                                    uppercase(strings,s);
    Function <String,String> l=(str1)->{
					                          return str1.toLowerCase();
				                                  }; 
				                                    lowercase(strings,l);	
	Function<String,String> r=(str3)->{	
		StringBuilder sb=new StringBuilder(str3);
		sb.reverse();
		return sb.toString();
	};
	reverse(strings,r);
	}//main ends
	
	public static void printLength
	(List<String>strings,Function<String,Integer> fRef)
	{
	
		     for(String str: strings)
		     {
		    	 System.out.println(fRef.apply(str));
		     }
	}
	
	public static void uppercase(List<String>strings,Function<String,String> up)
	{
		for(String str1:strings)
		{
			System.out.println(up.apply(str1));	
		}
	}
	
	
	public static void lowercase(List<String>strings,Function<String,String>low)
	
	{
		for(String str2:strings)
	
	{
		System.out.println(low.apply(str2));	
	}
		
		
	}
	
	
	public static void reverse(List<String>strings,Function<String,String>rev)
	{
		for(String str3:strings)
			
		{
			System.out.println(rev.apply(str3));	
		}
			
		
	}
}
	



package methodrefs;

import java.util.Optional;

public class TestOptional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str=null;
String str2="hello";
//Optional<String>optional=Optional.of(str);
Optional<String>optional2=Optional.ofNullable(str);
if(optional2.isPresent())
{
	System.out.println("value is  present "+optional2.get());
}
//System.out.println(optional.get());
//	}

//when str is used we will not get such element exception.
else
	//System.out.println("its null "+optional2.get()) 
	System.out.println("its null "+optional2.orElse("str not initialized"));
//if(optional.isEmpty())
//	System.out.println("value is not present");
//else 
//	System.out.println("value is present");
}
}

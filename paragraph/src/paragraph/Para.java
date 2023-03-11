package paragraph;

import java.util.HashMap;

public class Para {

	public static void main(String[] args) {
		HashMap<String,Integer> map=new HashMap<>();
		// TODO Auto-generated method stub
String a="the documentation for the polymorphic algorithms contained in this class "
		+ "generally includes a brief description of the implementation. "
		+ "such descriptions should be regarded as implementation notes, "
		+ "rather than parts of the specification. implementors should "
		+ "feel free to substitute other algorithms, so long as the specification "
		+ "itself is adhered to. for example, the algorithm used by sort does not"
		+ " have to be a mergesort, but it does have to stable.";


//String[] strArray=null;
//strArray=str.split(" ");

//strArray=str.split("[.]");
//strArray=str.split(",");

//for(int i=0;i<strArray.length;i++) {
//	System.out.println(strArray[i]);
//
//	String str1=str.replaceAll(".", "");
//	String str2=str1.replaceAll(",", "");
//	String par[]=str2.split("[ ]");
//	for(String ch:par)
		
	
 int count=0;
		String[] string = a.split(" ");
		for (String words : string )
		{
			if(map.containsKey(words)) {
				count=map.get(words);
				map.put(words, ++count);
			}
			else {
				map.put(words, 1);
			}
		}
		System.out.println(map);
//		for (int i = 0; i< string .length; i++)
//		{System.out.println(string[i]);
//		}
//		System.out.println(map);
//		}
//		

		
		
		//string reverse
		
//		int i=12321;
//		String str=i+"";
//		StringBuilder sb=new StringBuilder(str);
//		sb.reverse();
//		System.out.println(sb);
//		boolean result =str.equals(sb.toString());
//		System.out.println(result);
//		
		
		
		String str="pain is my purpose";
		int n=10;
		String s="10";
		Integer integer =new Integer("10");
		
		char[] i = null;
		String sint=s.valueOf(i);
		int m=Integer.parseInt(s);
		
		String s2=integer.toString();
	//	integer =s2.intValue();
		
	}
}
	
		
		



package strings;

public class TestStrings {

	public static void main(String[] args) {
//		byte bytes[]= {65,66,67,68,69};
//		String str  =new String(bytes);
//		System.out.println(str.length());
//		System.out.println(str);
//		str="welcome to UST global";
//	
//		bytes=str.getBytes();
//		for(byte b:bytes) {
//			System.out.println(b);
//		}
//		// TODO Auto-generated method stub
//char chars[]= {'U','S','T',' ','G'};
//
//	str=new String(chars);
//	System.out.println(str);
//	str.getChars(0, chars.length-1,chars, 0);
//	for(char c:chars) {
//		System.out.println(c);
//	}
//	
//int count=0;
	String string=new String("She sells sea shells in sea shore");
//	for(int i=0;i<string.length();i++)
//	{
//		if(string.charAt(i)=='s'||string.charAt(i)=='S')
//		{
//			count++;
//		}
//		
//			
//		}
//	System.out.println(count);
//	}
//	int count=0;
//	String string=new String("She sells sea .shells in sea shore");
//String words[]=string.split("[.]" );
//System.out.println(words.length);
//
//	for(String word:words) {
//		System.out.println(word);
//	}
//	string =new String("cartoon");
//	System.out.println(string.startsWith("car"));
//	System.out.println(string.endsWith("toon"));
//	
//	
//	int apos=string.indexOf('a');
//	int tpos=string.indexOf('t');
//	
//	String string2=string.substring(apos,tpos);
//	System.out.println(string2);
//	string2=string.substring(tpos);
//	System.out.println(string2);
//
//	 string=new String("madamdam");
//	 
//	 int dpos=string.lastIndexOf('d');
//	 System.out.println(string2);
//	 
//	 string2=string.substring(dpos,string.length());
//	 System.out.println(string2);
//			
//	
//	
//	
// string=new String("amina.ja@ust.com");
//	 
//	 int dpos1=string.lastIndexOf('.');
//	 System.out.println(string2);
//	 
//	 string2=string.substring(dpos1+1,string.length());
//	 System.out.println(string2);
//	
//	 String str1 =new String("welcome");
//	 String str2 =new String("weLCOME");
//
//	 boolean result=str2.equals(str1);
//	 System.out.println(result);
//	 int val=str2.compareTo(str1);
//	 System.out.println(val);

	
//System.out.println(str1.toLowerCase());
//System.out.println(str1);
//
//System.out.println(str1.toUpperCase());
//System.out.println(str1); 
 //immutable 
int digit=0;
int alpha=0;
int space=0;
int count=0;
	 string="16-11-477/6/A/3 Hyderabad 500036";	 
	 for(int i=0;i<string.length();i++)
	 {
		 if(Character.isDigit(string.charAt(i))) {
			 digit++;
		 }
		 else
			 if(Character.isAlphabetic(string.charAt(i)))
			 {
				alpha++;
				
		 }
			 else
				 if(Character.isSpaceChar(string.charAt(i)))
				 {
					 space++;
				 }
				 else
					
					 count++;
	 	 
	 }
	 System.out.println("Digit count="+digit);
	 System.out.println("Alphabet count"+alpha);
	 System.out.println("Number of spaces="+space);
	 System.out.println("Number of other characters="+count);

}
}

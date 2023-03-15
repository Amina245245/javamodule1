package oopsday4.composition;

public class CompanyHR {

	public static void main(String[] args) {
		
		Address resAdd=new Address("31","Mannath","Worli","Mumbai",400048);
		Address commAdd=new Address("32","Antela","Bandra","Mumbai",400032);
		
 Employee emp1=new Employee("john doe", "Male", 24, 101, "research", 40000,resAdd,commAdd);
 System.out.println(emp1);
 
 Employee emp2=new Employee("jane doe", "Female", 23, 102, "Accounting", 50000,resAdd,commAdd);
 System.out.println(emp2);
 
 Employee emp3=new Employee("jason doe", "Male", 25, 103, "sales", 60000,resAdd,commAdd);
 System.out.println(emp3);
 
 Employee emp4=new Employee("jones doe", "Male", 26, 104, "research", 70000,resAdd,commAdd);
 System.out.println(emp4);
 
 Employee emp5=new Employee("john doe", "Male", 24, 101, "research", 40000,resAdd,commAdd);
 System.out.println(emp5);
 
 if(emp1.equals(emp5)) {
	 System.out.println("the objects are same");
 }
	 else {
		 System.out.println("the objects are not same");
 }
	}

}

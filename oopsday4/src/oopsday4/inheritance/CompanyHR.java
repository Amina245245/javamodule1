package oopsday4.inheritance;

public class CompanyHR {

	public static void main(String[] args) {
		
 Employee emp1=new Employee("john doe", "Male", 24, 101, "research", 40000);
 System.out.println(emp1);
 
 Employee emp2=new Employee("jane doe", "Female", 23, 102, "Accounting", 50000);
 System.out.println(emp2);
 
 Employee emp3=new Employee("jason doe", "Male", 25, 103, "sales", 60000);
 System.out.println(emp3);
 
 Employee emp4=new Employee("jones doe", "Male", 26, 104, "research", 70000);
 System.out.println(emp4);
 
 Employee emp5=new Employee("john doe", "Male", 24, 101, "research", 40000);
 System.out.println(emp5);
 
 if(emp1.equals(emp5)) {
	 System.out.println("the objects are same");
 }
	 else {
		 System.out.println("the objects are not same");
 }
	}

}

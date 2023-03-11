package Userdefinedobjects;

import java.util.ArrayList;



public class TestEmpArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Employee> empList= new ArrayList<Employee>();

Employee emp1=new Employee("john doe", "Male", 24, 101, "research", 40000);

Employee emp2=new Employee("jane doe", "Female", 23, 102, "Accounting", 50000);

Employee emp3=new Employee("jason doe", "Male", 25, 103, "sales", 60000);

Employee emp4=new Employee("jones doe", "Male", 26, 104, "research", 70000);

Employee emp5=new Employee("john doe", "Male", 24, 101, "research", 40000);



empList.add(emp1);
empList.add(emp2);
empList.add(emp3);
empList.add(emp4);
empList.add(emp5);

System.out.println(empList);
	}

}

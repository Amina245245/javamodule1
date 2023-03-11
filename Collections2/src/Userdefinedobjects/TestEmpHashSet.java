package Userdefinedobjects;

import java.util.ArrayList;
import java.util.HashSet;

public class TestEmpHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Employee> empSet= new HashSet<Employee>();

		Employee emp1=new Employee("john doe", "Male", 24, 101, "research", 40000);

		Employee emp2=new Employee("jane doe", "Female", 23, 102, "Accounting", 50000);

		Employee emp3=new Employee("jason doe", "Male", 25, 103, "sales", 60000);

		Employee emp4=new Employee("jones doe", "Male", 26, 104, "research", 70000);

		Employee emp5=new Employee("john doe", "Male", 24, 101, "research", 40000);



		empSet.add(emp1);
		empSet.add(emp2);
		empSet.add(emp3);
		empSet.add(emp4);
		empSet.add(emp5);

		System.out.println(empSet.size());
			
	}

}

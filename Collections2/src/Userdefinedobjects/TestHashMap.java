package Userdefinedobjects;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.HashMap;
public class TestHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1=new Employee("john doe", "Male", 24, 101, "research", 40000);

		Employee emp2=new Employee("jane doe", "Female", 23, 102, "Accounting", 50000);

		Employee emp3=new Employee("jason doe", "Male", 25, 103, "sales", 60000);

		Employee emp4=new Employee("jones doe", "Male", 26, 104, "research", 70000);

		Employee emp5=new Employee("john doe", "Male", 24, 101, "research", 40000);

		ArrayList<Employee> empList= new ArrayList<Employee>();

		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		empList.add(emp5);
		
		TreeSet<Employee> empSet= new TreeSet<Employee>();
		empSet.add(emp1);
		empSet.add(emp2);
		empSet.add(emp3);
		empSet.add(emp4);
		empSet.add(emp5);

		HashSet<Employee> empSet1= new HashSet<Employee>();
		
		empSet1.add(emp1);
		empSet1.add(emp2);
		empSet1.add(emp3);
		empSet1.add(emp4);
		empSet1.add(emp5);
		
		HashMap<String,Collection> dataMap=new HashMap<>();
		dataMap.put("emptList", empList);
		dataMap.put("empTreeSet",empSet);
		dataMap.put("empSet",empSet1);
		
		System.out.println(dataMap);

	}

}

package oopsday4.inheritance;

import java.util.Objects;

public class Employee extends Person {
	
	private long empId;
	private String deptno;
	
	
	public long getEmpId() {
		return empId;
	}

	public void setEmpId(long empId) {
		this.empId = empId;
	}

	public String getDeptno() {
		return deptno;
	}

	public void setDeptno(String deptno) {
		this.deptno = deptno;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	private double salary;
	
	public Employee() {
		
	}

	public Employee(String name, String gender, int age,long empId,String deptno,double salary) {
		super(name, gender, age);
		this.empId=empId;
		this.deptno=deptno;
		this.salary=salary;
		
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", deptno=" + deptno + ", salary=" + salary + ", getName()=" + getName()
				+ ", getGender()=" + getGender() + ", getAge()=" + getAge() + "]";
	}
//@Override
//public boolean equals(Object obj) {
//	Employee ref=null;
//	if(obj!=null)
//		ref=(Employee)obj;
//
//	
//	if(ref.getEmpId()==this.empId
//			&& ref.getName().equals(this.getName())
//			&& ref.getDeptno()==this.deptno)
//	return true;
//
//else
//	return false;
//}
//@Override
//public int hashCode() {
//int code=this.hashCode() *32*((int)this.empId)*(this.getName().length()) *this.deptno.length();
//	return super.hashCode();
//}

	@Override
	public int hashCode() {
		return Objects.hash(deptno, empId, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(deptno, other.deptno) && empId == other.empId
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}
	
	
}

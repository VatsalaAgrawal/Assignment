package com.techment.Test1;

class Employee
{
	String firstName;
	String lastName;
	public Employee(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	
}
public class Program2 {

	public static void main(String[] args) {
		Employee e1=new Employee("Vatsala","Agrawal");
		Employee e2=new Employee("Roshni","Singh");
		Employee e3=new Employee("Ravi","Bhatia");
		System.out.println(e1.toString());
		System.out.println(e2.toString());
		System.out.println(e3.toString());
		

	}

}

package com.techment.demo;

class Student{  
void student(){
	System.out.println("STUDENT");
	}  
}  
class Employee extends Student{  
void employee(){
	System.out.println("EMPLOYEE");
	}  
}  
class Employee1 extends Employee{  
void employee1(){
	System.out.println("EMPLOYEE1");
}  
}  

public class MultilevelInheritanve {

	public static void main(String[] args) {
		Employee1 e=new Employee1();  
		e.student();  
		e.employee();  
		e.employee1();  

	}

}

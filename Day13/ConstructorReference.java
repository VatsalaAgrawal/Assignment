package com.techment.Day13;
interface A{
	Student getStudentDetails();
}
class Student{
	int id;
	String name;
	void display() {
		System.out.println("This is student info");
	}
}
public class ConstructorReference {

	public static void main(String[] args) {
		//by using lamda multiple line
		A a=()->{
			Student s=new Student();
			return s;
			
		};
		a.getStudentDetails().display();
		
		//by using lamda single line
		A a1=()->new Student();
		a1.getStudentDetails().display();
		
		//by using method reference
		A obj=Student::new;
		obj.getStudentDetails().display();
	}

}

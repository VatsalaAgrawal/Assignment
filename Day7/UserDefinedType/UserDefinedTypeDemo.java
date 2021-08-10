package com.techment.Day7.UserDefinedType;

import java.util.ArrayList;

public class UserDefinedTypeDemo {

	public static void main(String[] args) {
	Employee e1=new Employee(1,"Vatsala","HR");
	Employee e2=new Employee(1,"Reshmi","HR");
	ArrayList<Employee> a=new ArrayList<Employee>();
	a.add(e2);
	a.add(e1);
	a.add(new Employee(3,"Rahul","Hr"));
	for(Employee u:a)
	{
		System.out.println(u.id+" "+u.name+" "+u.dept);
	}
	}

}

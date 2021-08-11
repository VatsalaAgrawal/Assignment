package com.techment.Day8.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee implements Comparable<Employee>{
	int id;
	String name;
	String dept;
	int age;
	public Employee(int id, String name, String dept, int age) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", age=" + age + "]";
	}
	public int compareTo(Employee o)
	{
		if(this.age==o.age)
			return 0;
		else if(this.age>o.age)
			return 1;
			else
				return -1;
		
	}
}

public class ComparableDemo {

	public static void main(String[] args) {
		ArrayList<Employee> a=new ArrayList<Employee>();
		a.add(new Employee(1,"rahul","hr",8));
		a.add(new Employee(2,"rahulsingh","hr",80));
		a.add(new Employee(3,"priya","hr",18));
		Collections.sort(a);
		for(Employee e:a)
		{
			System.out.println(e.id+" "+e.name+" "+e.dept+" "+e.age);
			
		}

	}

}

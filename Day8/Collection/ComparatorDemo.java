package com.techment.Day8.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student{
	int id;
	String name;
	int age;
	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	
}
class AgeSorting implements Comparator<Student>
{
	

	@Override
	public int compare(Student o1, Student o2) {
	if(o1.age==o2.age)
		return 0;
	else if(o1.age>o2.age)
	return 1;
	else
		return -1;
	}
}
class NameSorting implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) {
	return o1.name.compareTo(o2.name);
	
	}
}

public class ComparatorDemo {

	public static void main(String[] args) {
		ArrayList<Student> a=new ArrayList<Student>();
		a.add(new Student(1,"rahul",8));
		a.add(new Student(2,"rahulsingh",80));
		a.add(new Student(3,"priya",18));
		System.out.println("After NAME Sorting-");
		Collections.sort(a,new NameSorting());
		for(Student e:a)
		{
			System.out.println(e.id+" "+e.name+" "+e.age);
			
		}
		System.out.println("After AGE Sorting-");
		Collections.sort(a,new AgeSorting());
		for(Student e:a)
		{
			System.out.println(e.id+" "+e.name+" "+e.age);
			
		}


	}
}




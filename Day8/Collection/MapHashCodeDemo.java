package com.techment.Day8.Collection;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Objects;

class Student1{
	int id;
	String name;
	String dept;
	public Student1(int id, String name, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
	}
	@Override
	public int hashCode() {
		return Objects.hash(dept, id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student1 other = (Student1) obj;
		return Objects.equals(dept, other.dept) && id == other.id && Objects.equals(name, other.name);
	}
	
	
	
}

public class MapHashCodeDemo {

	public static void main(String[] args) {
		Student1 s1=new Student1(1,"Vatsala","HR");
		Student1 s2=new Student1(1,"Vatsala","HR");
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	
	HashMap<Student1,String> h=new HashMap<Student1,String>();
	h.put(new Student1(2,"Rohan","Manager"),"CSE");
	h.put(new Student1(2,"Rohan","Manager"),"CSE");
	for(Entry<Student1,String> e:h.entrySet())
	{
		System.out.println(e);
	}

	}

}

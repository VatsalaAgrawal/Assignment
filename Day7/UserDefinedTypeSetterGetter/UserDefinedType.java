package com.techment.Day7.UserDefinedTypeSetterGetter;

import java.util.ArrayList;

import com.techment.Day7.UserDefinedType.Employee;

public class UserDefinedType {

	public static void main(String[] args) {
	ArrayList<Employee1> a=new ArrayList<Employee1>();
	Employee1 e1=new Employee1();
	Employee1 e2=new Employee1();
	Employee1 e3=new Employee1();
	e1.setId(12);
	e1.setName("Vatsala");
	e1.setDept("hr");
	e2.setId(13);
	e2.setName("Kavya");
	e2.setDept("hr");
	e3.setId(19);
	e3.setName("Reshma");
	e3.setDept("Manager");
	a.add(e1);
	a.add(e2);
	a.add(e3);
	for(Employee1 u:a)
	{
		System.out.println(u.getId()+" "+u.getName()+" "+u.getDept());
	}
	
	
	}

}



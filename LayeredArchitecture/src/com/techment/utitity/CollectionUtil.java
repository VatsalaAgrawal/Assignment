package com.techment.utitity;

import java.util.HashMap;
import java.util.Map;

import com.techment.model.Employee1;





public class CollectionUtil {
	static Map<Integer, Employee1> employees=new HashMap<Integer,Employee1>();

static {
	employees.put(1,new Employee1(1,"Vatsala","hr",78000));
	employees.put(2,new Employee1(2,"Rahul","Developer",700));
	employees.put(3,new Employee1(3,"Kavya","hr",78099));
	employees.put(4,new Employee1(4,"Rishita","Manager",60000));
}

/* this method is used to get the employee map,which we can initialised as static data*/
 public static Map<Integer,Employee1> getEmployeeList(){
	 return employees;
	 
 }
}

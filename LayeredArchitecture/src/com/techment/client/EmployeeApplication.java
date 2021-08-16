package com.techment.client;

import java.util.List;
import java.util.Scanner;

import com.techment.model.Employee1;
import com.techment.service.EmployeeServiveImpl;
import com.techment.service.IEmployeeService;

public class EmployeeApplication {

	public static void main(String[] args) {
		
		IEmployeeService service=new EmployeeServiveImpl();
		System.out.println("======Employee Application=====");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the dept to fetch employee");
		String dept=sc.next();
		
	
		
		
		List<Employee1> employees=service.getEmployeeByDept(dept);
		System.out.println(employees);

	}

}

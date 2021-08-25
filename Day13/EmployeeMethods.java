package com.techment.Day13;
import com.techment.Day12Java8.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;



public class EmployeeMethods {

	public static void main(String[] args) {
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(1, "Sachin", "hr", 20000, 38));
		employees.add(new Employee(2, "Kumar", "Developer", 30000, 23));
		employees.add(new Employee(3, "Anil", "Manager", 40000, 55));
		employees.add(new Employee(4, "John", "Developer", 50000, 45));
		employees.add(new Employee(5, "Rahul", "Manager", 60000, 48));
		employees.add(new Employee(6, "Saurabh", "hr", 70000, 30));
		employees.add(new Employee(7, "Jatin", "Developer", 80000, 28));
		
		employees.stream().map(e->"name "+e.getName()+"  salary "+e.getSalary() +"   Salary increased by 20%   " +(e.getSalary()*0.20)).forEach(System.out::println);
	List<String> li=employees.stream().map(e->"name "+e.getName()+"salary "+e.getSalary() +"Salary increased by 20%" +(e.getSalary()*0.20)).collect(Collectors.toList());
	
	
	EmployeeMethods e=new EmployeeMethods();
	Long hrSumSalary=e.deptWiseSumSalary(employees,"hr");
	System.out.println("Total HR Salary :"+hrSumSalary);
	
	}
		
	Long deptWiseSumSalary(ArrayList<Employee> employees,String dept)
			{
	Long sumSal=employees.stream().filter(e->e.getDept().equals(dept)).collect(Collectors.summarizingInt(Employee::getSalary)).getSum();

			return sumSal;
			}
	
}


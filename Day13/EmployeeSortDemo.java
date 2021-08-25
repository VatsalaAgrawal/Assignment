package com.techment.Day13;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.techment.Day12Java8.Employee;
class AgeComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1,Employee o2) {
		if(o1.getAge()==o2.getAge())
			return 0;
		else if(o1.getAge()>o2.getAge())
			return 1;
		else
			return -1;
		
	}
}

public class EmployeeSortDemo {

	public static void main(String[] args) {
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(1, "Sachin", "hr", 20000, 38));
		employees.add(new Employee(2, "Kumar", "Developer", 30000, 23));
		employees.add(new Employee(3, "Anil", "Manager", 40000, 55));
		employees.add(new Employee(4, "John", "Developer", 50000, 45));
		employees.add(new Employee(5, "Rahul", "Manager", 60000, 48));
		employees.add(new Employee(6, "Saurabh", "hr", 70000, 30));
		employees.add(new Employee(7, "Jatin", "Developer", 80000, 28));
		employees.forEach(System.out::println);
		System.out.println("Soring by Age");
		employees.stream().sorted(new AgeComparator()).forEach(System.out::println);
		System.out.println();
		employees.stream().sorted(Comparator.comparingInt(Employee::getAge).reversed()).forEach(System.out::println);

		System.out.println("Soring by Name");
	List<Employee> emp=employees.stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());
	emp.forEach(System.out::println);
	}

}

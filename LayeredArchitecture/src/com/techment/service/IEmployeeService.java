package com.techment.service;



import java.util.List;

import com.techment.model.Employee1;

public interface IEmployeeService {
	Employee1 getEmployeeById(int id);
	List<Employee1> getEmployeeByDept(String dept);

}

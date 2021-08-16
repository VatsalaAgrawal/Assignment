package com.techment.dao;

import java.util.List;

import com.techment.model.Employee1;

public interface IEmployeeDao {
	Employee1 getEmployeeById(int id);
	List<Employee1> getEmployeeByDept(String dept);
	

}

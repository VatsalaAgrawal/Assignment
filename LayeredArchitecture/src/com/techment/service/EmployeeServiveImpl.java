package com.techment.service;

import java.util.List;

import com.techment.dao.EmployeeDaoImpl;
import com.techment.dao.IEmployeeDao;
import com.techment.model.Employee1;

public class EmployeeServiveImpl implements IEmployeeService {

	IEmployeeDao employeeDao=new EmployeeDaoImpl();
	@Override
	public Employee1 getEmployeeById(int id) {
		// TODO Auto-generated method stub
		return employeeDao.getEmployeeById(id);
	}

	@Override
	public List<Employee1> getEmployeeByDept(String dept) {
		
		// TODO Auto-generated method stub
		return employeeDao.getEmployeeByDept(dept);
	}

}

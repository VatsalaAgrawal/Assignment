package com.techment.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.techment.model.Employee1;
import com.techment.utitity.CollectionUtil;

public class EmployeeDaoImpl implements IEmployeeDao {
CollectionUtil collectionUtil=new CollectionUtil();
	@Override
	public Employee1 getEmployeeById(int id) {
		
		Map<Integer,Employee1> empMap=CollectionUtil.getEmployeeList();
		
		Employee1 employee=empMap.get(id);
		
		return employee;
	}

	@Override
	public List<Employee1> getEmployeeByDept(String dept) {
		List<Employee1> empList=new ArrayList<Employee1>();
		Map<Integer,Employee1> empMap=CollectionUtil.getEmployeeList();
		for(Employee1 employee:empMap.values())
		{
			if(employee.getDept().equals(dept))
			{
				empList.add(employee);
			}
		}
		return empList;
	}

}

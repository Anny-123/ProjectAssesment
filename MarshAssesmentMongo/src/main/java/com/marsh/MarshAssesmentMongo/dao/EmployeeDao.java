package com.marsh.MarshAssesmentMongo.dao;

import java.util.List;

import com.marsh.MarshAssesmentMongo.model.Employee;

public interface EmployeeDao {

	public List<Employee> getEmployeesByName(String employeeName );
	public List<Employee> getEmployeesByDeptCode(String deptCode );

}

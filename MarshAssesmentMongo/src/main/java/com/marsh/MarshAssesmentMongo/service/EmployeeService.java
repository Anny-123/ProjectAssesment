package com.marsh.MarshAssesmentMongo.service;

import java.util.List;

import com.marsh.MarshAssesmentMongo.model.Employee;

public interface EmployeeService {
	
	public List<Employee> retrieveAllEmployees() ;

	public Employee retrieveEmployee(int employeeId);
	
	public Employee createEmployee(  Employee employee);

	public Employee deleteEmployee( int employeeId); 
		
	public Employee  updateEmployee(Employee employee);
	
	public List<Employee> getAllEmployees(int pageNo, int pageSize, String sortBy);
	
	public List<Employee> getEmployeesByName(String employeeName );
	
	public List<Employee> getEmployeesByNameAndDeptCode (String employeeName ,String deptCode );
	
}

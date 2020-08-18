package com.marsh.MarshAssesmentMongo.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.marsh.MarshAssesmentMongo.model.Employee;

@Repository
public interface EmployeePagingRepository extends PagingAndSortingRepository<Employee, Integer> {

	
	Employee findByEmployeeId(int employeeId);
	
	void deleteByEmployeeId(int employeeId);
	
}
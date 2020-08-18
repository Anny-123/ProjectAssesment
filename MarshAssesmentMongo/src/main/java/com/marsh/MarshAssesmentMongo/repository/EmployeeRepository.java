package com.marsh.MarshAssesmentMongo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.marsh.MarshAssesmentMongo.model.Employee;


@Repository
public interface EmployeeRepository extends MongoRepository<Employee, Integer> {

	
	Employee findByEmployeeId(int employeeId);
	
	@Query("{'employeeName' : ?0}")
	List<Employee> findAllByEmployeeName(String empName);
	
	@Query("{'deptCode' : ?0}")
	List<Employee> findAllByDeptCode(String deptCode);
	
	@Query("{'employeeName' : ?0 , 'deptCode': ?1 }")
	List<Employee> findAllByNameAndDeptCode(String empName, String deptCode);
	
	void deleteByEmployeeId(int employeeId);
	
}

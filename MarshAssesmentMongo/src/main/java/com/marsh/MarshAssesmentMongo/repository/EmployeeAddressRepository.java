package com.marsh.MarshAssesmentMongo.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.marsh.MarshAssesmentMongo.model.EmployeeAddress;

@Repository
public interface EmployeeAddressRepository extends MongoRepository<EmployeeAddress, Integer> {

	//Extracting employee address with employee id (not by its primary key) with customized query
	/*
	@Query("from EmployeeAddress where employee_id=:employeeId")
	Optional<EmployeeAddress> findByEmployeeId(@Param("employeeId") int employeeId);*/

}

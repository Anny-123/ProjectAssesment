package com.marsh.MarshAssesmentMongo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.FindAndModifyOptions;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import com.marsh.MarshAssesmentMongo.exception.SequenceException;
import com.marsh.MarshAssesmentMongo.model.DatabaseSequence;
import com.marsh.MarshAssesmentMongo.model.Employee;

@Service
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private MongoOperations mongoOperation;
	
	public List<Employee> getEmployeesByName(String employeeName )
	{

		 Query query = new Query(Criteria.where("employeeName").is(employeeName));

		 List<Employee> employees = mongoOperation.find(query, Employee.class);

		return employees;
	}


	public List<Employee> getEmployeesByDeptCode(String deptCode )
	{

		 Query query = new Query(Criteria.where("deptCode").is(deptCode));

		 List<Employee> employees = mongoOperation.find(query, Employee.class);

		return employees;
	}

}

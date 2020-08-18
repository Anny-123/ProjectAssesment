package com.marsh.MarshAssesmentMongo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.marsh.MarshAssesmentMongo.constant.Constants;
import com.marsh.MarshAssesmentMongo.dao.EmployeeDao;
import com.marsh.MarshAssesmentMongo.exception.EmployeeException;
import com.marsh.MarshAssesmentMongo.model.Employee;
import com.marsh.MarshAssesmentMongo.repository.EmployeeAddressRepository;
import com.marsh.MarshAssesmentMongo.repository.EmployeePagingRepository;
import com.marsh.MarshAssesmentMongo.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	EmployeeRepository employeeRepository;

	EmployeeAddressRepository employeeAddressRepository;
	
	private SequenceService sequenceService;

	EmployeePagingRepository employeePagingRepository;
	
	EmployeeDao employeeDao;

	@Autowired // optional
	public EmployeeServiceImpl(EmployeeRepository employeeRepository,
			EmployeeAddressRepository employeeAddressRepository,
			@Qualifier("sequenceServiceImpl")SequenceService sequenceService,
			EmployeePagingRepository employeePagingRepository,
			EmployeeDao employeeDao) {
		this.employeeRepository = employeeRepository;
		this.employeeAddressRepository = employeeAddressRepository;
		this.sequenceService=sequenceService;
		this.employeePagingRepository=employeePagingRepository;
		this.employeeDao=employeeDao;
	}

	@Override
	public List<Employee> retrieveAllEmployees() {
		// TODO Auto-generated method stub
		return (List<Employee>) employeeRepository.findAll();
	}

	@Override
	public Employee retrieveEmployee(int employeeId) {
		// TODO Auto-generated method stub
		Employee employee = employeeRepository.findByEmployeeId(employeeId);

		if (employee==null)
			throw new EmployeeException("Employee Id-" + employeeId + " does not exist");

		return employee;
	}
	
	@Override
	public Employee createEmployee(Employee employee) {

		employee.setEmployeeId(sequenceService.getNextSequenceId(Constants.EMPLOYEE_SEQ_KEY));
		employee.getEmployeeAddress().setId(sequenceService.getNextSequenceId(Constants.ADDRESS_SEQ_KEY));
		
		return employeeRepository.save(employee);
	}

	
	@Override
	public Employee deleteEmployee(int employeeId) {
		
		Employee employee = employeeRepository.findByEmployeeId(employeeId);
		
		if (employee== null)
			throw new EmployeeException("Employee Id :" + employeeId + " does not exist");

		employeeRepository.deleteByEmployeeId(employeeId);
		
		return employee;
	}

	@Override
	public Employee updateEmployee(Employee employee) {

		//---->
		
		Employee emp = employeeRepository.findByEmployeeId(employee.getEmployeeId());
		
		if (emp==null)
			throw new EmployeeException("Employee Id :" + employee.getEmployeeId() + " does not exist");

		employee.getEmployeeAddress().setId(emp.getEmployeeAddress().getId());
		
		return employeeRepository.save(employee);
	}

	
	public List<Employee> getAllEmployees(int pageNo, int pageSize, String sortBy)
    {
        Pageable paging = PageRequest.of(pageNo, pageSize, Sort.by(sortBy));
 
        Page<Employee> pagedResult = employeePagingRepository.findAll(paging);
         
        if(pagedResult.hasContent()) {
            return pagedResult.getContent();
        } else {
            return new ArrayList<Employee>();
        }
    }


	public List<Employee> getEmployeesByName(String employeeName )
    {
		return employeeRepository.findAllByEmployeeName(employeeName);

		//return employeeDao.getEmployeesByName(employeeName);
    }
	
	public List<Employee> getEmployeesByNameAndDeptCode (String employeeName ,String deptCode )
    {
		
		if(!employeeName.equals("") && !deptCode.equals(""))
			return employeeRepository.findAllByNameAndDeptCode(employeeName,deptCode);

		if(!employeeName.equals("") && deptCode.equals(""))
			return employeeRepository.findAllByEmployeeName(employeeName);	
		
		if(employeeName.equals("") && !deptCode.equals(""))
			return employeeRepository.findAllByDeptCode(deptCode);
		
		return null;
		
    }

}

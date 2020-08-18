package com.marsh.MarshAssesmentMongo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.marsh.MarshAssesmentMongo.model.Employee;
import com.marsh.MarshAssesmentMongo.service.EmployeeService;


@RestController
@RequestMapping("/api")
public class EmployeeController {

	
	EmployeeService service;

	@Autowired
	public EmployeeController(@Qualifier("employeeServiceImpl")EmployeeService service) {
		// TODO Auto-generated constructor stub
		this.service = service;
	}
	
/*	
	@GetMapping("/employees")
	public List<Employee> retrieveAllEmployees() {
		return (List<Employee>) service.retrieveAllEmployees();
	}
*/
	@GetMapping("/employees/{employeeId}")
	public ResponseEntity<Employee> retrieveEmployee(@PathVariable int employeeId) {

		Employee employee= service.retrieveEmployee(employeeId);

		ResponseEntity<Employee> response = new ResponseEntity<Employee>(employee, HttpStatus.OK);

		return response;
	}

	@PostMapping("/employees")
	public ResponseEntity<Employee> createEmployee(@Valid @RequestBody Employee employee) {

		Employee emp = service.createEmployee(employee);

		ResponseEntity<Employee> response = new ResponseEntity<Employee>(emp, HttpStatus.CREATED);

		return response;
	}
	

	@DeleteMapping("/employees/{employeeId}")
	public ResponseEntity<Employee> deleteEmployee(@PathVariable int employeeId) {
		
		Employee emp = service.deleteEmployee(employeeId);		
		
		ResponseEntity<Employee> response = new ResponseEntity<Employee>(emp, HttpStatus.OK);
		
		return response;
	}


	@PutMapping("/employees")
	public ResponseEntity<Employee> updateEmployee(@Valid @RequestBody Employee employee){
		
		Employee emp = service.updateEmployee(employee);
		
		ResponseEntity<Employee> response = new ResponseEntity<Employee>(emp, HttpStatus.OK);

		return response;
	}
	
	@GetMapping("/employees")
    public ResponseEntity<List<Employee>> getAllEmployees(
                        @RequestParam(defaultValue = "0") int pageNo, 
                        @RequestParam(defaultValue = "5") int pageSize,
                        @RequestParam(defaultValue = "employeeId") String sortBy) 
    {
        List<Employee> list = service.getAllEmployees(pageNo, pageSize, sortBy);
 
        return new ResponseEntity<List<Employee>>(list, new HttpHeaders(), HttpStatus.OK); 
    }
	
	@GetMapping("/employees/searchBy")
    public ResponseEntity<List<Employee>> getEmployeesByName(
                        @RequestParam(defaultValue = "") String employeeName,
                        @RequestParam(defaultValue = "") String deptCode)
    {
        List<Employee> list = service.getEmployeesByNameAndDeptCode(employeeName,deptCode);
 
        return new ResponseEntity<List<Employee>>(list, new HttpHeaders(), HttpStatus.OK); 
    }

/*	@GetMapping("/employees/searchBy")
    public ResponseEntity<List<Employee>> getEmployeesByDeptCode(
                        @RequestParam(defaultValue = "") String deptCode )
    {
        List<Employee> list = service.getEmployeesByDeptCode(deptCode);
 
        return new ResponseEntity<List<Employee>>(list, new HttpHeaders(), HttpStatus.OK); 
    }
*/
	
}

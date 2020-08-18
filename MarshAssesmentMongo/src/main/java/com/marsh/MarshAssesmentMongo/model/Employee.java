package com.marsh.MarshAssesmentMongo.model;

import java.util.Date;

import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Employee")
public class Employee {

	public Employee(int employeeId, String employeeName, String deptCode, Date birthDate,
			EmployeeAddress employeeAddress) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.deptCode = deptCode;
		this.birthDate = birthDate;
		this.employeeAddress = employeeAddress;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Id
	//@GeneratedValue
	private int employeeId;
	
	private String employeeName;
	
	private String deptCode;
	
	//@Past(message="Birth Date should be in past")
	private Date birthDate;
	
	@OneToOne(mappedBy = "employee")
	private EmployeeAddress employeeAddress;
	
	public EmployeeAddress getEmployeeAddress() {
		return employeeAddress;
	}

	public void setEmployeeAddress(EmployeeAddress employeeAddress) {
		this.employeeAddress = employeeAddress;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getDeptCode() {
		return deptCode;
	}

	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", deptCode=" + deptCode
				+  "]";
	}
	
}

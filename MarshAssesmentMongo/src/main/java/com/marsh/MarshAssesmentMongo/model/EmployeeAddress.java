package com.marsh.MarshAssesmentMongo.model;

import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnore;

//@Entity
@Document(collection = "EmployeeAddress")
public class EmployeeAddress {

	
	
	public EmployeeAddress() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeeAddress( String aptNo, String streetName, String city, String state, String country,
			String pincode) {
		super();
		
		this.aptNo = aptNo;
		this.streetName = streetName;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
	}

	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	//@JsonIgnore
	private int id;
	
	private String aptNo;
	
	private String streetName;
	
	private String city;
	
	private String state;
	
	private String country;
	
	private String pincode;
	
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Employee_ID")
	private Employee employee;


	public String getAptNo() {
		return aptNo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

/*	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}*/

	public void setAptNo(String aptNo) {
		this.aptNo = aptNo;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [aptNo=" + aptNo + ", streetName=" + streetName + ", city=" + city + ", state=" + state
				+ ", country=" + country + ", pincode=" + pincode + "]";
	}
	
	
}

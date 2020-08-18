package com.marsh.MarshAssesmentMongo.config;

import java.util.Date;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.marsh.MarshAssesmentMongo.constant.Constants;
import com.marsh.MarshAssesmentMongo.model.DatabaseSequence;
import com.marsh.MarshAssesmentMongo.model.Employee;
import com.marsh.MarshAssesmentMongo.model.EmployeeAddress;
import com.marsh.MarshAssesmentMongo.repository.DatabaseSequenceRepository;
import com.marsh.MarshAssesmentMongo.repository.EmployeeAddressRepository;
import com.marsh.MarshAssesmentMongo.repository.EmployeeRepository;

@EnableMongoRepositories(basePackages = ("com.marsh.MarshAssesmentMongo"))
@Configuration
public class MongoDBConfig {

	@Bean
    CommandLineRunner commandLineRunner(EmployeeRepository employeeRepository,
    									EmployeeAddressRepository employeeAddressRepository,
    									DatabaseSequenceRepository databaseSequenceRepository) {
        return strings -> {
        	
        	
        	employeeRepository.deleteAll();
        	databaseSequenceRepository.save(new DatabaseSequence (Constants.EMPLOYEE_SEQ_KEY,0));
        	databaseSequenceRepository.save(new DatabaseSequence (Constants.ADDRESS_SEQ_KEY,200));
        	employeeRepository.save(new Employee(301, "Peter", "D2", new Date(), 
        			new EmployeeAddress("Appt1", "Street1" ,"Thane","Maharashtra", "India","421001")
        			));
        	employeeRepository.save(new Employee(302, "S3", "D2", new Date(), 
        			new EmployeeAddress("Appt2", "Street2" ,"Thane","Maharashtra", "India","421001")
        			));

        	employeeRepository.save(new Employee(303, "S3", "A3", new Date(), 
        			new EmployeeAddress("Appt3", "Street3" ,"Thane","Maharashtra", "India","421001")
        			));
        	employeeRepository.save(new Employee(304, "A4", "C4", new Date(), 
        			new EmployeeAddress("Appt4", "Street4" ,"Thane","Maharashtra", "India","421001")
        			));



        	employeeRepository.save(new Employee(305, "S5", "A5", new Date(), 
        			new EmployeeAddress("Appt3", "Street3" ,"Thane","Maharashtra", "India","421001")
        			));
        	employeeRepository.save(new Employee(306, "A6", "C6", new Date(), 
        			new EmployeeAddress("Appt4", "Street4" ,"Thane","Maharashtra", "India","421001")
        			));


        	employeeRepository.save(new Employee(307, "S7", "D7", new Date(), 
        			new EmployeeAddress("Appt7", "Street7" ,"Thane","Maharashtra", "India","421001")
        			));
        	employeeRepository.save(new Employee(308, "A8", "C8", new Date(), 
        			new EmployeeAddress("Appt4", "Street4" ,"Thane","Maharashtra", "India","421001")
        			));

        
        };
    }

}
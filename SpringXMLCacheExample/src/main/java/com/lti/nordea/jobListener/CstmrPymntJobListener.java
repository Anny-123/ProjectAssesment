package com.lti.nordea.jobListener;


import java.time.LocalTime;
import java.util.List;

import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.lti.nordea.model.PaymentInfo;
import com.lti.nordea.service.BusinessService;
import com.lti.nordea.service.BusinessServiceImpl;


//provide the opportunity to execute some business logic before job start and after job completed.
public class CstmrPymntJobListener implements JobExecutionListener{

	
	private LocalTime startTime, stopTime;

	
	@Override
	public void beforeJob(JobExecution jobExecution) {
		// TODO Auto-generated method stub
		startTime = LocalTime.now();
        System.out.println("Reading Xml file Job starts at :"+startTime);
        
		
	}

	@Override
	public void afterJob(JobExecution jobExecution) {
		// TODO Auto-generated method stub
		stopTime = LocalTime.now();
        System.out.println("Reading Xml file Job stops at :"+stopTime);
 
        if(jobExecution.getStatus() == BatchStatus.COMPLETED){
            System.out.println("Reading Xml file and written into database completed successfully");
            //Here you can perform some other business logic like cleanup
            
        }else if(jobExecution.getStatus() == BatchStatus.FAILED){
            System.out.println("Reading Xml file job failed with following exceptions ");
            List<Throwable> exceptionList = jobExecution.getAllFailureExceptions();
            for(Throwable th : exceptionList){
                System.err.println("exception :" +th.getLocalizedMessage());
            }
        }
	}

}

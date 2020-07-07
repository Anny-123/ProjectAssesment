package com.lti.nordea.jobListener;

import java.time.LocalTime;
import java.util.List;

import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;
import org.springframework.stereotype.Component;

@Component
public class CstmrPymntCachingJobListener implements JobExecutionListener {

	private LocalTime startTime, stopTime;
	
	@Override
	public void beforeJob(JobExecution jobExecution) {
	
		startTime = LocalTime.now();
        System.out.println("Reading from database Job starts at :"+startTime);
	}

	@Override
	public void afterJob(JobExecution jobExecution) {
		// TODO Auto-generated method stub
		
		stopTime = LocalTime.now();
        System.out.println("Reading from database Job stops at :"+stopTime);
 
        if(jobExecution.getStatus() == BatchStatus.COMPLETED){
            System.out.println("Reading from database and put it into cache job completed successfully");
            //Here you can perform some other business logic like cleanup
            
        }else if(jobExecution.getStatus() == BatchStatus.FAILED){
            System.out.println("Reading from database job failed with following exceptions ");
            List<Throwable> exceptionList = jobExecution.getAllFailureExceptions();
            for(Throwable th : exceptionList){
                System.err.println("exception :" +th.getLocalizedMessage());
            }
        }		
	}
}



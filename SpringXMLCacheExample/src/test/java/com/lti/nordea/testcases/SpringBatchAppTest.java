package com.lti.nordea.testcases;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.test.JobLauncherTestUtils;
import org.springframework.batch.test.context.SpringBatchTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lti.nordea.SpringBatchAppMain;

@RunWith(SpringJUnit4ClassRunner.class)
//@RunWith(SpringRunner.class)
@SpringBatchTest
@EnableAutoConfiguration
@ContextConfiguration(classes = { SpringBatchAppMain.class })
public class SpringBatchAppTest {

	
	 @Autowired
	    private JobLauncherTestUtils jobLauncherTestUtils;

	    
	    @Test
	    public void launchJob() throws Exception {

	        //JobExecution jobExecution = jobLauncherTestUtils.launchJob();
	        
	        JobExecution jobExecution = jobLauncherTestUtils.launchStep("step1");
	        
	        assertEquals(BatchStatus.COMPLETED, jobExecution.getStatus());
	        
	    }
}

package com.lti.nordea;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionException;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@EnableJpaRepositories(basePackageClasses=PaymentInfoRepository.class)
//@EnableJpaRepositories("com.lti.nordea.repository")
@EnableCaching
@EnableAutoConfiguration
public class SpringBatchAppMain {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-batch-context.xml");
		 
        JobLauncher jobLauncher = (JobLauncher) context.getBean("jobLauncher");
        Job job1 = (Job) context.getBean("parsingXmlFileToDbJob");
        Job job2 = (Job) context.getBean("readingDbToCacheJob");
 
        try {
            JobExecution execution = jobLauncher.run(job1, new JobParameters());
            System.out.println("Job "+job1.getName()+" Exit Status : "+ execution.getStatus());
            
            execution = jobLauncher.run(job2, new JobParameters());
            System.out.println("Job "+job2.getName()+"  Exit Status : "+ execution.getStatus());
           
        } catch (JobExecutionException e) {
            System.out.println("Job  failed");
            e.printStackTrace();
        }
    }



}
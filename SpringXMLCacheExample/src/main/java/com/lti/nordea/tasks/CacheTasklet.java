package com.lti.nordea.tasks;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cache.CacheManager;

import com.lti.nordea.model.PaymentInfo;
import com.lti.nordea.service.BusinessService;

public class CacheTasklet implements Tasklet{
	
	/*@Autowired
	private CacheManager cacheManager;*/
	
/*	@Autowired
	@Qualifier("businessService")
	BusinessService businessService;*/
	
	 public CacheTasklet() {
	    }
    /*public CacheTasklet(CacheManager cacheManager) {
        this.cacheManager = cacheManager;
    }*/

    @Override
    public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
        
 /*   	//PaymentInfo obj=new PaymentInfo();
    	// cacheManager.getCache("EndToEndIdCache");
		//obj=serviceObj.getId();
		System.out.println("Called BeforeJob\\");
		obj=serviceObj.getPaymentInfo(1);
    	//obj = (PaymentIdInfo) cacheManager.getCache("EndToEndIdCache");
        System.out.println("Hello "+obj.getEndToEndId());*/
        return RepeatStatus.FINISHED;
    }

}

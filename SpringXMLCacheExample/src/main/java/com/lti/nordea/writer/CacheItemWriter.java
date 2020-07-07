package com.lti.nordea.writer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;

import com.lti.nordea.model.PaymentInfo;
import com.lti.nordea.service.IPaymentService;

public class CacheItemWriter implements ItemWriter<PaymentInfo> {

	
	@Autowired
	IPaymentService paymentService;
	
	
	
	@Override
	public void write(List<? extends PaymentInfo> items) throws Exception {
		// TODO Auto-generated method stub
		
		
		
		paymentService.copyToCache(items);
		
		
	}

}

package com.lti.nordea.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.lti.nordea.model.PaymentInfo;

@Service
public class PaymentService implements IPaymentService{
	
	List< PaymentInfo> dstList= new ArrayList<PaymentInfo>();
	
	public void copyToCache (List<? extends PaymentInfo> srcList)
	{
		List<PaymentInfo> dstList= new ArrayList<PaymentInfo>();
		dstList.addAll(srcList);
		
		//Collections.copy(dstList,items);
	//System.out.println(dstList);

	}

	
	@Cacheable("endToEndIdcache")
	public List<PaymentInfo> fetchFromCache()
	{
		System.out.println("List from cache "+dstList);
		return dstList;
	}
	
}

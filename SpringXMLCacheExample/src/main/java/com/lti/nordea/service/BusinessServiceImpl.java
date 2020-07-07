package com.lti.nordea.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.nordea.model.PaymentInfo;
import com.lti.nordea.repository.PaymentInfoRepository;


@Service("businessService")
@Transactional
public class BusinessServiceImpl implements BusinessService{
	
	
	
	/*@Autowired
	private PaymentInfoRepository paymentInfoRepository;*/
	
	//@Cacheable(value="EndToEndIdCache" ,key="#id")
/*	   public PaymentInfo getPaymentInfo(Integer id)
	   {
		List<PaymentInfo> infoList = new ArrayList<PaymentInfo>();
		System.out.println("In getPaymentInfo ");
		
		//info.setId(1);
		//info.setEndToEndId("EndToEndId");
		infoList=daoObj.findAll();
		
		//System.out.println("In getPaymentInfo "+info.getEndToEndId());
		
		PaymentInfo info = infoList.get(0);
		
		return info;
	   }*/
	


	@Override
	@Cacheable("EndToEndIdCache")
	public PaymentInfo findById(Integer id) {
		//return paymentInfoRepository.findOne(id);
		
		PaymentInfo info = new PaymentInfo();
		
		info.setEndToEndId("EndToEndId");
		info.setId(1);
		return info;
	}

}

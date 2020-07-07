package com.lti.nordea.service;

import java.util.List;

import com.lti.nordea.model.PaymentInfo;

public interface IPaymentService {
	
	public void copyToCache (List<? extends PaymentInfo> items);

	List<PaymentInfo> fetchFromCache();

}

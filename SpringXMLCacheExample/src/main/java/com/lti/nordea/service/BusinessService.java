package com.lti.nordea.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.lti.nordea.model.PaymentInfo;


public interface BusinessService {
	
	PaymentInfo findById(Integer id);
}

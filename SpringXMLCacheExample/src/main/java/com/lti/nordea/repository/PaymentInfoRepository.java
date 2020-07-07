package com.lti.nordea.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.lti.nordea.model.PaymentInfo;

public interface PaymentInfoRepository extends  JpaRepository<PaymentInfo, Integer>  {
	
	//public PaymentInfo findById(Integer id);	

}



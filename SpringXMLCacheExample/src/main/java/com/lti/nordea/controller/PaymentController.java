package com.lti.nordea.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.nordea.model.PaymentInfo;
import com.lti.nordea.service.IPaymentService;

@RestController
@RequestMapping("/api")
public class PaymentController {

	@Autowired
	IPaymentService paymentService;
	 
    @GetMapping("/paymentInfo")
    public List<PaymentInfo> getEndToEndId() {

    	List<PaymentInfo> idList= new ArrayList<PaymentInfo>();
    	idList=paymentService.fetchFromCache();
    	
    	
    	//PaymentInfo info = businessService.findById(id);
        /*if (info == null) {
            return new  ResponseEntity<>(HttpStatus.NOT_FOUND);
        }*/
        return idList;
    }
    
}

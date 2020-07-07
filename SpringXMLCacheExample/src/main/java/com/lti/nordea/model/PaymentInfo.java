package com.lti.nordea.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PaymentInfo implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5018186743550954596L;

	@Column(name="ENDTOENDID")
	private String endToEndId;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	private int paymntId;
	
	
	public int getPaymntId() {
		return paymntId;
	}

	public void setPaymntId(int paymntId) {
		this.paymntId = paymntId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEndToEndId() {
		return endToEndId;
	}

	public void setEndToEndId(String endToEndId) {
		this.endToEndId = endToEndId;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PaymentInfo [endToEndId=");
		builder.append(endToEndId);
		builder.append(", id=");
		builder.append(id);
		builder.append(", paymntId=");
		builder.append(paymntId);
		builder.append("]");
		return builder.toString();
	}
	

}

package com.lti.nordea.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.lti.nordea.model.PaymentInfo;

//class will eventually map the data from database into java object
public class PaymentIdRowMapper implements RowMapper<PaymentInfo> {

	@Override
	public PaymentInfo mapRow(ResultSet rs, int rowNum) throws SQLException {

		PaymentInfo info = new PaymentInfo();
		
		info.setEndToEndId(rs.getString("ENDTOENDID"));
		
		//System.out.println(rs.getInt("PAYMNTID"));
		info.setPaymntId(rs.getInt("PAYMNTID"));
		
		return info;
	}

}

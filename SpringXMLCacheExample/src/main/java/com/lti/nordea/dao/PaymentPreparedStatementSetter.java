package com.lti.nordea.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.batch.item.database.ItemPreparedStatementSetter;

import com.lti.nordea.model.CstmrCdtTrfInitn;

//class will eventually set the sql values
public class PaymentPreparedStatementSetter implements ItemPreparedStatementSetter<CstmrCdtTrfInitn> {


	@Override
	public void setValues(CstmrCdtTrfInitn item, PreparedStatement ps) throws SQLException {
		// TODO Auto-generated method stub
		ps.setString(1,item.getPmtInf().getCdtTrfTxInf().getPmtId().getEndToEndId());
		
		
	}
}

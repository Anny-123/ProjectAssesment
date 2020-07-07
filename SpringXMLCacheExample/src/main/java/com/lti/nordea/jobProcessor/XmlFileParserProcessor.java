package com.lti.nordea.jobProcessor;

import org.springframework.batch.item.ItemProcessor;

import com.lti.nordea.model.CstmrCdtTrfInitn;


// called after item read but before item write to perform a business logic on each item.
public class XmlFileParserProcessor  implements ItemProcessor<CstmrCdtTrfInitn, CstmrCdtTrfInitn>{
 
    @Override
    public CstmrCdtTrfInitn process(CstmrCdtTrfInitn item) throws Exception {
        System.out.println("Processing item :"+item.getPmtInf().getCdtTrfTxInf().getPmtId().getEndToEndId());
 
        return item;
    }
 
}
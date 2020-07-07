package com.lti.nordea.model;



public class CstmrTrfInfo
{
    private CstmrCdtTrfInitn CstmrCdtTrfInitn;

    public CstmrCdtTrfInitn getCstmrCdtTrfInitn ()
    {
        return CstmrCdtTrfInitn;
    }

    public void setCstmrCdtTrfInitn (CstmrCdtTrfInitn CstmrCdtTrfInitn)
    {
        this.CstmrCdtTrfInitn = CstmrCdtTrfInitn;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [CstmrCdtTrfInitn = "+CstmrCdtTrfInitn+"]";
    }
}

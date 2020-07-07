package com.lti.nordea.model;
public class Envlp
{
    private String PaymentType;

    public String getPaymentType ()
    {
        return PaymentType;
    }

    public void setPaymentType (String PaymentType)
    {
        this.PaymentType = PaymentType;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [PaymentType = "+PaymentType+"]";
    }
}
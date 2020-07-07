package com.lti.nordea.model;
public class DbtrAcct
{
    private String Ccy;

    private Id Id;

    public String getCcy ()
    {
        return Ccy;
    }

    public void setCcy (String Ccy)
    {
        this.Ccy = Ccy;
    }

    public Id getId ()
    {
        return Id;
    }

    public void setId (Id Id)
    {
        this.Id = Id;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Ccy = "+Ccy+", Id = "+Id+"]";
    }
}
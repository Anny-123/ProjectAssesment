package com.lti.nordea.model;

public class Tax
{
    private String Cdtr;

    public String getCdtr ()
    {
        return Cdtr;
    }

    public void setCdtr (String Cdtr)
    {
        this.Cdtr = Cdtr;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Cdtr = "+Cdtr+"]";
    }
}
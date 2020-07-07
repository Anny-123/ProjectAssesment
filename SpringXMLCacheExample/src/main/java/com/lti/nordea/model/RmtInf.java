package com.lti.nordea.model;
public class RmtInf
{
    private String Ustrd;

    public String getUstrd ()
    {
        return Ustrd;
    }

    public void setUstrd (String Ustrd)
    {
        this.Ustrd = Ustrd;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Ustrd = "+Ustrd+"]";
    }
}
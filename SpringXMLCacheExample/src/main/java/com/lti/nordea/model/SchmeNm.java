package com.lti.nordea.model;
public class SchmeNm
{
    private String Cd;

    public String getCd ()
    {
        return Cd;
    }

    public void setCd (String Cd)
    {
        this.Cd = Cd;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Cd = "+Cd+"]";
    }
}
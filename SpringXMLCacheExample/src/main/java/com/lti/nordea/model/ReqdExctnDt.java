package com.lti.nordea.model;
public class ReqdExctnDt
{
    private String Dt;

    public String getDt ()
    {
        return Dt;
    }

    public void setDt (String Dt)
    {
        this.Dt = Dt;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Dt = "+Dt+"]";
    }
}
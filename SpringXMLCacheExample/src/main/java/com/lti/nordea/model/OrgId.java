package com.lti.nordea.model;
public class OrgId
{
    private Othr Othr;

    public Othr getOthr ()
    {
        return Othr;
    }

    public void setOthr (Othr Othr)
    {
        this.Othr = Othr;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Othr = "+Othr+"]";
    }
}
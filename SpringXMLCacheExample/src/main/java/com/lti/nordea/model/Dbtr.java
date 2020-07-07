package com.lti.nordea.model;
public class Dbtr
{
    private PstlAdr PstlAdr;

    private Id Id;

    private String Nm;

    public PstlAdr getPstlAdr ()
    {
        return PstlAdr;
    }

    public void setPstlAdr (PstlAdr PstlAdr)
    {
        this.PstlAdr = PstlAdr;
    }

    public Id getId ()
    {
        return Id;
    }

    public void setId (Id Id)
    {
        this.Id = Id;
    }

    public String getNm ()
    {
        return Nm;
    }

    public void setNm (String Nm)
    {
        this.Nm = Nm;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [PstlAdr = "+PstlAdr+", Id = "+Id+", Nm = "+Nm+"]";
    }
}
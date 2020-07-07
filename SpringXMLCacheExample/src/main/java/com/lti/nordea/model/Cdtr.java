package com.lti.nordea.model;

public class Cdtr
{
    private PstlAdr PstlAdr;

    private String Nm;

    public PstlAdr getPstlAdr ()
    {
        return PstlAdr;
    }

    public void setPstlAdr (PstlAdr PstlAdr)
    {
        this.PstlAdr = PstlAdr;
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
        return "ClassPojo [PstlAdr = "+PstlAdr+", Nm = "+Nm+"]";
    }
}
			
		
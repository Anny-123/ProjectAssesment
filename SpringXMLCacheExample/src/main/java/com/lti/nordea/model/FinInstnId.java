package com.lti.nordea.model;
public class FinInstnId
{
    private PstlAdr PstlAdr;

    private String BICFI;

    public PstlAdr getPstlAdr ()
    {
        return PstlAdr;
    }

    public void setPstlAdr (PstlAdr PstlAdr)
    {
        this.PstlAdr = PstlAdr;
    }

    public String getBICFI ()
    {
        return BICFI;
    }

    public void setBICFI (String BICFI)
    {
        this.BICFI = BICFI;
    }

    @Override
    public String toString()
    {
        return " FinInstnId:[PstlAdr = "+PstlAdr+", BICFI = "+BICFI+"]";
    }
}
	
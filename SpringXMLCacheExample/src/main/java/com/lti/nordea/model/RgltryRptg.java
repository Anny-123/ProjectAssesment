package com.lti.nordea.model;
public class RgltryRptg
{
    private String Dtls;

    public String getDtls ()
    {
        return Dtls;
    }

    public void setDtls (String Dtls)
    {
        this.Dtls = Dtls;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Dtls = "+Dtls+"]";
    }
}
			

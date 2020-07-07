package com.lti.nordea.model;
public class Id
{
  	private OrgId OrgId;

    
    private Othr Othr;

    public Othr getOthr ()
    {
        return Othr;
    }

    public void setOthr (Othr Othr)
    {
        this.Othr = Othr;
    }

public OrgId getOrgId ()
    {
        return OrgId;
    }

    public void setOrgId (OrgId OrgId)
    {
        this.OrgId = OrgId;
    }
    @Override
    public String toString()
    {
        return "ClassPojo [Othr = "+Othr+"]";
    }
}
	
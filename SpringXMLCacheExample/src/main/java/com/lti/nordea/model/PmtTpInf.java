package com.lti.nordea.model;
public class PmtTpInf
{
    private CtgyPurp CtgyPurp;

    private SvcLvl SvcLvl;

    public CtgyPurp getCtgyPurp ()
    {
        return CtgyPurp;
    }

    public void setCtgyPurp (CtgyPurp CtgyPurp)
    {
        this.CtgyPurp = CtgyPurp;
    }

    public SvcLvl getSvcLvl ()
    {
        return SvcLvl;
    }

    public void setSvcLvl (SvcLvl SvcLvl)
    {
        this.SvcLvl = SvcLvl;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [CtgyPurp = "+CtgyPurp+", SvcLvl = "+SvcLvl+"]";
    }
}
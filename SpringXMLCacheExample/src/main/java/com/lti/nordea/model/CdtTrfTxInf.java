package com.lti.nordea.model;

public class CdtTrfTxInf
{
    private Cdtr Cdtr;

    private CdtrAgt CdtrAgt;

    private PmtTpInf PmtTpInf;

    private CdtrAcct CdtrAcct;

    private PmtId PmtId;

    private Amt Amt;

    private String ChrgBr;

    private Tax Tax;

    private RmtInf RmtInf;

    private RgltryRptg RgltryRptg;

    public Cdtr getCdtr ()
    {
        return Cdtr;
    }

    public void setCdtr (Cdtr Cdtr)
    {
        this.Cdtr = Cdtr;
    }

    public CdtrAgt getCdtrAgt ()
    {
        return CdtrAgt;
    }

    public void setCdtrAgt (CdtrAgt CdtrAgt)
    {
        this.CdtrAgt = CdtrAgt;
    }

    public PmtTpInf getPmtTpInf ()
    {
        return PmtTpInf;
    }

    public void setPmtTpInf (PmtTpInf PmtTpInf)
    {
        this.PmtTpInf = PmtTpInf;
    }

    public CdtrAcct getCdtrAcct ()
    {
        return CdtrAcct;
    }

    public void setCdtrAcct (CdtrAcct CdtrAcct)
    {
        this.CdtrAcct = CdtrAcct;
    }

    public PmtId getPmtId ()
    {
        return PmtId;
    }

    public void setPmtId (PmtId PmtId)
    {
        this.PmtId = PmtId;
    }

    public Amt getAmt ()
    {
        return Amt;
    }

    public void setAmt (Amt Amt)
    {
        this.Amt = Amt;
    }

    public String getChrgBr ()
    {
        return ChrgBr;
    }

    public void setChrgBr (String ChrgBr)
    {
        this.ChrgBr = ChrgBr;
    }

    public Tax getTax ()
    {
        return Tax;
    }

    public void setTax (Tax Tax)
    {
        this.Tax = Tax;
    }

    public RmtInf getRmtInf ()
    {
        return RmtInf;
    }

    public void setRmtInf (RmtInf RmtInf)
    {
        this.RmtInf = RmtInf;
    }

    public RgltryRptg getRgltryRptg ()
    {
        return RgltryRptg;
    }

    public void setRgltryRptg (RgltryRptg RgltryRptg)
    {
        this.RgltryRptg = RgltryRptg;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Cdtr = "+Cdtr+", CdtrAgt = "+CdtrAgt+", PmtTpInf = "+PmtTpInf+", CdtrAcct = "+CdtrAcct+", PmtId = "+PmtId+", Amt = "+Amt+", ChrgBr = "+ChrgBr+", Tax = "+Tax+", RmtInf = "+RmtInf+", RgltryRptg = "+RgltryRptg+"]";
    }
}
			
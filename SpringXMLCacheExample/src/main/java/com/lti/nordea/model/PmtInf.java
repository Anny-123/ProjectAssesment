package com.lti.nordea.model;
public class PmtInf
{
    private CdtTrfTxInf CdtTrfTxInf;

    private PmtTpInf PmtTpInf;

    private DbtrAcct DbtrAcct;

    private ReqdExctnDt ReqdExctnDt;

    private DbtrAgt DbtrAgt;

    private String PmtInfId;

    private String CtrlSum;

    private Dbtr Dbtr;

    private String PmtMtd;

    public CdtTrfTxInf getCdtTrfTxInf ()
    {
        return CdtTrfTxInf;
    }

    public void setCdtTrfTxInf (CdtTrfTxInf CdtTrfTxInf)
    {
        this.CdtTrfTxInf = CdtTrfTxInf;
    }

    public PmtTpInf getPmtTpInf ()
    {
        return PmtTpInf;
    }

    public void setPmtTpInf (PmtTpInf PmtTpInf)
    {
        this.PmtTpInf = PmtTpInf;
    }

    public DbtrAcct getDbtrAcct ()
    {
        return DbtrAcct;
    }

    public void setDbtrAcct (DbtrAcct DbtrAcct)
    {
        this.DbtrAcct = DbtrAcct;
    }

    public ReqdExctnDt getReqdExctnDt ()
    {
        return ReqdExctnDt;
    }

    public void setReqdExctnDt (ReqdExctnDt ReqdExctnDt)
    {
        this.ReqdExctnDt = ReqdExctnDt;
    }

    public DbtrAgt getDbtrAgt ()
    {
        return DbtrAgt;
    }

    public void setDbtrAgt (DbtrAgt DbtrAgt)
    {
        this.DbtrAgt = DbtrAgt;
    }

    public String getPmtInfId ()
    {
        return PmtInfId;
    }

    public void setPmtInfId (String PmtInfId)
    {
        this.PmtInfId = PmtInfId;
    }

    public String getCtrlSum ()
    {
        return CtrlSum;
    }

    public void setCtrlSum (String CtrlSum)
    {
        this.CtrlSum = CtrlSum;
    }

    public Dbtr getDbtr ()
    {
        return Dbtr;
    }

    public void setDbtr (Dbtr Dbtr)
    {
        this.Dbtr = Dbtr;
    }

    public String getPmtMtd ()
    {
        return PmtMtd;
    }

    public void setPmtMtd (String PmtMtd)
    {
        this.PmtMtd = PmtMtd;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [CdtTrfTxInf = "+CdtTrfTxInf+", PmtTpInf = "+PmtTpInf+", DbtrAcct = "+DbtrAcct+", ReqdExctnDt = "+ReqdExctnDt+", DbtrAgt = "+DbtrAgt+", PmtInfId = "+PmtInfId+", CtrlSum = "+CtrlSum+", Dbtr = "+Dbtr+", PmtMtd = "+PmtMtd+"]";
    }
}
			
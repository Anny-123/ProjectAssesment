package com.lti.nordea.model;
public class GrpHdr
{
    private String CreDtTm;

    private InitgPty InitgPty;

    private String NbOfTxs;

    private String MsgId;

    public String getCreDtTm ()
    {
        return CreDtTm;
    }

    public void setCreDtTm (String CreDtTm)
    {
        this.CreDtTm = CreDtTm;
    }

    public InitgPty getInitgPty ()
    {
        return InitgPty;
    }

    public void setInitgPty (InitgPty InitgPty)
    {
        this.InitgPty = InitgPty;
    }

    public String getNbOfTxs ()
    {
        return NbOfTxs;
    }

    public void setNbOfTxs (String NbOfTxs)
    {
        this.NbOfTxs = NbOfTxs;
    }

    public String getMsgId ()
    {
        return MsgId;
    }

    public void setMsgId (String MsgId)
    {
        this.MsgId = MsgId;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [CreDtTm = "+CreDtTm+", InitgPty = "+InitgPty+", NbOfTxs = "+NbOfTxs+", MsgId = "+MsgId+"]";
    }
}
			
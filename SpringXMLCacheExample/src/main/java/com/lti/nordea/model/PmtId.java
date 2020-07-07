package com.lti.nordea.model;

public class PmtId
{
    private String InstrId;

    private String EndToEndId;

    public String getInstrId ()
    {
        return InstrId;
    }

    public void setInstrId (String InstrId)
    {
        this.InstrId = InstrId;
    }

    public String getEndToEndId ()
    {
        return EndToEndId;
    }

    public void setEndToEndId (String EndToEndId)
    {
        this.EndToEndId = EndToEndId;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [InstrId = "+InstrId+", EndToEndId = "+EndToEndId+"]";
    }
}

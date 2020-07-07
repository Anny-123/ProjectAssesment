
package com.lti.nordea.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "CstmrCdtTrfInitn")
public class CstmrCdtTrfInitn
{
    private GrpHdr GrpHdr;

    private PmtInf PmtInf;

    private SplmtryData SplmtryData;

    public GrpHdr getGrpHdr ()
    {
        return GrpHdr;
    }

    public void setGrpHdr (GrpHdr GrpHdr)
    {
        this.GrpHdr = GrpHdr;
    }

    public PmtInf getPmtInf ()
    {
        return PmtInf;
    }

    public void setPmtInf (PmtInf PmtInf)
    {
        this.PmtInf = PmtInf;
    }

    public SplmtryData getSplmtryData ()
    {
        return SplmtryData;
    }

    public void setSplmtryData (SplmtryData SplmtryData)
    {
        this.SplmtryData = SplmtryData;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [GrpHdr = "+GrpHdr+", PmtInf = "+PmtInf+", SplmtryData = "+SplmtryData+"]";
    }
}
		
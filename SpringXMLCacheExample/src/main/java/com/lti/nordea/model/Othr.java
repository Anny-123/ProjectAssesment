package com.lti.nordea.model;
public class Othr
{
    private String Id;

    private SchmeNm SchmeNm;

    public String getId ()
    {
        return Id;
    }

    public void setId (String Id)
    {
        this.Id = Id;
    }

    public SchmeNm getSchmeNm ()
    {
        return SchmeNm;
    }

    public void setSchmeNm (SchmeNm SchmeNm)
    {
        this.SchmeNm = SchmeNm;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Id = "+Id+", SchmeNm = "+SchmeNm+"]";
    }
}

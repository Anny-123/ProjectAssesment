package com.lti.nordea.model;

public class InstdAmt
{
    private String Ccy;

    private String content;

    public String getCcy ()
    {
        return Ccy;
    }

    public void setCcy (String Ccy)
    {
        this.Ccy = Ccy;
    }

    public String getContent ()
    {
        return content;
    }

    public void setContent (String content)
    {
        this.content = content;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Ccy = "+Ccy+", content = "+content+"]";
    }
}
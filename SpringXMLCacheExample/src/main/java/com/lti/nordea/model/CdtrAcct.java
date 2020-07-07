package com.lti.nordea.model;
public class CdtrAcct
{
    private Id Id;

    public Id getId ()
    {
        return Id;
    }

    public void setId (Id Id)
    {
        this.Id = Id;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Id = "+Id+"]";
    }
}

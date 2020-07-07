package com.lti.nordea.model;
public class InitgPty
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
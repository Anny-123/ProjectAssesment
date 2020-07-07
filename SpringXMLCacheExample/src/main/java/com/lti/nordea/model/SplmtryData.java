package com.lti.nordea.model;
public class SplmtryData
{
    private Envlp Envlp;

    public Envlp getEnvlp ()
    {
        return Envlp;
    }

    public void setEnvlp (Envlp Envlp)
    {
        this.Envlp = Envlp;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Envlp = "+Envlp+"]";
    }
}
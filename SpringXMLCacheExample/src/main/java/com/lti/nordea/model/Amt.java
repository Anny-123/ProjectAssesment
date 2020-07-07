package com.lti.nordea.model;

public class Amt
{
    private InstdAmt InstdAmt;

    public InstdAmt getInstdAmt ()
    {
        return InstdAmt;
    }

    public void setInstdAmt (InstdAmt InstdAmt)
    {
        this.InstdAmt = InstdAmt;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [InstdAmt = "+InstdAmt+"]";
    }
}
	
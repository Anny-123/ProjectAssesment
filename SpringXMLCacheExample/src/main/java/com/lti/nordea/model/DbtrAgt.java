
package com.lti.nordea.model;
public class DbtrAgt
{
    private FinInstnId FinInstnId;

    public FinInstnId getFinInstnId ()
    {
        return FinInstnId;
    }

    public void setFinInstnId (FinInstnId FinInstnId)
    {
        this.FinInstnId = FinInstnId;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [FinInstnId = "+FinInstnId+"]";
    }
}
package com.bajaj.service;
import com.bajaj.dphone.DphoneCrudOperations;
import com.bajaj.dphone.ReferalRecordDphone;

public class Record {
    private String name;
    private int idNumber;
    public Record() {}

    public Record(String name, int idNumber)
    {


        this.name = name;
        this.idNumber = idNumber;
    }


    public int getIdNumber() { return idNumber; }

    public void setIdNumber(int idNumber)
    {
        this.idNumber = idNumber;
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    @Override public String toString()
    {

        return "Records{"
                + "name=" + name + ", idNumber=" + idNumber
                + '}';
    }
}

package com.example.sqlite;

public class Employee{
    private int Sno;
    private String name;
    private double increment;

    public Employee(int sno, String name, double increment) {
        Sno = sno;
        this.name = name;
        this.increment = increment;
    }

    public int getSno() {
        return Sno;
    }

    public void setSno(int sno) {
        Sno = sno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getIncrement() {
        return increment;
    }

    public void setIncrement(double increment) {
        this.increment = increment;
    }
}

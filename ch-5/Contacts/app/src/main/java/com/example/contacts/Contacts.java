package com.example.contacts;

public class Contacts {
    private int Sno;
    private String mob;
    private String name;

    public Contacts(){

    }

    public Contacts(int Sno, String mob, String name){
        this.Sno = Sno;
        this.mob = mob;
        this.name = name;
    }
    public void setSno(int Sno) {
        this.Sno = Sno;
    }

    public void setMob(String mob) {
        this.mob = mob;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSno() {
        return this.Sno;
    }

    public String getMob() {
        return this.mob;
    }

    public String getName() {
        return this.name;
    }
}

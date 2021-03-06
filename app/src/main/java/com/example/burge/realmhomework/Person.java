package com.example.burge.realmhomework;


import java.util.List;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class Person extends RealmObject{

    @PrimaryKey
    private int serialNumber;
    private String surname;
    private String name;




    public Person() {
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Person{" +
                "serialNumber=" + serialNumber +
                ", surname=" + surname +
                ", name='" + name + '\'' +
                '}';
    }
}

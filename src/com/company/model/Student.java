package com.company.model;

import com.company.base.People;

public class Student extends People {

    private int id;

    public Student(int id, String name, String lastName, int age, Adress adress) {
        super(name, lastName, age, adress);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String toString() {

        return getName() + " " + getLastName()  + " " + getAge() + " " + getAdress();
    }



}

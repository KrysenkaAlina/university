package com.company.base;

import com.company.model.Adress;

public class People {

    private String name;
    private String lastName;
    private int age;
    private Adress adress;

    public People(String name, String lastName, int age, Adress adress) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", adress=" + adress +
                '}';
    }
}

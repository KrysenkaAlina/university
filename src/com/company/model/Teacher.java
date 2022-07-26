package com.company.model;

import com.company.base.People;

public class Teacher extends People {

    private double salary;
    private final double defSalary=2000;
    private int id;

    public Teacher(int id, String name, String lastName, int age, Adress adress, double salary) {
        super(name, lastName, age, adress);
        this.salary = salary;
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getDefSalary() {
        return defSalary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "salary=" + salary +
                ", defSalary=" + defSalary +
                ", id=" + id +
                '}';
    }
}

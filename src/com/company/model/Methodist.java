package com.company.model;

import java.util.ArrayList;

public class Methodist extends Teacher {
    private ArrayList<Teacher> teachers;

    public Methodist(int id, String name, String lastName, int age, Adress adress, double salary, ArrayList<Teacher> teachers) {
        super(id, name, lastName, age, adress, salary);
        this.teachers = teachers;
    }

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(ArrayList<Teacher> teachers) {
        this.teachers = teachers;
    }

    @Override
    public String toString() {
        return "Methodist{" +
                "teachers=" + teachers +
                '}';
    }
}

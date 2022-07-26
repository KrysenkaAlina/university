package com.company.model;

import java.util.ArrayList;

public class Group {

        public String name;
        public int course;
        private ArrayList<Student> arStudents = null;
        private ArrayList<Teacher> teacher = null;

    public Group(String name, int course, ArrayList<Student> arStudents, ArrayList<Teacher> teacher) {
        this.name = name;
        this.course = course;
        this.arStudents = arStudents;
        this.teacher = teacher;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public ArrayList<Student> getArStudents() {
        return arStudents;
    }

    public void setArStudents(ArrayList<Student> arStudents) {
        this.arStudents = arStudents;
    }

    public ArrayList<Teacher> getTeacher() {
        return teacher;
    }

    public void setTeacher(ArrayList<Teacher> teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Group{" +
                "name='" + name + '\'' +
                ", course=" + course +
                ", arStudents=" + arStudents +
                ", teacher=" + teacher +
                '}';
    }
}

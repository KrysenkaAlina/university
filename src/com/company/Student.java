package com.company;

public class Student {

    public String name;
    public String surname;
    public int age;
    private Adress address;

    Student(String newname, String newsurname, int newage, Adress address) {

        name = newname;
        surname = newsurname;
        age = newage;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Adress getAddress() {
        return address;
    }

    public void setAddress(Adress address) {
        this.address = address;
    }


    public String toString() {
        return name + " " + surname + " " + age;
    }

    void changeAddress(Adress address){
        this.address = address;
    }

    void dispInfo(){
        System.out.printf("Student Name: %s, age: %d, living address: %s\n", this.name+" "+this.name, age, address.getAdress());
    }

    void printInfo(){
        System.out.printf("Student Name: %s, age: %d, living address: %s\n", this.name+" "+this.name, age, address.getAdress());
    }
}

package com.company;

public class Teacher {

    public String name;
    public String surname;
    public int age;
    public Adress adress;
    private double salary;

    Teacher(String newname, String newsurname, int newage, Adress address) {

        name = newname;
        surname = newsurname;
        age = newage;
        this.adress = address;
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

    public Adress getAdress() {
        return adress;
    }

    public void setAddress(Adress address) {
        this.adress = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    void dispInfo(){
        System.out.printf("Teacher name: %s, age: %d, living address: %s, salary=%.2f\n", this.name+" "+this.surname, age, adress.getAdress(),this.salary);
    }
    //only as example
    double calcSalary(double working_hours, double hourly_payment){
        return (working_hours*hourly_payment);
    }

    void changeSalary(double salary){
        this.salary = salary;

    }

    void changeAddress(Adress address){
        this.adress = adress;
    }
}

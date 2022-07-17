package com.company;

public class Adress {

    public String city;
    public String street;
    public String house;
    public int flat;

    Adress(String newcity, String newstreet, String newhouse, int newflat) {

        city = newcity;
        street = newstreet;
        house = newhouse;
        flat = newflat;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public int getFlat() {
        return flat;
    }

    public void setFlat(int flat) {
        this.flat = flat;
    }

    String getAdress(){
        return (this.city + ", " + this.street + ", " +this.house + ", " + this.flat);
    }
}

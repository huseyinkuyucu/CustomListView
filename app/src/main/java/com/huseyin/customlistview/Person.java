package com.huseyin.customlistview;

public class Person {

    private String name;
    private String surname;
    private String country;
    private String hobby;
    private int imageId;


    public Person(String name, String surname, String country, String hobby, int imageId) {
        this.name = name;
        this.surname = surname;
        this.country = country;
        this.hobby = hobby;
        this.imageId = imageId;
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }


}

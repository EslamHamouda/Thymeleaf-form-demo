package com.example.thymeleafdemo.model;

import java.util.List;

public class Student {
    private String firstName;
    private String lastName;
    private String country;
    private String favLanguage;
    private List<String> favSystems;

    public Student(){}

    public Student(String firstName, String lastName, String country, String favLanguage, List<String> favSystems) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
        this.favLanguage = favLanguage;
        this.favSystems = favSystems;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getFavLanguage() {
        return favLanguage;
    }

    public void setFavLanguage(String favLanguage) {
        this.favLanguage = favLanguage;
    }

    public List<String> getFavSystems() {
        return favSystems;
    }

    public void setFavSystems(List<String> favSystems) {
        this.favSystems = favSystems;
    }
}

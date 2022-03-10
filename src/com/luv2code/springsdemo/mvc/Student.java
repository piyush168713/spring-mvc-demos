package com.luv2code.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {

    private String firstName;
    private String lastName;

    private String country;
    private LinkedHashMap<String, String> countryOptions;

    private String favouriteLanguage;

    private String[] operatingSystems;

    public Student(){              // no-arg constructor

        // Populate country options: Used ISO country code
        countryOptions = new LinkedHashMap<>();
        
        countryOptions.put("BR","Brazil");
        countryOptions.put("FR","France");
        countryOptions.put("DE","Germany");
        countryOptions.put("IND","India");
        countryOptions.put("US", "United States of America");

    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }


    public String getCountry(){           // On submit the form , Spring will call student.getCountry(...)
        return country;
    }

    public void setCountry(String country){
        this.country = country;
    }

    public LinkedHashMap<String, String> getCountryOptions() {       // when form is loaded, Spring will call this function.
        return countryOptions;
    }

    public String getFavouriteLanguage(){
        return favouriteLanguage;
    }

    public void setFavouriteLanguage(String favouriteLanguage){
        this.favouriteLanguage = favouriteLanguage;
    }


    public String[] getOperatingSystems(){
        return operatingSystems;
    }

    public void setOperatingSystems(String[] operatingSystems){
        this.operatingSystems = operatingSystems;
    }


}

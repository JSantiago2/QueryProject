package com.example.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Location {

    private String city;
    private String country;
    private String region;


    public Location(){

    }

    /*public Location(String city, String country, String region){
        this.city = city;
        this.country = country;
        this.region = region;

    }*/

    public String getCity(){
        return this.city;
    }

    public String getCountry(){
        return this.country;
    }

    public String getRegion(){
        return this.region;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Override
    public String toString() {
        return "Location{" +
                "city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", region='" + region + '\'' +
                '}';
    }
}

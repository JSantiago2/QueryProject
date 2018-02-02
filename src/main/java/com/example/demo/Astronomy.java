package com.example.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Astronomy {

    private String sunrise;
    private String sunset;

    public Astronomy(){
    }

   /* public Astronomy(String sunRise, String sunSet){
        this.sunRise = sunRise;
        this.sunSet = sunSet;
    }*/

    public String getSunRise(){
        return this.sunrise;
    }

    public String getSunSet(){
        return this.sunset;
    }

    public void setSunRise(String sunrise) {
        this.sunrise = sunrise;
    }

    public void setSunSet(String sunset) {
        this.sunset = sunset;
    }

    @Override
    public String toString() {
        return "Astronomy{" +
                "sunrise='" + sunrise + '\'' +
                ", sunset='" + sunset + '\'' +
                '}';
    }
}

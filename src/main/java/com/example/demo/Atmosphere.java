package com.example.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Atmosphere {

    private String humidity;
    private String pressure;
    private String rising;
    private String visibility;

    public Atmosphere(){
    }

   /* public Atmosphere(String humidity, String pressured, String rising, String visibility){
        this.humidity = humidity;
        this.pressured = pressured;
        this.rising = rising;
        this.visibility = visibility;
    }*/

    public String getHumidity(){
        return this.humidity;
    }

    public String getPressure(){
        return this.pressure;
    }

    public String getRising(){
        return this.rising;
    }

    public String getVisibility(){
        return this.visibility;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public void setRising(String rising) {
        this.rising = rising;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    @Override
    public String toString() {
        return "Atmosphere{" +
                "humidity='" + humidity + '\'' +
                ", pressure='" + pressure + '\'' +
                ", rising='" + rising + '\'' +
                ", visibility='" + visibility + '\'' +
                '}';
    }
}

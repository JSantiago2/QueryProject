package com.example.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Units {

    private String distance;
    private String pressure;
    private String speed;
    private String temperature;

    public Units() {
    }

    /*public Units(String distance, String pressure, String speed, String temperature) {
        this.distance = distance;
        this.pressure = pressure;
        this.speed = speed;
        this.temperature = temperature;
    }*/

    public String getDistance(){
        return this.distance;
    }

    public String getPressure(){
        return this.pressure;
    }

    public String getSpeed(){
        return this.speed;
    }

    public String getTemperature(){
        return this.temperature;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "Units{" +
                "distance='" + distance + '\'' +
                ", pressure='" + pressure + '\'' +
                ", speed='" + speed + '\'' +
                ", temperature='" + temperature + '\'' +
                '}';
    }
}

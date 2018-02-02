package com.example.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Wind {

    private String chill;
    private String direction;
    private String speed;

    public Wind(){
    }

    /*public Wind(String chill, String direction, String speed){
        this.chill = chill;
        this.direction = direction;
        this.speed = speed;
    }*/

    public String getChill(){
        return this.chill;
    }

    public String getDirection(){
        return this.direction;
    }

    public String getSpeed(){
        return this.speed;
    }

    public void setChill(String chill) {
        this.chill = chill;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Wind{" +
                "chill='" + chill + '\'' +
                ", direction='" + direction + '\'' +
                ", speed='" + speed + '\'' +
                '}';
    }
}

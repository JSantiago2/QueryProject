package com.example.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Forecast {

    private String code;
    private String date;
    private String day;
    private String high;
    private String low;
    private String text;




    public Forecast(){
    }

    /*public Forecast(String code, String date, String day, String high, String low, String text){
        this.code = code;
        this.date = date;
        this.day = day;
        this.high = high;
        this.low = low;
        this.text = text;
    }*/

    public String getCode(){
        return this.code;
    }

    public String getDate(){
        return this.date;
    }

    public String getDay(){
        return this.day;
    }

    public String getHigh(){
        return this.high;
    }

    public String getLow(){
        return this.low;
    }

    public String getText(){
        return this.text;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public void setHigh(String high) {
        this.high = high;
    }

    public void setLow(String low) {
        this.low = low;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Forecast{" +
                "code='" + code + '\'' +
                ", date='" + date + '\'' +
                ", day='" + day + '\'' +
                ", high='" + high + '\'' +
                ", low='" + low + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}

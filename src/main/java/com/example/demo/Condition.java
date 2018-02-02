package com.example.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Condition {

    private String code;
    private String date;
    private String temp;
    private String text;

    public Condition() {
    }

   /* public Condition(String code, String date, String temp, String text){
        this.code = code;
        this.date = date;
        this.temp = temp;
        this.text = text;
    }*/

    public String getCode(){
        return this.code;
    }

    public String getDate(){
        return this.date;
    }

    public String getTemp(){
        return this.temp;
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

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Condition{" +
                "code='" + code + '\'' +
                ", date='" + date + '\'' +
                ", temp='" + temp + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}

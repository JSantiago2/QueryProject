package com.example.demo;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Item {

    private String title;
    private String lat;
    private String longi;
    private String link;
    private String pubDate;
    private Condition condition;
    private List<Forecast> forecast;
    private String description;
    private Guid guid;

    public Item() {
    }

    /*public Item(String title, String lat, String longi, String link, Condition condition, String pubDate, Forecast forecast, Guid guid){
        this.title = title;
        this.lat = lat;
        this.longi = longi;
        this.link = link;
        this.condition = condition;
        this.pubDate = pubDate;
        this.forecast = (List<Forecast>) forecast;
        this.guid = guid;

    }*/

    public String getTitle(){
        return this.title;
    }

    public String getLat(){
        return this.lat;
    }

    public String getLongi(){
        return this.longi;
    }

    public String getLink(){
        return this.link;
    }

    public String getPubDate(){
        return this.pubDate;
    }

    public Condition getCondition() {
        return condition;
    }

    public Forecast getForecast() {
        return (Forecast) forecast;
    }

    public Guid getGuid() {
        return guid;
    }

    public String getDescription(){
        return description;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public void setLongi(String longi) {
        this.longi = longi;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public void setPubDate(String pubDate) {
        this.pubDate = pubDate;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    public void setForecast(List<Forecast> forecast) {
        this.forecast = forecast;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setGuid(Guid guid) {
        this.guid = guid;
    }

    @Override
    public String toString() {
        return "Item{" +
                "title='" + title + '\'' +
                ", lat='" + lat + '\'' +
                ", longi='" + longi + '\'' +
                ", link='" + link + '\'' +
                ", pubDate='" + pubDate + '\'' +
                ", condition=" + condition +
                ", forecast=" + forecast +
                ", description='" + description + '\'' +
                ", guid=" + guid +
                '}';
    }
}

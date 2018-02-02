package com.example.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Query {

    private int count;
    private String created;
    private String lang;
    private Results results;

    public Query(){
    }

    /*public Query(int count, String created, String lang, Results results){
        this.count = count;
        this.created = created;
        this.lang = lang;
        this.results = results;
    }*/

    public int getCount(){
        return this.count;
    }

    public String getCreated(){
        return this.created;
    }

    public String getLang(){
        return this.lang;
    }

    public Results getResults(){
        return this.results;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public void setResults(Results results) {
        this.results = results;
    }

    @Override
    public String toString() {
        return "Query{" +
                "count=" + count +
                ", created='" + created + '\'' +
                ", lang='" + lang + '\'' +
                ", results=" + results +
                '}';
    }
}




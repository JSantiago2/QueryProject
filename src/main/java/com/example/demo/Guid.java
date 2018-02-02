package com.example.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Guid {

    private String isPermaLink;

    public Guid(){
    }

   /* public Guid(String isPermalLink){
        this.isPermalLink = isPermalLink;
    }*/

    public String getIsPermaLink(){
        return this.isPermaLink;
    }

    public void setIsPermaLink(String isPermaLink) {
        this.isPermaLink = isPermaLink;
    }

    @Override
    public String toString() {
        return "Guid{" +
                "isPermaLink='" + isPermaLink + '\'' +
                '}';
    }
}

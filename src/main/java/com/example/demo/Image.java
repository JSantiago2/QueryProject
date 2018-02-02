package com.example.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Image {

    private String title;
    private String width;
    private String height;
    private String link;
    private String url;

    public Image(){
    }

   /* public Image(String title, String width, String height, String link, String url){
        this.title = title;
        this.width = width;
        this.height = height;
        this.link = link;
        this.url = url;
    }*/

    public String getTitle(){
        return this.title;
    }

    public String getWidth(){
        return this.width;
    }

    public String getHeight(){
        return this.height;
    }

    public String getLink(){
        return this.link;
    }

    public String getUrl(){
        return this.url;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Image{" +
                "title='" + title + '\'' +
                ", width='" + width + '\'' +
                ", height='" + height + '\'' +
                ", link='" + link + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}

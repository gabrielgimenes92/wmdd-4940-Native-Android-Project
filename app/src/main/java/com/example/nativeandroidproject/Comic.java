package com.example.nativeandroidproject;

public class Comic {

    private String Title;
    private String Url;

    public Comic() {

    }

    public Comic(String title, String url) {
        Title = title;
        Url = url;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setUrl(String url) {
        Url = url;
    }

    public String getTitle() {
        return Title;
    }

    public String getUrl() {
        return Url;
    }
}

package com.example.ammar.librarytest.model;

public class AdvertModel {
    private String Id;
    private int Location;
    private String PictureId;
    private int DisplayOrder;
    private String Link;
    private String ImagePath;
    private String StartDate;
    private String EndDate;
    private String Facebook;
    private String Instagram;
    private String Twitter;
    private String LinkedIn;

    public int getLocation() {
        return Location;
    }

    public String getPictureId() {
        return PictureId;
    }

    public int getDisplayOrder() {
        return DisplayOrder;
    }

    public String getStartDate() {
        return StartDate;
    }

    public String getEndDate() {
        return EndDate;
    }

    public String getFacebook() {
        return Facebook;
    }

    public String getInstagram() {
        return Instagram;
    }

    public String getTwitter() {
        return Twitter;
    }

    public String getLinkedIn() {
        return LinkedIn;
    }

    public String getWhatsapp() {
        return Whatsapp;
    }

    private String Whatsapp;


    public String getId() {
        return Id;
    }

    public String getLink() {
        return Link;
    }

    public String getImagePath() {
        return ImagePath;
    }
}

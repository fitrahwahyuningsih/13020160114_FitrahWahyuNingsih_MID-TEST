package com.developercute.moviecatalogue;

public class MovieModel {
    int photo;
    String judulTV, descTV;

    public MovieModel(int photo, String judulTV, String descTV) {
        this.photo = photo;
        this.judulTV = judulTV;
        this.descTV = descTV;
    }

    public int getPhoto() {
        return photo;
    }

    public String getJudulTV() {
        return judulTV;
    }

    public String getDescTV() {
        return descTV;
    }
}


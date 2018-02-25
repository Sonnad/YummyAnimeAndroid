package com.example.sonad.yummyanimeandroid;

/**
 * Created by Lincoln on 18/05/16.
 */
public class Album {
    private String name;
    private int numOfSeries;
    private int thumbnail;

    public Album() {
    }

    public Album(String name, int numOfSeries, int thumbnail) {
        this.name = name;
        this.numOfSeries = numOfSeries;
        this.thumbnail = thumbnail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumOfSongs() {
        return numOfSeries;
    }

    public void setNumOfSongs(int numOfSongs) {
        this.numOfSeries = numOfSongs;
    }

    public int getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }
}

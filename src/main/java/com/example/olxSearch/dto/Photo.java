package com.example.olxSearch.dto;

public class Photo {
    private long id;
    private String filename;
    private int rotation;
    private int width;
    private int height;
    private String link;

    // getters and setters

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public int getRotation() {
        return rotation;
    }

    public void setRotation(int rotation) {
        this.rotation = rotation;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @Override
    public String toString() {
        return "Photo{" +
                "id=" + id +
                ", filename='" + filename + '\'' +
                ", rotation=" + rotation +
                ", width=" + width +
                ", height=" + height +
                ", link='" + link + '\'' +
                '}';
    }
}
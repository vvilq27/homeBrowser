package com.example.olxSearch.dto;

public class Map {

    private int zoom;
    private Double lat;
    private Double lon;
    private int radius;
    private boolean show_detailed;

    public int getZoom() {
        return zoom;
    }

    public void setZoom(int zoom) {
        this.zoom = zoom;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLon() {
        return lon;
    }

    public void setLon(Double lon) {
        this.lon = lon;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public boolean isShow_detailed() {
        return show_detailed;
    }

    public void setShow_detailed(boolean show_detailed) {
        this.show_detailed = show_detailed;
    }
}

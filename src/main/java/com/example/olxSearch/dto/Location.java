package com.example.olxSearch.dto;

public class Location {
    private City city;
    private District district;
    private Region region;

    // getters and setters

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public District getDistrict() {
        return district;
    }

    public void setDistrict(District district) {
        this.district = district;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    @Override
    public String toString() {
        return "Location{" +
                "city=" + city +
                ", district=" + district +
                ", region=" + region +
                '}';
    }
}

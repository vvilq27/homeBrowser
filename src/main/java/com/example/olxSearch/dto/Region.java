package com.example.olxSearch.dto;

public class Region {
    private int id;
    private String name;
    private String normalized_name;

    // getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNormalized_name() {
        return normalized_name;
    }

    public void setNormalized_name(String normalized_name) {
        this.normalized_name = normalized_name;
    }

    @Override
    public String toString() {
        return "Region{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", normalized_name='" + normalized_name + '\'' +
                '}';
    }
}